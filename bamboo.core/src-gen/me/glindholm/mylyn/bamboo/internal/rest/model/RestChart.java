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
 * RestChart
 */
@JsonPropertyOrder({
  RestChart.JSON_PROPERTY_LOCATION,
  RestChart.JSON_PROPERTY_IMAGE_MAP_NAME,
  RestChart.JSON_PROPERTY_IMAGE_MAP,
  RestChart.JSON_PROPERTY_WIDTH,
  RestChart.JSON_PROPERTY_HEIGHT
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RestChart implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_LOCATION = "location";
  private String location;

  public static final String JSON_PROPERTY_IMAGE_MAP_NAME = "imageMapName";
  private String imageMapName;

  public static final String JSON_PROPERTY_IMAGE_MAP = "imageMap";
  private String imageMap;

  public static final String JSON_PROPERTY_WIDTH = "width";
  private Integer width;

  public static final String JSON_PROPERTY_HEIGHT = "height";
  private Integer height;

  public RestChart() { 
  }

  public RestChart location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLocation() {
    return location;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocation(String location) {
    this.location = location;
  }


  public RestChart imageMapName(String imageMapName) {
    this.imageMapName = imageMapName;
    return this;
  }

   /**
   * Get imageMapName
   * @return imageMapName
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_IMAGE_MAP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImageMapName() {
    return imageMapName;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_MAP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageMapName(String imageMapName) {
    this.imageMapName = imageMapName;
  }


  public RestChart imageMap(String imageMap) {
    this.imageMap = imageMap;
    return this;
  }

   /**
   * Get imageMap
   * @return imageMap
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_IMAGE_MAP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImageMap() {
    return imageMap;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_MAP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageMap(String imageMap) {
    this.imageMap = imageMap;
  }


  public RestChart width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWidth() {
    return width;
  }


  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWidth(Integer width) {
    this.width = width;
  }


  public RestChart height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHeight() {
    return height;
  }


  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeight(Integer height) {
    this.height = height;
  }


  /**
   * Return true if this RestChart object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestChart restChart = (RestChart) o;
    return Objects.equals(this.location, restChart.location) &&
        Objects.equals(this.imageMapName, restChart.imageMapName) &&
        Objects.equals(this.imageMap, restChart.imageMap) &&
        Objects.equals(this.width, restChart.width) &&
        Objects.equals(this.height, restChart.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, imageMapName, imageMap, width, height);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestChart {\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    imageMapName: ").append(toIndentedString(imageMapName)).append("\n");
    sb.append("    imageMap: ").append(toIndentedString(imageMap)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

