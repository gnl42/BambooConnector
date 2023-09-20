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
import me.glindholm.mylyn.bamboo.internal.rest.model.ArtifactLink;
import me.glindholm.mylyn.bamboo.internal.rest.model.ResultsSummary;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ConsumedSubscription
 */
@JsonPropertyOrder({
  ConsumedSubscription.JSON_PROPERTY_ARTIFACT_LINK,
  ConsumedSubscription.JSON_PROPERTY_CONSUMER_RESULT_SUMMARY,
  ConsumedSubscription.JSON_PROPERTY_DESTINATION_DIRECTORY,
  ConsumedSubscription.JSON_PROPERTY_ID,
  ConsumedSubscription.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConsumedSubscription implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ARTIFACT_LINK = "artifactLink";
  private ArtifactLink artifactLink;

  public static final String JSON_PROPERTY_CONSUMER_RESULT_SUMMARY = "consumerResultSummary";
  private ResultsSummary consumerResultSummary;

  public static final String JSON_PROPERTY_DESTINATION_DIRECTORY = "destinationDirectory";
  private String destinationDirectory;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public ConsumedSubscription() { 
  }

  public ConsumedSubscription artifactLink(ArtifactLink artifactLink) {
    this.artifactLink = artifactLink;
    return this;
  }

   /**
   * Get artifactLink
   * @return artifactLink
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_ARTIFACT_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ArtifactLink getArtifactLink() {
    return artifactLink;
  }


  @JsonProperty(JSON_PROPERTY_ARTIFACT_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArtifactLink(ArtifactLink artifactLink) {
    this.artifactLink = artifactLink;
  }


  public ConsumedSubscription consumerResultSummary(ResultsSummary consumerResultSummary) {
    this.consumerResultSummary = consumerResultSummary;
    return this;
  }

   /**
   * Get consumerResultSummary
   * @return consumerResultSummary
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_CONSUMER_RESULT_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ResultsSummary getConsumerResultSummary() {
    return consumerResultSummary;
  }


  @JsonProperty(JSON_PROPERTY_CONSUMER_RESULT_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConsumerResultSummary(ResultsSummary consumerResultSummary) {
    this.consumerResultSummary = consumerResultSummary;
  }


  public ConsumedSubscription destinationDirectory(String destinationDirectory) {
    this.destinationDirectory = destinationDirectory;
    return this;
  }

   /**
   * Get destinationDirectory
   * @return destinationDirectory
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_DESTINATION_DIRECTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDestinationDirectory() {
    return destinationDirectory;
  }


  @JsonProperty(JSON_PROPERTY_DESTINATION_DIRECTORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDestinationDirectory(String destinationDirectory) {
    this.destinationDirectory = destinationDirectory;
  }


  public ConsumedSubscription id(Long id) {
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


  public ConsumedSubscription name(String name) {
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


  /**
   * Return true if this ConsumedSubscription object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumedSubscription consumedSubscription = (ConsumedSubscription) o;
    return Objects.equals(this.artifactLink, consumedSubscription.artifactLink) &&
        Objects.equals(this.consumerResultSummary, consumedSubscription.consumerResultSummary) &&
        Objects.equals(this.destinationDirectory, consumedSubscription.destinationDirectory) &&
        Objects.equals(this.id, consumedSubscription.id) &&
        Objects.equals(this.name, consumedSubscription.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifactLink, consumerResultSummary, destinationDirectory, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumedSubscription {\n");
    sb.append("    artifactLink: ").append(toIndentedString(artifactLink)).append("\n");
    sb.append("    consumerResultSummary: ").append(toIndentedString(consumerResultSummary)).append("\n");
    sb.append("    destinationDirectory: ").append(toIndentedString(destinationDirectory)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
