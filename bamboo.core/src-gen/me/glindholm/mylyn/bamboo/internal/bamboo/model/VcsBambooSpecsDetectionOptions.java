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
 * VcsBambooSpecsDetectionOptions
 */
@JsonPropertyOrder({
  VcsBambooSpecsDetectionOptions.JSON_PROPERTY_BAMBOO_SPECS_DETECTION_ENABLED,
  VcsBambooSpecsDetectionOptions.JSON_PROPERTY_BAMBOO_SPECS_DETECTION,
  VcsBambooSpecsDetectionOptions.JSON_PROPERTY_CONFIGURATION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-08T20:39:31.812169500-07:00[America/Vancouver]")
public class VcsBambooSpecsDetectionOptions implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_BAMBOO_SPECS_DETECTION_ENABLED = "bambooSpecsDetectionEnabled";
  private Boolean bambooSpecsDetectionEnabled;

  public static final String JSON_PROPERTY_BAMBOO_SPECS_DETECTION = "bambooSpecsDetection";
  private Boolean bambooSpecsDetection;

  public static final String JSON_PROPERTY_CONFIGURATION = "configuration";
  private Object _configuration;

  public VcsBambooSpecsDetectionOptions() { 
  }

  public VcsBambooSpecsDetectionOptions bambooSpecsDetectionEnabled(Boolean bambooSpecsDetectionEnabled) {
    this.bambooSpecsDetectionEnabled = bambooSpecsDetectionEnabled;
    return this;
  }

   /**
   * Get bambooSpecsDetectionEnabled
   * @return bambooSpecsDetectionEnabled
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_BAMBOO_SPECS_DETECTION_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBambooSpecsDetectionEnabled() {
    return bambooSpecsDetectionEnabled;
  }


  @JsonProperty(JSON_PROPERTY_BAMBOO_SPECS_DETECTION_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBambooSpecsDetectionEnabled(Boolean bambooSpecsDetectionEnabled) {
    this.bambooSpecsDetectionEnabled = bambooSpecsDetectionEnabled;
  }


  public VcsBambooSpecsDetectionOptions bambooSpecsDetection(Boolean bambooSpecsDetection) {
    this.bambooSpecsDetection = bambooSpecsDetection;
    return this;
  }

   /**
   * Get bambooSpecsDetection
   * @return bambooSpecsDetection
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_BAMBOO_SPECS_DETECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBambooSpecsDetection() {
    return bambooSpecsDetection;
  }


  @JsonProperty(JSON_PROPERTY_BAMBOO_SPECS_DETECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBambooSpecsDetection(Boolean bambooSpecsDetection) {
    this.bambooSpecsDetection = bambooSpecsDetection;
  }


  public VcsBambooSpecsDetectionOptions _configuration(Object _configuration) {
    this._configuration = _configuration;
    return this;
  }

   /**
   * Get _configuration
   * @return _configuration
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getConfiguration() {
    return _configuration;
  }


  @JsonProperty(JSON_PROPERTY_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfiguration(Object _configuration) {
    this._configuration = _configuration;
  }


  /**
   * Return true if this VcsBambooSpecsDetectionOptions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VcsBambooSpecsDetectionOptions vcsBambooSpecsDetectionOptions = (VcsBambooSpecsDetectionOptions) o;
    return Objects.equals(this.bambooSpecsDetectionEnabled, vcsBambooSpecsDetectionOptions.bambooSpecsDetectionEnabled) &&
        Objects.equals(this.bambooSpecsDetection, vcsBambooSpecsDetectionOptions.bambooSpecsDetection) &&
        Objects.equals(this._configuration, vcsBambooSpecsDetectionOptions._configuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bambooSpecsDetectionEnabled, bambooSpecsDetection, _configuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VcsBambooSpecsDetectionOptions {\n");
    sb.append("    bambooSpecsDetectionEnabled: ").append(toIndentedString(bambooSpecsDetectionEnabled)).append("\n");
    sb.append("    bambooSpecsDetection: ").append(toIndentedString(bambooSpecsDetection)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
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
