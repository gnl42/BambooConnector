package me.glindholm.mylyn.build.BambooConnector;

import java.util.Base64;
import java.util.concurrent.ExecutionException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

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
import me.glindholm.mylyn.build.bamboo.invoker.ApiResponse;
import me.glindholm.mylyn.build.bamboo.model.GetUsers200Response;
import me.glindholm.mylyn.build.bamboo.model.RestInfo;
import me.glindholm.mylyn.build.bamboo.model.RestPlan;
import me.glindholm.mylyn.build.bamboo.model.RestPlans;
import me.glindholm.mylyn.build.bamboo.model.RestProjects;
import me.glindholm.mylyn.build.bamboo.model.RestResources;
import me.glindholm.mylyn.build.bamboo.model.RestResults;
import me.glindholm.mylyn.build.bamboo.model.RestResultsResults;
import me.glindholm.mylyn.build.bamboo.model.Result;
import me.glindholm.mylyn.build.bamboo.model.UserBean;

public class BambooTester9 {
    static ApiClient apiClient;

    @BeforeAll
    public static void connect() {
        apiClient = new ApiClient();
        final ObjectMapper mapper = apiClient.getObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
        apiClient.updateBaseUri("https://192.168.0.120:9683/rest");
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

        final RestInfo serverInfo = def.getInfo().get();
        System.out.println( serverInfo);
    }

    @Test
    public void testAllPlans() throws InterruptedException, ExecutionException, ApiException {
        final BuildApi build = new BuildApi(apiClient);

        RestPlans  plans = build.getAllPlanList("plans,plans.plan,plans.plan.actions,plans.plan.stages.stage.plans.plan,plans.plan.branches.branch.latestResult.labels.label,plans.plan.branches.branch.latestResult.comment,plans.plan.branches.branch.latestResult.jiraIssues,plans.plan.branches.branch.latestResult.vcsRevisions").get();
        System.out.println( plans);
    }

    @Test
    public void testPlan() throws InterruptedException, ExecutionException, ApiException {
        final BuildApi build = new BuildApi(apiClient);

        final RestPlan plans = build.getPlan("MYL9", "CON9", "actions,stages,branches,variableContext").get();
        System.out.println( plans);

    }


    @Test
    public void testBranch() throws InterruptedException, ExecutionException, ApiException {
        final BuildApi build = new BuildApi(apiClient);

        final Object plans = build.getPlanBranches("MYL9", "CON9", null, null, null, null).get();
        System.out.println( plans);

    }

//    @Test
//    public void testResult() throws InterruptedException, ExecutionException, ApiException {
//        final DefaultApi def = new DefaultApi(apiClient);
//
////        final RestResultList plan = def.getLatestBuildResultsForBuild("AP-CON0", "2", "changes", null, null, null, null, null, null, null, null, null).get();
//
//        final Result res = def.getBuild("AP", "CON0", "2", "changes", null).get();
//        final BuildPlanResults res2 = def.getLatestBuildResultsForProject("AP-CON", "results", null, null, null, null, null, null, null, null, null).get();
//        System.out.println( res2);
//    }

    @Test
    public void testUsers() throws InterruptedException, ExecutionException, ApiException {
        final UserManagementApi user = new UserManagementApi(apiClient);

        GetUsers200Response  users = user.getUsers(null, null, null).get();
        System.out.println( users);

    }

    @Test
    public void testCurrentUser() throws InterruptedException, ExecutionException, ApiException {
        final DefaultApi def = new DefaultApi(apiClient);

        final UserBean myself = def.getCurrentUser().get();
        System.out.println( myself);
    }

    @Test
    public void testLatestBuildResults() throws InterruptedException, ExecutionException, ApiException {
        final BuildApi build = new BuildApi(apiClient);
        final CoreApi core = new CoreApi(apiClient);
        final DefaultApi def = new DefaultApi(apiClient);

        final RestResultsResults res = def.getLatestBuildResults(null, null, "results.result.artifacts,results.result.variables,results.result.stages", null, null, null, null, null, null, null).get();
        System.out.println( res);
    }

