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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RestManualEncryptionConfiguration
 */
@JsonPropertyOrder({
  RestManualEncryptionConfiguration.JSON_PROPERTY_ENABLED,
  RestManualEncryptionConfiguration.JSON_PROPERTY_LIMIT,
  RestManualEncryptionConfiguration.JSON_PROPERTY_LIMIT_UNIT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-08T20:39:31.812169500-07:00[America/Vancouver]")
public class RestManualEncryptionConfiguration implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Integer limit;

  /**
   * Gets or Sets limitUnit
   */
  public enum LimitUnitEnum {
    NANOSECONDS("NANOSECONDS"),
    
    MICROSECONDS("MICROSECONDS"),
    
    MILLISECONDS("MILLISECONDS"),
    
    SECONDS("SECONDS"),
    
    MINUTES("MINUTES"),
    
    HOURS("HOURS"),
    
    DAYS("DAYS");

    private String value;

    LimitUnitEnum(String value) {
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
    public static LimitUnitEnum fromValue(String value) {
      for (LimitUnitEnum b : LimitUnitEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_LIMIT_UNIT = "limitUnit";
  private LimitUnitEnum limitUnit;

  public RestManualEncryptionConfiguration() { 
  }

  public RestManualEncryptionConfiguration enabled(Boolean enabled) {
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


  public RestManualEncryptionConfiguration limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLimit() {
    return limit;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public RestManualEncryptionConfiguration limitUnit(LimitUnitEnum limitUnit) {
    this.limitUnit = limitUnit;
    return this;
  }

   /**
   * Get limitUnit
   * @return limitUnit
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_LIMIT_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LimitUnitEnum getLimitUnit() {
    return limitUnit;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimitUnit(LimitUnitEnum limitUnit) {
    this.limitUnit = limitUnit;
  }


  /**
   * Return true if this RestManualEncryptionConfiguration object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestManualEncryptionConfiguration restManualEncryptionConfiguration = (RestManualEncryptionConfiguration) o;
    return Objects.equals(this.enabled, restManualEncryptionConfiguration.enabled) &&
        Objects.equals(this.limit, restManualEncryptionConfiguration.limit) &&
        Objects.equals(this.limitUnit, restManualEncryptionConfiguration.limitUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, limit, limitUnit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestManualEncryptionConfiguration {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    limitUnit: ").append(toIndentedString(limitUnit)).append("\n");
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
