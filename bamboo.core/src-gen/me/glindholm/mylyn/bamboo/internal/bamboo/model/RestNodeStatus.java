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
 * RestNodeStatus
 */
@JsonPropertyOrder({
  RestNodeStatus.JSON_PROPERTY_NODE_ID,
  RestNodeStatus.JSON_PROPERTY_NODE_NAME,
  RestNodeStatus.JSON_PROPERTY_LAST_HEARTBEAT,
  RestNodeStatus.JSON_PROPERTY_PRIMARY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-08T20:39:31.812169500-07:00[America/Vancouver]")
public class RestNodeStatus implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NODE_ID = "nodeId";
  private String nodeId;

  public static final String JSON_PROPERTY_NODE_NAME = "nodeName";
  private String nodeName;

  public static final String JSON_PROPERTY_LAST_HEARTBEAT = "lastHeartbeat";
  private Date lastHeartbeat;

  public static final String JSON_PROPERTY_PRIMARY = "primary";
  private Boolean primary;

  public RestNodeStatus() { 
  }

  public RestNodeStatus nodeId(String nodeId) {
    this.nodeId = nodeId;
    return this;
  }

   /**
   * Get nodeId
   * @return nodeId
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_NODE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNodeId() {
    return nodeId;
  }


  @JsonProperty(JSON_PROPERTY_NODE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }


  public RestNodeStatus nodeName(String nodeName) {
    this.nodeName = nodeName;
    return this;
  }

   /**
   * Get nodeName
   * @return nodeName
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_NODE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNodeName() {
    return nodeName;
  }


  @JsonProperty(JSON_PROPERTY_NODE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }


  public RestNodeStatus lastHeartbeat(Date lastHeartbeat) {
    this.lastHeartbeat = lastHeartbeat;
    return this;
  }

   /**
   * Get lastHeartbeat
   * @return lastHeartbeat
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_LAST_HEARTBEAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getLastHeartbeat() {
    return lastHeartbeat;
  }


  @JsonProperty(JSON_PROPERTY_LAST_HEARTBEAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastHeartbeat(Date lastHeartbeat) {
    this.lastHeartbeat = lastHeartbeat;
  }


  public RestNodeStatus primary(Boolean primary) {
    this.primary = primary;
    return this;
  }

   /**
   * Get primary
   * @return primary
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_PRIMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPrimary() {
    return primary;
  }


  @JsonProperty(JSON_PROPERTY_PRIMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }


  /**
   * Return true if this RestNodeStatus object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestNodeStatus restNodeStatus = (RestNodeStatus) o;
    return Objects.equals(this.nodeId, restNodeStatus.nodeId) &&
        Objects.equals(this.nodeName, restNodeStatus.nodeName) &&
        Objects.equals(this.lastHeartbeat, restNodeStatus.lastHeartbeat) &&
        Objects.equals(this.primary, restNodeStatus.primary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeId, nodeName, lastHeartbeat, primary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestNodeStatus {\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    lastHeartbeat: ").append(toIndentedString(lastHeartbeat)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
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

