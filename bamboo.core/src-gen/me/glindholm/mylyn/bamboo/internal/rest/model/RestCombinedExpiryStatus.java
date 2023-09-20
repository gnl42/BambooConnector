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
import me.glindholm.mylyn.bamboo.internal.rest.model.RestExpiryStatus;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RestCombinedExpiryStatus
 */
@JsonPropertyOrder({
  RestCombinedExpiryStatus.JSON_PROPERTY_BUILD_EXPIRY_STATUS,
  RestCombinedExpiryStatus.JSON_PROPERTY_DEPLOYMENT_EXPIRY_STATUS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RestCombinedExpiryStatus implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_BUILD_EXPIRY_STATUS = "buildExpiryStatus";
  private RestExpiryStatus buildExpiryStatus;

  public static final String JSON_PROPERTY_DEPLOYMENT_EXPIRY_STATUS = "deploymentExpiryStatus";
  private RestExpiryStatus deploymentExpiryStatus;

  public RestCombinedExpiryStatus() { 
  }

  public RestCombinedExpiryStatus buildExpiryStatus(RestExpiryStatus buildExpiryStatus) {
    this.buildExpiryStatus = buildExpiryStatus;
    return this;
  }

   /**
   * Get buildExpiryStatus
   * @return buildExpiryStatus
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_BUILD_EXPIRY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestExpiryStatus getBuildExpiryStatus() {
    return buildExpiryStatus;
  }


  @JsonProperty(JSON_PROPERTY_BUILD_EXPIRY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuildExpiryStatus(RestExpiryStatus buildExpiryStatus) {
    this.buildExpiryStatus = buildExpiryStatus;
  }


  public RestCombinedExpiryStatus deploymentExpiryStatus(RestExpiryStatus deploymentExpiryStatus) {
    this.deploymentExpiryStatus = deploymentExpiryStatus;
    return this;
  }

   /**
   * Get deploymentExpiryStatus
   * @return deploymentExpiryStatus
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_EXPIRY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestExpiryStatus getDeploymentExpiryStatus() {
    return deploymentExpiryStatus;
  }


  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_EXPIRY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeploymentExpiryStatus(RestExpiryStatus deploymentExpiryStatus) {
    this.deploymentExpiryStatus = deploymentExpiryStatus;
  }


  /**
   * Return true if this RestCombinedExpiryStatus object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestCombinedExpiryStatus restCombinedExpiryStatus = (RestCombinedExpiryStatus) o;
    return Objects.equals(this.buildExpiryStatus, restCombinedExpiryStatus.buildExpiryStatus) &&
        Objects.equals(this.deploymentExpiryStatus, restCombinedExpiryStatus.deploymentExpiryStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buildExpiryStatus, deploymentExpiryStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestCombinedExpiryStatus {\n");
    sb.append("    buildExpiryStatus: ").append(toIndentedString(buildExpiryStatus)).append("\n");
    sb.append("    deploymentExpiryStatus: ").append(toIndentedString(deploymentExpiryStatus)).append("\n");
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
