/*******************************************************************************
 * Copyright © 2023 George Lindholm.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 *     George Lindholm - initial API and implementation
 *******************************************************************************/

package me.glindholm.mylyn.bamboo.internal.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.Builder;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringJoiner;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.mylyn.builds.core.BuildState;
import org.eclipse.mylyn.builds.core.BuildStatus;
import org.eclipse.mylyn.builds.core.IArtifact;
import org.eclipse.mylyn.builds.core.IBuild;
import org.eclipse.mylyn.builds.core.IBuildCause;
import org.eclipse.mylyn.builds.core.IBuildFactory;
import org.eclipse.mylyn.builds.core.IBuildPlan;
import org.eclipse.mylyn.builds.core.IChange;
import org.eclipse.mylyn.builds.core.IChangeArtifact;
import org.eclipse.mylyn.builds.core.IChangeSet;
import org.eclipse.mylyn.builds.core.IHealthReport;
import org.eclipse.mylyn.builds.core.IStringParameterDefinition;
import org.eclipse.mylyn.builds.core.ITestCase;
import org.eclipse.mylyn.builds.core.ITestResult;
import org.eclipse.mylyn.builds.core.ITestSuite;
import org.eclipse.mylyn.builds.core.IUser;
import org.eclipse.mylyn.builds.core.TestCaseResult;
import org.eclipse.mylyn.builds.core.spi.AbstractConfigurationCache;
import org.eclipse.mylyn.builds.core.spi.BuildPlanRequest;
import org.eclipse.mylyn.builds.core.spi.BuildServerBehaviour;
import org.eclipse.mylyn.builds.core.spi.BuildServerConfiguration;
import org.eclipse.mylyn.builds.core.spi.GetBuildsRequest;
import org.eclipse.mylyn.builds.core.spi.GetBuildsRequest.Kind;
import org.eclipse.mylyn.builds.core.spi.GetBuildsRequest.Scope;
import org.eclipse.mylyn.builds.core.spi.RunBuildRequest;
import org.eclipse.mylyn.commons.core.operations.IOperationMonitor;
import org.eclipse.mylyn.commons.repositories.core.RepositoryLocation;
import org.eclipse.mylyn.commons.repositories.core.auth.AuthenticationType;
import org.eclipse.mylyn.commons.repositories.core.auth.UserCredentials;
import org.eclipse.osgi.util.NLS;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import me.glindholm.mylyn.bamboo.internal.core.client.BambooConfiguration;
import me.glindholm.mylyn.bamboo.internal.core.client.BambooConfigurationCache;
import me.glindholm.mylyn.bamboo.internal.core.client.BambooServerInfo;
import me.glindholm.mylyn.bamboo.internal.core.client.BambooServerInfo.Type;
import me.glindholm.mylyn.bamboo.internal.rest.api.BuildApi;
import me.glindholm.mylyn.bamboo.internal.rest.api.DefaultApi;
import me.glindholm.mylyn.bamboo.internal.rest.api.DownloadApi;
import me.glindholm.mylyn.bamboo.internal.rest.invoker.ApiClient;
import me.glindholm.mylyn.bamboo.internal.rest.invoker.ApiException;
import me.glindholm.mylyn.bamboo.internal.rest.invoker.Pair;
import me.glindholm.mylyn.bamboo.internal.rest.model.CommitFile;
import me.glindholm.mylyn.bamboo.internal.rest.model.RestBuildArtifact;
import me.glindholm.mylyn.bamboo.internal.rest.model.RestInfo;
import me.glindholm.mylyn.bamboo.internal.rest.model.RestPlan;
import me.glindholm.mylyn.bamboo.internal.rest.model.RestPlanBranch;
import me.glindholm.mylyn.bamboo.internal.rest.model.RestPlans;
import me.glindholm.mylyn.bamboo.internal.rest.model.RestQueuedBuild;
import me.glindholm.mylyn.bamboo.internal.rest.model.RestResultsResults;
import me.glindholm.mylyn.bamboo.internal.rest.model.RestStageResult;
import me.glindholm.mylyn.bamboo.internal.rest.model.RestVariable;
import me.glindholm.mylyn.bamboo.internal.rest.model.RestVariableDefinitionContext;
import me.glindholm.mylyn.bamboo.internal.rest.model.Result;
import me.glindholm.mylyn.bamboo.internal.rest.model.ResultChange;
import me.glindholm.mylyn.bamboo.internal.rest.model.StartBuildRequest;
import me.glindholm.mylyn.bamboo.internal.rest.model.TestResult;
import me.glindholm.mylyn.bamboo.internal.rest.model.TestResultErrorsList;
import me.glindholm.mylyn.bamboo.internal.rest.model.TestResultsResultList;

