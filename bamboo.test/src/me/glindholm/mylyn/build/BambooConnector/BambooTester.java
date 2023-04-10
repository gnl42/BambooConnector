package me.glindholm.mylyn.build.BambooConnector;

import java.util.Base64;
import java.util.concurrent.ExecutionException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import me.glindholm.mylyn.build.bamboo.api.BuildApi;
import me.glindholm.mylyn.build.bamboo.api.CoreApi;
import me.glindholm.mylyn.build.bamboo.api.DefaultApi;
import me.glindholm.mylyn.build.bamboo.api.DeploymentApi;
import me.glindholm.mylyn.build.bamboo.api.PermissionsApi;
import me.glindholm.mylyn.build.bamboo.api.ResourceApi;
import me.glindholm.mylyn.build.bamboo.api.UserManagementApi;
import me.glindholm.mylyn.build.bamboo.invoker.ApiClient;
import me.glindholm.mylyn.build.bamboo.invoker.ApiException;
import me.glindholm.mylyn.build.bamboo.model.BuildPlan;
import me.glindholm.mylyn.build.bamboo.model.BuildPlanResults;
import me.glindholm.mylyn.build.bamboo.model.BuildPlans;
import me.glindholm.mylyn.build.bamboo.model.BuildResult;
import me.glindholm.mylyn.build.bamboo.model.BuildResults;
import me.glindholm.mylyn.build.bamboo.model.FindUsersInGroup200Response;
import me.glindholm.mylyn.build.bamboo.model.RestProjects;
import me.glindholm.mylyn.build.bamboo.model.RestResources;
import me.glindholm.mylyn.build.bamboo.model.RestResults;
import me.glindholm.mylyn.build.bamboo.model.ServerInfo;
import me.glindholm.mylyn.build.bamboo.model.UserBean;

public class BambooTester {
    private static final Logger log = LoggerFactory.getLogger(BambooTester.class);

    static ApiClient apiClient;

    @BeforeAll
    public static void connect() {
        apiClient = new ApiClient();
        apiClient.updateBaseUri("http://192.168.0.120:9380/rest");
        final ObjectMapper mapper = apiClient.getObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
//        apiClient.updateBaseUri("https://192.168.0.120:9383/rest");
        apiClient.setRequestInterceptor(authorize -> authorize.header("Authorization", basicAuth("gnl", System.getenv("PW"))));

    }

    private static String basicAuth(final String username, final String password) {
        return "Basic " + Base64.getEncoder().encodeToString((username + ":" + password).getBytes());
    }

    @Test
    public void testServer() throws InterruptedException, ExecutionException, ApiException {
        final BuildApi build = new BuildApi(apiClient);
        final CoreApi core = new CoreApi(apiClient);
        final DefaultApi def = new DefaultApi(apiClient);
        final DeploymentApi deployment = new DeploymentApi(apiClient);
        final PermissionsApi permissions = new PermissionsApi(apiClient);
        final ResourceApi resource = new ResourceApi(apiClient);
        final UserManagementApi user = new UserManagementApi(apiClient);

        final ServerInfo serverInfo = def.getInfo().get();
        log.trace("{}", serverInfo);
    }

    @Test
    public void testAllPlans() throws InterruptedException, ExecutionException, ApiException {
        final BuildApi build = new BuildApi(apiClient);

        final BuildPlans plans = build.getAllPlanList("plans", null, 5000).get();
        log.info("{}", plans);
    }

    @Test
    public void testPlan() throws InterruptedException, ExecutionException, ApiException {
        final BuildApi build = new BuildApi(apiClient);

        final BuildPlan plans = build.getPlan("AP-CON0", "", null).get();
        log.info("{}", plans);

    }

    @Test
    public void testNoBuildPlan() throws InterruptedException, ExecutionException, ApiException {
        final BuildApi build = new BuildApi(apiClient);

        final BuildPlan plans = build.getPlan("JT-STSUIQ", "", null).get();
        log.info("{}", plans);

    }

    @Test
    public void testBranch() throws InterruptedException, ExecutionException, ApiException {
        final BuildApi build = new BuildApi(apiClient);

        final Object plans = build.getPlanBranches("AP", "CON", null, null, null, null).get();
        log.info("{}", plans);

    }

    @Test
    public void testResult() throws InterruptedException, ExecutionException, ApiException {
        final DefaultApi def = new DefaultApi(apiClient);

//        final RestResultList plan = def.getLatestBuildResultsForBuild("AP-CON0", "2", "changes", null, null, null, null, null, null, null, null, null).get();

        final BuildResult res = def.getBuild("AP", "CON0", "2", "changes", null).get();
        final BuildPlanResults res2 = def.getLatestBuildResultsForProject("AP-CON", "results", null, null, null, null, null, null, null, null, null).get();
        log.info("{}", res2);
    }

    @Test
    public void testUsers() throws InterruptedException, ExecutionException, ApiException {
        final UserManagementApi user = new UserManagementApi(apiClient);

        final FindUsersInGroup200Response users = user.getUsers(null, null, null).get();
        log.info("{}", users);

    }

