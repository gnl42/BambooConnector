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
 * RestArtifactHandler
 */
@JsonPropertyOrder({
  RestArtifactHandler.JSON_PROPERTY_SELF,
  RestArtifactHandler.JSON_PROPERTY_SHARED_ARTIFACTS_ENABLED,
  RestArtifactHandler.JSON_PROPERTY_NONSHARED_ARTIFACTS_ENABLED,
  RestArtifactHandler.JSON_PROPERTY_ATTRIBUTES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RestArtifactHandler implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SELF = "self";
  private String self;

  public static final String JSON_PROPERTY_SHARED_ARTIFACTS_ENABLED = "sharedArtifactsEnabled";
  private Boolean sharedArtifactsEnabled;

  public static final String JSON_PROPERTY_NONSHARED_ARTIFACTS_ENABLED = "nonsharedArtifactsEnabled";
  private Boolean nonsharedArtifactsEnabled;

  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private Object attributes;

  public RestArtifactHandler() { 
  }

  @JsonCreator
  public RestArtifactHandler(
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




  public RestArtifactHandler sharedArtifactsEnabled(Boolean sharedArtifactsEnabled) {
    this.sharedArtifactsEnabled = sharedArtifactsEnabled;
    return this;
  }

   /**
   * Get sharedArtifactsEnabled
   * @return sharedArtifactsEnabled
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_SHARED_ARTIFACTS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSharedArtifactsEnabled() {
    return sharedArtifactsEnabled;
  }


  @JsonProperty(JSON_PROPERTY_SHARED_ARTIFACTS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSharedArtifactsEnabled(Boolean sharedArtifactsEnabled) {
    this.sharedArtifactsEnabled = sharedArtifactsEnabled;
  }


  public RestArtifactHandler nonsharedArtifactsEnabled(Boolean nonsharedArtifactsEnabled) {
    this.nonsharedArtifactsEnabled = nonsharedArtifactsEnabled;
    return this;
  }

   /**
   * Get nonsharedArtifactsEnabled
   * @return nonsharedArtifactsEnabled
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_NONSHARED_ARTIFACTS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNonsharedArtifactsEnabled() {
    return nonsharedArtifactsEnabled;
  }


  @JsonProperty(JSON_PROPERTY_NONSHARED_ARTIFACTS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNonsharedArtifactsEnabled(Boolean nonsharedArtifactsEnabled) {
    this.nonsharedArtifactsEnabled = nonsharedArtifactsEnabled;
  }


  public RestArtifactHandler attributes(Object attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getAttributes() {
    return attributes;
  }


  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }


  /**
   * Return true if this RestArtifactHandler object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestArtifactHandler restArtifactHandler = (RestArtifactHandler) o;
    return Objects.equals(this.self, restArtifactHandler.self) &&
        Objects.equals(this.sharedArtifactsEnabled, restArtifactHandler.sharedArtifactsEnabled) &&
        Objects.equals(this.nonsharedArtifactsEnabled, restArtifactHandler.nonsharedArtifactsEnabled) &&
        Objects.equals(this.attributes, restArtifactHandler.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, sharedArtifactsEnabled, nonsharedArtifactsEnabled, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestArtifactHandler {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    sharedArtifactsEnabled: ").append(toIndentedString(sharedArtifactsEnabled)).append("\n");
    sb.append("    nonsharedArtifactsEnabled: ").append(toIndentedString(nonsharedArtifactsEnabled)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
