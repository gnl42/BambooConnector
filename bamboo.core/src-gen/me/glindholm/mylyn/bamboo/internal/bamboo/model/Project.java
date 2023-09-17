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
import java.util.ArrayList;
import java.util.List;
import me.glindholm.mylyn.bamboo.internal.bamboo.model.BambooEntityOid;
import me.glindholm.mylyn.bamboo.internal.bamboo.model.Labelling;
import me.glindholm.mylyn.bamboo.internal.bamboo.model.VcsBambooSpecsSource;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Project
 */
@JsonPropertyOrder({
  Project.JSON_PROPERTY_VCS_BAMBOO_SPECS_SOURCE,
  Project.JSON_PROPERTY_CURRENT_STATUS,
  Project.JSON_PROPERTY_ENTITY_TYPE,
  Project.JSON_PROPERTY_LABELLINGS,
  Project.JSON_PROPERTY_RELATED_LABELLINGS,
  Project.JSON_PROPERTY_KEY,
  Project.JSON_PROPERTY_NAME,
  Project.JSON_PROPERTY_ID,
  Project.JSON_PROPERTY_OID,
  Project.JSON_PROPERTY_MARKED_FOR_DELETION,
  Project.JSON_PROPERTY_DESCRIPTION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-08T20:39:31.812169500-07:00[America/Vancouver]")
public class Project implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_VCS_BAMBOO_SPECS_SOURCE = "vcsBambooSpecsSource";
  private VcsBambooSpecsSource vcsBambooSpecsSource;

  public static final String JSON_PROPERTY_CURRENT_STATUS = "currentStatus";
  private String currentStatus;

  /**
   * Gets or Sets entityType
   */
  public enum EntityTypeEnum {
    CHAIN("CHAIN"),
    
    STAGE("STAGE"),
    
    JOB("JOB"),
    
    REPOSITORY("REPOSITORY"),
    
    CHAIN_BRANCH("CHAIN_BRANCH"),
    
    JOB_BRANCH("JOB_BRANCH"),
    
    TASK("TASK"),
    
    PROJECT("PROJECT"),
    
    ARTIFACT_DEFINITION("ARTIFACT_DEFINITION"),
    
    DEPLOYMENT_PROJECT("DEPLOYMENT_PROJECT"),
    
    SHARED_CREDENTIAL("SHARED_CREDENTIAL");

    private String value;

    EntityTypeEnum(String value) {
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
    public static EntityTypeEnum fromValue(String value) {
      for (EntityTypeEnum b : EntityTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ENTITY_TYPE = "entityType";
  private EntityTypeEnum entityType;

  public static final String JSON_PROPERTY_LABELLINGS = "labellings";
  private List<Labelling> labellings;

  public static final String JSON_PROPERTY_RELATED_LABELLINGS = "relatedLabellings";
  private List<Labelling> relatedLabellings;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_OID = "oid";
  private BambooEntityOid oid;

  public static final String JSON_PROPERTY_MARKED_FOR_DELETION = "markedForDeletion";
  private Boolean markedForDeletion;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public Project() { 
  }

  public Project vcsBambooSpecsSource(VcsBambooSpecsSource vcsBambooSpecsSource) {
    this.vcsBambooSpecsSource = vcsBambooSpecsSource;
    return this;
  }

   /**
   * Get vcsBambooSpecsSource
   * @return vcsBambooSpecsSource
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_VCS_BAMBOO_SPECS_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VcsBambooSpecsSource getVcsBambooSpecsSource() {
    return vcsBambooSpecsSource;
  }


  @JsonProperty(JSON_PROPERTY_VCS_BAMBOO_SPECS_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVcsBambooSpecsSource(VcsBambooSpecsSource vcsBambooSpecsSource) {
    this.vcsBambooSpecsSource = vcsBambooSpecsSource;
  }


  public Project currentStatus(String currentStatus) {
    this.currentStatus = currentStatus;
    return this;
  }

   /**
   * Get currentStatus
   * @return currentStatus
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_CURRENT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrentStatus() {
    return currentStatus;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentStatus(String currentStatus) {
    this.currentStatus = currentStatus;
  }


  public Project entityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
    return this;
  }

   /**
   * Get entityType
   * @return entityType
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EntityTypeEnum getEntityType() {
    return entityType;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
  }


  public Project labellings(List<Labelling> labellings) {
    this.labellings = labellings;
    return this;
  }

  public Project addLabellingsItem(Labelling labellingsItem) {
    if (this.labellings == null) {
      this.labellings = new ArrayList<>();
    }
    this.labellings.add(labellingsItem);
    return this;
  }

   /**
   * Get labellings
   * @return labellings
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_LABELLINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Labelling> getLabellings() {
    return labellings;
  }


  @JsonProperty(JSON_PROPERTY_LABELLINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabellings(List<Labelling> labellings) {
    this.labellings = labellings;
  }


  public Project relatedLabellings(List<Labelling> relatedLabellings) {
    this.relatedLabellings = relatedLabellings;
    return this;
  }

  public Project addRelatedLabellingsItem(Labelling relatedLabellingsItem) {
    if (this.relatedLabellings == null) {
      this.relatedLabellings = new ArrayList<>();
    }
    this.relatedLabellings.add(relatedLabellingsItem);
    return this;
  }

   /**
   * Get relatedLabellings
   * @return relatedLabellings
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_RELATED_LABELLINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Labelling> getRelatedLabellings() {
    return relatedLabellings;
  }


  @JsonProperty(JSON_PROPERTY_RELATED_LABELLINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelatedLabellings(List<Labelling> relatedLabellings) {
    this.relatedLabellings = relatedLabellings;
  }


  public Project key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKey() {
    return key;
  }


  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKey(String key) {
    this.key = key;
  }


  public Project name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
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


  public Project id(Long id) {
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


  public Project oid(BambooEntityOid oid) {
    this.oid = oid;
    return this;
  }

   /**
   * Get oid
   * @return oid
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_OID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BambooEntityOid getOid() {
    return oid;
  }


  @JsonProperty(JSON_PROPERTY_OID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOid(BambooEntityOid oid) {
    this.oid = oid;
  }


  public Project markedForDeletion(Boolean markedForDeletion) {
    this.markedForDeletion = markedForDeletion;
    return this;
  }

   /**
   * Get markedForDeletion
   * @return markedForDeletion
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_MARKED_FOR_DELETION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMarkedForDeletion() {
    return markedForDeletion;
  }


  @JsonProperty(JSON_PROPERTY_MARKED_FOR_DELETION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarkedForDeletion(Boolean markedForDeletion) {
    this.markedForDeletion = markedForDeletion;
  }


  public Project description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Return true if this Project object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Project project = (Project) o;
    return Objects.equals(this.vcsBambooSpecsSource, project.vcsBambooSpecsSource) &&
        Objects.equals(this.currentStatus, project.currentStatus) &&
        Objects.equals(this.entityType, project.entityType) &&
        Objects.equals(this.labellings, project.labellings) &&
        Objects.equals(this.relatedLabellings, project.relatedLabellings) &&
        Objects.equals(this.key, project.key) &&
        Objects.equals(this.name, project.name) &&
        Objects.equals(this.id, project.id) &&
        Objects.equals(this.oid, project.oid) &&
        Objects.equals(this.markedForDeletion, project.markedForDeletion) &&
        Objects.equals(this.description, project.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vcsBambooSpecsSource, currentStatus, entityType, labellings, relatedLabellings, key, name, id, oid, markedForDeletion, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Project {\n");
    sb.append("    vcsBambooSpecsSource: ").append(toIndentedString(vcsBambooSpecsSource)).append("\n");
    sb.append("    currentStatus: ").append(toIndentedString(currentStatus)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    labellings: ").append(toIndentedString(labellings)).append("\n");
    sb.append("    relatedLabellings: ").append(toIndentedString(relatedLabellings)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    oid: ").append(toIndentedString(oid)).append("\n");
    sb.append("    markedForDeletion: ").append(toIndentedString(markedForDeletion)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

