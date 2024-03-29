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
 * RestAgentAssignmentExecutorDetails
 */
@JsonPropertyOrder({
  RestAgentAssignmentExecutorDetails.JSON_PROPERTY_ID,
  RestAgentAssignmentExecutorDetails.JSON_PROPERTY_KEY,
  RestAgentAssignmentExecutorDetails.JSON_PROPERTY_TYPE,
  RestAgentAssignmentExecutorDetails.JSON_PROPERTY_AGENT_TYPE,
  RestAgentAssignmentExecutorDetails.JSON_PROPERTY_NAME,
  RestAgentAssignmentExecutorDetails.JSON_PROPERTY_CAPABILITIES_MATCH,
  RestAgentAssignmentExecutorDetails.JSON_PROPERTY_DISABLED,
  RestAgentAssignmentExecutorDetails.JSON_PROPERTY_REMOVABLE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RestAgentAssignmentExecutorDetails implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    AGENT("AGENT"),
    
    IMAGE("IMAGE"),
    
    EPHEMERAL("EPHEMERAL");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  /**
   * Gets or Sets agentType
   */
  public enum AgentTypeEnum {
    LOCAL("LOCAL"),
    
    REMOTE("REMOTE"),
    
    ELASTIC("ELASTIC"),
    
    EPHEMERAL("EPHEMERAL");

    private String value;

    AgentTypeEnum(String value) {
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
    public static AgentTypeEnum fromValue(String value) {
      for (AgentTypeEnum b : AgentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_AGENT_TYPE = "agentType";
  private AgentTypeEnum agentType;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CAPABILITIES_MATCH = "capabilitiesMatch";
  private Boolean capabilitiesMatch;

  public static final String JSON_PROPERTY_DISABLED = "disabled";
  private Boolean disabled;

  public static final String JSON_PROPERTY_REMOVABLE = "removable";
  private Boolean removable;

  public RestAgentAssignmentExecutorDetails() { 
  }

  public RestAgentAssignmentExecutorDetails id(Long id) {
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


  public RestAgentAssignmentExecutorDetails key(String key) {
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


  public RestAgentAssignmentExecutorDetails type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public RestAgentAssignmentExecutorDetails agentType(AgentTypeEnum agentType) {
    this.agentType = agentType;
    return this;
  }

   /**
   * Get agentType
   * @return agentType
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_AGENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AgentTypeEnum getAgentType() {
    return agentType;
  }


  @JsonProperty(JSON_PROPERTY_AGENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgentType(AgentTypeEnum agentType) {
    this.agentType = agentType;
  }


  public RestAgentAssignmentExecutorDetails name(String name) {
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


  public RestAgentAssignmentExecutorDetails capabilitiesMatch(Boolean capabilitiesMatch) {
    this.capabilitiesMatch = capabilitiesMatch;
    return this;
  }

   /**
   * Get capabilitiesMatch
   * @return capabilitiesMatch
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_CAPABILITIES_MATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCapabilitiesMatch() {
    return capabilitiesMatch;
  }


  @JsonProperty(JSON_PROPERTY_CAPABILITIES_MATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCapabilitiesMatch(Boolean capabilitiesMatch) {
    this.capabilitiesMatch = capabilitiesMatch;
  }


  public RestAgentAssignmentExecutorDetails disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

   /**
   * Get disabled
   * @return disabled
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_DISABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDisabled() {
    return disabled;
  }


  @JsonProperty(JSON_PROPERTY_DISABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  public RestAgentAssignmentExecutorDetails removable(Boolean removable) {
    this.removable = removable;
    return this;
  }

   /**
   * Get removable
   * @return removable
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_REMOVABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRemovable() {
    return removable;
  }


  @JsonProperty(JSON_PROPERTY_REMOVABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemovable(Boolean removable) {
    this.removable = removable;
  }


  /**
   * Return true if this RestAgentAssignmentExecutorDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestAgentAssignmentExecutorDetails restAgentAssignmentExecutorDetails = (RestAgentAssignmentExecutorDetails) o;
    return Objects.equals(this.id, restAgentAssignmentExecutorDetails.id) &&
        Objects.equals(this.key, restAgentAssignmentExecutorDetails.key) &&
        Objects.equals(this.type, restAgentAssignmentExecutorDetails.type) &&
        Objects.equals(this.agentType, restAgentAssignmentExecutorDetails.agentType) &&
        Objects.equals(this.name, restAgentAssignmentExecutorDetails.name) &&
        Objects.equals(this.capabilitiesMatch, restAgentAssignmentExecutorDetails.capabilitiesMatch) &&
        Objects.equals(this.disabled, restAgentAssignmentExecutorDetails.disabled) &&
        Objects.equals(this.removable, restAgentAssignmentExecutorDetails.removable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, key, type, agentType, name, capabilitiesMatch, disabled, removable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestAgentAssignmentExecutorDetails {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    agentType: ").append(toIndentedString(agentType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    capabilitiesMatch: ").append(toIndentedString(capabilitiesMatch)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    removable: ").append(toIndentedString(removable)).append("\n");
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

