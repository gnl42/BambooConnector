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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RequirementReadonlyData
 */
@JsonPropertyOrder({
  RequirementReadonlyData.JSON_PROPERTY_MATCHING_AGENTS,
  RequirementReadonlyData.JSON_PROPERTY_MATCHING_IMAGES,
  RequirementReadonlyData.JSON_PROPERTY_MATCHING_TEMPLATES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-08T20:39:31.812169500-07:00[America/Vancouver]")
public class RequirementReadonlyData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_MATCHING_AGENTS = "matchingAgents";
  private Integer matchingAgents;

  public static final String JSON_PROPERTY_MATCHING_IMAGES = "matchingImages";
  private Integer matchingImages;

  public static final String JSON_PROPERTY_MATCHING_TEMPLATES = "matchingTemplates";
  private Integer matchingTemplates;

  public RequirementReadonlyData() { 
  }

  public RequirementReadonlyData matchingAgents(Integer matchingAgents) {
    this.matchingAgents = matchingAgents;
    return this;
  }

   /**
   * Get matchingAgents
   * @return matchingAgents
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_MATCHING_AGENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMatchingAgents() {
    return matchingAgents;
  }


  @JsonProperty(JSON_PROPERTY_MATCHING_AGENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMatchingAgents(Integer matchingAgents) {
    this.matchingAgents = matchingAgents;
  }


  public RequirementReadonlyData matchingImages(Integer matchingImages) {
    this.matchingImages = matchingImages;
    return this;
  }

   /**
   * Get matchingImages
   * @return matchingImages
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_MATCHING_IMAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMatchingImages() {
    return matchingImages;
  }


  @JsonProperty(JSON_PROPERTY_MATCHING_IMAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMatchingImages(Integer matchingImages) {
    this.matchingImages = matchingImages;
  }


  public RequirementReadonlyData matchingTemplates(Integer matchingTemplates) {
    this.matchingTemplates = matchingTemplates;
    return this;
  }

   /**
   * Get matchingTemplates
   * @return matchingTemplates
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_MATCHING_TEMPLATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMatchingTemplates() {
    return matchingTemplates;
  }


  @JsonProperty(JSON_PROPERTY_MATCHING_TEMPLATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMatchingTemplates(Integer matchingTemplates) {
    this.matchingTemplates = matchingTemplates;
  }


  /**
   * Return true if this RequirementReadonlyData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequirementReadonlyData requirementReadonlyData = (RequirementReadonlyData) o;
    return Objects.equals(this.matchingAgents, requirementReadonlyData.matchingAgents) &&
        Objects.equals(this.matchingImages, requirementReadonlyData.matchingImages) &&
        Objects.equals(this.matchingTemplates, requirementReadonlyData.matchingTemplates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchingAgents, matchingImages, matchingTemplates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequirementReadonlyData {\n");
    sb.append("    matchingAgents: ").append(toIndentedString(matchingAgents)).append("\n");
    sb.append("    matchingImages: ").append(toIndentedString(matchingImages)).append("\n");
    sb.append("    matchingTemplates: ").append(toIndentedString(matchingTemplates)).append("\n");
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

