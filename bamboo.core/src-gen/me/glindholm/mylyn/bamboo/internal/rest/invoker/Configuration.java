/*
 * Bamboo
 * This is the reference document for the Atlassian Bamboo REST API. The REST API is for developers who want to:    - integrate Bamboo with other applications;   - create scripts that interact with Bamboo; or   - develop plugins that enhance the Bamboo UI, using REST to interact with the backend.    You can read more about developing Bamboo plugins in the [Bamboo Developer Documentation](https://developer.atlassian.com/bamboo/server/docs/latest/).
 *
 * The version of the OpenAPI document: 9.3.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package me.glindholm.mylyn.bamboo.internal.rest.invoker;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Configuration {
    public static final String VERSION = "1.0.0-SNAPSHOT";

    private static ApiClient defaultApiClient = new ApiClient();

    /**
     * Get the default API client, which would be used when creating API
     * instances without providing an API client.
     *
     * @return Default API client
     */
    public static ApiClient getDefaultApiClient() {
        return defaultApiClient;
    }

    /**
     * Set the default API client, which would be used when creating API
     * instances without providing an API client.
     *
     * @param apiClient API client
     */
    public static void setDefaultApiClient(ApiClient apiClient) {
        defaultApiClient = apiClient;
    }
}