    @Test
    public void testBuildAlias() throws InterruptedException, ExecutionException, ApiException {
        final DefaultApi def = new DefaultApi(apiClient);
        String expand = "result,changes,changes.change,changes.change.files,comments,comments.comment,labels,stages.stage[0],stages.stage[0].results.result.testResults.allTests.testResult.errors,stages.stage.results.result.testResults.failedTests.testResult.errors,stages.stage.results.result.metadata";
         expand = String.join(",",
//        		"result",
//        		"changes.change.files",
//        		"comments.comment",
//        		"labels.label",
//        		"variables",
//        		"artifacts.artifact",
        		"testResults",
        		 "artifacts",
        		 "comments",
        		 "labels",
        		 "logFiles",
        		 "changes.change.files",
        		 "metadata",
        		 "testResults",
        		 "metadata",
        		 "jiraIssues",
        		 "vcsRevisions",
        		 "variables",
        		"stages.stage.results.result.artifacts",
        		"stages.stage.results.result.variables",
        		"stages.stage.results.result.changes",
        		"stages.stage.results.result.comments",
        		"stages.stage.results.result.testResults.allTests.testResult.errors.error"
        		);
		String label = null;
		String buildState = null;
		String favourite = null;
		Boolean includeAllStates = null;
		Boolean contnuable = null;
		Integer maxResults = null;
		Integer startIndex = null;
		String issueKey = null;
		String lifeCycleState = null;
		Result res = def.getBuildAlias("MYL9", "CON90", "3", expand).get();
		System.out.println( res);
    }

    private static final String ALL_TESTS = "stages.stage[0].results.result.testResults.allTests.testResult.errors";
    private static final String SUCCESSFUL_TESTS = "stages.stage.results.result.testResults.successfulTests.testResult.errors";
    private static final String FAILED_TESTS = "stages.stage.results.result.testResults.failedTests.testResult.errors";
//        		stages.stage.changes.change.files.file

    @Test
    public void testLatestBuildResultsProject() throws InterruptedException, ExecutionException, ApiException {
        final BuildApi build = new BuildApi(apiClient);
        final CoreApi core = new CoreApi(apiClient);
        final DefaultApi def = new DefaultApi(apiClient);

        String expand = """
        		result,
        		changes.change.files,
        		comments.comment,
        		labels.label,
        		variables,
        		artifacts.artifact,
        		stages.stage.results.result.artifacts.artifact
        		""";
		String label = null;
		String buildState = null;
		String favourite = null;
		Boolean includeAllStates = null;
		Boolean contnuable = null;
		Integer maxResults = null;
		Integer startIndex = null;
		String issueKey = null;
		String lifeCycleState = null;
		RestResultsResults res = def.getLatestBuildResults(includeAllStates, contnuable, expand, issueKey, maxResults, startIndex, label, buildState, favourite, lifeCycleState).get();

        System.out.println( res);
    }

    @Test
    public void testLatestBuildResultsForProject() throws InterruptedException, ExecutionException, ApiException {
        final BuildApi build = new BuildApi(apiClient);
        final CoreApi core = new CoreApi(apiClient);
        final DefaultApi def = new DefaultApi(apiClient);

        String expand = String.join(",","results.result.stages.stage");
		String label = null;
		String buildState = null;
		String favourite = null;
		Boolean includeAllStates = null;
		Boolean contnuable = null;
		Integer maxResults = null;
		Integer startIndex = null;
		String projectKey = "MYL9";
		RestResultsResults res = def.getLatestBuildResultsForProject(projectKey, includeAllStates, contnuable, expand, null, maxResults, startIndex, label, buildState, favourite, favourite).get();

        System.out.println( res);
    }

    @Test
    public void testBuildHistory() throws InterruptedException, ExecutionException, ApiException {
        final DefaultApi def = new DefaultApi(apiClient);
		String label = null;
		String buildState = null;
		String favourite = null;
		Boolean includeAllStates = null;
		Boolean contnuable = null;
		Integer maxResults = null;
		Integer startIndex = null;
		String expand = "changes,metadata,plan,master,vcsRevisions,artifacts,comments,labels,jiraIssues,variables,stages";
       String issueKey = null;
	String lifeCycleState = null;
	RestResults res = def.getBuildHistory("MYL9", "CON90-2", true, true, expand, issueKey, null, null, label, buildState, favourite, lifeCycleState).get();
	 System.out.println( res);
    }

