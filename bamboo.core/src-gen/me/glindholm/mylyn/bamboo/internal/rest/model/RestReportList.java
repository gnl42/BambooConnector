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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import me.glindholm.mylyn.bamboo.internal.rest.model.RestReport;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RestReportList
 */
@JsonPropertyOrder({
  RestReportList.JSON_PROPERTY_START_INDEX,
  RestReportList.JSON_PROPERTY_MAX_RESULT,
  RestReportList.JSON_PROPERTY_SIZE,
  RestReportList.JSON_PROPERTY_CALLBACK,
  RestReportList.JSON_PROPERTY_REPORT,
  RestReportList.JSON_PROPERTY_ALL_ELEMENTS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RestReportList implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_START_INDEX = "start-index";
  private Integer startIndex;

  public static final String JSON_PROPERTY_MAX_RESULT = "max-result";
  private Integer maxResult;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Integer size;

  public static final String JSON_PROPERTY_CALLBACK = "callback";
  private JsonNullable<Object> callback = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_REPORT = "report";
  private List<RestReport> report;

  public static final String JSON_PROPERTY_ALL_ELEMENTS = "allElements";
  private List<RestReport> allElements;

  public RestReportList() { 
  }

  public RestReportList startIndex(Integer startIndex) {
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


  public RestReportList maxResult(Integer maxResult) {
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


  public RestReportList size(Integer size) {
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


  public RestReportList callback(Object callback) {
    this.callback = JsonNullable.<Object>of(callback);
    return this;
  }

   /**
   * Get callback
   * @return callback
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonIgnore

  public Object getCallback() {
        return callback.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CALLBACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getCallback_JsonNullable() {
    return callback;
  }
  
  @JsonProperty(JSON_PROPERTY_CALLBACK)
  public void setCallback_JsonNullable(JsonNullable<Object> callback) {
    this.callback = callback;
  }

  public void setCallback(Object callback) {
    this.callback = JsonNullable.<Object>of(callback);
  }


  public RestReportList report(List<RestReport> report) {
    this.report = report;
    return this;
  }

  public RestReportList addReportItem(RestReport reportItem) {
    if (this.report == null) {
      this.report = new ArrayList<>();
    }
    this.report.add(reportItem);
    return this;
  }

   /**
   * Get report
   * @return report
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_REPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RestReport> getReport() {
    return report;
  }


  @JsonProperty(JSON_PROPERTY_REPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReport(List<RestReport> report) {
    this.report = report;
  }


  public RestReportList allElements(List<RestReport> allElements) {
    this.allElements = allElements;
    return this;
  }

  public RestReportList addAllElementsItem(RestReport allElementsItem) {
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

  public List<RestReport> getAllElements() {
    return allElements;
  }


  @JsonProperty(JSON_PROPERTY_ALL_ELEMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllElements(List<RestReport> allElements) {
    this.allElements = allElements;
  }


  /**
   * Return true if this RestReportList object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestReportList restReportList = (RestReportList) o;
    return Objects.equals(this.startIndex, restReportList.startIndex) &&
        Objects.equals(this.maxResult, restReportList.maxResult) &&
        Objects.equals(this.size, restReportList.size) &&
        equalsNullable(this.callback, restReportList.callback) &&
        Objects.equals(this.report, restReportList.report) &&
        Objects.equals(this.allElements, restReportList.allElements);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(startIndex, maxResult, size, hashCodeNullable(callback), report, allElements);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestReportList {\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    maxResult: ").append(toIndentedString(maxResult)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
    sb.append("    report: ").append(toIndentedString(report)).append("\n");
    sb.append("    allElements: ").append(toIndentedString(allElements)).append("\n");
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

