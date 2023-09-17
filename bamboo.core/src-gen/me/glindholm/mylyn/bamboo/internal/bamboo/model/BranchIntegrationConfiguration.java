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
import me.glindholm.mylyn.bamboo.internal.bamboo.model.BranchIntegrationPoint;
import me.glindholm.mylyn.bamboo.internal.bamboo.model.PlanKey;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * BranchIntegrationConfiguration
 */
@JsonPropertyOrder({
  BranchIntegrationConfiguration.JSON_PROPERTY_PUSH_ENABLED,
  BranchIntegrationConfiguration.JSON_PROPERTY_INTEGRATION_PLAN_BRANCH_KEY,
  BranchIntegrationConfiguration.JSON_PROPERTY_INTEGRATION_POINT,
  BranchIntegrationConfiguration.JSON_PROPERTY_STRATEGY,
  BranchIntegrationConfiguration.JSON_PROPERTY_ENABLED,
  BranchIntegrationConfiguration.JSON_PROPERTY_VALID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-08T20:39:31.812169500-07:00[America/Vancouver]")
public class BranchIntegrationConfiguration implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PUSH_ENABLED = "pushEnabled";
  private Boolean pushEnabled;

  public static final String JSON_PROPERTY_INTEGRATION_PLAN_BRANCH_KEY = "integrationPlanBranchKey";
  private PlanKey integrationPlanBranchKey;

  public static final String JSON_PROPERTY_INTEGRATION_POINT = "integrationPoint";
  private BranchIntegrationPoint integrationPoint;

  /**
   * Gets or Sets strategy
   */
  public enum StrategyEnum {
    BRANCH_UPDATER("BRANCH_UPDATER"),
    
    GATE_KEEPER("GATE_KEEPER");

    private String value;

    StrategyEnum(String value) {
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
    public static StrategyEnum fromValue(String value) {
      for (StrategyEnum b : StrategyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STRATEGY = "strategy";
  private StrategyEnum strategy;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_VALID = "valid";
  private Boolean valid;

  public BranchIntegrationConfiguration() { 
  }

  public BranchIntegrationConfiguration pushEnabled(Boolean pushEnabled) {
    this.pushEnabled = pushEnabled;
    return this;
  }

   /**
   * Get pushEnabled
   * @return pushEnabled
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_PUSH_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPushEnabled() {
    return pushEnabled;
  }


  @JsonProperty(JSON_PROPERTY_PUSH_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPushEnabled(Boolean pushEnabled) {
    this.pushEnabled = pushEnabled;
  }


  public BranchIntegrationConfiguration integrationPlanBranchKey(PlanKey integrationPlanBranchKey) {
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


  public BranchIntegrationConfiguration integrationPoint(BranchIntegrationPoint integrationPoint) {
    this.integrationPoint = integrationPoint;
    return this;
  }

   /**
   * Get integrationPoint
   * @return integrationPoint
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_INTEGRATION_POINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BranchIntegrationPoint getIntegrationPoint() {
    return integrationPoint;
  }


  @JsonProperty(JSON_PROPERTY_INTEGRATION_POINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntegrationPoint(BranchIntegrationPoint integrationPoint) {
    this.integrationPoint = integrationPoint;
  }


  public BranchIntegrationConfiguration strategy(StrategyEnum strategy) {
    this.strategy = strategy;
    return this;
  }

   /**
   * Get strategy
   * @return strategy
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_STRATEGY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StrategyEnum getStrategy() {
    return strategy;
  }


  @JsonProperty(JSON_PROPERTY_STRATEGY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStrategy(StrategyEnum strategy) {
    this.strategy = strategy;
  }


  public BranchIntegrationConfiguration enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public BranchIntegrationConfiguration valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

   /**
   * Get valid
   * @return valid
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_VALID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getValid() {
    return valid;
  }


  @JsonProperty(JSON_PROPERTY_VALID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValid(Boolean valid) {
    this.valid = valid;
  }


  /**
   * Return true if this BranchIntegrationConfiguration object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BranchIntegrationConfiguration branchIntegrationConfiguration = (BranchIntegrationConfiguration) o;
    return Objects.equals(this.pushEnabled, branchIntegrationConfiguration.pushEnabled) &&
        Objects.equals(this.integrationPlanBranchKey, branchIntegrationConfiguration.integrationPlanBranchKey) &&
        Objects.equals(this.integrationPoint, branchIntegrationConfiguration.integrationPoint) &&
        Objects.equals(this.strategy, branchIntegrationConfiguration.strategy) &&
        Objects.equals(this.enabled, branchIntegrationConfiguration.enabled) &&
        Objects.equals(this.valid, branchIntegrationConfiguration.valid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pushEnabled, integrationPlanBranchKey, integrationPoint, strategy, enabled, valid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BranchIntegrationConfiguration {\n");
    sb.append("    pushEnabled: ").append(toIndentedString(pushEnabled)).append("\n");
    sb.append("    integrationPlanBranchKey: ").append(toIndentedString(integrationPlanBranchKey)).append("\n");
    sb.append("    integrationPoint: ").append(toIndentedString(integrationPoint)).append("\n");
    sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
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