    @Test
    public void testResultBuild() throws InterruptedException, ExecutionException, ApiException {
        final BuildApi build = new BuildApi(apiClient);
        final CoreApi core = new CoreApi(apiClient);
        final DefaultApi def = new DefaultApi(apiClient);

//        final RestResults history = def.getBuildHistory("AP", "CON0", true, true, "changes", null, null, null, null, null, null, null).get();
        final Result res = def.getBuild("AP", "CON0", "2", "changes,metadata,plan,master,vcsRevisions,artifacts,comments,labels,jiraIssues,variables,stages", null).get();
        System.out.println( res);
    }


    @Test
    public void testResultMissingPlan() throws InterruptedException, ExecutionException, ApiException {
        final BuildApi build = new BuildApi(apiClient);
        final CoreApi core = new CoreApi(apiClient);
        final DefaultApi def = new DefaultApi(apiClient);

        try {
            String expand = "changes,changes.change,changes.change.files,comments,comments.comment,labels,stages.stage[0],stages.stage[0].results.result.testResults.allTests.testResult.errors,stages.stage.results.result.testResults.failedTests.testResult.errors";
    		String label = null;
    		String buildState = null;
    		String favourite = null;
    		Boolean includeAllStates = null;
    		Boolean contnuable = null;
    		Integer maxResults = null;
    		Integer startIndex = null;
    		String projectKey = "AP-CON5";
			RestResultsResults res = def.getLatestBuildResultsForProject(projectKey, includeAllStates, contnuable, expand, null, maxResults, startIndex, label, buildState, favourite, favourite).get();
            System.out.println( res);
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

        final RestResults res = def.getBuildHistory("AP", "CON0", null, null, "results[0].result", null, null, null, null, null, null, null).get();
        System.out.println( res);
    }

    @Test
    public void testResultStatus() throws InterruptedException, ExecutionException, ApiException {
        final BuildApi build = new BuildApi(apiClient);
        final CoreApi core = new CoreApi(apiClient);
        final DefaultApi def = new DefaultApi(apiClient);

//        final RestResults history = def.getBuildHistory("AP", "CON0", true, true, "changes", null, null, null, null, null, null, null).get();
        final Result history = def.getBuild("AP", "CON0", "JOB1-2", "testResults.allTests.testResult.errors", null).get();
        System.out.println( history);
    }

    @Test
    public void testTestErrors() throws InterruptedException, ExecutionException, ApiException {
        final BuildApi build = new BuildApi(apiClient);
        final CoreApi core = new CoreApi(apiClient);
        final DefaultApi def = new DefaultApi(apiClient);

//        final RestResults history = def.getBuildHistory("AP", "CON0", true, true, "changes", null, null, null, null, null, null, null).get();
        final Result history = def.getBuild("AP", "CON0", "2", "testResults.allTests.testResult.errors", null).get();
        System.out.println( history);
    }

    @Test
    public void testServices() throws InterruptedException, ExecutionException, ApiException {
        final BuildApi build = new BuildApi(apiClient);
        final CoreApi core = new CoreApi(apiClient);
        final DefaultApi def = new DefaultApi(apiClient);

//        final RestResults history = def.getBuildHistory("AP", "CON0", true, true, "changes", null, null, null, null, null, null, null).get();
        final RestResources history = def.getAllServices().get();
        System.out.println( history);
    }

    @Test
    public void testProjects() throws InterruptedException, ExecutionException, ApiException {
        final BuildApi build = new BuildApi(apiClient);
        final CoreApi core = new CoreApi(apiClient);
        final DefaultApi def = new DefaultApi(apiClient);

        final RestProjects res = def.getProjects(null, true).get();
        System.out.println( res);
    }

}
