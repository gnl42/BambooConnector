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
import me.glindholm.mylyn.bamboo.internal.rest.model.RestQueuedBuildList;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RestQueuedBuilds
 */
@JsonPropertyOrder({
  RestQueuedBuilds.JSON_PROPERTY_EXPAND,
  RestQueuedBuilds.JSON_PROPERTY_LINK,
  RestQueuedBuilds.JSON_PROPERTY_QUEUED_BUILDS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RestQueuedBuilds implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_EXPAND = "expand";
  private String expand;

  public static final String JSON_PROPERTY_LINK = "link";
  private Link link;

  public static final String JSON_PROPERTY_QUEUED_BUILDS = "queuedBuilds";
  private RestQueuedBuildList queuedBuilds;

  public RestQueuedBuilds() { 
  }

  public RestQueuedBuilds expand(String expand) {
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


  public RestQueuedBuilds link(Link link) {
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


  public RestQueuedBuilds queuedBuilds(RestQueuedBuildList queuedBuilds) {
    this.queuedBuilds = queuedBuilds;
    return this;
  }

   /**
   * Get queuedBuilds
   * @return queuedBuilds
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_QUEUED_BUILDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestQueuedBuildList getQueuedBuilds() {
    return queuedBuilds;
  }


  @JsonProperty(JSON_PROPERTY_QUEUED_BUILDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQueuedBuilds(RestQueuedBuildList queuedBuilds) {
    this.queuedBuilds = queuedBuilds;
  }


  /**
   * Return true if this RestQueuedBuilds object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestQueuedBuilds restQueuedBuilds = (RestQueuedBuilds) o;
    return Objects.equals(this.expand, restQueuedBuilds.expand) &&
        Objects.equals(this.link, restQueuedBuilds.link) &&
        Objects.equals(this.queuedBuilds, restQueuedBuilds.queuedBuilds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expand, link, queuedBuilds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestQueuedBuilds {\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    queuedBuilds: ").append(toIndentedString(queuedBuilds)).append("\n");
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