/**
 * @author George Lindholm
 */
public class BambooServerBehaviour extends BuildServerBehaviour {
    private static final String GREATER_THAN = ">"; //$NON-NLS-1$

    private static final String LESS_THAN = "<"; //$NON-NLS-1$

    private static final String SPACE = " "; //$NON-NLS-1$

    private static final String DOWNLOAD_PREFIX = "/download/"; //$NON-NLS-1$

    private static final String DASH = "-"; //$NON-NLS-1$

    private static final Pattern BUILDER_EXPRESSION = Pattern.compile("(.*?) <a href=\"(.*?)\">(.*?)(&lt;(.*)&gt;)?</a>"); //$NON-NLS-1$

    private static final String USER_AGENT_STRING = "Bamboo Mylyn Build Connector"; //$NON-NLS-1$

    private static final String USER_AGENT = "User-Agent"; //$NON-NLS-1$

    private static final String AUTHORIZATION_HEADER = "Authorization"; //$NON-NLS-1$

    private final RepositoryLocation location;

    private final ApiClient apiClient;

    private final AbstractConfigurationCache<BambooConfiguration> cache;

    public BambooServerBehaviour(final RepositoryLocation location, final BambooConfigurationCache cache) {
        Assert.isNotNull(location);
        Assert.isNotNull(cache);

        this.location = location;
        this.cache = cache;

        final UserCredentials credentials = location.getCredentials(AuthenticationType.REPOSITORY);
        final String userName = credentials.getUserName();
        final String password = credentials.getPassword();

        apiClient = new ApiClient();
        apiClient.updateBaseUri(location.getUrl() + "/rest"); //$NON-NLS-1$

        final HttpClient.Builder httpClient = HttpClient.newBuilder();
        final boolean followRedirects = true;
        httpClient.connectTimeout(Duration.ofMinutes(1)) //
                .followRedirects(followRedirects ? HttpClient.Redirect.ALWAYS : HttpClient.Redirect.NEVER);
        apiClient.setHttpClientBuilder(httpClient);

        apiClient.setRequestInterceptor(request -> addHeaders(userName, password, request));
    }

    private static HttpRequest.Builder addHeaders(final String username, final String password, final HttpRequest.Builder authorize) {
        authorize.header(AUTHORIZATION_HEADER, password.isEmpty() ? bearerAuth(password) : basicAuth(username, password));
        authorize.header(USER_AGENT, USER_AGENT_STRING);
        return authorize;
    }

    private static String basicAuth(final String username, final String password) {
        return "Basic " + Base64.getEncoder().encodeToString((username + ":" + password).getBytes()); //$NON-NLS-1$ //$NON-NLS-2$
    }

    private static String bearerAuth(final String token) {
        return "Bearer " + token; //$NON-NLS-1$
    }

    public RepositoryLocation getLocation() {
        return location;
    }

    @Override
    public List<IBuild> getBuilds(final GetBuildsRequest request, final IOperationMonitor monitor) throws CoreException {
        final DefaultApi def = new DefaultApi(apiClient);

        try {
            if (request.getKind() == Kind.LAST) {
                final IBuild lastBuild = getLastBuild(request);
                return Collections.singletonList(lastBuild);
            } else if (request.getKind() == Kind.SELECTED) {
                final String buildNr = request.getIds().iterator().next();
                final IBuild thatBuild = getSpecificBuild(request.getPlan().getId(), buildNr);
                return Collections.singletonList(thatBuild);
            } else if (request.getKind() == Kind.ALL && request.getScope() == Scope.HISTORY) {
                final String[] planKey = request.getPlan().getId().split(DASH);
                final RestResultsResults bambooBuilds = def.getBuildHistory(planKey[0], planKey[1], true, null,
                        "results.result,results.result.stages.stage.results.result", null, null, null, null, null, null, null);

                final List<IBuild> builds = new ArrayList<>(bambooBuilds.getResults().getResult().size());
                for (final Result bambooBuild : bambooBuilds.getResults().getResult()) {
                    builds.add(parseBuild(bambooBuild));
                }
                return builds;
            } else {
                throw new UnsupportedOperationException("Unsupported request kind and scope combination: kind=" //$NON-NLS-1$
                        + request.getKind() + ",scope=" + request.getScope()); //$NON-NLS-1$
            }
        } catch (ApiException | URISyntaxException | InterruptedException | ExecutionException e) {
            if (e instanceof final ApiException apiEx) {
                if (apiEx.getCode() == 404) {
                    final IBuild build = createBuild();

                    build.setId(request.getPlan().getId());
                    build.setState(BuildState.BUILDABLE);
                    build.setStatus(BuildStatus.NOT_BUILT);
                    build.setSummary(StringUtils.EMPTY);
                    build.setDuration(0);
                    build.setLabel(StringUtils.EMPTY);
                    build.setDisplayName(request.getPlan().getDescription());
                    build.setName(request.getPlan().getName());

                    return Collections.singletonList(build);
                }
            }
            throw BambooCorePlugin.toCoreException(e);
        }
    }

