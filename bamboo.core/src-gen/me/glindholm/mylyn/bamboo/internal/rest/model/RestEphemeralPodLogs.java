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
 * RestEphemeralPodLogs
 */
@JsonPropertyOrder({
  RestEphemeralPodLogs.JSON_PROPERTY_POD_NAME,
  RestEphemeralPodLogs.JSON_PROPERTY_LOGS,
  RestEphemeralPodLogs.JSON_PROPERTY_CONTAINER_NAME,
  RestEphemeralPodLogs.JSON_PROPERTY_LAST_TIME_STAMP
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RestEphemeralPodLogs implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_POD_NAME = "podName";
  private String podName;

  public static final String JSON_PROPERTY_LOGS = "logs";
  private List<String> logs;

  public static final String JSON_PROPERTY_CONTAINER_NAME = "containerName";
  private String containerName;

  public static final String JSON_PROPERTY_LAST_TIME_STAMP = "lastTimeStamp";
  private String lastTimeStamp;

  public RestEphemeralPodLogs() { 
  }

  public RestEphemeralPodLogs podName(String podName) {
    this.podName = podName;
    return this;
  }

   /**
   * Get podName
   * @return podName
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_POD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPodName() {
    return podName;
  }


  @JsonProperty(JSON_PROPERTY_POD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPodName(String podName) {
    this.podName = podName;
  }


  public RestEphemeralPodLogs logs(List<String> logs) {
    this.logs = logs;
    return this;
  }

  public RestEphemeralPodLogs addLogsItem(String logsItem) {
    if (this.logs == null) {
      this.logs = new ArrayList<>();
    }
    this.logs.add(logsItem);
    return this;
  }

   /**
   * Get logs
   * @return logs
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_LOGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getLogs() {
    return logs;
  }


  @JsonProperty(JSON_PROPERTY_LOGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogs(List<String> logs) {
    this.logs = logs;
  }


  public RestEphemeralPodLogs containerName(String containerName) {
    this.containerName = containerName;
    return this;
  }

   /**
   * Get containerName
   * @return containerName
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_CONTAINER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContainerName() {
    return containerName;
  }


  @JsonProperty(JSON_PROPERTY_CONTAINER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContainerName(String containerName) {
    this.containerName = containerName;
  }


  public RestEphemeralPodLogs lastTimeStamp(String lastTimeStamp) {
    this.lastTimeStamp = lastTimeStamp;
    return this;
  }

   /**
   * Get lastTimeStamp
   * @return lastTimeStamp
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_LAST_TIME_STAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastTimeStamp() {
    return lastTimeStamp;
  }


  @JsonProperty(JSON_PROPERTY_LAST_TIME_STAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastTimeStamp(String lastTimeStamp) {
    this.lastTimeStamp = lastTimeStamp;
  }


  /**
   * Return true if this RestEphemeralPodLogs object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestEphemeralPodLogs restEphemeralPodLogs = (RestEphemeralPodLogs) o;
    return Objects.equals(this.podName, restEphemeralPodLogs.podName) &&
        Objects.equals(this.logs, restEphemeralPodLogs.logs) &&
        Objects.equals(this.containerName, restEphemeralPodLogs.containerName) &&
        Objects.equals(this.lastTimeStamp, restEphemeralPodLogs.lastTimeStamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(podName, logs, containerName, lastTimeStamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestEphemeralPodLogs {\n");
    sb.append("    podName: ").append(toIndentedString(podName)).append("\n");
    sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
    sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
    sb.append("    lastTimeStamp: ").append(toIndentedString(lastTimeStamp)).append("\n");
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

