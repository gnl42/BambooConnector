package me.glindholm.mylyn.build.bamboo.core.internal.client;

import static org.apache.commons.lang3.StringUtils.isNotEmpty;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Base64;
import java.util.concurrent.ExecutionException;

import org.eclipse.mylyn.commons.core.operations.IOperationMonitor;
import org.eclipse.mylyn.commons.repositories.core.RepositoryLocation;
import org.eclipse.mylyn.commons.repositories.core.auth.AuthenticationType;
import org.eclipse.mylyn.commons.repositories.core.auth.UserCredentials;

import me.glindholm.mylyn.build.bamboo.api.BuildApi;
import me.glindholm.mylyn.build.bamboo.api.DefaultApi;
import me.glindholm.mylyn.build.bamboo.invoker.ApiClient;
import me.glindholm.mylyn.build.bamboo.invoker.ApiException;
import me.glindholm.mylyn.build.bamboo.model.RestInfo;
import me.glindholm.mylyn.build.bamboo.model.RestPlan;
import me.glindholm.mylyn.build.bamboo.model.RestPlans;
import me.glindholm.mylyn.build.bamboo.model.RestResultsResults;
import me.glindholm.mylyn.build.bamboo.model.Result;

public class BambooRestClient {

    private ApiClient client;
    private final RepositoryLocation location;

    public BambooRestClient(final RepositoryLocation location, final BambooConfigurationCache cache) {
        this.location = location;
    }

    public boolean isInitialized() {
        return client != null;
    }

    private ApiClient getClient() {
        if (client == null) {
            createClient(location);
        }
        return client;
    }

    public void createClient(final RepositoryLocation location) {
        final UserCredentials credentials = location.getCredentials(AuthenticationType.REPOSITORY);
        final String url = location.getUrl();
        final String userName = credentials.getUserName();
        final String password = credentials.getPassword();
        client = new ApiClient();
        final HttpClient.Builder httpClient = HttpClient.newBuilder();
//        httpClient.connectTimeout(Duration.ofMinutes(1)) //
//                .followRedirects(followRedirects ? HttpClient.Redirect.ALWAYS : HttpClient.Redirect.NEVER);
        client.setHttpClientBuilder(httpClient);

        client.updateBaseUri(url + "/rest");
        client.setRequestInterceptor(authorize -> addHeaders(userName, password, authorize));
    }

    private static HttpRequest.Builder addHeaders(final String username, final String password, final HttpRequest.Builder authorize) {
        authorize.header("Authorization", isNotEmpty(password) ? basicAuth(username, password) : bearerAuth(password));
        authorize.header("User-Agent", "Bamboo Mylyn Build Connector");
        return authorize;
    }

    private static String basicAuth(final String username, final String password) {
        return "Basic " + Base64.getEncoder().encodeToString((username + ":" + password).getBytes());
    }

    private static String bearerAuth(final String token) {
        return "Bearer " + token;
    }

    public RestInfo validate(final IOperationMonitor monitor) throws InterruptedException, ExecutionException, ApiException {
        createClient(location);

        return new DefaultApi(client).getInfo().get();
    }

    public  RestPlans getPlans() throws InterruptedException, ExecutionException, ApiException {
        return new BuildApi(getClient()).getAllPlanList("plans").get();
    }

    public  RestPlan getPlan(final String planId) throws InterruptedException, ExecutionException, ApiException {
        return new BuildApi(getClient()).getPlan(planId, "", null).get();
    }

    public  Result getBuildResult(final String planId, final int i) throws InterruptedException, ExecutionException, ApiException {
        String expand = String.join(",","results.result.stages.stage");
        DefaultApi def = new DefaultApi(getClient());
		RestResultsResults result = def.getLatestBuildResultsForProject(planId, null, null, expand, null, null, null, null, null, null, null).get();
		return result.getResults().getResult().get(0);
    }

    public Reader getLogfile(final String planId, final IOperationMonitor monitor)
            throws InterruptedException, ExecutionException, ApiException, MalformedURLException, IOException, URISyntaxException {

        DefaultApi def = new DefaultApi(getClient());
        String expand = String.join(",","results.result.stages.stage");
		RestResultsResults result = def.getLatestBuildResultsForProject(planId, null, null, expand, null, null, null, null, null, null, null).get();
        final String logFile = result.getResults().getResult().get(0).getLogFiles().get(0);

        final HttpRequest request = HttpRequest.newBuilder() //
                .GET() //
                .uri(new URI(logFile)) //
                .build();

        final HttpResponse<InputStream> response = client.getHttpClient().sendAsync(request, HttpResponse.BodyHandlers.ofInputStream()).get();

        return new BufferedReader(new InputStreamReader(response.body()));
    }

}
