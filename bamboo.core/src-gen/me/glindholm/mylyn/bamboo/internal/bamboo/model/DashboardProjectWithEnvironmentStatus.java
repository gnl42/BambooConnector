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
import java.util.ArrayList;
import java.util.List;
import me.glindholm.mylyn.bamboo.internal.bamboo.model.DeploymentProject;
import me.glindholm.mylyn.bamboo.internal.bamboo.model.EnvironmentStatus;
import me.glindholm.mylyn.bamboo.internal.bamboo.model.RestDeploymentVersion;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DashboardProjectWithEnvironmentStatus
 */
@JsonPropertyOrder({
  DashboardProjectWithEnvironmentStatus.JSON_PROPERTY_DEPLOYMENT_PROJECT,
  DashboardProjectWithEnvironmentStatus.JSON_PROPERTY_ENVIRONMENT_STATUSES,
  DashboardProjectWithEnvironmentStatus.JSON_PROPERTY_FUTURE_VERSION,
  DashboardProjectWithEnvironmentStatus.JSON_PROPERTY_RELATED_VERSION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-08T20:39:31.812169500-07:00[America/Vancouver]")
public class DashboardProjectWithEnvironmentStatus implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DEPLOYMENT_PROJECT = "deploymentProject";
  private DeploymentProject deploymentProject;

  public static final String JSON_PROPERTY_ENVIRONMENT_STATUSES = "environmentStatuses";
  private List<EnvironmentStatus> environmentStatuses;

  public static final String JSON_PROPERTY_FUTURE_VERSION = "futureVersion";
  private RestDeploymentVersion futureVersion;

  public static final String JSON_PROPERTY_RELATED_VERSION = "relatedVersion";
  private RestDeploymentVersion relatedVersion;

  public DashboardProjectWithEnvironmentStatus() { 
  }

  public DashboardProjectWithEnvironmentStatus deploymentProject(DeploymentProject deploymentProject) {
    this.deploymentProject = deploymentProject;
    return this;
  }

   /**
   * Get deploymentProject
   * @return deploymentProject
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_PROJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DeploymentProject getDeploymentProject() {
    return deploymentProject;
  }


  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_PROJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeploymentProject(DeploymentProject deploymentProject) {
    this.deploymentProject = deploymentProject;
  }


  public DashboardProjectWithEnvironmentStatus environmentStatuses(List<EnvironmentStatus> environmentStatuses) {
    this.environmentStatuses = environmentStatuses;
    return this;
  }

  public DashboardProjectWithEnvironmentStatus addEnvironmentStatusesItem(EnvironmentStatus environmentStatusesItem) {
    if (this.environmentStatuses == null) {
      this.environmentStatuses = new ArrayList<>();
    }
    this.environmentStatuses.add(environmentStatusesItem);
    return this;
  }

   /**
   * Get environmentStatuses
   * @return environmentStatuses
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_ENVIRONMENT_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<EnvironmentStatus> getEnvironmentStatuses() {
    return environmentStatuses;
  }


  @JsonProperty(JSON_PROPERTY_ENVIRONMENT_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnvironmentStatuses(List<EnvironmentStatus> environmentStatuses) {
    this.environmentStatuses = environmentStatuses;
  }


  public DashboardProjectWithEnvironmentStatus futureVersion(RestDeploymentVersion futureVersion) {
    this.futureVersion = futureVersion;
    return this;
  }

   /**
   * Get futureVersion
   * @return futureVersion
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_FUTURE_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestDeploymentVersion getFutureVersion() {
    return futureVersion;
  }


  @JsonProperty(JSON_PROPERTY_FUTURE_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFutureVersion(RestDeploymentVersion futureVersion) {
    this.futureVersion = futureVersion;
  }


  public DashboardProjectWithEnvironmentStatus relatedVersion(RestDeploymentVersion relatedVersion) {
    this.relatedVersion = relatedVersion;
    return this;
  }

   /**
   * Get relatedVersion
   * @return relatedVersion
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_RELATED_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestDeploymentVersion getRelatedVersion() {
    return relatedVersion;
  }


  @JsonProperty(JSON_PROPERTY_RELATED_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelatedVersion(RestDeploymentVersion relatedVersion) {
    this.relatedVersion = relatedVersion;
  }


  /**
   * Return true if this DashboardProjectWithEnvironmentStatus object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardProjectWithEnvironmentStatus dashboardProjectWithEnvironmentStatus = (DashboardProjectWithEnvironmentStatus) o;
    return Objects.equals(this.deploymentProject, dashboardProjectWithEnvironmentStatus.deploymentProject) &&
        Objects.equals(this.environmentStatuses, dashboardProjectWithEnvironmentStatus.environmentStatuses) &&
        Objects.equals(this.futureVersion, dashboardProjectWithEnvironmentStatus.futureVersion) &&
        Objects.equals(this.relatedVersion, dashboardProjectWithEnvironmentStatus.relatedVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deploymentProject, environmentStatuses, futureVersion, relatedVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardProjectWithEnvironmentStatus {\n");
    sb.append("    deploymentProject: ").append(toIndentedString(deploymentProject)).append("\n");
    sb.append("    environmentStatuses: ").append(toIndentedString(environmentStatuses)).append("\n");
    sb.append("    futureVersion: ").append(toIndentedString(futureVersion)).append("\n");
    sb.append("    relatedVersion: ").append(toIndentedString(relatedVersion)).append("\n");
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

