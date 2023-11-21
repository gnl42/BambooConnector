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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RestRepositoryConnectionResult
 */
@JsonPropertyOrder({
  RestRepositoryConnectionResult.JSON_PROPERTY_CONNECTION_ERRORS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RestRepositoryConnectionResult implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CONNECTION_ERRORS = "connectionErrors";
  private List<String> connectionErrors;

  public RestRepositoryConnectionResult() { 
  }

  public RestRepositoryConnectionResult connectionErrors(List<String> connectionErrors) {
    this.connectionErrors = connectionErrors;
    return this;
  }

  public RestRepositoryConnectionResult addConnectionErrorsItem(String connectionErrorsItem) {
    if (this.connectionErrors == null) {
      this.connectionErrors = new ArrayList<>();
    }
    this.connectionErrors.add(connectionErrorsItem);
    return this;
  }

   /**
   * Get connectionErrors
   * @return connectionErrors
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_CONNECTION_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getConnectionErrors() {
    return connectionErrors;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTION_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnectionErrors(List<String> connectionErrors) {
    this.connectionErrors = connectionErrors;
  }


  /**
   * Return true if this RestRepositoryConnectionResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestRepositoryConnectionResult restRepositoryConnectionResult = (RestRepositoryConnectionResult) o;
    return Objects.equals(this.connectionErrors, restRepositoryConnectionResult.connectionErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestRepositoryConnectionResult {\n");
    sb.append("    connectionErrors: ").append(toIndentedString(connectionErrors)).append("\n");
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

