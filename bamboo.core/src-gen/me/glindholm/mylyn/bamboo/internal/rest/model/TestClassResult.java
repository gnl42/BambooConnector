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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import me.glindholm.mylyn.bamboo.internal.rest.model.BuildResultsSummary;
import me.glindholm.mylyn.bamboo.internal.rest.model.TestCaseResult;
import me.glindholm.mylyn.bamboo.internal.rest.model.TestClass;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * TestClassResult
 */
@JsonPropertyOrder({
  TestClassResult.JSON_PROPERTY_DURATION,
  TestClassResult.JSON_PROPERTY_TEST_CASE_RESULTS,
  TestClassResult.JSON_PROPERTY_BUILD_RESULTS_SUMMARY,
  TestClassResult.JSON_PROPERTY_TEST_CLASS,
  TestClassResult.JSON_PROPERTY_TEST_CASE_RESULTS_SET,
  TestClassResult.JSON_PROPERTY_FAILED_TEST_COUNT,
  TestClassResult.JSON_PROPERTY_SUCCESSFUL_TEST_COUNT,
  TestClassResult.JSON_PROPERTY_SKIPPED_TEST_COUNT,
  TestClassResult.JSON_PROPERTY_NAME,
  TestClassResult.JSON_PROPERTY_SHORT_NAME,
  TestClassResult.JSON_PROPERTY_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestClassResult implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Long duration;

  public static final String JSON_PROPERTY_TEST_CASE_RESULTS = "testCaseResults";
  private List<TestCaseResult> testCaseResults;

  public static final String JSON_PROPERTY_BUILD_RESULTS_SUMMARY = "buildResultsSummary";
  private BuildResultsSummary buildResultsSummary;

  public static final String JSON_PROPERTY_TEST_CLASS = "testClass";
  private TestClass testClass;

  public static final String JSON_PROPERTY_TEST_CASE_RESULTS_SET = "testCaseResultsSet";
  private Set<TestCaseResult> testCaseResultsSet;

  public static final String JSON_PROPERTY_FAILED_TEST_COUNT = "failedTestCount";
  private Integer failedTestCount;

  public static final String JSON_PROPERTY_SUCCESSFUL_TEST_COUNT = "successfulTestCount";
  private Integer successfulTestCount;

  public static final String JSON_PROPERTY_SKIPPED_TEST_COUNT = "skippedTestCount";
  private Integer skippedTestCount;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SHORT_NAME = "shortName";
  private String shortName;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public TestClassResult() { 
  }

  public TestClassResult duration(Long duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDuration() {
    return duration;
  }


  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDuration(Long duration) {
    this.duration = duration;
  }


  public TestClassResult testCaseResults(List<TestCaseResult> testCaseResults) {
    this.testCaseResults = testCaseResults;
    return this;
  }

  public TestClassResult addTestCaseResultsItem(TestCaseResult testCaseResultsItem) {
    if (this.testCaseResults == null) {
      this.testCaseResults = new ArrayList<>();
    }
    this.testCaseResults.add(testCaseResultsItem);
    return this;
  }

   /**
   * Get testCaseResults
   * @return testCaseResults
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_TEST_CASE_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TestCaseResult> getTestCaseResults() {
    return testCaseResults;
  }


  @JsonProperty(JSON_PROPERTY_TEST_CASE_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestCaseResults(List<TestCaseResult> testCaseResults) {
    this.testCaseResults = testCaseResults;
  }


  public TestClassResult buildResultsSummary(BuildResultsSummary buildResultsSummary) {
    this.buildResultsSummary = buildResultsSummary;
    return this;
  }

   /**
   * Get buildResultsSummary
   * @return buildResultsSummary
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_BUILD_RESULTS_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BuildResultsSummary getBuildResultsSummary() {
    return buildResultsSummary;
  }


  @JsonProperty(JSON_PROPERTY_BUILD_RESULTS_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuildResultsSummary(BuildResultsSummary buildResultsSummary) {
    this.buildResultsSummary = buildResultsSummary;
  }


  public TestClassResult testClass(TestClass testClass) {
    this.testClass = testClass;
    return this;
  }

   /**
   * Get testClass
   * @return testClass
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_TEST_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TestClass getTestClass() {
    return testClass;
  }


  @JsonProperty(JSON_PROPERTY_TEST_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestClass(TestClass testClass) {
    this.testClass = testClass;
  }


  public TestClassResult testCaseResultsSet(Set<TestCaseResult> testCaseResultsSet) {
    this.testCaseResultsSet = testCaseResultsSet;
    return this;
  }

  public TestClassResult addTestCaseResultsSetItem(TestCaseResult testCaseResultsSetItem) {
    if (this.testCaseResultsSet == null) {
      this.testCaseResultsSet = new LinkedHashSet<>();
    }
    this.testCaseResultsSet.add(testCaseResultsSetItem);
    return this;
  }

   /**
   * Get testCaseResultsSet
   * @return testCaseResultsSet
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_TEST_CASE_RESULTS_SET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<TestCaseResult> getTestCaseResultsSet() {
    return testCaseResultsSet;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_TEST_CASE_RESULTS_SET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestCaseResultsSet(Set<TestCaseResult> testCaseResultsSet) {
    this.testCaseResultsSet = testCaseResultsSet;
  }


  public TestClassResult failedTestCount(Integer failedTestCount) {
    this.failedTestCount = failedTestCount;
    return this;
  }

   /**
   * Get failedTestCount
   * @return failedTestCount
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_FAILED_TEST_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFailedTestCount() {
    return failedTestCount;
  }


  @JsonProperty(JSON_PROPERTY_FAILED_TEST_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailedTestCount(Integer failedTestCount) {
    this.failedTestCount = failedTestCount;
  }


  public TestClassResult successfulTestCount(Integer successfulTestCount) {
    this.successfulTestCount = successfulTestCount;
    return this;
  }

   /**
   * Get successfulTestCount
   * @return successfulTestCount
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_SUCCESSFUL_TEST_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSuccessfulTestCount() {
    return successfulTestCount;
  }


  @JsonProperty(JSON_PROPERTY_SUCCESSFUL_TEST_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuccessfulTestCount(Integer successfulTestCount) {
    this.successfulTestCount = successfulTestCount;
  }


  public TestClassResult skippedTestCount(Integer skippedTestCount) {
    this.skippedTestCount = skippedTestCount;
    return this;
  }

   /**
   * Get skippedTestCount
   * @return skippedTestCount
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_SKIPPED_TEST_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSkippedTestCount() {
    return skippedTestCount;
  }


  @JsonProperty(JSON_PROPERTY_SKIPPED_TEST_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSkippedTestCount(Integer skippedTestCount) {
    this.skippedTestCount = skippedTestCount;
  }


  public TestClassResult name(String name) {
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


  public TestClassResult shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

   /**
   * Get shortName
   * @return shortName
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_SHORT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShortName() {
    return shortName;
  }


  @JsonProperty(JSON_PROPERTY_SHORT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShortName(String shortName) {
    this.shortName = shortName;
  }


  public TestClassResult id(Long id) {
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
   * Return true if this TestClassResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestClassResult testClassResult = (TestClassResult) o;
    return Objects.equals(this.duration, testClassResult.duration) &&
        Objects.equals(this.testCaseResults, testClassResult.testCaseResults) &&
        Objects.equals(this.buildResultsSummary, testClassResult.buildResultsSummary) &&
        Objects.equals(this.testClass, testClassResult.testClass) &&
        Objects.equals(this.testCaseResultsSet, testClassResult.testCaseResultsSet) &&
        Objects.equals(this.failedTestCount, testClassResult.failedTestCount) &&
        Objects.equals(this.successfulTestCount, testClassResult.successfulTestCount) &&
        Objects.equals(this.skippedTestCount, testClassResult.skippedTestCount) &&
        Objects.equals(this.name, testClassResult.name) &&
        Objects.equals(this.shortName, testClassResult.shortName) &&
        Objects.equals(this.id, testClassResult.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, testCaseResults, buildResultsSummary, testClass, testCaseResultsSet, failedTestCount, successfulTestCount, skippedTestCount, name, shortName, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestClassResult {\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    testCaseResults: ").append(toIndentedString(testCaseResults)).append("\n");
    sb.append("    buildResultsSummary: ").append(toIndentedString(buildResultsSummary)).append("\n");
    sb.append("    testClass: ").append(toIndentedString(testClass)).append("\n");
    sb.append("    testCaseResultsSet: ").append(toIndentedString(testCaseResultsSet)).append("\n");
    sb.append("    failedTestCount: ").append(toIndentedString(failedTestCount)).append("\n");
    sb.append("    successfulTestCount: ").append(toIndentedString(successfulTestCount)).append("\n");
    sb.append("    skippedTestCount: ").append(toIndentedString(skippedTestCount)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
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