    private IBuild getLastBuild(final GetBuildsRequest request) throws InterruptedException, ExecutionException, ApiException, URISyntaxException {
        return getSpecificBuild(request.getPlan().getId(), "latest");
    }

    private IBuild getSpecificBuild(final String plan, final String buildNr) throws InterruptedException, ExecutionException, ApiException, URISyntaxException {
        final DefaultApi def = new DefaultApi(apiClient);

        final String[] planKey = plan.split(DASH);
        final String expand = String.join(",", "stages.stage.results.result.artifacts.artifact", "stages.stage.results.result.changes.change.files.file",
                "stages.stage.results.result.testResults.allTests.testResult.errors.error", "stages.stage.results.result.testResults.skippedTests",
                "stages.stage.results.result.testResults.quarantinedTests");
        final Result bambooBuild = def.getBuild(planKey[0], planKey[1], buildNr, expand, null);
        final IBuild build = parseBuild(bambooBuild);
        return build;
    }

    private IBuild parseBuild(final Result result) throws URISyntaxException {
        final IBuild build = createBuild();

        build.setId(String.valueOf(result.getId()));
        build.setName(result.getPlanName());
        build.setBuildNumber(result.getBuildNumber());
        build.setLabel(String.valueOf(result.getBuildNumber()));
        build.setDuration(result.getBuildDuration());
        build.setTimestamp(result.getBuildStartedTime().getTime());
        build.setUrl(browserUrl(result.getPlanResultKey().getEntityKey().getKey() + "-" + result.getBuildNumber()).toString());
        build.setState(parseBuildState(result));
        build.setStatus(parseBuildStatus(result));
        build.setSummary(parserBuildSummary(result));

        build.setDisplayName("Display name");
        if (!result.getLifeCycleState().equals("InProgress") && !result.getLifeCycleState().equals("NotBuilt")) {
            final ITestResult testResult = createTestResult();
            build.setTestResult(testResult);

            testResult.setFailCount(result.getFailedTestCount());
            testResult.setDuration(result.getBuildDuration());
            testResult.setErrorCount(-1);
            testResult.setFailCount(result.getFailedTestCount());
            testResult.setIgnoredCount(result.getSkippedTestCount() + result.getQuarantinedTestCount());
            testResult.setPassCount(result.getSuccessfulTestCount());

            if (result.getStages().getStage() != null && !result.getStages().getStage().isEmpty()) {
                for (final RestStageResult stage : result.getStages().getStage()) {
                    if (stage.getIsBuilding() != null) {
                        build.setState(stage.getIsBuilding() ? BuildState.RUNNING : BuildState.STOPPED);
                    }
                    build.setStatus(parseBuildStatus(result));
                    build.setSummary(result.getBuildReason());

                    final IBuildCause cause = createBuildCause();
                    cause.setBuild(null);
                    final Matcher matcher = BUILDER_EXPRESSION.matcher(result.getBuildReason());
                    if (matcher.find()) {
                        final String reason = matcher.group(1);
                        final String userUrl = matcher.group(2);
                        final String name = matcher.group(3);
                        final String email = matcher.group(5);
                        StringBuilder description = new StringBuilder().append(reason).append(SPACE).append(name);
                        if (email != null) {
                            description.append(LESS_THAN).append(email).append(GREATER_THAN);
                        }
                        cause.setDescription(description.toString());

                        final IUser user = createUser();
                        user.setName(email);
                        user.setEmail(email);
                        user.setUrl(userUrl);
                        cause.setUser(user);
                    } else {
                        cause.setDescription(result.getBuildReason());
                    }
                    build.getCause().add(cause);

                    if (false) {
                        final IUser culprit = createUser();
                        build.getCulprits().add(culprit);
                    }

                    for (final Result stageResult : stage.getResults().getResult()) {
                        if (stageResult.getArtifacts().getArtifact() != null) {
                            for (final RestBuildArtifact bambooArtifact : stageResult.getArtifacts().getArtifact()) {
                                final IArtifact artifact = parseArtifacts(bambooArtifact, stage.getName());
                                build.getArtifacts().add(artifact);
                            }
                        }
                        if (stageResult.getChanges() != null) {
                            final IChangeSet changeSet = createChangeSet();
                            // Commits
                            build.setChangeSet(changeSet);
                            for (final ResultChange bambooChange : stageResult.getChanges().getChange()) {
                                final IChange change = parseChangeSet(bambooChange);
                                changeSet.getChanges().add(change);
                            }
                        }
                        parseUnitTests(testResult, stageResult);
                    }
                }
            }
        }
        return build;

    }

