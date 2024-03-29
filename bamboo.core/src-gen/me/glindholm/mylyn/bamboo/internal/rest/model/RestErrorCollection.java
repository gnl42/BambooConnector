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
 * RestErrorCollection
 */
@JsonPropertyOrder({
  RestErrorCollection.JSON_PROPERTY_ERRORS,
  RestErrorCollection.JSON_PROPERTY_FIELD_ERRORS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RestErrorCollection implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<String> errors;

  public static final String JSON_PROPERTY_FIELD_ERRORS = "fieldErrors";
  private Object fieldErrors;

  public RestErrorCollection() { 
  }

  public RestErrorCollection errors(List<String> errors) {
    this.errors = errors;
    return this;
  }

  public RestErrorCollection addErrorsItem(String errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getErrors() {
    return errors;
  }


  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrors(List<String> errors) {
    this.errors = errors;
  }


  public RestErrorCollection fieldErrors(Object fieldErrors) {
    this.fieldErrors = fieldErrors;
    return this;
  }

   /**
   * Get fieldErrors
   * @return fieldErrors
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_FIELD_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getFieldErrors() {
    return fieldErrors;
  }


  @JsonProperty(JSON_PROPERTY_FIELD_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFieldErrors(Object fieldErrors) {
    this.fieldErrors = fieldErrors;
  }


  /**
   * Return true if this RestErrorCollection object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestErrorCollection restErrorCollection = (RestErrorCollection) o;
    return Objects.equals(this.errors, restErrorCollection.errors) &&
        Objects.equals(this.fieldErrors, restErrorCollection.fieldErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, fieldErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestErrorCollection {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    fieldErrors: ").append(toIndentedString(fieldErrors)).append("\n");
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

