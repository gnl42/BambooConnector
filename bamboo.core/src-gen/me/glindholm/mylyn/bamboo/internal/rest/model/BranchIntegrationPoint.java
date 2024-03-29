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
import me.glindholm.mylyn.bamboo.internal.rest.model.PlanKey;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * BranchIntegrationPoint
 */
@JsonPropertyOrder({
  BranchIntegrationPoint.JSON_PROPERTY_INTEGRATION_PLAN_BRANCH_KEY,
  BranchIntegrationPoint.JSON_PROPERTY_INTEGRATION_VCS_REFERENCE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BranchIntegrationPoint implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_INTEGRATION_PLAN_BRANCH_KEY = "integrationPlanBranchKey";
  private PlanKey integrationPlanBranchKey;

  public static final String JSON_PROPERTY_INTEGRATION_VCS_REFERENCE = "integrationVcsReference";
  private String integrationVcsReference;

  public BranchIntegrationPoint() { 
  }

  public BranchIntegrationPoint integrationPlanBranchKey(PlanKey integrationPlanBranchKey) {
    this.integrationPlanBranchKey = integrationPlanBranchKey;
    return this;
  }

   /**
   * Get integrationPlanBranchKey
   * @return integrationPlanBranchKey
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_INTEGRATION_PLAN_BRANCH_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PlanKey getIntegrationPlanBranchKey() {
    return integrationPlanBranchKey;
  }


  @JsonProperty(JSON_PROPERTY_INTEGRATION_PLAN_BRANCH_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntegrationPlanBranchKey(PlanKey integrationPlanBranchKey) {
    this.integrationPlanBranchKey = integrationPlanBranchKey;
  }


  public BranchIntegrationPoint integrationVcsReference(String integrationVcsReference) {
    this.integrationVcsReference = integrationVcsReference;
    return this;
  }

   /**
   * Get integrationVcsReference
   * @return integrationVcsReference
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_INTEGRATION_VCS_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIntegrationVcsReference() {
    return integrationVcsReference;
  }


  @JsonProperty(JSON_PROPERTY_INTEGRATION_VCS_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntegrationVcsReference(String integrationVcsReference) {
    this.integrationVcsReference = integrationVcsReference;
  }


  /**
   * Return true if this BranchIntegrationPoint object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BranchIntegrationPoint branchIntegrationPoint = (BranchIntegrationPoint) o;
    return Objects.equals(this.integrationPlanBranchKey, branchIntegrationPoint.integrationPlanBranchKey) &&
        Objects.equals(this.integrationVcsReference, branchIntegrationPoint.integrationVcsReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integrationPlanBranchKey, integrationVcsReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchIntegrationPoint {\n");
    sb.append("    integrationPlanBranchKey: ").append(toIndentedString(integrationPlanBranchKey)).append("\n");
    sb.append("    integrationVcsReference: ").append(toIndentedString(integrationVcsReference)).append("\n");
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

