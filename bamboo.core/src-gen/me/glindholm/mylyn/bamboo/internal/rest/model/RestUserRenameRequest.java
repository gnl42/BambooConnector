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
 * RestUserRenameRequest
 */
@JsonPropertyOrder({
  RestUserRenameRequest.JSON_PROPERTY_NAME,
  RestUserRenameRequest.JSON_PROPERTY_OLD_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RestUserRenameRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OLD_NAME = "oldName";
  private String oldName;

  public RestUserRenameRequest() { 
  }

  public RestUserRenameRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @Schema(example = "newUsername", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
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


  public RestUserRenameRequest oldName(String oldName) {
    this.oldName = oldName;
    return this;
  }

   /**
   * Get oldName
   * @return oldName
  **/
  @jakarta.annotation.Nullable
  @Schema(example = "oldUsername", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_OLD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOldName() {
    return oldName;
  }


  @JsonProperty(JSON_PROPERTY_OLD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOldName(String oldName) {
    this.oldName = oldName;
  }


  /**
   * Return true if this RestUserRenameRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestUserRenameRequest restUserRenameRequest = (RestUserRenameRequest) o;
    return Objects.equals(this.name, restUserRenameRequest.name) &&
        Objects.equals(this.oldName, restUserRenameRequest.oldName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, oldName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestUserRenameRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    oldName: ").append(toIndentedString(oldName)).append("\n");
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

