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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import me.glindholm.mylyn.bamboo.internal.rest.model.DeploymentVersionItem;
import me.glindholm.mylyn.bamboo.internal.rest.model.Operations;
import me.glindholm.mylyn.bamboo.internal.rest.model.RestDeploymentVersionStatus;
import me.glindholm.mylyn.bamboo.internal.rest.model.VariableSubstitutionContext;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RestDeploymentVersion
 */
@JsonPropertyOrder({
  RestDeploymentVersion.JSON_PROPERTY_ID,
  RestDeploymentVersion.JSON_PROPERTY_NAME,
  RestDeploymentVersion.JSON_PROPERTY_CREATION_DATE,
  RestDeploymentVersion.JSON_PROPERTY_CREATOR_USER_NAME,
  RestDeploymentVersion.JSON_PROPERTY_ITEMS,
  RestDeploymentVersion.JSON_PROPERTY_VERSION_STATUS,
  RestDeploymentVersion.JSON_PROPERTY_OPERATIONS,
  RestDeploymentVersion.JSON_PROPERTY_CREATOR_DISPLAY_NAME,
  RestDeploymentVersion.JSON_PROPERTY_CREATOR_GRAVATAR_URL,
  RestDeploymentVersion.JSON_PROPERTY_PLAN_BRANCH_NAME,
  RestDeploymentVersion.JSON_PROPERTY_AGE_ZERO_POINT,
  RestDeploymentVersion.JSON_PROPERTY_DEPLOYMENT_PROJECT_ID,
  RestDeploymentVersion.JSON_PROPERTY_VARIABLE_CONTEXT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RestDeploymentVersion implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CREATION_DATE = "creationDate";
  private Date creationDate;

  public static final String JSON_PROPERTY_CREATOR_USER_NAME = "creatorUserName";
  private String creatorUserName;

  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<DeploymentVersionItem> items;

  public static final String JSON_PROPERTY_VERSION_STATUS = "versionStatus";
  private RestDeploymentVersionStatus versionStatus;

  public static final String JSON_PROPERTY_OPERATIONS = "operations";
  private Operations operations;

  public static final String JSON_PROPERTY_CREATOR_DISPLAY_NAME = "creatorDisplayName";
  private String creatorDisplayName;

  public static final String JSON_PROPERTY_CREATOR_GRAVATAR_URL = "creatorGravatarUrl";
  private String creatorGravatarUrl;

  public static final String JSON_PROPERTY_PLAN_BRANCH_NAME = "planBranchName";
  private String planBranchName;

  public static final String JSON_PROPERTY_AGE_ZERO_POINT = "ageZeroPoint";
  private Date ageZeroPoint;

  public static final String JSON_PROPERTY_DEPLOYMENT_PROJECT_ID = "deploymentProjectId";
  private Long deploymentProjectId;

  public static final String JSON_PROPERTY_VARIABLE_CONTEXT = "variableContext";
  private List<VariableSubstitutionContext> variableContext;

  public RestDeploymentVersion() { 
  }

  public RestDeploymentVersion id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Long id) {
    this.id = id;
  }


  public RestDeploymentVersion name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public RestDeploymentVersion creationDate(Date creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Get creationDate
   * @return creationDate
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_CREATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getCreationDate() {
    return creationDate;
  }


  @JsonProperty(JSON_PROPERTY_CREATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }


  public RestDeploymentVersion creatorUserName(String creatorUserName) {
    this.creatorUserName = creatorUserName;
    return this;
  }

   /**
   * Get creatorUserName
   * @return creatorUserName
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_CREATOR_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatorUserName() {
    return creatorUserName;
  }


  @JsonProperty(JSON_PROPERTY_CREATOR_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatorUserName(String creatorUserName) {
    this.creatorUserName = creatorUserName;
  }


  public RestDeploymentVersion items(List<DeploymentVersionItem> items) {
    this.items = items;
    return this;
  }

  public RestDeploymentVersion addItemsItem(DeploymentVersionItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DeploymentVersionItem> getItems() {
    return items;
  }


  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setItems(List<DeploymentVersionItem> items) {
    this.items = items;
  }


  public RestDeploymentVersion versionStatus(RestDeploymentVersionStatus versionStatus) {
    this.versionStatus = versionStatus;
    return this;
  }

   /**
   * Get versionStatus
   * @return versionStatus
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_VERSION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestDeploymentVersionStatus getVersionStatus() {
    return versionStatus;
  }


  @JsonProperty(JSON_PROPERTY_VERSION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersionStatus(RestDeploymentVersionStatus versionStatus) {
    this.versionStatus = versionStatus;
  }


  public RestDeploymentVersion operations(Operations operations) {
    this.operations = operations;
    return this;
  }

   /**
   * Get operations
   * @return operations
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_OPERATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Operations getOperations() {
    return operations;
  }


  @JsonProperty(JSON_PROPERTY_OPERATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperations(Operations operations) {
    this.operations = operations;
  }


  public RestDeploymentVersion creatorDisplayName(String creatorDisplayName) {
    this.creatorDisplayName = creatorDisplayName;
    return this;
  }

   /**
   * Get creatorDisplayName
   * @return creatorDisplayName
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_CREATOR_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatorDisplayName() {
    return creatorDisplayName;
  }


  @JsonProperty(JSON_PROPERTY_CREATOR_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatorDisplayName(String creatorDisplayName) {
    this.creatorDisplayName = creatorDisplayName;
  }


  public RestDeploymentVersion creatorGravatarUrl(String creatorGravatarUrl) {
    this.creatorGravatarUrl = creatorGravatarUrl;
    return this;
  }

   /**
   * Get creatorGravatarUrl
   * @return creatorGravatarUrl
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_CREATOR_GRAVATAR_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatorGravatarUrl() {
    return creatorGravatarUrl;
  }


  @JsonProperty(JSON_PROPERTY_CREATOR_GRAVATAR_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatorGravatarUrl(String creatorGravatarUrl) {
    this.creatorGravatarUrl = creatorGravatarUrl;
  }


  public RestDeploymentVersion planBranchName(String planBranchName) {
    this.planBranchName = planBranchName;
    return this;
  }

   /**
   * Get planBranchName
   * @return planBranchName
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_PLAN_BRANCH_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPlanBranchName() {
    return planBranchName;
  }


  @JsonProperty(JSON_PROPERTY_PLAN_BRANCH_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlanBranchName(String planBranchName) {
    this.planBranchName = planBranchName;
  }


  public RestDeploymentVersion ageZeroPoint(Date ageZeroPoint) {
    this.ageZeroPoint = ageZeroPoint;
    return this;
  }

   /**
   * Get ageZeroPoint
   * @return ageZeroPoint
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_AGE_ZERO_POINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getAgeZeroPoint() {
    return ageZeroPoint;
  }


  @JsonProperty(JSON_PROPERTY_AGE_ZERO_POINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgeZeroPoint(Date ageZeroPoint) {
    this.ageZeroPoint = ageZeroPoint;
  }


  public RestDeploymentVersion deploymentProjectId(Long deploymentProjectId) {
    this.deploymentProjectId = deploymentProjectId;
    return this;
  }

   /**
   * Get deploymentProjectId
   * @return deploymentProjectId
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDeploymentProjectId() {
    return deploymentProjectId;
  }


  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeploymentProjectId(Long deploymentProjectId) {
    this.deploymentProjectId = deploymentProjectId;
  }


  public RestDeploymentVersion variableContext(List<VariableSubstitutionContext> variableContext) {
    this.variableContext = variableContext;
    return this;
  }

  public RestDeploymentVersion addVariableContextItem(VariableSubstitutionContext variableContextItem) {
    if (this.variableContext == null) {
      this.variableContext = new ArrayList<>();
    }
    this.variableContext.add(variableContextItem);
    return this;
  }

   /**
   * Get variableContext
   * @return variableContext
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_VARIABLE_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<VariableSubstitutionContext> getVariableContext() {
    return variableContext;
  }


  @JsonProperty(JSON_PROPERTY_VARIABLE_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVariableContext(List<VariableSubstitutionContext> variableContext) {
    this.variableContext = variableContext;
  }


  /**
   * Return true if this RestDeploymentVersion object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestDeploymentVersion restDeploymentVersion = (RestDeploymentVersion) o;
    return Objects.equals(this.id, restDeploymentVersion.id) &&
        Objects.equals(this.name, restDeploymentVersion.name) &&
        Objects.equals(this.creationDate, restDeploymentVersion.creationDate) &&
        Objects.equals(this.creatorUserName, restDeploymentVersion.creatorUserName) &&
        Objects.equals(this.items, restDeploymentVersion.items) &&
        Objects.equals(this.versionStatus, restDeploymentVersion.versionStatus) &&
        Objects.equals(this.operations, restDeploymentVersion.operations) &&
        Objects.equals(this.creatorDisplayName, restDeploymentVersion.creatorDisplayName) &&
        Objects.equals(this.creatorGravatarUrl, restDeploymentVersion.creatorGravatarUrl) &&
        Objects.equals(this.planBranchName, restDeploymentVersion.planBranchName) &&
        Objects.equals(this.ageZeroPoint, restDeploymentVersion.ageZeroPoint) &&
        Objects.equals(this.deploymentProjectId, restDeploymentVersion.deploymentProjectId) &&
        Objects.equals(this.variableContext, restDeploymentVersion.variableContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, creationDate, creatorUserName, items, versionStatus, operations, creatorDisplayName, creatorGravatarUrl, planBranchName, ageZeroPoint, deploymentProjectId, variableContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestDeploymentVersion {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    creatorUserName: ").append(toIndentedString(creatorUserName)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    versionStatus: ").append(toIndentedString(versionStatus)).append("\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
    sb.append("    creatorDisplayName: ").append(toIndentedString(creatorDisplayName)).append("\n");
    sb.append("    creatorGravatarUrl: ").append(toIndentedString(creatorGravatarUrl)).append("\n");
    sb.append("    planBranchName: ").append(toIndentedString(planBranchName)).append("\n");
    sb.append("    ageZeroPoint: ").append(toIndentedString(ageZeroPoint)).append("\n");
    sb.append("    deploymentProjectId: ").append(toIndentedString(deploymentProjectId)).append("\n");
    sb.append("    variableContext: ").append(toIndentedString(variableContext)).append("\n");
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

