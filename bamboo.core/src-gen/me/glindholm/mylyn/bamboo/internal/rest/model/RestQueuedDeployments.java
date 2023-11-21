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
import me.glindholm.mylyn.bamboo.internal.rest.model.Link;
import me.glindholm.mylyn.bamboo.internal.rest.model.RestQueuedDeploymentList;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RestQueuedDeployments
 */
@JsonPropertyOrder({
  RestQueuedDeployments.JSON_PROPERTY_EXPAND,
  RestQueuedDeployments.JSON_PROPERTY_LINK,
  RestQueuedDeployments.JSON_PROPERTY_QUEUED_DEPLOYMENTS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RestQueuedDeployments implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_EXPAND = "expand";
  private String expand;

  public static final String JSON_PROPERTY_LINK = "link";
  private Link link;

  public static final String JSON_PROPERTY_QUEUED_DEPLOYMENTS = "queuedDeployments";
  private RestQueuedDeploymentList queuedDeployments;

  public RestQueuedDeployments() { 
  }

  public RestQueuedDeployments expand(String expand) {
    this.expand = expand;
    return this;
  }

   /**
   * Get expand
   * @return expand
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_EXPAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExpand() {
    return expand;
  }


  @JsonProperty(JSON_PROPERTY_EXPAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpand(String expand) {
    this.expand = expand;
  }


  public RestQueuedDeployments link(Link link) {
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Link getLink() {
    return link;
  }


  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLink(Link link) {
    this.link = link;
  }


  public RestQueuedDeployments queuedDeployments(RestQueuedDeploymentList queuedDeployments) {
    this.queuedDeployments = queuedDeployments;
    return this;
  }

   /**
   * Get queuedDeployments
   * @return queuedDeployments
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_QUEUED_DEPLOYMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestQueuedDeploymentList getQueuedDeployments() {
    return queuedDeployments;
  }


  @JsonProperty(JSON_PROPERTY_QUEUED_DEPLOYMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQueuedDeployments(RestQueuedDeploymentList queuedDeployments) {
    this.queuedDeployments = queuedDeployments;
  }


  /**
   * Return true if this RestQueuedDeployments object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestQueuedDeployments restQueuedDeployments = (RestQueuedDeployments) o;
    return Objects.equals(this.expand, restQueuedDeployments.expand) &&
        Objects.equals(this.link, restQueuedDeployments.link) &&
        Objects.equals(this.queuedDeployments, restQueuedDeployments.queuedDeployments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expand, link, queuedDeployments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestQueuedDeployments {\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    queuedDeployments: ").append(toIndentedString(queuedDeployments)).append("\n");
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

