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
import me.glindholm.mylyn.bamboo.internal.rest.model.ImmutableVcsLocationBambooSpecsState;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ImmutableVcsBambooSpecsSource
 */
@JsonPropertyOrder({
  ImmutableVcsBambooSpecsSource.JSON_PROPERTY_VCS_LOCATION_BAMBOO_SPECS_STATE,
  ImmutableVcsBambooSpecsSource.JSON_PROPERTY_SOURCE_LOCATION,
  ImmutableVcsBambooSpecsSource.JSON_PROPERTY_YAML_CONFIGURATION,
  ImmutableVcsBambooSpecsSource.JSON_PROPERTY_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ImmutableVcsBambooSpecsSource implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_VCS_LOCATION_BAMBOO_SPECS_STATE = "vcsLocationBambooSpecsState";
  private ImmutableVcsLocationBambooSpecsState vcsLocationBambooSpecsState;

  public static final String JSON_PROPERTY_SOURCE_LOCATION = "sourceLocation";
  private String sourceLocation;

  public static final String JSON_PROPERTY_YAML_CONFIGURATION = "yamlConfiguration";
  private Boolean yamlConfiguration;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public ImmutableVcsBambooSpecsSource() { 
  }

  public ImmutableVcsBambooSpecsSource vcsLocationBambooSpecsState(ImmutableVcsLocationBambooSpecsState vcsLocationBambooSpecsState) {
    this.vcsLocationBambooSpecsState = vcsLocationBambooSpecsState;
    return this;
  }

   /**
   * Get vcsLocationBambooSpecsState
   * @return vcsLocationBambooSpecsState
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_VCS_LOCATION_BAMBOO_SPECS_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ImmutableVcsLocationBambooSpecsState getVcsLocationBambooSpecsState() {
    return vcsLocationBambooSpecsState;
  }


  @JsonProperty(JSON_PROPERTY_VCS_LOCATION_BAMBOO_SPECS_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVcsLocationBambooSpecsState(ImmutableVcsLocationBambooSpecsState vcsLocationBambooSpecsState) {
    this.vcsLocationBambooSpecsState = vcsLocationBambooSpecsState;
  }


  public ImmutableVcsBambooSpecsSource sourceLocation(String sourceLocation) {
    this.sourceLocation = sourceLocation;
    return this;
  }

   /**
   * Get sourceLocation
   * @return sourceLocation
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_SOURCE_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSourceLocation() {
    return sourceLocation;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceLocation(String sourceLocation) {
    this.sourceLocation = sourceLocation;
  }


  public ImmutableVcsBambooSpecsSource yamlConfiguration(Boolean yamlConfiguration) {
    this.yamlConfiguration = yamlConfiguration;
    return this;
  }

   /**
   * Get yamlConfiguration
   * @return yamlConfiguration
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_YAML_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getYamlConfiguration() {
    return yamlConfiguration;
  }


  @JsonProperty(JSON_PROPERTY_YAML_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYamlConfiguration(Boolean yamlConfiguration) {
    this.yamlConfiguration = yamlConfiguration;
  }


  public ImmutableVcsBambooSpecsSource id(Long id) {
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


  /**
   * Return true if this ImmutableVcsBambooSpecsSource object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImmutableVcsBambooSpecsSource immutableVcsBambooSpecsSource = (ImmutableVcsBambooSpecsSource) o;
    return Objects.equals(this.vcsLocationBambooSpecsState, immutableVcsBambooSpecsSource.vcsLocationBambooSpecsState) &&
        Objects.equals(this.sourceLocation, immutableVcsBambooSpecsSource.sourceLocation) &&
        Objects.equals(this.yamlConfiguration, immutableVcsBambooSpecsSource.yamlConfiguration) &&
        Objects.equals(this.id, immutableVcsBambooSpecsSource.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vcsLocationBambooSpecsState, sourceLocation, yamlConfiguration, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImmutableVcsBambooSpecsSource {\n");
    sb.append("    vcsLocationBambooSpecsState: ").append(toIndentedString(vcsLocationBambooSpecsState)).append("\n");
    sb.append("    sourceLocation: ").append(toIndentedString(sourceLocation)).append("\n");
    sb.append("    yamlConfiguration: ").append(toIndentedString(yamlConfiguration)).append("\n");
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
