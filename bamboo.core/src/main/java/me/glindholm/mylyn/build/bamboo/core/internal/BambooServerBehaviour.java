package me.glindholm.mylyn.build.bamboo.core.internal;

import java.io.IOException;
import java.io.Reader;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.mylyn.builds.core.BuildState;
import org.eclipse.mylyn.builds.core.IBuild;
import org.eclipse.mylyn.builds.core.IBuildPlan;
import org.eclipse.mylyn.builds.core.IChangeSet;
import org.eclipse.mylyn.builds.core.ITestResult;
import org.eclipse.mylyn.builds.core.spi.BuildPlanRequest;
import org.eclipse.mylyn.builds.core.spi.BuildServerBehaviour;
import org.eclipse.mylyn.builds.core.spi.BuildServerConfiguration;
import org.eclipse.mylyn.builds.core.spi.GetBuildsRequest;
import org.eclipse.mylyn.builds.core.spi.GetBuildsRequest.Kind;
import org.eclipse.mylyn.builds.core.spi.GetBuildsRequest.Scope;
import org.eclipse.mylyn.builds.core.spi.RunBuildRequest;
import org.eclipse.mylyn.commons.core.operations.IOperationMonitor;
import org.eclipse.mylyn.commons.repositories.core.RepositoryLocation;
import org.eclipse.osgi.util.NLS;

import me.glindholm.mylyn.build.bamboo.core.BambooCorePlugin;
import me.glindholm.mylyn.build.bamboo.core.internal.client.BambooConfigurationCache;
import me.glindholm.mylyn.build.bamboo.core.internal.client.BambooException;
import me.glindholm.mylyn.build.bamboo.core.internal.client.BambooRestClient;
import me.glindholm.mylyn.build.bamboo.invoker.ApiException;
import me.glindholm.mylyn.build.bamboo.model.BuildPlan;
import me.glindholm.mylyn.build.bamboo.model.BuildPlans;
import me.glindholm.mylyn.build.bamboo.model.BuildResult;
import me.glindholm.mylyn.build.bamboo.model.ServerInfo;

public class BambooServerBehaviour extends BuildServerBehaviour {

    private final BambooRestClient client;
    private final RepositoryLocation location;

    public BambooServerBehaviour(final RepositoryLocation location, final BambooConfigurationCache cache) {
        this.location = location;
        client = new BambooRestClient(location, cache);
    }

    @Override
    public BuildServerConfiguration getConfiguration() {
        final List<IBuildPlan> plans = new ArrayList<>();
        if (client.isInitialized()) {
            try {
                final BuildPlans bambooPlans = client.getPlans();
                for (final BuildPlan bambooPlan : bambooPlans.getPlans().getPlan()) {
                    final IBuildPlan plan = createBuildPlan();
                    plan.setId(bambooPlan.getKey());
                    plan.setName(bambooPlan.getName());
                    plan.setDescription(bambooPlan.getDescription());
                    plans.add(plan);

                }
            } catch (InterruptedException | ExecutionException | ApiException e) {
                // FIXME throw BambooCorePlugin.toCoreException(new BambooException(e));
            }
        }
        return new BuildServerConfiguration(plans);
    }

    @Override
    public List<IBuild> getBuilds(final GetBuildsRequest request, final IOperationMonitor monitor) throws CoreException {
        try {
            if (request.getKind() == Kind.LAST || request.getKind() == Kind.SELECTED) {
                final IBuildPlan plan = request.getPlan();

                final BuildResult result = client.getBuildResult(plan.getId(), 0);
//                        request.getKind() == Kind.LAST ? 0 : Integer.parseInt(request.getIds().iterator().next()));
                final IBuild build = createBuild();
                build.setDuration(result.getBuildDurationInSeconds());
                build.setBuildNumber(result.getBuildNumber());
                build.setRefreshDate(result.getBuildStartedTime());
                final IChangeSet changeSet = createChangeSet();
                changeSet.setKind("42");
                build.setChangeSet(changeSet);

                final ITestResult testResult = createTestResult();
                testResult.setBuild(build);
                testResult.setFailCount(result.getFailedTestCount());
                testResult.setPassCount(result.getSuccessfulTestCount());

                build.setTestResult(testResult);
                return Collections.singletonList(build);

            }

            if (request.getKind() == Kind.ALL && request.getScope() == Scope.HISTORY) {
                final List<IBuild> builds = new ArrayList<>();

                throw BambooCorePlugin.toCoreException(new BambooException("Not implemented (yet!)"));
            }
            return null;
        } catch (InterruptedException | ExecutionException | ApiException | CoreException e) {
            throw BambooCorePlugin.toCoreException(new BambooException(e));
        }
    }

    @Override
    public Reader getConsole(final IBuild build, final IOperationMonitor monitor) throws CoreException {
        // TODO Auto-generated method stub
        try {
            return client.getLogfile(build.getId(), monitor);
        } catch (URISyntaxException | InterruptedException | ExecutionException | ApiException | IOException e) {
            throw BambooCorePlugin.toCoreException(new BambooException(e));
        }

    }

    @Override
    public List<IBuildPlan> getPlans(final BuildPlanRequest request, final IOperationMonitor monitor) throws CoreException {
        final List<IBuildPlan> plans = new ArrayList<>(request.getPlanIds().size());
        try {
            for (final String planId : request.getPlanIds()) {
                final BuildPlan bambooPlan = client.getPlan(planId);
                final IBuildPlan plan = createBuildPlan();

                plan.setId(bambooPlan.getKey());
                plan.setName(bambooPlan.getName());
                plan.setDescription(bambooPlan.getDescription());
                plan.setUrl(bambooPlan.getLink().getHref().toString());
                plan.setState(bambooPlan.getIsBuilding() ? BuildState.RUNNING : BuildState.STOPPED);
                final BuildResult bambooBuild = client.getBuildResult(planId, 0);
                final IBuild build = createBuild();
                build.setId(bambooBuild.getBuildNumber() + "");
                // build.setLabel(bambooBuild.getLabels().getLabel().get(0));
                build.setUrl(bambooBuild.getLink().getHref().toString());
                build.setDuration(bambooBuild.getBuildDuration());
                build.setState(bambooBuild.getBuildState().equals("failed") ? BuildState.STOPPED : BuildState.BUILDABLE);

                plan.setLastBuild(build);

                plans.add(plan);

            }

        } catch (InterruptedException | ExecutionException | ApiException e) {
            throw BambooCorePlugin.toCoreException(new BambooException(e));
        }
        return plans;
    }

    @Override
    public BuildServerConfiguration refreshConfiguration(final IOperationMonitor monitor) throws CoreException {
        return getConfiguration();
    }

    @Override
    public void runBuild(final RunBuildRequest request, final IOperationMonitor monitor) throws CoreException {
        // TODO Auto-generated method stub

    }

    @Override
    public IStatus validate(final IOperationMonitor monitor) throws CoreException {
        try {
            final ServerInfo info = client.validate(monitor);
            final BambooStatus status = new BambooStatus(IStatus.OK, BambooCorePlugin.ID_PLUGIN,
                    NLS.bind(Messages.BambooServerBehaviour_Validation_succesful, info.getVersion()));
            status.setInfo(info);
            return status;
        } catch (InterruptedException | ExecutionException | ApiException e) {
            throw BambooCorePlugin.toCoreException(new BambooException(e));
        }
    }

}
