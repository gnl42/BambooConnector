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
 * RestOperations
 */
@JsonPropertyOrder({
  RestOperations.JSON_PROPERTY_CAN_VIEW,
  RestOperations.JSON_PROPERTY_CAN_VIEW_CONFIGURATION,
  RestOperations.JSON_PROPERTY_CAN_EDIT,
  RestOperations.JSON_PROPERTY_CAN_DELETE,
  RestOperations.JSON_PROPERTY_ALLOWED_TO_EXECUTE,
  RestOperations.JSON_PROPERTY_CAN_EXECUTE,
  RestOperations.JSON_PROPERTY_CANT_EXECUTE_REASON,
  RestOperations.JSON_PROPERTY_ALLOWED_TO_CREATE_VERSION,
  RestOperations.JSON_PROPERTY_ALLOWED_TO_SET_VERSION_STATUS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-08T20:39:31.812169500-07:00[America/Vancouver]")
public class RestOperations implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CAN_VIEW = "canView";
  private Boolean canView;

  public static final String JSON_PROPERTY_CAN_VIEW_CONFIGURATION = "canViewConfiguration";
  private Boolean canViewConfiguration;

  public static final String JSON_PROPERTY_CAN_EDIT = "canEdit";
  private Boolean canEdit;

  public static final String JSON_PROPERTY_CAN_DELETE = "canDelete";
  private Boolean canDelete;

  public static final String JSON_PROPERTY_ALLOWED_TO_EXECUTE = "allowedToExecute";
  private Boolean allowedToExecute;

  public static final String JSON_PROPERTY_CAN_EXECUTE = "canExecute";
  private Boolean canExecute;

  public static final String JSON_PROPERTY_CANT_EXECUTE_REASON = "cantExecuteReason";
  private String cantExecuteReason;

  public static final String JSON_PROPERTY_ALLOWED_TO_CREATE_VERSION = "allowedToCreateVersion";
  private Boolean allowedToCreateVersion;

  public static final String JSON_PROPERTY_ALLOWED_TO_SET_VERSION_STATUS = "allowedToSetVersionStatus";
  private Boolean allowedToSetVersionStatus;

  public RestOperations() { 
  }

  public RestOperations canView(Boolean canView) {
    this.canView = canView;
    return this;
  }

   /**
   * Get canView
   * @return canView
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_CAN_VIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanView() {
    return canView;
  }


  @JsonProperty(JSON_PROPERTY_CAN_VIEW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCanView(Boolean canView) {
    this.canView = canView;
  }


  public RestOperations canViewConfiguration(Boolean canViewConfiguration) {
    this.canViewConfiguration = canViewConfiguration;
    return this;
  }

   /**
   * Get canViewConfiguration
   * @return canViewConfiguration
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_CAN_VIEW_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanViewConfiguration() {
    return canViewConfiguration;
  }


  @JsonProperty(JSON_PROPERTY_CAN_VIEW_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCanViewConfiguration(Boolean canViewConfiguration) {
    this.canViewConfiguration = canViewConfiguration;
  }


  public RestOperations canEdit(Boolean canEdit) {
    this.canEdit = canEdit;
    return this;
  }

   /**
   * Get canEdit
   * @return canEdit
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_CAN_EDIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanEdit() {
    return canEdit;
  }


  @JsonProperty(JSON_PROPERTY_CAN_EDIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCanEdit(Boolean canEdit) {
    this.canEdit = canEdit;
  }


  public RestOperations canDelete(Boolean canDelete) {
    this.canDelete = canDelete;
    return this;
  }

   /**
   * Get canDelete
   * @return canDelete
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_CAN_DELETE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanDelete() {
    return canDelete;
  }


  @JsonProperty(JSON_PROPERTY_CAN_DELETE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCanDelete(Boolean canDelete) {
    this.canDelete = canDelete;
  }


  public RestOperations allowedToExecute(Boolean allowedToExecute) {
    this.allowedToExecute = allowedToExecute;
    return this;
  }

   /**
   * Get allowedToExecute
   * @return allowedToExecute
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_ALLOWED_TO_EXECUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowedToExecute() {
    return allowedToExecute;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED_TO_EXECUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedToExecute(Boolean allowedToExecute) {
    this.allowedToExecute = allowedToExecute;
  }


  public RestOperations canExecute(Boolean canExecute) {
    this.canExecute = canExecute;
    return this;
  }

   /**
   * Get canExecute
   * @return canExecute
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_CAN_EXECUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCanExecute() {
    return canExecute;
  }


  @JsonProperty(JSON_PROPERTY_CAN_EXECUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCanExecute(Boolean canExecute) {
    this.canExecute = canExecute;
  }


  public RestOperations cantExecuteReason(String cantExecuteReason) {
    this.cantExecuteReason = cantExecuteReason;
    return this;
  }

   /**
   * Get cantExecuteReason
   * @return cantExecuteReason
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_CANT_EXECUTE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCantExecuteReason() {
    return cantExecuteReason;
  }


  @JsonProperty(JSON_PROPERTY_CANT_EXECUTE_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCantExecuteReason(String cantExecuteReason) {
    this.cantExecuteReason = cantExecuteReason;
  }


  public RestOperations allowedToCreateVersion(Boolean allowedToCreateVersion) {
    this.allowedToCreateVersion = allowedToCreateVersion;
    return this;
  }

   /**
   * Get allowedToCreateVersion
   * @return allowedToCreateVersion
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_ALLOWED_TO_CREATE_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowedToCreateVersion() {
    return allowedToCreateVersion;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED_TO_CREATE_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedToCreateVersion(Boolean allowedToCreateVersion) {
    this.allowedToCreateVersion = allowedToCreateVersion;
  }


  public RestOperations allowedToSetVersionStatus(Boolean allowedToSetVersionStatus) {
    this.allowedToSetVersionStatus = allowedToSetVersionStatus;
    return this;
  }

   /**
   * Get allowedToSetVersionStatus
   * @return allowedToSetVersionStatus
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_ALLOWED_TO_SET_VERSION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowedToSetVersionStatus() {
    return allowedToSetVersionStatus;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED_TO_SET_VERSION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedToSetVersionStatus(Boolean allowedToSetVersionStatus) {
    this.allowedToSetVersionStatus = allowedToSetVersionStatus;
  }


  /**
   * Return true if this RestOperations object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestOperations restOperations = (RestOperations) o;
    return Objects.equals(this.canView, restOperations.canView) &&
        Objects.equals(this.canViewConfiguration, restOperations.canViewConfiguration) &&
        Objects.equals(this.canEdit, restOperations.canEdit) &&
        Objects.equals(this.canDelete, restOperations.canDelete) &&
        Objects.equals(this.allowedToExecute, restOperations.allowedToExecute) &&
        Objects.equals(this.canExecute, restOperations.canExecute) &&
        Objects.equals(this.cantExecuteReason, restOperations.cantExecuteReason) &&
        Objects.equals(this.allowedToCreateVersion, restOperations.allowedToCreateVersion) &&
        Objects.equals(this.allowedToSetVersionStatus, restOperations.allowedToSetVersionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canView, canViewConfiguration, canEdit, canDelete, allowedToExecute, canExecute, cantExecuteReason, allowedToCreateVersion, allowedToSetVersionStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestOperations {\n");
    sb.append("    canView: ").append(toIndentedString(canView)).append("\n");
    sb.append("    canViewConfiguration: ").append(toIndentedString(canViewConfiguration)).append("\n");
    sb.append("    canEdit: ").append(toIndentedString(canEdit)).append("\n");
    sb.append("    canDelete: ").append(toIndentedString(canDelete)).append("\n");
    sb.append("    allowedToExecute: ").append(toIndentedString(allowedToExecute)).append("\n");
    sb.append("    canExecute: ").append(toIndentedString(canExecute)).append("\n");
    sb.append("    cantExecuteReason: ").append(toIndentedString(cantExecuteReason)).append("\n");
    sb.append("    allowedToCreateVersion: ").append(toIndentedString(allowedToCreateVersion)).append("\n");
    sb.append("    allowedToSetVersionStatus: ").append(toIndentedString(allowedToSetVersionStatus)).append("\n");
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

