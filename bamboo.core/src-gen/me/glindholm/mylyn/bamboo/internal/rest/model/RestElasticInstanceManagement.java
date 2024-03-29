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
 * RestElasticInstanceManagement
 */
@JsonPropertyOrder({
  RestElasticInstanceManagement.JSON_PROPERTY_TYPE,
  RestElasticInstanceManagement.JSON_PROPERTY_IDLE_AGENT_SHUTDOWN_DELAY_MINUTES,
  RestElasticInstanceManagement.JSON_PROPERTY_ALLOWED_NON_BAMBOO_INSTANCES,
  RestElasticInstanceManagement.JSON_PROPERTY_MAX_NUM_OF_INSTANCES_START,
  RestElasticInstanceManagement.JSON_PROPERTY_NUM_OF_BUILDS_IN_QUEUE,
  RestElasticInstanceManagement.JSON_PROPERTY_NUM_OF_ELASTIC_BUILDS_IN_QUEUE,
  RestElasticInstanceManagement.JSON_PROPERTY_AVG_QUEUE_TIME_MINUTES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RestElasticInstanceManagement implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_IDLE_AGENT_SHUTDOWN_DELAY_MINUTES = "idleAgentShutdownDelayMinutes";
  private Integer idleAgentShutdownDelayMinutes;

  public static final String JSON_PROPERTY_ALLOWED_NON_BAMBOO_INSTANCES = "allowedNonBambooInstances";
  private Integer allowedNonBambooInstances;

  public static final String JSON_PROPERTY_MAX_NUM_OF_INSTANCES_START = "maxNumOfInstancesStart";
  private Integer maxNumOfInstancesStart;

  public static final String JSON_PROPERTY_NUM_OF_BUILDS_IN_QUEUE = "numOfBuildsInQueue";
  private Integer numOfBuildsInQueue;

  public static final String JSON_PROPERTY_NUM_OF_ELASTIC_BUILDS_IN_QUEUE = "numOfElasticBuildsInQueue";
  private Integer numOfElasticBuildsInQueue;

  public static final String JSON_PROPERTY_AVG_QUEUE_TIME_MINUTES = "avgQueueTimeMinutes";
  private Integer avgQueueTimeMinutes;

  public RestElasticInstanceManagement() { 
  }

  public RestElasticInstanceManagement type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @Schema(example = "Custom", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public RestElasticInstanceManagement idleAgentShutdownDelayMinutes(Integer idleAgentShutdownDelayMinutes) {
    this.idleAgentShutdownDelayMinutes = idleAgentShutdownDelayMinutes;
    return this;
  }

   /**
   * Get idleAgentShutdownDelayMinutes
   * @return idleAgentShutdownDelayMinutes
  **/
  @jakarta.annotation.Nullable
  @Schema(example = "5", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_IDLE_AGENT_SHUTDOWN_DELAY_MINUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIdleAgentShutdownDelayMinutes() {
    return idleAgentShutdownDelayMinutes;
  }


  @JsonProperty(JSON_PROPERTY_IDLE_AGENT_SHUTDOWN_DELAY_MINUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdleAgentShutdownDelayMinutes(Integer idleAgentShutdownDelayMinutes) {
    this.idleAgentShutdownDelayMinutes = idleAgentShutdownDelayMinutes;
  }


  public RestElasticInstanceManagement allowedNonBambooInstances(Integer allowedNonBambooInstances) {
    this.allowedNonBambooInstances = allowedNonBambooInstances;
    return this;
  }

   /**
   * Get allowedNonBambooInstances
   * @return allowedNonBambooInstances
  **/
  @jakarta.annotation.Nullable
  @Schema(example = "3", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_ALLOWED_NON_BAMBOO_INSTANCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAllowedNonBambooInstances() {
    return allowedNonBambooInstances;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED_NON_BAMBOO_INSTANCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedNonBambooInstances(Integer allowedNonBambooInstances) {
    this.allowedNonBambooInstances = allowedNonBambooInstances;
  }


  public RestElasticInstanceManagement maxNumOfInstancesStart(Integer maxNumOfInstancesStart) {
    this.maxNumOfInstancesStart = maxNumOfInstancesStart;
    return this;
  }

   /**
   * Get maxNumOfInstancesStart
   * @return maxNumOfInstancesStart
  **/
  @jakarta.annotation.Nullable
  @Schema(example = "7", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_MAX_NUM_OF_INSTANCES_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxNumOfInstancesStart() {
    return maxNumOfInstancesStart;
  }


  @JsonProperty(JSON_PROPERTY_MAX_NUM_OF_INSTANCES_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxNumOfInstancesStart(Integer maxNumOfInstancesStart) {
    this.maxNumOfInstancesStart = maxNumOfInstancesStart;
  }


  public RestElasticInstanceManagement numOfBuildsInQueue(Integer numOfBuildsInQueue) {
    this.numOfBuildsInQueue = numOfBuildsInQueue;
    return this;
  }

   /**
   * Get numOfBuildsInQueue
   * @return numOfBuildsInQueue
  **/
  @jakarta.annotation.Nullable
  @Schema(example = "5", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_NUM_OF_BUILDS_IN_QUEUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumOfBuildsInQueue() {
    return numOfBuildsInQueue;
  }


  @JsonProperty(JSON_PROPERTY_NUM_OF_BUILDS_IN_QUEUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumOfBuildsInQueue(Integer numOfBuildsInQueue) {
    this.numOfBuildsInQueue = numOfBuildsInQueue;
  }


  public RestElasticInstanceManagement numOfElasticBuildsInQueue(Integer numOfElasticBuildsInQueue) {
    this.numOfElasticBuildsInQueue = numOfElasticBuildsInQueue;
    return this;
  }

   /**
   * Get numOfElasticBuildsInQueue
   * @return numOfElasticBuildsInQueue
  **/
  @jakarta.annotation.Nullable
  @Schema(example = "1", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_NUM_OF_ELASTIC_BUILDS_IN_QUEUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumOfElasticBuildsInQueue() {
    return numOfElasticBuildsInQueue;
  }


  @JsonProperty(JSON_PROPERTY_NUM_OF_ELASTIC_BUILDS_IN_QUEUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumOfElasticBuildsInQueue(Integer numOfElasticBuildsInQueue) {
    this.numOfElasticBuildsInQueue = numOfElasticBuildsInQueue;
  }


  public RestElasticInstanceManagement avgQueueTimeMinutes(Integer avgQueueTimeMinutes) {
    this.avgQueueTimeMinutes = avgQueueTimeMinutes;
    return this;
  }

   /**
   * Get avgQueueTimeMinutes
   * @return avgQueueTimeMinutes
  **/
  @jakarta.annotation.Nullable
  @Schema(example = "10", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_AVG_QUEUE_TIME_MINUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAvgQueueTimeMinutes() {
    return avgQueueTimeMinutes;
  }


  @JsonProperty(JSON_PROPERTY_AVG_QUEUE_TIME_MINUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvgQueueTimeMinutes(Integer avgQueueTimeMinutes) {
    this.avgQueueTimeMinutes = avgQueueTimeMinutes;
  }


  /**
   * Return true if this RestElasticInstanceManagement object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestElasticInstanceManagement restElasticInstanceManagement = (RestElasticInstanceManagement) o;
    return Objects.equals(this.type, restElasticInstanceManagement.type) &&
        Objects.equals(this.idleAgentShutdownDelayMinutes, restElasticInstanceManagement.idleAgentShutdownDelayMinutes) &&
        Objects.equals(this.allowedNonBambooInstances, restElasticInstanceManagement.allowedNonBambooInstances) &&
        Objects.equals(this.maxNumOfInstancesStart, restElasticInstanceManagement.maxNumOfInstancesStart) &&
        Objects.equals(this.numOfBuildsInQueue, restElasticInstanceManagement.numOfBuildsInQueue) &&
        Objects.equals(this.numOfElasticBuildsInQueue, restElasticInstanceManagement.numOfElasticBuildsInQueue) &&
        Objects.equals(this.avgQueueTimeMinutes, restElasticInstanceManagement.avgQueueTimeMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, idleAgentShutdownDelayMinutes, allowedNonBambooInstances, maxNumOfInstancesStart, numOfBuildsInQueue, numOfElasticBuildsInQueue, avgQueueTimeMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestElasticInstanceManagement {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    idleAgentShutdownDelayMinutes: ").append(toIndentedString(idleAgentShutdownDelayMinutes)).append("\n");
    sb.append("    allowedNonBambooInstances: ").append(toIndentedString(allowedNonBambooInstances)).append("\n");
    sb.append("    maxNumOfInstancesStart: ").append(toIndentedString(maxNumOfInstancesStart)).append("\n");
    sb.append("    numOfBuildsInQueue: ").append(toIndentedString(numOfBuildsInQueue)).append("\n");
    sb.append("    numOfElasticBuildsInQueue: ").append(toIndentedString(numOfElasticBuildsInQueue)).append("\n");
    sb.append("    avgQueueTimeMinutes: ").append(toIndentedString(avgQueueTimeMinutes)).append("\n");
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

