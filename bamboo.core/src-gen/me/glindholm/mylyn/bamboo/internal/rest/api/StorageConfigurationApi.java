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

package me.glindholm.mylyn.bamboo.internal.rest.api;

import me.glindholm.mylyn.bamboo.internal.rest.invoker.ApiClient;
import me.glindholm.mylyn.bamboo.internal.rest.invoker.ApiException;
import me.glindholm.mylyn.bamboo.internal.rest.invoker.ApiResponse;
import me.glindholm.mylyn.bamboo.internal.rest.invoker.Pair;

import me.glindholm.mylyn.bamboo.internal.rest.model.RestErrorCollection;
import me.glindholm.mylyn.bamboo.internal.rest.model.RestStorageConfiguration;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.http.HttpRequest;
import java.nio.channels.Channels;
import java.nio.channels.Pipe;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StorageConfigurationApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public StorageConfigurationApi() {
    this(new ApiClient());
  }

  public StorageConfigurationApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
    memberVarAsyncResponseInterceptor = apiClient.getAsyncResponseInterceptor();
  }

  protected ApiException getApiException(String operationId, HttpResponse<InputStream> response) throws IOException {
    String body = response.body() == null ? null : new String(response.body().readAllBytes());
    String message = formatExceptionMessage(operationId, response.statusCode(), body);
    return new ApiException(response.statusCode(), message, response.headers(), body);
  }

  private String formatExceptionMessage(String operationId, int statusCode, String body) {
    if (body == null || body.isEmpty()) {
      body = "[no body]";
    }
    return operationId + " call failed with: " + statusCode + " - " + body;
  }

  /**
   * 
   * Read storage configuration limits.
   * @return RestStorageConfiguration
   * @throws ApiException if fails to make API call
   */
  public RestStorageConfiguration getStorageConfiguration() throws ApiException {
    ApiResponse<RestStorageConfiguration> localVarResponse = getStorageConfigurationWithHttpInfo();
    return localVarResponse.getData();
  }

  /**
   * 
   * Read storage configuration limits.
   * @return ApiResponse&lt;RestStorageConfiguration&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RestStorageConfiguration> getStorageConfigurationWithHttpInfo() throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getStorageConfigurationRequestBuilder();
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getStorageConfiguration", localVarResponse);
        }
        return new ApiResponse<RestStorageConfiguration>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<RestStorageConfiguration>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder getStorageConfigurationRequestBuilder() throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/admin/latest/storageSettings";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * 
   * Set storage configuration limits.
   * @param restStorageConfiguration New storage configuration limits (required)
   * @return RestStorageConfiguration
   * @throws ApiException if fails to make API call
   */
  public RestStorageConfiguration saveStorageConfiguration(RestStorageConfiguration restStorageConfiguration) throws ApiException {
    ApiResponse<RestStorageConfiguration> localVarResponse = saveStorageConfigurationWithHttpInfo(restStorageConfiguration);
    return localVarResponse.getData();
  }

  /**
   * 
   * Set storage configuration limits.
   * @param restStorageConfiguration New storage configuration limits (required)
   * @return ApiResponse&lt;RestStorageConfiguration&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<RestStorageConfiguration> saveStorageConfigurationWithHttpInfo(RestStorageConfiguration restStorageConfiguration) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = saveStorageConfigurationRequestBuilder(restStorageConfiguration);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("saveStorageConfiguration", localVarResponse);
        }
        return new ApiResponse<RestStorageConfiguration>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<RestStorageConfiguration>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder saveStorageConfigurationRequestBuilder(RestStorageConfiguration restStorageConfiguration) throws ApiException {
    // verify the required parameter 'restStorageConfiguration' is set
    if (restStorageConfiguration == null) {
      throw new ApiException(400, "Missing the required parameter 'restStorageConfiguration' when calling saveStorageConfiguration");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/admin/latest/storageSettings";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(restStorageConfiguration);
      localVarRequestBuilder.method("PUT", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
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
}
