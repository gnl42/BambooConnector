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
import me.glindholm.mylyn.bamboo.internal.bamboo.model.TestResultError;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TestResultErrorsList
 */
@JsonPropertyOrder({
  TestResultErrorsList.JSON_PROPERTY_SIZE,
  TestResultErrorsList.JSON_PROPERTY_MAX_RESULT,
  TestResultErrorsList.JSON_PROPERTY_START_INDEX,
  TestResultErrorsList.JSON_PROPERTY_ERROR
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-08T20:39:31.812169500-07:00[America/Vancouver]")
public class TestResultErrorsList implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Integer size;

  public static final String JSON_PROPERTY_MAX_RESULT = "max-result";
  private Integer maxResult;

  public static final String JSON_PROPERTY_START_INDEX = "start-index";
  private Integer startIndex;

  public static final String JSON_PROPERTY_ERROR = "error";
  private List<TestResultError> error;

  public TestResultErrorsList() { 
  }

  public TestResultErrorsList size(Integer size) {
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


  public TestResultErrorsList maxResult(Integer maxResult) {
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


  public TestResultErrorsList startIndex(Integer startIndex) {
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


  public TestResultErrorsList error(List<TestResultError> error) {
    this.error = error;
    return this;
  }

  public TestResultErrorsList addErrorItem(TestResultError errorItem) {
    if (this.error == null) {
      this.error = new ArrayList<>();
    }
    this.error.add(errorItem);
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TestResultError> getError() {
    return error;
  }


  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setError(List<TestResultError> error) {
    this.error = error;
  }


  /**
   * Return true if this TestResultErrorsList object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestResultErrorsList testResultErrorsList = (TestResultErrorsList) o;
    return Objects.equals(this.size, testResultErrorsList.size) &&
        Objects.equals(this.maxResult, testResultErrorsList.maxResult) &&
        Objects.equals(this.startIndex, testResultErrorsList.startIndex) &&
        Objects.equals(this.error, testResultErrorsList.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, maxResult, startIndex, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestResultErrorsList {\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    maxResult: ").append(toIndentedString(maxResult)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

