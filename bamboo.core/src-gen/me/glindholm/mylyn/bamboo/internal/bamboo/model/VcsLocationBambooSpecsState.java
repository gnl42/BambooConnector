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
import java.util.Date;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * VcsLocationBambooSpecsState
 */
@JsonPropertyOrder({
  VcsLocationBambooSpecsState.JSON_PROPERTY_REVISION,
  VcsLocationBambooSpecsState.JSON_PROPERTY_SPECS_NOT_FOUND,
  VcsLocationBambooSpecsState.JSON_PROPERTY_BRANCH,
  VcsLocationBambooSpecsState.JSON_PROPERTY_VCS_LOCATION_ID,
  VcsLocationBambooSpecsState.JSON_PROPERTY_LOG_FILENAME,
  VcsLocationBambooSpecsState.JSON_PROPERTY_SPECS_EXECUTION_DATE,
  VcsLocationBambooSpecsState.JSON_PROPERTY_SPEC_IMPORT_STATE,
  VcsLocationBambooSpecsState.JSON_PROPERTY_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-08T20:39:31.812169500-07:00[America/Vancouver]")
public class VcsLocationBambooSpecsState implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_REVISION = "revision";
  private String revision;

  public static final String JSON_PROPERTY_SPECS_NOT_FOUND = "specsNotFound";
  private Boolean specsNotFound;

  public static final String JSON_PROPERTY_BRANCH = "branch";
  private String branch;

  public static final String JSON_PROPERTY_VCS_LOCATION_ID = "vcsLocationId";
  private Long vcsLocationId;

  public static final String JSON_PROPERTY_LOG_FILENAME = "logFilename";
  private String logFilename;

  public static final String JSON_PROPERTY_SPECS_EXECUTION_DATE = "specsExecutionDate";
  private Date specsExecutionDate;

  /**
   * Gets or Sets specImportState
   */
  public enum SpecImportStateEnum {
    SUCCESS("SUCCESS"),
    
    ERROR("ERROR");

    private String value;

    SpecImportStateEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SpecImportStateEnum fromValue(String value) {
      for (SpecImportStateEnum b : SpecImportStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SPEC_IMPORT_STATE = "specImportState";
  private SpecImportStateEnum specImportState;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public VcsLocationBambooSpecsState() { 
  }

  public VcsLocationBambooSpecsState revision(String revision) {
    this.revision = revision;
    return this;
  }

   /**
   * Get revision
   * @return revision
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_REVISION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRevision() {
    return revision;
  }


  @JsonProperty(JSON_PROPERTY_REVISION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRevision(String revision) {
    this.revision = revision;
  }


  public VcsLocationBambooSpecsState specsNotFound(Boolean specsNotFound) {
    this.specsNotFound = specsNotFound;
    return this;
  }

   /**
   * Get specsNotFound
   * @return specsNotFound
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_SPECS_NOT_FOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSpecsNotFound() {
    return specsNotFound;
  }


  @JsonProperty(JSON_PROPERTY_SPECS_NOT_FOUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpecsNotFound(Boolean specsNotFound) {
    this.specsNotFound = specsNotFound;
  }


  public VcsLocationBambooSpecsState branch(String branch) {
    this.branch = branch;
    return this;
  }

   /**
   * Get branch
   * @return branch
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_BRANCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBranch() {
    return branch;
  }


  @JsonProperty(JSON_PROPERTY_BRANCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBranch(String branch) {
    this.branch = branch;
  }


  public VcsLocationBambooSpecsState vcsLocationId(Long vcsLocationId) {
    this.vcsLocationId = vcsLocationId;
    return this;
  }

   /**
   * Get vcsLocationId
   * @return vcsLocationId
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_VCS_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getVcsLocationId() {
    return vcsLocationId;
  }


  @JsonProperty(JSON_PROPERTY_VCS_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVcsLocationId(Long vcsLocationId) {
    this.vcsLocationId = vcsLocationId;
  }


  public VcsLocationBambooSpecsState logFilename(String logFilename) {
    this.logFilename = logFilename;
    return this;
  }

   /**
   * Get logFilename
   * @return logFilename
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_LOG_FILENAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLogFilename() {
    return logFilename;
  }


  @JsonProperty(JSON_PROPERTY_LOG_FILENAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogFilename(String logFilename) {
    this.logFilename = logFilename;
  }


  public VcsLocationBambooSpecsState specsExecutionDate(Date specsExecutionDate) {
    this.specsExecutionDate = specsExecutionDate;
    return this;
  }

   /**
   * Get specsExecutionDate
   * @return specsExecutionDate
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_SPECS_EXECUTION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getSpecsExecutionDate() {
    return specsExecutionDate;
  }


  @JsonProperty(JSON_PROPERTY_SPECS_EXECUTION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpecsExecutionDate(Date specsExecutionDate) {
    this.specsExecutionDate = specsExecutionDate;
  }


  public VcsLocationBambooSpecsState specImportState(SpecImportStateEnum specImportState) {
    this.specImportState = specImportState;
    return this;
  }

   /**
   * Get specImportState
   * @return specImportState
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_SPEC_IMPORT_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SpecImportStateEnum getSpecImportState() {
    return specImportState;
  }


  @JsonProperty(JSON_PROPERTY_SPEC_IMPORT_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpecImportState(SpecImportStateEnum specImportState) {
    this.specImportState = specImportState;
  }


  public VcsLocationBambooSpecsState id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Long id) {
    this.id = id;
  }


  /**
   * Return true if this VcsLocationBambooSpecsState object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VcsLocationBambooSpecsState vcsLocationBambooSpecsState = (VcsLocationBambooSpecsState) o;
    return Objects.equals(this.revision, vcsLocationBambooSpecsState.revision) &&
        Objects.equals(this.specsNotFound, vcsLocationBambooSpecsState.specsNotFound) &&
        Objects.equals(this.branch, vcsLocationBambooSpecsState.branch) &&
        Objects.equals(this.vcsLocationId, vcsLocationBambooSpecsState.vcsLocationId) &&
        Objects.equals(this.logFilename, vcsLocationBambooSpecsState.logFilename) &&
        Objects.equals(this.specsExecutionDate, vcsLocationBambooSpecsState.specsExecutionDate) &&
        Objects.equals(this.specImportState, vcsLocationBambooSpecsState.specImportState) &&
        Objects.equals(this.id, vcsLocationBambooSpecsState.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(revision, specsNotFound, branch, vcsLocationId, logFilename, specsExecutionDate, specImportState, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VcsLocationBambooSpecsState {\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    specsNotFound: ").append(toIndentedString(specsNotFound)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    vcsLocationId: ").append(toIndentedString(vcsLocationId)).append("\n");
    sb.append("    logFilename: ").append(toIndentedString(logFilename)).append("\n");
    sb.append("    specsExecutionDate: ").append(toIndentedString(specsExecutionDate)).append("\n");
    sb.append("    specImportState: ").append(toIndentedString(specImportState)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

