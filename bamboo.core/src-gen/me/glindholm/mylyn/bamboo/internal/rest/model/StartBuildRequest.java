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
 * StartBuildRequest
 */
@JsonPropertyOrder({
  StartBuildRequest.JSON_PROPERTY_FAKE_PARAM
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StartBuildRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FAKE_PARAM = "fakeParam";
  private String fakeParam;

  public StartBuildRequest() { 
  }

  public StartBuildRequest fakeParam(String fakeParam) {
    this.fakeParam = fakeParam;
    return this;
  }

   /**
   * Get fakeParam
   * @return fakeParam
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_FAKE_PARAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFakeParam() {
    return fakeParam;
  }


  @JsonProperty(JSON_PROPERTY_FAKE_PARAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFakeParam(String fakeParam) {
    this.fakeParam = fakeParam;
  }


  /**
   * Return true if this startBuild_request object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartBuildRequest startBuildRequest = (StartBuildRequest) o;
    return Objects.equals(this.fakeParam, startBuildRequest.fakeParam);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fakeParam);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartBuildRequest {\n");
    sb.append("    fakeParam: ").append(toIndentedString(fakeParam)).append("\n");
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

