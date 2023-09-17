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
import me.glindholm.mylyn.bamboo.internal.bamboo.model.RestPlanLabel;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RestPlanLabelList
 */
@JsonPropertyOrder({
  RestPlanLabelList.JSON_PROPERTY_ALL_ELEMENTS,
  RestPlanLabelList.JSON_PROPERTY_CALLBACK,
  RestPlanLabelList.JSON_PROPERTY_LABEL,
  RestPlanLabelList.JSON_PROPERTY_MAX_RESULT,
  RestPlanLabelList.JSON_PROPERTY_SIZE,
  RestPlanLabelList.JSON_PROPERTY_START_INDEX
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-08T20:39:31.812169500-07:00[America/Vancouver]")
public class RestPlanLabelList implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ALL_ELEMENTS = "allElements";
  private List<RestPlanLabel> allElements;

  public static final String JSON_PROPERTY_CALLBACK = "callback";
  private Object callback;

  public static final String JSON_PROPERTY_LABEL = "label";
  private List<RestPlanLabel> label;

  public static final String JSON_PROPERTY_MAX_RESULT = "max-result";
  private Integer maxResult;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Integer size;

  public static final String JSON_PROPERTY_START_INDEX = "start-index";
  private Integer startIndex;

  public RestPlanLabelList() { 
  }

  public RestPlanLabelList allElements(List<RestPlanLabel> allElements) {
    this.allElements = allElements;
    return this;
  }

  public RestPlanLabelList addAllElementsItem(RestPlanLabel allElementsItem) {
    if (this.allElements == null) {
      this.allElements = new ArrayList<>();
    }
    this.allElements.add(allElementsItem);
    return this;
  }

   /**
   * Get allElements
   * @return allElements
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_ALL_ELEMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RestPlanLabel> getAllElements() {
    return allElements;
  }


  @JsonProperty(JSON_PROPERTY_ALL_ELEMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllElements(List<RestPlanLabel> allElements) {
    this.allElements = allElements;
  }


  public RestPlanLabelList callback(Object callback) {
    this.callback = callback;
    return this;
  }

   /**
   * Get callback
   * @return callback
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_CALLBACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getCallback() {
    return callback;
  }


  @JsonProperty(JSON_PROPERTY_CALLBACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCallback(Object callback) {
    this.callback = callback;
  }


  public RestPlanLabelList label(List<RestPlanLabel> label) {
    this.label = label;
    return this;
  }

  public RestPlanLabelList addLabelItem(RestPlanLabel labelItem) {
    if (this.label == null) {
      this.label = new ArrayList<>();
    }
    this.label.add(labelItem);
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RestPlanLabel> getLabel() {
    return label;
  }


  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabel(List<RestPlanLabel> label) {
    this.label = label;
  }


  public RestPlanLabelList maxResult(Integer maxResult) {
    this.maxResult = maxResult;
    return this;
  }

   /**
   * Get maxResult
   * @return maxResult
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_MAX_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxResult() {
    return maxResult;
  }


  @JsonProperty(JSON_PROPERTY_MAX_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxResult(Integer maxResult) {
    this.maxResult = maxResult;
  }


  public RestPlanLabelList size(Integer size) {
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

  public Integer getSize() {
    return size;
  }


  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSize(Integer size) {
    this.size = size;
  }


  public RestPlanLabelList startIndex(Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

   /**
   * Get startIndex
   * @return startIndex
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartIndex() {
    return startIndex;
  }


  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }


  /**
   * Return true if this RestPlanLabelList object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestPlanLabelList restPlanLabelList = (RestPlanLabelList) o;
    return Objects.equals(this.allElements, restPlanLabelList.allElements) &&
        Objects.equals(this.callback, restPlanLabelList.callback) &&
        Objects.equals(this.label, restPlanLabelList.label) &&
        Objects.equals(this.maxResult, restPlanLabelList.maxResult) &&
        Objects.equals(this.size, restPlanLabelList.size) &&
        Objects.equals(this.startIndex, restPlanLabelList.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allElements, callback, label, maxResult, size, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestPlanLabelList {\n");
    sb.append("    allElements: ").append(toIndentedString(allElements)).append("\n");
    sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    maxResult: ").append(toIndentedString(maxResult)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
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

