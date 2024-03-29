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
 * RestBuildConcurrency
 */
@JsonPropertyOrder({
  RestBuildConcurrency.JSON_PROPERTY_SELF,
  RestBuildConcurrency.JSON_PROPERTY_BUILD_CONCURRENCY_ENABLED,
  RestBuildConcurrency.JSON_PROPERTY_DEFAULT_CONCURRENT_BUILDS_NUMBER
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RestBuildConcurrency implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SELF = "self";
  private String self;

  public static final String JSON_PROPERTY_BUILD_CONCURRENCY_ENABLED = "buildConcurrencyEnabled";
  private Boolean buildConcurrencyEnabled;

  public static final String JSON_PROPERTY_DEFAULT_CONCURRENT_BUILDS_NUMBER = "defaultConcurrentBuildsNumber";
  private Integer defaultConcurrentBuildsNumber;

  public RestBuildConcurrency() { 
  }

  @JsonCreator
  public RestBuildConcurrency(
    @JsonProperty(JSON_PROPERTY_SELF) String self
  ) {
  this();
    this.self = self;
  }

   /**
   * Get self
   * @return self
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_SELF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSelf() {
    return self;
  }




  public RestBuildConcurrency buildConcurrencyEnabled(Boolean buildConcurrencyEnabled) {
    this.buildConcurrencyEnabled = buildConcurrencyEnabled;
    return this;
  }

   /**
   * Get buildConcurrencyEnabled
   * @return buildConcurrencyEnabled
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_BUILD_CONCURRENCY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBuildConcurrencyEnabled() {
    return buildConcurrencyEnabled;
  }


  @JsonProperty(JSON_PROPERTY_BUILD_CONCURRENCY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuildConcurrencyEnabled(Boolean buildConcurrencyEnabled) {
    this.buildConcurrencyEnabled = buildConcurrencyEnabled;
  }


  public RestBuildConcurrency defaultConcurrentBuildsNumber(Integer defaultConcurrentBuildsNumber) {
    this.defaultConcurrentBuildsNumber = defaultConcurrentBuildsNumber;
    return this;
  }

   /**
   * Get defaultConcurrentBuildsNumber
   * @return defaultConcurrentBuildsNumber
  **/
  @jakarta.annotation.Nullable
  @Schema(example = "10", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_DEFAULT_CONCURRENT_BUILDS_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDefaultConcurrentBuildsNumber() {
    return defaultConcurrentBuildsNumber;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_CONCURRENT_BUILDS_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultConcurrentBuildsNumber(Integer defaultConcurrentBuildsNumber) {
    this.defaultConcurrentBuildsNumber = defaultConcurrentBuildsNumber;
  }


  /**
   * Return true if this RestBuildConcurrency object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestBuildConcurrency restBuildConcurrency = (RestBuildConcurrency) o;
    return Objects.equals(this.self, restBuildConcurrency.self) &&
        Objects.equals(this.buildConcurrencyEnabled, restBuildConcurrency.buildConcurrencyEnabled) &&
        Objects.equals(this.defaultConcurrentBuildsNumber, restBuildConcurrency.defaultConcurrentBuildsNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, buildConcurrencyEnabled, defaultConcurrentBuildsNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestBuildConcurrency {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    buildConcurrencyEnabled: ").append(toIndentedString(buildConcurrencyEnabled)).append("\n");
    sb.append("    defaultConcurrentBuildsNumber: ").append(toIndentedString(defaultConcurrentBuildsNumber)).append("\n");
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

