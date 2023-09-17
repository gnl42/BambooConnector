/*
 * Bamboo
 * This is the reference document for the Atlassian Bamboo REST API. The REST API is for developers who want to:    - integrate Bamboo with other applications;   - create scripts that interact with Bamboo; or   - develop plugins that enhance the Bamboo UI, using REST to interact with the backend.    You can read more about developing Bamboo plugins in the [Bamboo Developer Documentation](https://developer.atlassian.com/bamboo/server/docs/latest/).
 *
 * The version of the OpenAPI document: 9.3.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package me.glindholm.mylyn.bamboo.internal.bamboo.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import me.glindholm.mylyn.bamboo.internal.bamboo.model.RestProjectUriInfoPathSegmentsInner;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RestProjectUriInfo
 */
@JsonPropertyOrder({
  RestProjectUriInfo.JSON_PROPERTY_REQUEST_URI,
  RestProjectUriInfo.JSON_PROPERTY_REQUEST_URI_BUILDER,
  RestProjectUriInfo.JSON_PROPERTY_BASE_URI_BUILDER,
  RestProjectUriInfo.JSON_PROPERTY_QUERY_PARAMETERS,
  RestProjectUriInfo.JSON_PROPERTY_BASE_URI,
  RestProjectUriInfo.JSON_PROPERTY_ABSOLUTE_PATH_BUILDER,
  RestProjectUriInfo.JSON_PROPERTY_PATH_PARAMETERS,
  RestProjectUriInfo.JSON_PROPERTY_MATCHED_U_R_IS,
  RestProjectUriInfo.JSON_PROPERTY_MATCHED_RESOURCES,
  RestProjectUriInfo.JSON_PROPERTY_PATH_SEGMENTS,
  RestProjectUriInfo.JSON_PROPERTY_PATH,
  RestProjectUriInfo.JSON_PROPERTY_ABSOLUTE_PATH
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-08T20:39:31.812169500-07:00[America/Vancouver]")
public class RestProjectUriInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_REQUEST_URI = "requestUri";
  private URI requestUri;

  public static final String JSON_PROPERTY_REQUEST_URI_BUILDER = "requestUriBuilder";
  private Object requestUriBuilder;

  public static final String JSON_PROPERTY_BASE_URI_BUILDER = "baseUriBuilder";
  private Object baseUriBuilder;

  public static final String JSON_PROPERTY_QUERY_PARAMETERS = "queryParameters";
  private Object queryParameters;

  public static final String JSON_PROPERTY_BASE_URI = "baseUri";
  private URI baseUri;

  public static final String JSON_PROPERTY_ABSOLUTE_PATH_BUILDER = "absolutePathBuilder";
  private Object absolutePathBuilder;

  public static final String JSON_PROPERTY_PATH_PARAMETERS = "pathParameters";
  private Object pathParameters;

  public static final String JSON_PROPERTY_MATCHED_U_R_IS = "matchedURIs";
  private List<String> matchedURIs;

  public static final String JSON_PROPERTY_MATCHED_RESOURCES = "matchedResources";
  private List<Object> matchedResources;

  public static final String JSON_PROPERTY_PATH_SEGMENTS = "pathSegments";
  private List<RestProjectUriInfoPathSegmentsInner> pathSegments;

  public static final String JSON_PROPERTY_PATH = "path";
  private String path;

  public static final String JSON_PROPERTY_ABSOLUTE_PATH = "absolutePath";
  private URI absolutePath;

  public RestProjectUriInfo() { 
  }

  public RestProjectUriInfo requestUri(URI requestUri) {
    this.requestUri = requestUri;
    return this;
  }

   /**
   * Get requestUri
   * @return requestUri
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_REQUEST_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public URI getRequestUri() {
    return requestUri;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestUri(URI requestUri) {
    this.requestUri = requestUri;
  }


  public RestProjectUriInfo requestUriBuilder(Object requestUriBuilder) {
    this.requestUriBuilder = requestUriBuilder;
    return this;
  }

   /**
   * Get requestUriBuilder
   * @return requestUriBuilder
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_REQUEST_URI_BUILDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getRequestUriBuilder() {
    return requestUriBuilder;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_URI_BUILDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestUriBuilder(Object requestUriBuilder) {
    this.requestUriBuilder = requestUriBuilder;
  }


  public RestProjectUriInfo baseUriBuilder(Object baseUriBuilder) {
    this.baseUriBuilder = baseUriBuilder;
    return this;
  }

   /**
   * Get baseUriBuilder
   * @return baseUriBuilder
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_BASE_URI_BUILDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getBaseUriBuilder() {
    return baseUriBuilder;
  }


  @JsonProperty(JSON_PROPERTY_BASE_URI_BUILDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBaseUriBuilder(Object baseUriBuilder) {
    this.baseUriBuilder = baseUriBuilder;
  }


  public RestProjectUriInfo queryParameters(Object queryParameters) {
    this.queryParameters = queryParameters;
    return this;
  }

   /**
   * Get queryParameters
   * @return queryParameters
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_QUERY_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getQueryParameters() {
    return queryParameters;
  }


  @JsonProperty(JSON_PROPERTY_QUERY_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQueryParameters(Object queryParameters) {
    this.queryParameters = queryParameters;
  }


  public RestProjectUriInfo baseUri(URI baseUri) {
    this.baseUri = baseUri;
    return this;
  }

   /**
   * Get baseUri
   * @return baseUri
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_BASE_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public URI getBaseUri() {
    return baseUri;
  }


  @JsonProperty(JSON_PROPERTY_BASE_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBaseUri(URI baseUri) {
    this.baseUri = baseUri;
  }


  public RestProjectUriInfo absolutePathBuilder(Object absolutePathBuilder) {
    this.absolutePathBuilder = absolutePathBuilder;
    return this;
  }

   /**
   * Get absolutePathBuilder
   * @return absolutePathBuilder
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_ABSOLUTE_PATH_BUILDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getAbsolutePathBuilder() {
    return absolutePathBuilder;
  }


  @JsonProperty(JSON_PROPERTY_ABSOLUTE_PATH_BUILDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAbsolutePathBuilder(Object absolutePathBuilder) {
    this.absolutePathBuilder = absolutePathBuilder;
  }


  public RestProjectUriInfo pathParameters(Object pathParameters) {
    this.pathParameters = pathParameters;
    return this;
  }

   /**
   * Get pathParameters
   * @return pathParameters
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_PATH_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getPathParameters() {
    return pathParameters;
  }


  @JsonProperty(JSON_PROPERTY_PATH_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPathParameters(Object pathParameters) {
    this.pathParameters = pathParameters;
  }


  public RestProjectUriInfo matchedURIs(List<String> matchedURIs) {
    this.matchedURIs = matchedURIs;
    return this;
  }

  public RestProjectUriInfo addMatchedURIsItem(String matchedURIsItem) {
    if (this.matchedURIs == null) {
      this.matchedURIs = new ArrayList<>();
    }
    this.matchedURIs.add(matchedURIsItem);
    return this;
  }

   /**
   * Get matchedURIs
   * @return matchedURIs
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_MATCHED_U_R_IS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getMatchedURIs() {
    return matchedURIs;
  }


  @JsonProperty(JSON_PROPERTY_MATCHED_U_R_IS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMatchedURIs(List<String> matchedURIs) {
    this.matchedURIs = matchedURIs;
  }


  public RestProjectUriInfo matchedResources(List<Object> matchedResources) {
    this.matchedResources = matchedResources;
    return this;
  }

  public RestProjectUriInfo addMatchedResourcesItem(Object matchedResourcesItem) {
    if (this.matchedResources == null) {
      this.matchedResources = new ArrayList<>();
    }
    this.matchedResources.add(matchedResourcesItem);
    return this;
  }

   /**
   * Get matchedResources
   * @return matchedResources
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_MATCHED_RESOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getMatchedResources() {
    return matchedResources;
  }


  @JsonProperty(JSON_PROPERTY_MATCHED_RESOURCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMatchedResources(List<Object> matchedResources) {
    this.matchedResources = matchedResources;
  }


  public RestProjectUriInfo pathSegments(List<RestProjectUriInfoPathSegmentsInner> pathSegments) {
    this.pathSegments = pathSegments;
    return this;
  }

  public RestProjectUriInfo addPathSegmentsItem(RestProjectUriInfoPathSegmentsInner pathSegmentsItem) {
    if (this.pathSegments == null) {
      this.pathSegments = new ArrayList<>();
    }
    this.pathSegments.add(pathSegmentsItem);
    return this;
  }

   /**
   * Get pathSegments
   * @return pathSegments
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_PATH_SEGMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RestProjectUriInfoPathSegmentsInner> getPathSegments() {
    return pathSegments;
  }


  @JsonProperty(JSON_PROPERTY_PATH_SEGMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPathSegments(List<RestProjectUriInfoPathSegmentsInner> pathSegments) {
    this.pathSegments = pathSegments;
  }


  public RestProjectUriInfo path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPath() {
    return path;
  }


  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPath(String path) {
    this.path = path;
  }


  public RestProjectUriInfo absolutePath(URI absolutePath) {
    this.absolutePath = absolutePath;
    return this;
  }

   /**
   * Get absolutePath
   * @return absolutePath
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_ABSOLUTE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public URI getAbsolutePath() {
    return absolutePath;
  }


  @JsonProperty(JSON_PROPERTY_ABSOLUTE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAbsolutePath(URI absolutePath) {
    this.absolutePath = absolutePath;
  }


  /**
   * Return true if this RestProject_uriInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestProjectUriInfo restProjectUriInfo = (RestProjectUriInfo) o;
    return Objects.equals(this.requestUri, restProjectUriInfo.requestUri) &&
        Objects.equals(this.requestUriBuilder, restProjectUriInfo.requestUriBuilder) &&
        Objects.equals(this.baseUriBuilder, restProjectUriInfo.baseUriBuilder) &&
        Objects.equals(this.queryParameters, restProjectUriInfo.queryParameters) &&
        Objects.equals(this.baseUri, restProjectUriInfo.baseUri) &&
        Objects.equals(this.absolutePathBuilder, restProjectUriInfo.absolutePathBuilder) &&
        Objects.equals(this.pathParameters, restProjectUriInfo.pathParameters) &&
        Objects.equals(this.matchedURIs, restProjectUriInfo.matchedURIs) &&
        Objects.equals(this.matchedResources, restProjectUriInfo.matchedResources) &&
        Objects.equals(this.pathSegments, restProjectUriInfo.pathSegments) &&
        Objects.equals(this.path, restProjectUriInfo.path) &&
        Objects.equals(this.absolutePath, restProjectUriInfo.absolutePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestUri, requestUriBuilder, baseUriBuilder, queryParameters, baseUri, absolutePathBuilder, pathParameters, matchedURIs, matchedResources, pathSegments, path, absolutePath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestProjectUriInfo {\n");
    sb.append("    requestUri: ").append(toIndentedString(requestUri)).append("\n");
    sb.append("    requestUriBuilder: ").append(toIndentedString(requestUriBuilder)).append("\n");
    sb.append("    baseUriBuilder: ").append(toIndentedString(baseUriBuilder)).append("\n");
    sb.append("    queryParameters: ").append(toIndentedString(queryParameters)).append("\n");
    sb.append("    baseUri: ").append(toIndentedString(baseUri)).append("\n");
    sb.append("    absolutePathBuilder: ").append(toIndentedString(absolutePathBuilder)).append("\n");
    sb.append("    pathParameters: ").append(toIndentedString(pathParameters)).append("\n");
    sb.append("    matchedURIs: ").append(toIndentedString(matchedURIs)).append("\n");
    sb.append("    matchedResources: ").append(toIndentedString(matchedResources)).append("\n");
    sb.append("    pathSegments: ").append(toIndentedString(pathSegments)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    absolutePath: ").append(toIndentedString(absolutePath)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

