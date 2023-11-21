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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RestBuildArtifact
 */
@JsonPropertyOrder({
  RestBuildArtifact.JSON_PROPERTY_NAME,
  RestBuildArtifact.JSON_PROPERTY_LINK,
  RestBuildArtifact.JSON_PROPERTY_PRODUCER_JOB_KEY,
  RestBuildArtifact.JSON_PROPERTY_SHARED,
  RestBuildArtifact.JSON_PROPERTY_SIZE,
  RestBuildArtifact.JSON_PROPERTY_PRETTY_SIZE_DESCRIPTION,
  RestBuildArtifact.JSON_PROPERTY_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RestBuildArtifact implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_LINK = "link";
  private Link link;

  public static final String JSON_PROPERTY_PRODUCER_JOB_KEY = "producerJobKey";
  private String producerJobKey;

  public static final String JSON_PROPERTY_SHARED = "shared";
  private Boolean shared;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Long size;

  public static final String JSON_PROPERTY_PRETTY_SIZE_DESCRIPTION = "prettySizeDescription";
  private String prettySizeDescription;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public RestBuildArtifact() { 
  }

  public RestBuildArtifact name(String name) {
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


  public RestBuildArtifact link(Link link) {
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


  public RestBuildArtifact producerJobKey(String producerJobKey) {
    this.producerJobKey = producerJobKey;
    return this;
  }

   /**
   * Get producerJobKey
   * @return producerJobKey
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_PRODUCER_JOB_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProducerJobKey() {
    return producerJobKey;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCER_JOB_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProducerJobKey(String producerJobKey) {
    this.producerJobKey = producerJobKey;
  }


  public RestBuildArtifact shared(Boolean shared) {
    this.shared = shared;
    return this;
  }

   /**
   * Get shared
   * @return shared
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_SHARED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShared() {
    return shared;
  }


  @JsonProperty(JSON_PROPERTY_SHARED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShared(Boolean shared) {
    this.shared = shared;
  }


  public RestBuildArtifact size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSize() {
    return size;
  }


  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSize(Long size) {
    this.size = size;
  }


  public RestBuildArtifact prettySizeDescription(String prettySizeDescription) {
    this.prettySizeDescription = prettySizeDescription;
    return this;
  }

   /**
   * Get prettySizeDescription
   * @return prettySizeDescription
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_PRETTY_SIZE_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrettySizeDescription() {
    return prettySizeDescription;
  }


  @JsonProperty(JSON_PROPERTY_PRETTY_SIZE_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrettySizeDescription(String prettySizeDescription) {
    this.prettySizeDescription = prettySizeDescription;
  }


  public RestBuildArtifact id(String id) {
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

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Return true if this RestBuildArtifact object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestBuildArtifact restBuildArtifact = (RestBuildArtifact) o;
    return Objects.equals(this.name, restBuildArtifact.name) &&
        Objects.equals(this.link, restBuildArtifact.link) &&
        Objects.equals(this.producerJobKey, restBuildArtifact.producerJobKey) &&
        Objects.equals(this.shared, restBuildArtifact.shared) &&
        Objects.equals(this.size, restBuildArtifact.size) &&
        Objects.equals(this.prettySizeDescription, restBuildArtifact.prettySizeDescription) &&
        Objects.equals(this.id, restBuildArtifact.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, link, producerJobKey, shared, size, prettySizeDescription, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestBuildArtifact {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    producerJobKey: ").append(toIndentedString(producerJobKey)).append("\n");
    sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    prettySizeDescription: ").append(toIndentedString(prettySizeDescription)).append("\n");
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

