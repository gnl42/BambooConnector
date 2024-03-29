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
import me.glindholm.mylyn.bamboo.internal.rest.model.DeploymentKey;
import me.glindholm.mylyn.bamboo.internal.rest.model.ImmutableRequirementSet;
import me.glindholm.mylyn.bamboo.internal.rest.model.Operations;
import me.glindholm.mylyn.bamboo.internal.rest.model.TaskDefinition;
import me.glindholm.mylyn.bamboo.internal.rest.model.TriggerDefinition;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Environment
 */
@JsonPropertyOrder({
  Environment.JSON_PROPERTY_OPERATIONS,
  Environment.JSON_PROPERTY_TASK_DEFINITIONS,
  Environment.JSON_PROPERTY_CONFIGURATION_STATE,
  Environment.JSON_PROPERTY_DEPLOYMENT_PROJECT_ID,
  Environment.JSON_PROPERTY_REQUIREMENT_SET,
  Environment.JSON_PROPERTY_TASK_DEFINITIONS_SUPPLIER,
  Environment.JSON_PROPERTY_TRIGGER_DEFINITIONS_SUPPLIER,
  Environment.JSON_PROPERTY_POSITION,
  Environment.JSON_PROPERTY_NAME,
  Environment.JSON_PROPERTY_KEY,
  Environment.JSON_PROPERTY_ID,
  Environment.JSON_PROPERTY_DESCRIPTION,
  Environment.JSON_PROPERTY_TRIGGER_DEFINITIONS,
  Environment.JSON_PROPERTY_SUSPENDED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Environment implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_OPERATIONS = "operations";
  private Operations operations;

  public static final String JSON_PROPERTY_TASK_DEFINITIONS = "taskDefinitions";
  private List<TaskDefinition> taskDefinitions;

  /**
   * Gets or Sets configurationState
   */
  public enum ConfigurationStateEnum {
    CREATED("CREATED"),
    
    DETAILED("DETAILED"),
    
    TASKED("TASKED");

    private String value;

    ConfigurationStateEnum(String value) {
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
    public static ConfigurationStateEnum fromValue(String value) {
      for (ConfigurationStateEnum b : ConfigurationStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CONFIGURATION_STATE = "configurationState";
  private ConfigurationStateEnum configurationState;

  public static final String JSON_PROPERTY_DEPLOYMENT_PROJECT_ID = "deploymentProjectId";
  private Long deploymentProjectId;

  public static final String JSON_PROPERTY_REQUIREMENT_SET = "requirementSet";
  private ImmutableRequirementSet requirementSet;

  public static final String JSON_PROPERTY_TASK_DEFINITIONS_SUPPLIER = "taskDefinitionsSupplier";
  private Object taskDefinitionsSupplier;

  public static final String JSON_PROPERTY_TRIGGER_DEFINITIONS_SUPPLIER = "triggerDefinitionsSupplier";
  private Object triggerDefinitionsSupplier;

  public static final String JSON_PROPERTY_POSITION = "position";
  private Integer position;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_KEY = "key";
  private DeploymentKey key;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_TRIGGER_DEFINITIONS = "triggerDefinitions";
  private List<TriggerDefinition> triggerDefinitions;

  public static final String JSON_PROPERTY_SUSPENDED = "suspended";
  private Boolean suspended;

  public Environment() { 
  }

  public Environment operations(Operations operations) {
    this.operations = operations;
    return this;
  }

   /**
   * Get operations
   * @return operations
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_OPERATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Operations getOperations() {
    return operations;
  }


  @JsonProperty(JSON_PROPERTY_OPERATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperations(Operations operations) {
    this.operations = operations;
  }


  public Environment taskDefinitions(List<TaskDefinition> taskDefinitions) {
    this.taskDefinitions = taskDefinitions;
    return this;
  }

  public Environment addTaskDefinitionsItem(TaskDefinition taskDefinitionsItem) {
    if (this.taskDefinitions == null) {
      this.taskDefinitions = new ArrayList<>();
    }
    this.taskDefinitions.add(taskDefinitionsItem);
    return this;
  }

   /**
   * Get taskDefinitions
   * @return taskDefinitions
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_TASK_DEFINITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TaskDefinition> getTaskDefinitions() {
    return taskDefinitions;
  }


  @JsonProperty(JSON_PROPERTY_TASK_DEFINITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaskDefinitions(List<TaskDefinition> taskDefinitions) {
    this.taskDefinitions = taskDefinitions;
  }


  public Environment configurationState(ConfigurationStateEnum configurationState) {
    this.configurationState = configurationState;
    return this;
  }

   /**
   * Get configurationState
   * @return configurationState
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_CONFIGURATION_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConfigurationStateEnum getConfigurationState() {
    return configurationState;
  }


  @JsonProperty(JSON_PROPERTY_CONFIGURATION_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfigurationState(ConfigurationStateEnum configurationState) {
    this.configurationState = configurationState;
  }


  public Environment deploymentProjectId(Long deploymentProjectId) {
    this.deploymentProjectId = deploymentProjectId;
    return this;
  }

   /**
   * Get deploymentProjectId
   * @return deploymentProjectId
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDeploymentProjectId() {
    return deploymentProjectId;
  }


  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeploymentProjectId(Long deploymentProjectId) {
    this.deploymentProjectId = deploymentProjectId;
  }


  public Environment requirementSet(ImmutableRequirementSet requirementSet) {
    this.requirementSet = requirementSet;
    return this;
  }

   /**
   * Get requirementSet
   * @return requirementSet
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_REQUIREMENT_SET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ImmutableRequirementSet getRequirementSet() {
    return requirementSet;
  }


  @JsonProperty(JSON_PROPERTY_REQUIREMENT_SET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequirementSet(ImmutableRequirementSet requirementSet) {
    this.requirementSet = requirementSet;
  }


  public Environment taskDefinitionsSupplier(Object taskDefinitionsSupplier) {
    this.taskDefinitionsSupplier = taskDefinitionsSupplier;
    return this;
  }

   /**
   * Get taskDefinitionsSupplier
   * @return taskDefinitionsSupplier
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_TASK_DEFINITIONS_SUPPLIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getTaskDefinitionsSupplier() {
    return taskDefinitionsSupplier;
  }


  @JsonProperty(JSON_PROPERTY_TASK_DEFINITIONS_SUPPLIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaskDefinitionsSupplier(Object taskDefinitionsSupplier) {
    this.taskDefinitionsSupplier = taskDefinitionsSupplier;
  }


  public Environment triggerDefinitionsSupplier(Object triggerDefinitionsSupplier) {
    this.triggerDefinitionsSupplier = triggerDefinitionsSupplier;
    return this;
  }

   /**
   * Get triggerDefinitionsSupplier
   * @return triggerDefinitionsSupplier
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_TRIGGER_DEFINITIONS_SUPPLIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getTriggerDefinitionsSupplier() {
    return triggerDefinitionsSupplier;
  }


  @JsonProperty(JSON_PROPERTY_TRIGGER_DEFINITIONS_SUPPLIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTriggerDefinitionsSupplier(Object triggerDefinitionsSupplier) {
    this.triggerDefinitionsSupplier = triggerDefinitionsSupplier;
  }


  public Environment position(Integer position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_POSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPosition() {
    return position;
  }


  @JsonProperty(JSON_PROPERTY_POSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPosition(Integer position) {
    this.position = position;
  }


  public Environment name(String name) {
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


  public Environment key(DeploymentKey key) {
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

  public DeploymentKey getKey() {
    return key;
  }


  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKey(DeploymentKey key) {
    this.key = key;
  }


  public Environment id(Long id) {
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


  public Environment description(String description) {
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


  public Environment triggerDefinitions(List<TriggerDefinition> triggerDefinitions) {
    this.triggerDefinitions = triggerDefinitions;
    return this;
  }

  public Environment addTriggerDefinitionsItem(TriggerDefinition triggerDefinitionsItem) {
    if (this.triggerDefinitions == null) {
      this.triggerDefinitions = new ArrayList<>();
    }
    this.triggerDefinitions.add(triggerDefinitionsItem);
    return this;
  }

   /**
   * Get triggerDefinitions
   * @return triggerDefinitions
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_TRIGGER_DEFINITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TriggerDefinition> getTriggerDefinitions() {
    return triggerDefinitions;
  }


  @JsonProperty(JSON_PROPERTY_TRIGGER_DEFINITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTriggerDefinitions(List<TriggerDefinition> triggerDefinitions) {
    this.triggerDefinitions = triggerDefinitions;
  }


  public Environment suspended(Boolean suspended) {
    this.suspended = suspended;
    return this;
  }

   /**
   * Get suspended
   * @return suspended
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_SUSPENDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSuspended() {
    return suspended;
  }


  @JsonProperty(JSON_PROPERTY_SUSPENDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }


  /**
   * Return true if this Environment object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Environment environment = (Environment) o;
    return Objects.equals(this.operations, environment.operations) &&
        Objects.equals(this.taskDefinitions, environment.taskDefinitions) &&
        Objects.equals(this.configurationState, environment.configurationState) &&
        Objects.equals(this.deploymentProjectId, environment.deploymentProjectId) &&
        Objects.equals(this.requirementSet, environment.requirementSet) &&
        Objects.equals(this.taskDefinitionsSupplier, environment.taskDefinitionsSupplier) &&
        Objects.equals(this.triggerDefinitionsSupplier, environment.triggerDefinitionsSupplier) &&
        Objects.equals(this.position, environment.position) &&
        Objects.equals(this.name, environment.name) &&
        Objects.equals(this.key, environment.key) &&
        Objects.equals(this.id, environment.id) &&
        Objects.equals(this.description, environment.description) &&
        Objects.equals(this.triggerDefinitions, environment.triggerDefinitions) &&
        Objects.equals(this.suspended, environment.suspended);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operations, taskDefinitions, configurationState, deploymentProjectId, requirementSet, taskDefinitionsSupplier, triggerDefinitionsSupplier, position, name, key, id, description, triggerDefinitions, suspended);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Environment {\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
    sb.append("    taskDefinitions: ").append(toIndentedString(taskDefinitions)).append("\n");
    sb.append("    configurationState: ").append(toIndentedString(configurationState)).append("\n");
    sb.append("    deploymentProjectId: ").append(toIndentedString(deploymentProjectId)).append("\n");
    sb.append("    requirementSet: ").append(toIndentedString(requirementSet)).append("\n");
    sb.append("    taskDefinitionsSupplier: ").append(toIndentedString(taskDefinitionsSupplier)).append("\n");
    sb.append("    triggerDefinitionsSupplier: ").append(toIndentedString(triggerDefinitionsSupplier)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    triggerDefinitions: ").append(toIndentedString(triggerDefinitions)).append("\n");
    sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
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

