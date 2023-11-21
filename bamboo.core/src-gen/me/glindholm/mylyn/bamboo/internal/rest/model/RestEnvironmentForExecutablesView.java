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


package me.glindholm.mylyn.bamboo.internal.rest.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Arrays;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RestEnvironmentForExecutablesView
 */
@JsonPropertyOrder({
  RestEnvironmentForExecutablesView.JSON_PROPERTY_PROJECT_ID,
  RestEnvironmentForExecutablesView.JSON_PROPERTY_PROJECT_NAME,
  RestEnvironmentForExecutablesView.JSON_PROPERTY_ENVIRONMENT_ID,
  RestEnvironmentForExecutablesView.JSON_PROPERTY_ENVIRONMENT_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RestEnvironmentForExecutablesView implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PROJECT_ID = "projectId";
  private Long projectId;

  public static final String JSON_PROPERTY_PROJECT_NAME = "projectName";
  private String projectName;

  public static final String JSON_PROPERTY_ENVIRONMENT_ID = "environmentId";
  private Long environmentId;

  public static final String JSON_PROPERTY_ENVIRONMENT_NAME = "environmentName";
  private String environmentName;

  public RestEnvironmentForExecutablesView() { 
  }

  public RestEnvironmentForExecutablesView projectId(Long projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getProjectId() {
    return projectId;
  }


  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }


  public RestEnvironmentForExecutablesView projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Get projectName
   * @return projectName
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_PROJECT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProjectName() {
    return projectName;
  }


  @JsonProperty(JSON_PROPERTY_PROJECT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }


  public RestEnvironmentForExecutablesView environmentId(Long environmentId) {
    this.environmentId = environmentId;
    return this;
  }

   /**
   * Get environmentId
   * @return environmentId
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_ENVIRONMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getEnvironmentId() {
    return environmentId;
  }


  @JsonProperty(JSON_PROPERTY_ENVIRONMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnvironmentId(Long environmentId) {
    this.environmentId = environmentId;
  }


  public RestEnvironmentForExecutablesView environmentName(String environmentName) {
    this.environmentName = environmentName;
    return this;
  }

   /**
   * Get environmentName
   * @return environmentName
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_ENVIRONMENT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnvironmentName() {
    return environmentName;
  }


  @JsonProperty(JSON_PROPERTY_ENVIRONMENT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }


  /**
   * Return true if this RestEnvironmentForExecutablesView object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestEnvironmentForExecutablesView restEnvironmentForExecutablesView = (RestEnvironmentForExecutablesView) o;
    return Objects.equals(this.projectId, restEnvironmentForExecutablesView.projectId) &&
        Objects.equals(this.projectName, restEnvironmentForExecutablesView.projectName) &&
        Objects.equals(this.environmentId, restEnvironmentForExecutablesView.environmentId) &&
        Objects.equals(this.environmentName, restEnvironmentForExecutablesView.environmentName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectId, projectName, environmentId, environmentName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestEnvironmentForExecutablesView {\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
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

