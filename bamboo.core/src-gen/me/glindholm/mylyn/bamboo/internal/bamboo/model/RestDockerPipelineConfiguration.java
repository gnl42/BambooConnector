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
import java.util.ArrayList;
import java.util.List;
import me.glindholm.mylyn.bamboo.internal.bamboo.model.RestDataVolume;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RestDockerPipelineConfiguration
 */
@JsonPropertyOrder({
  RestDockerPipelineConfiguration.JSON_PROPERTY_ENABLED,
  RestDockerPipelineConfiguration.JSON_PROPERTY_DOCKER_IMAGE,
  RestDockerPipelineConfiguration.JSON_PROPERTY_DATA_VOLUMES,
  RestDockerPipelineConfiguration.JSON_PROPERTY_ADDITIONAL_ARGUMENTS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-08T20:39:31.812169500-07:00[America/Vancouver]")
public class RestDockerPipelineConfiguration implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_DOCKER_IMAGE = "dockerImage";
  private String dockerImage;

  public static final String JSON_PROPERTY_DATA_VOLUMES = "dataVolumes";
  private List<RestDataVolume> dataVolumes;

  public static final String JSON_PROPERTY_ADDITIONAL_ARGUMENTS = "additionalArguments";
  private List<String> additionalArguments;

  public RestDockerPipelineConfiguration() { 
  }

  public RestDockerPipelineConfiguration enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public RestDockerPipelineConfiguration dockerImage(String dockerImage) {
    this.dockerImage = dockerImage;
    return this;
  }

   /**
   * Get dockerImage
   * @return dockerImage
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_DOCKER_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDockerImage() {
    return dockerImage;
  }


  @JsonProperty(JSON_PROPERTY_DOCKER_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDockerImage(String dockerImage) {
    this.dockerImage = dockerImage;
  }


  public RestDockerPipelineConfiguration dataVolumes(List<RestDataVolume> dataVolumes) {
    this.dataVolumes = dataVolumes;
    return this;
  }

  public RestDockerPipelineConfiguration addDataVolumesItem(RestDataVolume dataVolumesItem) {
    if (this.dataVolumes == null) {
      this.dataVolumes = new ArrayList<>();
    }
    this.dataVolumes.add(dataVolumesItem);
    return this;
  }

   /**
   * Get dataVolumes
   * @return dataVolumes
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_DATA_VOLUMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RestDataVolume> getDataVolumes() {
    return dataVolumes;
  }


  @JsonProperty(JSON_PROPERTY_DATA_VOLUMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDataVolumes(List<RestDataVolume> dataVolumes) {
    this.dataVolumes = dataVolumes;
  }


  public RestDockerPipelineConfiguration additionalArguments(List<String> additionalArguments) {
    this.additionalArguments = additionalArguments;
    return this;
  }

  public RestDockerPipelineConfiguration addAdditionalArgumentsItem(String additionalArgumentsItem) {
    if (this.additionalArguments == null) {
      this.additionalArguments = new ArrayList<>();
    }
    this.additionalArguments.add(additionalArgumentsItem);
    return this;
  }

   /**
   * Get additionalArguments
   * @return additionalArguments
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_ARGUMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAdditionalArguments() {
    return additionalArguments;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_ARGUMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalArguments(List<String> additionalArguments) {
    this.additionalArguments = additionalArguments;
  }


  /**
   * Return true if this RestDockerPipelineConfiguration object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestDockerPipelineConfiguration restDockerPipelineConfiguration = (RestDockerPipelineConfiguration) o;
    return Objects.equals(this.enabled, restDockerPipelineConfiguration.enabled) &&
        Objects.equals(this.dockerImage, restDockerPipelineConfiguration.dockerImage) &&
        Objects.equals(this.dataVolumes, restDockerPipelineConfiguration.dataVolumes) &&
        Objects.equals(this.additionalArguments, restDockerPipelineConfiguration.additionalArguments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, dockerImage, dataVolumes, additionalArguments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestDockerPipelineConfiguration {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    dockerImage: ").append(toIndentedString(dockerImage)).append("\n");
    sb.append("    dataVolumes: ").append(toIndentedString(dataVolumes)).append("\n");
    sb.append("    additionalArguments: ").append(toIndentedString(additionalArguments)).append("\n");
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