    @Test
    public void testCurrentUser() throws InterruptedException, ExecutionException, ApiException {
        final DefaultApi def = new DefaultApi(apiClient);

        final UserBean myself = def.getCurrentUser().get();
        log.info("{}", myself);
    }

    @Test
    public void testResults() throws InterruptedException, ExecutionException, ApiException {
        final BuildApi build = new BuildApi(apiClient);
        final CoreApi core = new CoreApi(apiClient);
        final DefaultApi def = new DefaultApi(apiClient);

        final RestResults res = def.getLatestBuildResults(null, null, null, null, null, null, null, null, null, null).get();
        log.info("{}", res);
    }

    @Test
    public void testResultProject() throws InterruptedException, ExecutionException, ApiException {
        final BuildApi build = new BuildApi(apiClient);
        final CoreApi core = new CoreApi(apiClient);
        final DefaultApi def = new DefaultApi(apiClient);

        final BuildResult res = def.getLatestBuildResultForProject("AP-CON0",
                "changes,changes.change,changes.change.files,comments,comments.comment,labels,stages.stage[0],stages.stage[0].results.result.testResults.allTests.testResult.errors,stages.stage.results.result.testResults.failedTests.testResult.errors",
                null, null, null, null, null, null, null, null, null).get();
        log.info("{}", res);
    }

    @Test
    public void testResultMissingPlan() throws InterruptedException, ExecutionException, ApiException {
        final BuildApi build = new BuildApi(apiClient);
        final CoreApi core = new CoreApi(apiClient);
        final DefaultApi def = new DefaultApi(apiClient);

        try {
            final BuildResult res = def.getLatestBuildResultForProject("JT-STSUIQ",
                    "changes,changes.change,changes.change.files,comments,comments.comment,labels,stages.stage[0],stages.stage[0].results.result.testResults.allTests.testResult.errors,stages.stage.results.result.testResults.failedTests.testResult.errors",
                    null, null, null, null, null, null, null, null, null).get();
            log.info("{}", res);
        } catch (InterruptedException | ExecutionException | ApiException e) {
            if (e.getCause() != null && e.getCause() instanceof ApiException) {
                final ApiException realE = (ApiException) e.getCause();
                if (realE.getCode() == 404) {
                    return;
                }
            }
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Test
    public void testResultBuildKey() throws InterruptedException, ExecutionException, ApiException {
        final BuildApi build = new BuildApi(apiClient);
        final CoreApi core = new CoreApi(apiClient);
        final DefaultApi def = new DefaultApi(apiClient);

        final BuildResults res = def.getBuildHistory("AP", "CON0", null, null, "results[0].result", null, null, null, null, null, null, null).get();
        log.info("{}", res);
    }

    @Test
    public void testResultBuild() throws InterruptedException, ExecutionException, ApiException {
        final BuildApi build = new BuildApi(apiClient);
        final CoreApi core = new CoreApi(apiClient);
        final DefaultApi def = new DefaultApi(apiClient);

//        final RestResults history = def.getBuildHistory("AP", "CON0", true, true, "changes", null, null, null, null, null, null, null).get();
        final BuildResult res = def
                .getBuild("AP", "CON0", "2", "changes,metadata,plan,master,vcsRevisions,artifacts,comments,labels,jiraIssues,variables,stages", null).get();
        log.info("{}", res);
    }

    @Test
    public void testResultStatus() throws InterruptedException, ExecutionException, ApiException {
        final BuildApi build = new BuildApi(apiClient);
        final CoreApi core = new CoreApi(apiClient);
        final DefaultApi def = new DefaultApi(apiClient);

//        final RestResults history = def.getBuildHistory("AP", "CON0", true, true, "changes", null, null, null, null, null, null, null).get();
        final BuildResult history = def.getBuild("AP", "CON0", "JOB1-2", "testResults.allTests.testResult.errors", null).get();
        log.info("{}", history);
    }

    @Test
    public void testTestErrors() throws InterruptedException, ExecutionException, ApiException {
        final BuildApi build = new BuildApi(apiClient);
        final CoreApi core = new CoreApi(apiClient);
        final DefaultApi def = new DefaultApi(apiClient);

//        final RestResults history = def.getBuildHistory("AP", "CON0", true, true, "changes", null, null, null, null, null, null, null).get();
        final BuildResult history = def.getBuild("AP", "CON0", "2", "testResults.allTests.testResult.errors", null).get();
        log.info("{}", history);
    }

    @Test
    public void testServices() throws InterruptedException, ExecutionException, ApiException {
        final BuildApi build = new BuildApi(apiClient);
        final CoreApi core = new CoreApi(apiClient);
        final DefaultApi def = new DefaultApi(apiClient);

//        final RestResults history = def.getBuildHistory("AP", "CON0", true, true, "changes", null, null, null, null, null, null, null).get();
        final RestResources history = def.getAllServices().get();
        log.info("{}", history);
    }

    @Test
    public void testProjects() throws InterruptedException, ExecutionException, ApiException {
        final BuildApi build = new BuildApi(apiClient);
        final CoreApi core = new CoreApi(apiClient);
        final DefaultApi def = new DefaultApi(apiClient);

        final RestProjects res = def.getProjects(null, true).get();
        log.info("{}", res);
    }

}
