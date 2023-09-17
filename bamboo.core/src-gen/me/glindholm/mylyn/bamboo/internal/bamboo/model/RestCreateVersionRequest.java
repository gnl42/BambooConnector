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
 * RestCreateVersionRequest
 */
@JsonPropertyOrder({
  RestCreateVersionRequest.JSON_PROPERTY_NAME,
  RestCreateVersionRequest.JSON_PROPERTY_NEXT_VERSION_NAME,
  RestCreateVersionRequest.JSON_PROPERTY_PLAN_RESULT_KEY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-08T20:39:31.812169500-07:00[America/Vancouver]")
public class RestCreateVersionRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NEXT_VERSION_NAME = "nextVersionName";
  private String nextVersionName;

  public static final String JSON_PROPERTY_PLAN_RESULT_KEY = "planResultKey";
  private String planResultKey;

  public RestCreateVersionRequest() { 
  }

  public RestCreateVersionRequest name(String name) {
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


  public RestCreateVersionRequest nextVersionName(String nextVersionName) {
    this.nextVersionName = nextVersionName;
    return this;
  }

   /**
   * Get nextVersionName
   * @return nextVersionName
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_NEXT_VERSION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNextVersionName() {
    return nextVersionName;
  }


  @JsonProperty(JSON_PROPERTY_NEXT_VERSION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNextVersionName(String nextVersionName) {
    this.nextVersionName = nextVersionName;
  }


  public RestCreateVersionRequest planResultKey(String planResultKey) {
    this.planResultKey = planResultKey;
    return this;
  }

   /**
   * Get planResultKey
   * @return planResultKey
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_PLAN_RESULT_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPlanResultKey() {
    return planResultKey;
  }


  @JsonProperty(JSON_PROPERTY_PLAN_RESULT_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlanResultKey(String planResultKey) {
    this.planResultKey = planResultKey;
  }


  /**
   * Return true if this RestCreateVersionRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestCreateVersionRequest restCreateVersionRequest = (RestCreateVersionRequest) o;
    return Objects.equals(this.name, restCreateVersionRequest.name) &&
        Objects.equals(this.nextVersionName, restCreateVersionRequest.nextVersionName) &&
        Objects.equals(this.planResultKey, restCreateVersionRequest.planResultKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, nextVersionName, planResultKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestCreateVersionRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nextVersionName: ").append(toIndentedString(nextVersionName)).append("\n");
    sb.append("    planResultKey: ").append(toIndentedString(planResultKey)).append("\n");
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

