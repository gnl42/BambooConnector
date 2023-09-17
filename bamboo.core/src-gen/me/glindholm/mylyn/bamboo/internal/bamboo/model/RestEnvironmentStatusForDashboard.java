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
import java.util.Date;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RestEnvironmentStatusForDashboard
 */
@JsonPropertyOrder({
  RestEnvironmentStatusForDashboard.JSON_PROPERTY_DEPLOYMENT_RESULT_ID,
  RestEnvironmentStatusForDashboard.JSON_PROPERTY_DEPLOYMENT_STATE,
  RestEnvironmentStatusForDashboard.JSON_PROPERTY_DEPLOYMENT_VERSION_ID,
  RestEnvironmentStatusForDashboard.JSON_PROPERTY_DEPLOYMENT_VERSION_NAME,
  RestEnvironmentStatusForDashboard.JSON_PROPERTY_DEPLOYMENT_VERSION_RELATED_BRANCH_NAME,
  RestEnvironmentStatusForDashboard.JSON_PROPERTY_DEPLOYMENT_VERSION_STATE,
  RestEnvironmentStatusForDashboard.JSON_PROPERTY_ENVIRONMENT_ID,
  RestEnvironmentStatusForDashboard.JSON_PROPERTY_EXECUTED_DATE,
  RestEnvironmentStatusForDashboard.JSON_PROPERTY_FINISHED_DATE,
  RestEnvironmentStatusForDashboard.JSON_PROPERTY_LIFE_CYCLE_STATE,
  RestEnvironmentStatusForDashboard.JSON_PROPERTY_QUEUED_DATE,
  RestEnvironmentStatusForDashboard.JSON_PROPERTY_STARTED_DATE,
  RestEnvironmentStatusForDashboard.JSON_PROPERTY_VERSION_STATUS_GRAVATAR_URL,
  RestEnvironmentStatusForDashboard.JSON_PROPERTY_VERSION_STATUS_USER_DISPLAY_NAME,
  RestEnvironmentStatusForDashboard.JSON_PROPERTY_VERSION_STATUS_USER_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-08T20:39:31.812169500-07:00[America/Vancouver]")
public class RestEnvironmentStatusForDashboard implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DEPLOYMENT_RESULT_ID = "deploymentResultId";
  private Long deploymentResultId;

  /**
   * Gets or Sets deploymentState
   */
  public enum DeploymentStateEnum {
    UNKNOWN("Unknown"),
    
    SUCCESSFUL("Successful"),
    
    FAILED("Failed");

    private String value;

    DeploymentStateEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DeploymentStateEnum fromValue(String value) {
      for (DeploymentStateEnum b : DeploymentStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DEPLOYMENT_STATE = "deploymentState";
  private DeploymentStateEnum deploymentState;

  public static final String JSON_PROPERTY_DEPLOYMENT_VERSION_ID = "deploymentVersionId";
  private Long deploymentVersionId;

  public static final String JSON_PROPERTY_DEPLOYMENT_VERSION_NAME = "deploymentVersionName";
  private String deploymentVersionName;

  public static final String JSON_PROPERTY_DEPLOYMENT_VERSION_RELATED_BRANCH_NAME = "deploymentVersionRelatedBranchName";
  private String deploymentVersionRelatedBranchName;

  /**
   * Gets or Sets deploymentVersionState
   */
  public enum DeploymentVersionStateEnum {
    UNKNOWN("Unknown"),
    
    APPROVED("Approved"),
    
    BROKEN("Broken"),
    
    INCOMPLETE("Incomplete");

    private String value;

    DeploymentVersionStateEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DeploymentVersionStateEnum fromValue(String value) {
      for (DeploymentVersionStateEnum b : DeploymentVersionStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DEPLOYMENT_VERSION_STATE = "deploymentVersionState";
  private DeploymentVersionStateEnum deploymentVersionState;

  public static final String JSON_PROPERTY_ENVIRONMENT_ID = "environmentId";
  private Long environmentId;

  public static final String JSON_PROPERTY_EXECUTED_DATE = "executedDate";
  private Date executedDate;

  public static final String JSON_PROPERTY_FINISHED_DATE = "finishedDate";
  private Date finishedDate;

  /**
   * Gets or Sets lifeCycleState
   */
  public enum LifeCycleStateEnum {
    PENDING("Pending"),
    
    QUEUED("Queued"),
    
    INPROGRESS("InProgress"),
    
    FINISHED("Finished"),
    
    NOTBUILT("NotBuilt");

    private String value;

    LifeCycleStateEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LifeCycleStateEnum fromValue(String value) {
      for (LifeCycleStateEnum b : LifeCycleStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_LIFE_CYCLE_STATE = "lifeCycleState";
  private LifeCycleStateEnum lifeCycleState;

  public static final String JSON_PROPERTY_QUEUED_DATE = "queuedDate";
  private Date queuedDate;

  public static final String JSON_PROPERTY_STARTED_DATE = "startedDate";
  private Date startedDate;

  public static final String JSON_PROPERTY_VERSION_STATUS_GRAVATAR_URL = "versionStatusGravatarUrl";
  private String versionStatusGravatarUrl;

  public static final String JSON_PROPERTY_VERSION_STATUS_USER_DISPLAY_NAME = "versionStatusUserDisplayName";
  private String versionStatusUserDisplayName;

  public static final String JSON_PROPERTY_VERSION_STATUS_USER_NAME = "versionStatusUserName";
  private String versionStatusUserName;

  public RestEnvironmentStatusForDashboard() { 
  }

  public RestEnvironmentStatusForDashboard deploymentResultId(Long deploymentResultId) {
    this.deploymentResultId = deploymentResultId;
    return this;
  }

   /**
   * Get deploymentResultId
   * @return deploymentResultId
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_RESULT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDeploymentResultId() {
    return deploymentResultId;
  }


  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_RESULT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeploymentResultId(Long deploymentResultId) {
    this.deploymentResultId = deploymentResultId;
  }


  public RestEnvironmentStatusForDashboard deploymentState(DeploymentStateEnum deploymentState) {
    this.deploymentState = deploymentState;
    return this;
  }

   /**
   * Get deploymentState
   * @return deploymentState
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DeploymentStateEnum getDeploymentState() {
    return deploymentState;
  }


  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeploymentState(DeploymentStateEnum deploymentState) {
    this.deploymentState = deploymentState;
  }


  public RestEnvironmentStatusForDashboard deploymentVersionId(Long deploymentVersionId) {
    this.deploymentVersionId = deploymentVersionId;
    return this;
  }

   /**
   * Get deploymentVersionId
   * @return deploymentVersionId
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_VERSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDeploymentVersionId() {
    return deploymentVersionId;
  }


  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_VERSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeploymentVersionId(Long deploymentVersionId) {
    this.deploymentVersionId = deploymentVersionId;
  }


  public RestEnvironmentStatusForDashboard deploymentVersionName(String deploymentVersionName) {
    this.deploymentVersionName = deploymentVersionName;
    return this;
  }

   /**
   * Get deploymentVersionName
   * @return deploymentVersionName
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_VERSION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeploymentVersionName() {
    return deploymentVersionName;
  }


  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_VERSION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeploymentVersionName(String deploymentVersionName) {
    this.deploymentVersionName = deploymentVersionName;
  }


  public RestEnvironmentStatusForDashboard deploymentVersionRelatedBranchName(String deploymentVersionRelatedBranchName) {
    this.deploymentVersionRelatedBranchName = deploymentVersionRelatedBranchName;
    return this;
  }

   /**
   * Get deploymentVersionRelatedBranchName
   * @return deploymentVersionRelatedBranchName
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_VERSION_RELATED_BRANCH_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDeploymentVersionRelatedBranchName() {
    return deploymentVersionRelatedBranchName;
  }


  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_VERSION_RELATED_BRANCH_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeploymentVersionRelatedBranchName(String deploymentVersionRelatedBranchName) {
    this.deploymentVersionRelatedBranchName = deploymentVersionRelatedBranchName;
  }


  public RestEnvironmentStatusForDashboard deploymentVersionState(DeploymentVersionStateEnum deploymentVersionState) {
    this.deploymentVersionState = deploymentVersionState;
    return this;
  }

   /**
   * Get deploymentVersionState
   * @return deploymentVersionState
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_VERSION_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DeploymentVersionStateEnum getDeploymentVersionState() {
    return deploymentVersionState;
  }


  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_VERSION_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeploymentVersionState(DeploymentVersionStateEnum deploymentVersionState) {
    this.deploymentVersionState = deploymentVersionState;
  }


  public RestEnvironmentStatusForDashboard environmentId(Long environmentId) {
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


  public RestEnvironmentStatusForDashboard executedDate(Date executedDate) {
    this.executedDate = executedDate;
    return this;
  }

   /**
   * Get executedDate
   * @return executedDate
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_EXECUTED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getExecutedDate() {
    return executedDate;
  }


  @JsonProperty(JSON_PROPERTY_EXECUTED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExecutedDate(Date executedDate) {
    this.executedDate = executedDate;
  }


  public RestEnvironmentStatusForDashboard finishedDate(Date finishedDate) {
    this.finishedDate = finishedDate;
    return this;
  }

   /**
   * Get finishedDate
   * @return finishedDate
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_FINISHED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getFinishedDate() {
    return finishedDate;
  }


  @JsonProperty(JSON_PROPERTY_FINISHED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFinishedDate(Date finishedDate) {
    this.finishedDate = finishedDate;
  }


  public RestEnvironmentStatusForDashboard lifeCycleState(LifeCycleStateEnum lifeCycleState) {
    this.lifeCycleState = lifeCycleState;
    return this;
  }

   /**
   * Get lifeCycleState
   * @return lifeCycleState
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_LIFE_CYCLE_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LifeCycleStateEnum getLifeCycleState() {
    return lifeCycleState;
  }


  @JsonProperty(JSON_PROPERTY_LIFE_CYCLE_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLifeCycleState(LifeCycleStateEnum lifeCycleState) {
    this.lifeCycleState = lifeCycleState;
  }


  public RestEnvironmentStatusForDashboard queuedDate(Date queuedDate) {
    this.queuedDate = queuedDate;
    return this;
  }

   /**
   * Get queuedDate
   * @return queuedDate
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_QUEUED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getQueuedDate() {
    return queuedDate;
  }


  @JsonProperty(JSON_PROPERTY_QUEUED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQueuedDate(Date queuedDate) {
    this.queuedDate = queuedDate;
  }


  public RestEnvironmentStatusForDashboard startedDate(Date startedDate) {
    this.startedDate = startedDate;
    return this;
  }

   /**
   * Get startedDate
   * @return startedDate
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_STARTED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getStartedDate() {
    return startedDate;
  }


  @JsonProperty(JSON_PROPERTY_STARTED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartedDate(Date startedDate) {
    this.startedDate = startedDate;
  }


  public RestEnvironmentStatusForDashboard versionStatusGravatarUrl(String versionStatusGravatarUrl) {
    this.versionStatusGravatarUrl = versionStatusGravatarUrl;
    return this;
  }

   /**
   * Get versionStatusGravatarUrl
   * @return versionStatusGravatarUrl
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_VERSION_STATUS_GRAVATAR_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVersionStatusGravatarUrl() {
    return versionStatusGravatarUrl;
  }


  @JsonProperty(JSON_PROPERTY_VERSION_STATUS_GRAVATAR_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersionStatusGravatarUrl(String versionStatusGravatarUrl) {
    this.versionStatusGravatarUrl = versionStatusGravatarUrl;
  }


  public RestEnvironmentStatusForDashboard versionStatusUserDisplayName(String versionStatusUserDisplayName) {
    this.versionStatusUserDisplayName = versionStatusUserDisplayName;
    return this;
  }

   /**
   * Get versionStatusUserDisplayName
   * @return versionStatusUserDisplayName
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_VERSION_STATUS_USER_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVersionStatusUserDisplayName() {
    return versionStatusUserDisplayName;
  }


  @JsonProperty(JSON_PROPERTY_VERSION_STATUS_USER_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersionStatusUserDisplayName(String versionStatusUserDisplayName) {
    this.versionStatusUserDisplayName = versionStatusUserDisplayName;
  }


  public RestEnvironmentStatusForDashboard versionStatusUserName(String versionStatusUserName) {
    this.versionStatusUserName = versionStatusUserName;
    return this;
  }

   /**
   * Get versionStatusUserName
   * @return versionStatusUserName
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_VERSION_STATUS_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVersionStatusUserName() {
    return versionStatusUserName;
  }


  @JsonProperty(JSON_PROPERTY_VERSION_STATUS_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersionStatusUserName(String versionStatusUserName) {
    this.versionStatusUserName = versionStatusUserName;
  }


  /**
   * Return true if this RestEnvironmentStatusForDashboard object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestEnvironmentStatusForDashboard restEnvironmentStatusForDashboard = (RestEnvironmentStatusForDashboard) o;
    return Objects.equals(this.deploymentResultId, restEnvironmentStatusForDashboard.deploymentResultId) &&
        Objects.equals(this.deploymentState, restEnvironmentStatusForDashboard.deploymentState) &&
        Objects.equals(this.deploymentVersionId, restEnvironmentStatusForDashboard.deploymentVersionId) &&
        Objects.equals(this.deploymentVersionName, restEnvironmentStatusForDashboard.deploymentVersionName) &&
        Objects.equals(this.deploymentVersionRelatedBranchName, restEnvironmentStatusForDashboard.deploymentVersionRelatedBranchName) &&
        Objects.equals(this.deploymentVersionState, restEnvironmentStatusForDashboard.deploymentVersionState) &&
        Objects.equals(this.environmentId, restEnvironmentStatusForDashboard.environmentId) &&
        Objects.equals(this.executedDate, restEnvironmentStatusForDashboard.executedDate) &&
        Objects.equals(this.finishedDate, restEnvironmentStatusForDashboard.finishedDate) &&
        Objects.equals(this.lifeCycleState, restEnvironmentStatusForDashboard.lifeCycleState) &&
        Objects.equals(this.queuedDate, restEnvironmentStatusForDashboard.queuedDate) &&
        Objects.equals(this.startedDate, restEnvironmentStatusForDashboard.startedDate) &&
        Objects.equals(this.versionStatusGravatarUrl, restEnvironmentStatusForDashboard.versionStatusGravatarUrl) &&
        Objects.equals(this.versionStatusUserDisplayName, restEnvironmentStatusForDashboard.versionStatusUserDisplayName) &&
        Objects.equals(this.versionStatusUserName, restEnvironmentStatusForDashboard.versionStatusUserName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deploymentResultId, deploymentState, deploymentVersionId, deploymentVersionName, deploymentVersionRelatedBranchName, deploymentVersionState, environmentId, executedDate, finishedDate, lifeCycleState, queuedDate, startedDate, versionStatusGravatarUrl, versionStatusUserDisplayName, versionStatusUserName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestEnvironmentStatusForDashboard {\n");
    sb.append("    deploymentResultId: ").append(toIndentedString(deploymentResultId)).append("\n");
    sb.append("    deploymentState: ").append(toIndentedString(deploymentState)).append("\n");
    sb.append("    deploymentVersionId: ").append(toIndentedString(deploymentVersionId)).append("\n");
    sb.append("    deploymentVersionName: ").append(toIndentedString(deploymentVersionName)).append("\n");
    sb.append("    deploymentVersionRelatedBranchName: ").append(toIndentedString(deploymentVersionRelatedBranchName)).append("\n");
    sb.append("    deploymentVersionState: ").append(toIndentedString(deploymentVersionState)).append("\n");
    sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
    sb.append("    executedDate: ").append(toIndentedString(executedDate)).append("\n");
    sb.append("    finishedDate: ").append(toIndentedString(finishedDate)).append("\n");
    sb.append("    lifeCycleState: ").append(toIndentedString(lifeCycleState)).append("\n");
    sb.append("    queuedDate: ").append(toIndentedString(queuedDate)).append("\n");
    sb.append("    startedDate: ").append(toIndentedString(startedDate)).append("\n");
    sb.append("    versionStatusGravatarUrl: ").append(toIndentedString(versionStatusGravatarUrl)).append("\n");
    sb.append("    versionStatusUserDisplayName: ").append(toIndentedString(versionStatusUserDisplayName)).append("\n");
    sb.append("    versionStatusUserName: ").append(toIndentedString(versionStatusUserName)).append("\n");
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