    private URI browserUrl(final String key) throws URISyntaxException {
        return new URI(location.getUrl() + "/browse/" + key);
    }

    private static String parserBuildSummary(final Result result) {
        final Matcher matcher = BUILDER_EXPRESSION.matcher(result.getBuildReason());
        final String description;

        if (matcher.find()) {
            final String reason = matcher.group(1);
            final String userUrl = matcher.group(2);
            final String name = matcher.group(3);
            String email = matcher.group(5);
            email = email != null ? LESS_THAN + email + GREATER_THAN : "";
            description = reason + SPACE + name;
        } else {
            description = result.getBuildReason();
        }
        return description + ", " + result.getBuildTestSummary(); //$NON-NLS-1$
    }

    private void parseUnitTests(final ITestResult testResult, final Result stageResult) throws RuntimeException {
        if (stageResult.getTestResults() != null) {
            final Map<String, List<ITestCase>> cases = new HashMap<>();

            parseTests(cases, stageResult.getTestResults().getAllTests(), null);
            parseTests(cases, stageResult.getTestResults().getQuarantinedTests(), TestCaseResult.SKIPPED);
            parseTests(cases, stageResult.getTestResults().getSkippedTests(), TestCaseResult.SKIPPED);
            parseTests(cases, stageResult.getTestResults().getFixedTests(), TestCaseResult.FIXED);

            for (final Entry<String, List<ITestCase>> tests : cases.entrySet()) {
                final ITestSuite junitSuite = createTestSuite();

                junitSuite.setDuration(stageResult.getBuildDuration());
                junitSuite.setLabel(tests.getKey());
                junitSuite.setResult(testResult);

                for (final ITestCase unitTest : tests.getValue()) {
                    unitTest.setSuite(junitSuite);
                    junitSuite.getCases().add(unitTest);
                }
                testResult.getSuites().add(junitSuite);
            }
        }
    }

