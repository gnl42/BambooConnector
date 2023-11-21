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
import java.util.List;
import me.glindholm.mylyn.bamboo.internal.rest.model.RestSpec;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RestProjectSpec
 */
@JsonPropertyOrder({
  RestProjectSpec.JSON_PROPERTY_PROJECT_KEY,
  RestProjectSpec.JSON_PROPERTY_SPEC
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RestProjectSpec implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PROJECT_KEY = "projectKey";
  private String projectKey;

  public static final String JSON_PROPERTY_SPEC = "spec";
  private List<RestSpec> spec;

  public RestProjectSpec() { 
  }

  public RestProjectSpec projectKey(String projectKey) {
    this.projectKey = projectKey;
    return this;
  }

   /**
   * Get projectKey
   * @return projectKey
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_PROJECT_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProjectKey() {
    return projectKey;
  }


  @JsonProperty(JSON_PROPERTY_PROJECT_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProjectKey(String projectKey) {
    this.projectKey = projectKey;
  }


  public RestProjectSpec spec(List<RestSpec> spec) {
    this.spec = spec;
    return this;
  }

  public RestProjectSpec addSpecItem(RestSpec specItem) {
    if (this.spec == null) {
      this.spec = new ArrayList<>();
    }
    this.spec.add(specItem);
    return this;
  }

   /**
   * Get spec
   * @return spec
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_SPEC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RestSpec> getSpec() {
    return spec;
  }


  @JsonProperty(JSON_PROPERTY_SPEC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpec(List<RestSpec> spec) {
    this.spec = spec;
  }


  /**
   * Return true if this RestProjectSpec object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestProjectSpec restProjectSpec = (RestProjectSpec) o;
    return Objects.equals(this.projectKey, restProjectSpec.projectKey) &&
        Objects.equals(this.spec, restProjectSpec.spec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectKey, spec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestProjectSpec {\n");
    sb.append("    projectKey: ").append(toIndentedString(projectKey)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
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

