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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RestDeploymentSpec
 */
@JsonPropertyOrder({
  RestDeploymentSpec.JSON_PROPERTY_DEPLOYMENT_ID,
  RestDeploymentSpec.JSON_PROPERTY_CODE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RestDeploymentSpec implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DEPLOYMENT_ID = "deploymentId";
  private Long deploymentId;

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public RestDeploymentSpec() { 
  }

  public RestDeploymentSpec deploymentId(Long deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }

   /**
   * Get deploymentId
   * @return deploymentId
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDeploymentId() {
    return deploymentId;
  }


  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeploymentId(Long deploymentId) {
    this.deploymentId = deploymentId;
  }


  public RestDeploymentSpec code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCode(String code) {
    this.code = code;
  }


  /**
   * Return true if this RestDeploymentSpec object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestDeploymentSpec restDeploymentSpec = (RestDeploymentSpec) o;
    return Objects.equals(this.deploymentId, restDeploymentSpec.deploymentId) &&
        Objects.equals(this.code, restDeploymentSpec.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deploymentId, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestDeploymentSpec {\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