    private void parseTests(final Map<String, List<ITestCase>> cases, final TestResultsResultList tests, final TestCaseResult testResult)
            throws RuntimeException {
        if (tests != null && tests.getTestResult() != null) {
            // test results
            for (final TestResult junitCase : tests.getTestResult()) {
                final ITestCase testCase = parseTestCase(junitCase);

                final List<ITestCase> list = cases.computeIfAbsent(junitCase.getClassName(), s -> new ArrayList<>());
                if (testResult == null) {
                    list.add(testCase);
                } else { // May need to update the unit test status
                    boolean found = false;
                    for (final ITestCase unitCase : list) {
                        if (testCase.getLabel().equals(unitCase.getLabel())) {
                            unitCase.setStatus(testResult);
                            if (testResult.equals(TestCaseResult.SKIPPED)) {
                                unitCase.setSkipped(true);
                            }
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        list.add(testCase);
                    }
                }
            }
        }
    }

    private IChange parseChangeSet(final ResultChange bambooChange) {
        final IChange change = createChange();

        final IUser user = createUser();
        user.setName(bambooChange.getAuthor());
        user.setId(bambooChange.getAuthor());
        change.setAuthor(user);

        change.setMessage(bambooChange.getComment());
        change.setDate(bambooChange.getDate().getTime());
        change.setRevision(bambooChange.getChangesetId());

        for (final CommitFile files : bambooChange.getFiles().getFile()) {
            final IChangeArtifact artifact = createChangeArtifact();
            artifact.setFile(files.getName());
            artifact.setRevision(files.getRevision());
            change.getArtifacts().add(artifact);

        }
        return change;
    }

    private IArtifact parseArtifacts(final RestBuildArtifact bambooArtifact, final String stageName) {
        final IArtifact artifact = createArtifact();

        artifact.setName(bambooArtifact.getName());
        String relativePath = bambooArtifact.getLink().getHref().getPath();
        if (relativePath.startsWith(DOWNLOAD_PREFIX)) {
            final int offset = relativePath.indexOf("/", DOWNLOAD_PREFIX.length());
            relativePath = relativePath.substring(offset);
        }
        artifact.setRelativePath(stageName + relativePath);
        artifact.setUrl(bambooArtifact.getLink().getHref().toString());
        return artifact;
    }

    private ITestCase parseTestCase(final TestResult junitCase) throws RuntimeException {
        final ITestCase testCase = createTestCase();

        testCase.setClassName(junitCase.getClassName());

        if (junitCase.getDuration() != null) {
            testCase.setDuration(junitCase.getDuration());
        }
        testCase.setLabel(junitCase.getMethodName());
        testCase.setStatus(parseStatus(junitCase));

        final TestResultErrorsList stackTrace = junitCase.getErrors();
        if (stackTrace != null && stackTrace.getSize() > 0) {
            // What does it mean if more than one???
            testCase.setStackTrace(stackTrace.getError().get(0).getMessage());
        }
        return testCase;
    }

    private static BuildState parseBuildState(final Result result) {
        return switch (result.getBuildState()) {
        case "Buildable" -> {
            yield BuildState.BUILDABLE;
        }
        case "Queued" -> {
            yield BuildState.QUEUED;
        }
        case "Running" -> {
            yield BuildState.RUNNING;
        }
        case "Stopped", "Failed" -> {
            yield BuildState.STOPPED;
        }
        case "Unknown" -> {
            yield null; // Need something better
        }
        default -> {
            yield null;
        }
        };
    }

    private static BuildStatus parseBuildStatus(final Result result) {
        return switch (result.getState()) {
        case "Successful" -> {
            yield BuildStatus.SUCCESS;
        }
        case "Failed" -> {
            yield BuildStatus.FAILED;
        }
        case "Unknown" -> {
            yield null;
        }
        default -> {
            throw new RuntimeException("unknown status: " + result.getState());
        }
        };
    }

    private static TestCaseResult parseStatus(final TestResult junitCase) throws RuntimeException {
        return switch (junitCase.getStatus()) {
        case "successful" -> {
            yield TestCaseResult.PASSED;
        }
        case "failed" -> {
            yield TestCaseResult.FAILED;
        }
        case "skipped" -> {
            yield TestCaseResult.SKIPPED;
        }
        default -> {
            throw new RuntimeException("unknown status: " + junitCase.getStatus());
        }
        };
    }

    @Override
    public BuildServerConfiguration getConfiguration() {

        final Map<String, String> jobNameById = getBambooConfiguration().jobNameById;
        final List<IBuildPlan> plans = new ArrayList<>(jobNameById.size());
        for (final Entry<String, String> entry : jobNameById.entrySet()) {
            final IBuildPlan plan = createBuildPlan();
            plan.setId(entry.getKey());
            plan.setName(entry.getValue());
            plans.add(plan);
        }
        return new BuildServerConfiguration(plans);
    }

    private BambooConfiguration getBambooConfiguration() {
        return cache.getConfiguration(location.getUrl());
    }

    private void setConfiguration(final BambooConfiguration configuration) {
        cache.setConfiguration(location.getUrl(), configuration);
    }

    @Override
    public Reader getConsole(final IBuild build, final IOperationMonitor monitor) throws CoreException {
        final DefaultApi def = new DefaultApi(apiClient);
        final String[] planKey = build.getPlan().getId().split(DASH);
        try {
            final Result result = def.getBuildAlias(planKey[0], planKey[1], build.getLabel(), "stages.stage.results.result");

            final List<String> logFiles = result.getStages().getStage().get(0).getResults().getResult().get(0).getLogFiles();
            if (logFiles != null) {
                final String logFile = logFiles.get(0);

                final ApiClient downloadApiClient = new ApiClient();
                downloadApiClient.updateBaseUri(location.getUrl());
                final UserCredentials credentials = location.getCredentials(AuthenticationType.REPOSITORY);
                final String userName = credentials.getUserName();
                final String password = credentials.getPassword();

                downloadApiClient.setRequestInterceptor(request -> {
                    try {
                        request.uri(new URI(logFile));
                    } catch (final URISyntaxException e) {
                        throw new RuntimeException(e);
                    }
                    addHeaders(userName, password, request);
                });
                final DownloadApi download = new DownloadApi(downloadApiClient);
                final String log = download.getFile();

                return new BufferedReader(new StringReader(log));
            } else {
                return new BufferedReader(new StringReader("<<< No output >>>"));
            }
        } catch (final ApiException e) {
            throw BambooCorePlugin.toCoreException(e);
        }
    }

    @Override
    public List<IBuildPlan> getPlans(final BuildPlanRequest request, final IOperationMonitor monitor) throws CoreException {
        final List<String> ids = request.getPlanIds();
        return getJobs(ids, monitor);
    }

    private List<IBuildPlan> getJobs(List<String> ids, final IOperationMonitor monitor) throws CoreException {
        if (ids != null && ids.isEmpty()) {
            return Collections.<IBuildPlan>emptyList();
        }

        final BuildApi build = new BuildApi(apiClient);

        final List<IBuildPlan> plans = new ArrayList<>();
        boolean updateConfig = false;
        try {
            if (ids == null) {
                updateConfig = true;
                final RestPlans allPlans = build.getAllPlanList("plans.plan.branches"); //$NON-NLS-1$

                ids = new ArrayList<>();
                for (final RestPlan plan : allPlans.getPlans().getPlan()) {
                    ids.add(plan.getPlanKey().getKey());
                    for (final RestPlanBranch branch : plan.getBranches().getBranch()) {
                        ids.add(branch.getKey());
                    }
                }
            }
            final DefaultApi def = new DefaultApi(apiClient);
            for (final String id : ids) {
                final String[] planKey = id.split(DASH);
                final RestPlan plan = build.getPlan(planKey[0], planKey[1], "stages.stage.plans[0].plan.stages.stage,variableContext");

                final RestResultsResults history = def.getBuildHistory(planKey[0], planKey[1], null, null, "results[0].result.variables", null, null, null,
                        null, null, null, null);
                final IBuildPlan job = parseBuildPlan(plan, history);
                plans.add(job);
            }

            if (updateConfig) {
                updateConfiguration(plans);
            }

            return plans;
        } catch (ApiException | URISyntaxException | InterruptedException | ExecutionException e) {
            throw BambooCorePlugin.toCoreException(e);
        }
    }

    private void updateConfiguration(final List<IBuildPlan> jobs) {
        final Map<String, String> jobNameById = new HashMap<>(jobs.size());

        for (final IBuildPlan job : jobs) {
            jobNameById.put(job.getId(), job.getName());
        }
        final BambooConfiguration configuration = new BambooConfiguration();
        configuration.jobNameById = jobNameById;
        setConfiguration(configuration);
    }

    private IBuildPlan parseBuildPlan(final RestPlan plan, final RestResultsResults history)
            throws InterruptedException, ExecutionException, ApiException, URISyntaxException {
        final IBuildPlan buildPlan = createBuildPlan();

        buildPlan.setId(plan.getStages().getStage().get(0).getPlans().getPlan().get(0).getPlanKey().getKey());
//		buildPlan.setId(plan.getPlanKey().getKey());
        buildPlan.setName(plan.getPlanKey().getKey());
        final String planName;
        if (plan.getMaster() == null) {
            planName = plan.getName();
        } else {
            planName = plan.getMaster().getName() + "/" + plan.getShortName();
        }
        buildPlan.setName(planName);
        buildPlan.setDescription(plan.getDescription());
        buildPlan.setUrl(browserUrl(plan.getPlanKey().getKey()).toString());
        buildPlan.setSummary(plan.getDescription());

        buildPlan.setState(plan.getIsBuilding() ? BuildState.RUNNING : BuildState.STOPPED);

        final List<IHealthReport> healthReports = parseHealthReport(buildPlan, plan, history);

        buildPlan.getHealthReports().addAll(healthReports);

        final Map<String, String> globals = new HashMap<>();
        if (plan.getVariableContext().getVariable() != null) {
            for (final RestVariableDefinitionContext variable : plan.getVariableContext().getVariable()) {
                if (!variable.getIsPassword()) {
                    switch (variable.getVariableType()) {
                    case PROJECT, PLAN, JOB: {
                        globals.put(variable.getKey(), variable.getValue());
                    }
                    default: {
                    }
                    }

                }
            }
        }

        final List<Result> buildHistory = history.getResults().getResult();
        if (history.getResults().getResult() != null && !history.getResults().getResult().isEmpty()) {
            final Result lastBuild = history.getResults().getResult().get(0);

            buildPlan.setStatus(parseBuildStatus(lastBuild));

            final IBuild build = createBuild();

            build.setId(lastBuild.getPlanResultKey().getKey());
            build.setLabel("build label");
            build.setBuildNumber(lastBuild.getBuildNumber());
//			build.setUrl(lastBuild.getLink().getHref().toString());

            buildPlan.setLastBuild(build);

            for (final RestVariable variable : lastBuild.getVariables().getVariable()) {
                if (globals.containsKey(variable.getName())) {
                    final IStringParameterDefinition definition = IBuildFactory.INSTANCE.createStringParameterDefinition();
                    definition.setName(variable.getName());
                    definition.setDefaultValue(variable.getValue());
                    buildPlan.getParameterDefinitions().add(definition);
                }
            }
        }

        return buildPlan;

    }

    private List<IHealthReport> parseHealthReport(final IBuildPlan buildPlan, final RestPlan plan, final RestResultsResults history)
            throws InterruptedException, ExecutionException, ApiException {
        final List<IHealthReport> healthReports = new ArrayList<>();

        final List<Result> buildResult = history.getResults().getResult();
        if (buildResult.isEmpty()) {
            final IHealthReport healthReport = createHealthReport();
            healthReport.setHealth(100);
            buildPlan.setHealth(healthReport.getHealth());
            healthReport.setDescription("Never built");

            healthReports.add(healthReport);
        } else {
            final Result result = buildResult.get(0);

            IHealthReport healthReport = createHealthReport();
            healthReport.setHealth(result.getFailedTestCount() == 0 ? 100 : 0);
            buildPlan.setHealth(healthReport.getHealth());
            healthReport.setDescription("Test result: " + result.getBuildTestSummary());
            healthReports.add(healthReport);

            if (result.getFailedTestCount() != 0) {
                final RestResultsResults lastSuccess = new DefaultApi(apiClient).getLatestBuildResults(null, null, "results.result", null, null, null, null,
                        "Successful", null, null);

                final int health;
                final Date lastDate = lastSuccess.getResults().getResult().get(0).getBuildCompletedTime();
                final Period p = Period.between(LocalDate.ofInstant(lastDate.toInstant(), ZoneId.of("UTC")), LocalDate.now());
                if (p.getDays() == 1) {
                    health = 70;
                } else if (p.getDays() > 7) {
                    health = 50;
                } else if (p.getMonths() >= 1) {
                    health = 30;
                } else {
                    health = 0;
                }
                healthReport = createHealthReport();
                healthReport.setHealth(health);
                healthReport.setDescription("Failing since: " + lastDate);

                healthReports.add(healthReport);
            }
        }
        return healthReports;
    }

    @Override
    public BuildServerConfiguration refreshConfiguration(final IOperationMonitor monitor) throws CoreException {
        getJobs(null, monitor);
        return getConfiguration();
    }

    @Override
    public void runBuild(final RunBuildRequest request, final IOperationMonitor monitor) throws CoreException {
        final String[] planKey = request.getPlan().getId().split(DASH);
        Map<String, String> parameters = request.getParameters();
        if (parameters == null) {
            parameters = new HashMap<>(0);
        }
        try {
            startBuild(planKey[0], planKey[1], true, null, null, parameters).join();
        } catch (CompletionException | ApiException e) {
            if (e.getCause() instanceof ApiException) {
                final ApiException ex = (ApiException) e.getCause();
                if (ex.getCode() == 400) {
                    System.out.println(ex.getMessage());
                } else {
                    throw BambooCorePlugin.toCoreException(e);
                }
            } else {
                throw BambooCorePlugin.toCoreException(e);
            }
        }
    }

    @Override
    // FIXME Doesn't abort: https://jira.atlassian.com/browse/BAM-21065
    public void abortBuild(final IBuild build, final IOperationMonitor monitor) throws CoreException {
//		BrowserUtil.openUrl("", 0);
        try {
            final DefaultApi def = new DefaultApi(apiClient);

            final String[] planKey = build.getPlan().getId().split(DASH, 2);
            def.stopBuild(planKey[0], planKey[1], build.getBuildNumber());

        } catch (final ApiException e) {
            throw BambooCorePlugin.toCoreException(e);
        }
    }

    @Override
    public IStatus validate(final IOperationMonitor monitor) throws CoreException {
        try {
            final RestInfo bambooInfo = new DefaultApi(apiClient).getInfo();
            final BambooServerInfo info = new BambooServerInfo(Type.BAMBOO, bambooInfo.getVersion());
            final BambooStatus status = new BambooStatus(IStatus.OK, BambooCorePlugin.ID_PLUGIN,
                    NLS.bind(Messages.BambooServerBehaviour_Validation_succesful, info.getVersion()));
            status.setInfo(info);
            return status;
        } catch (final ApiException e) {
            throw BambooCorePlugin.toCoreException(e);
        }
    }

    /**
     * Custom version of startBuild that allows parameters to be set for build
     *
     * @param projectKey
     * @param buildKey
     * @param executeAllStages
     * @param customRevision
     * @param stage
     * @param variables
     * @return
     * @throws ApiException
     */
    private CompletableFuture<RestQueuedBuild> startBuild(final String projectKey, final String buildKey, final Boolean executeAllStages,
            final String customRevision, final String stage, final Map<String, String> variables) throws ApiException {
        try {
            final HttpRequest.Builder localVarRequestBuilder = startBuildRequestBuilder(projectKey, buildKey, executeAllStages, customRevision, stage,
                    variables);
            final HttpClient memberVarHttpClient = apiClient.getHttpClient();
            final ObjectMapper memberVarObjectMapper = apiClient.getObjectMapper();

            return memberVarHttpClient.sendAsync(localVarRequestBuilder.build(), HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
                if (localVarResponse.statusCode() / 100 != 2) {
                    return CompletableFuture.failedFuture(getApiException("startBuild", localVarResponse)); //$NON-NLS-1$
                }
                try {
                    return CompletableFuture.completedFuture(memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<RestQueuedBuild>() {
                    }));
                } catch (final IOException e) {
                    return CompletableFuture.failedFuture(new ApiException(e));
                }
            });
        } catch (final ApiException e) {
            return CompletableFuture.failedFuture(e);
        }
    }

    private HttpRequest.Builder startBuildRequestBuilder(final String projectKey, final String buildKey, final Boolean executeAllStages,
            final String customRevision, final String stage, final Map<String, String> variables) throws ApiException {
        // verify the required parameter 'projectKey' is set
        if (projectKey == null) {
            throw new ApiException(400, "Missing the required parameter 'projectKey' when calling startBuild");
        }
        // verify the required parameter 'buildKey' is set
        if (buildKey == null) {
            throw new ApiException(400, "Missing the required parameter 'buildKey' when calling startBuild");
        }

        final HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

        final String localVarPath = "/api/latest/queue/{projectKey}-{buildKey}".replace("{projectKey}", ApiClient.urlEncode(projectKey.toString()))
                .replace("{buildKey}", ApiClient.urlEncode(buildKey.toString()));

        final List<Pair> localVarQueryParams = new ArrayList<>(ApiClient.parameterToPairs("executeAllStages", executeAllStages));
        localVarQueryParams.addAll(ApiClient.parameterToPairs("customRevision", customRevision));
        localVarQueryParams.addAll(ApiClient.parameterToPairs("stage", stage));

        for (final Entry<String, String> var : variables.entrySet()) {
            localVarQueryParams.addAll(ApiClient.parameterToPairs("bamboo.variable." + var.getKey(), var.getValue()));
        }

        final ObjectMapper memberVarObjectMapper = apiClient.getObjectMapper();
        final Duration memberVarReadTimeout = apiClient.getReadTimeout();
        final String memberVarBaseUri = apiClient.getBaseUri();
        final Consumer<Builder> memberVarInterceptor = apiClient.getRequestInterceptor();

        if (!localVarQueryParams.isEmpty()) {
            final StringJoiner queryJoiner = new StringJoiner("&");
            localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
            localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
        } else {
            localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
        }

        localVarRequestBuilder.header("Content-Type", "application/json");
        localVarRequestBuilder.header("Accept", "application/json");

        try {
            final byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(new StartBuildRequest());
            localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
        } catch (final IOException e) {
            throw new ApiException(e);
        }

        if (memberVarReadTimeout != null) {
            localVarRequestBuilder.timeout(memberVarReadTimeout);
        }
        if (memberVarInterceptor != null) {
            memberVarInterceptor.accept(localVarRequestBuilder);
        }
        return localVarRequestBuilder;
    }

    private static ApiException getApiException(final String operationId, final HttpResponse<String> response) {
        final String message = formatExceptionMessage(operationId, response.statusCode(), response.body());
        return new ApiException(response.statusCode(), message, response.headers(), response.body());
    }

    private static String formatExceptionMessage(final String operationId, final int statusCode, String body) {
        if (body == null || body.isEmpty()) {
            body = "[no body]";
        }
        return operationId + " call failed with: " + statusCode + " - " + body;
    }

}
