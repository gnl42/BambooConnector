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
import me.glindholm.mylyn.bamboo.internal.rest.model.ResultsSummary;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Author
 */
@JsonPropertyOrder({
  Author.JSON_PROPERTY_BREAKAGES,
  Author.JSON_PROPERTY_NUMBER_OF_BREAKAGES,
  Author.JSON_PROPERTY_FIXES,
  Author.JSON_PROPERTY_NUMBER_OF_FIXES,
  Author.JSON_PROPERTY_FAILED_BUILDS,
  Author.JSON_PROPERTY_NUMBER_OF_FAILED_BUILDS,
  Author.JSON_PROPERTY_SUCCESSFUL_BUILDS,
  Author.JSON_PROPERTY_NUMBER_OF_SUCCESSFUL_BUILDS,
  Author.JSON_PROPERTY_TRIGGERED_BUILD_RESULTS,
  Author.JSON_PROPERTY_ALL_TRIGGERED_BUILD_RESULTS,
  Author.JSON_PROPERTY_NUMBER_OF_TRIGGERED_BUILDS,
  Author.JSON_PROPERTY_FULL_NAME,
  Author.JSON_PROPERTY_LINKED_USER_NAME,
  Author.JSON_PROPERTY_EMAIL,
  Author.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Author implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_BREAKAGES = "breakages";
  private List<ResultsSummary> breakages;

  public static final String JSON_PROPERTY_NUMBER_OF_BREAKAGES = "numberOfBreakages";
  private Integer numberOfBreakages;

  public static final String JSON_PROPERTY_FIXES = "fixes";
  private List<ResultsSummary> fixes;

  public static final String JSON_PROPERTY_NUMBER_OF_FIXES = "numberOfFixes";
  private Integer numberOfFixes;

  public static final String JSON_PROPERTY_FAILED_BUILDS = "failedBuilds";
  private List<ResultsSummary> failedBuilds;

  public static final String JSON_PROPERTY_NUMBER_OF_FAILED_BUILDS = "numberOfFailedBuilds";
  private Integer numberOfFailedBuilds;

  public static final String JSON_PROPERTY_SUCCESSFUL_BUILDS = "successfulBuilds";
  private List<ResultsSummary> successfulBuilds;

  public static final String JSON_PROPERTY_NUMBER_OF_SUCCESSFUL_BUILDS = "numberOfSuccessfulBuilds";
  private Integer numberOfSuccessfulBuilds;

  public static final String JSON_PROPERTY_TRIGGERED_BUILD_RESULTS = "triggeredBuildResults";
  private List<ResultsSummary> triggeredBuildResults;

  public static final String JSON_PROPERTY_ALL_TRIGGERED_BUILD_RESULTS = "allTriggeredBuildResults";
  private List<ResultsSummary> allTriggeredBuildResults;

  public static final String JSON_PROPERTY_NUMBER_OF_TRIGGERED_BUILDS = "numberOfTriggeredBuilds";
  private Integer numberOfTriggeredBuilds;

  public static final String JSON_PROPERTY_FULL_NAME = "fullName";
  private String fullName;

  public static final String JSON_PROPERTY_LINKED_USER_NAME = "linkedUserName";
  private String linkedUserName;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public Author() { 
  }

  public Author breakages(List<ResultsSummary> breakages) {
    this.breakages = breakages;
    return this;
  }

  public Author addBreakagesItem(ResultsSummary breakagesItem) {
    if (this.breakages == null) {
      this.breakages = new ArrayList<>();
    }
    this.breakages.add(breakagesItem);
    return this;
  }

   /**
   * Get breakages
   * @return breakages
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_BREAKAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ResultsSummary> getBreakages() {
    return breakages;
  }


  @JsonProperty(JSON_PROPERTY_BREAKAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBreakages(List<ResultsSummary> breakages) {
    this.breakages = breakages;
  }


  public Author numberOfBreakages(Integer numberOfBreakages) {
    this.numberOfBreakages = numberOfBreakages;
    return this;
  }

   /**
   * Get numberOfBreakages
   * @return numberOfBreakages
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_BREAKAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberOfBreakages() {
    return numberOfBreakages;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_BREAKAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfBreakages(Integer numberOfBreakages) {
    this.numberOfBreakages = numberOfBreakages;
  }


  public Author fixes(List<ResultsSummary> fixes) {
    this.fixes = fixes;
    return this;
  }

  public Author addFixesItem(ResultsSummary fixesItem) {
    if (this.fixes == null) {
      this.fixes = new ArrayList<>();
    }
    this.fixes.add(fixesItem);
    return this;
  }

   /**
   * Get fixes
   * @return fixes
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_FIXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ResultsSummary> getFixes() {
    return fixes;
  }


  @JsonProperty(JSON_PROPERTY_FIXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFixes(List<ResultsSummary> fixes) {
    this.fixes = fixes;
  }


  public Author numberOfFixes(Integer numberOfFixes) {
    this.numberOfFixes = numberOfFixes;
    return this;
  }

   /**
   * Get numberOfFixes
   * @return numberOfFixes
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_FIXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberOfFixes() {
    return numberOfFixes;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_FIXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfFixes(Integer numberOfFixes) {
    this.numberOfFixes = numberOfFixes;
  }


  public Author failedBuilds(List<ResultsSummary> failedBuilds) {
    this.failedBuilds = failedBuilds;
    return this;
  }

  public Author addFailedBuildsItem(ResultsSummary failedBuildsItem) {
    if (this.failedBuilds == null) {
      this.failedBuilds = new ArrayList<>();
    }
    this.failedBuilds.add(failedBuildsItem);
    return this;
  }

   /**
   * Get failedBuilds
   * @return failedBuilds
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_FAILED_BUILDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ResultsSummary> getFailedBuilds() {
    return failedBuilds;
  }


  @JsonProperty(JSON_PROPERTY_FAILED_BUILDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailedBuilds(List<ResultsSummary> failedBuilds) {
    this.failedBuilds = failedBuilds;
  }


  public Author numberOfFailedBuilds(Integer numberOfFailedBuilds) {
    this.numberOfFailedBuilds = numberOfFailedBuilds;
    return this;
  }

   /**
   * Get numberOfFailedBuilds
   * @return numberOfFailedBuilds
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_FAILED_BUILDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberOfFailedBuilds() {
    return numberOfFailedBuilds;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_FAILED_BUILDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfFailedBuilds(Integer numberOfFailedBuilds) {
    this.numberOfFailedBuilds = numberOfFailedBuilds;
  }


  public Author successfulBuilds(List<ResultsSummary> successfulBuilds) {
    this.successfulBuilds = successfulBuilds;
    return this;
  }

  public Author addSuccessfulBuildsItem(ResultsSummary successfulBuildsItem) {
    if (this.successfulBuilds == null) {
      this.successfulBuilds = new ArrayList<>();
    }
    this.successfulBuilds.add(successfulBuildsItem);
    return this;
  }

   /**
   * Get successfulBuilds
   * @return successfulBuilds
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_SUCCESSFUL_BUILDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ResultsSummary> getSuccessfulBuilds() {
    return successfulBuilds;
  }


  @JsonProperty(JSON_PROPERTY_SUCCESSFUL_BUILDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuccessfulBuilds(List<ResultsSummary> successfulBuilds) {
    this.successfulBuilds = successfulBuilds;
  }


  public Author numberOfSuccessfulBuilds(Integer numberOfSuccessfulBuilds) {
    this.numberOfSuccessfulBuilds = numberOfSuccessfulBuilds;
    return this;
  }

   /**
   * Get numberOfSuccessfulBuilds
   * @return numberOfSuccessfulBuilds
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_SUCCESSFUL_BUILDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberOfSuccessfulBuilds() {
    return numberOfSuccessfulBuilds;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_SUCCESSFUL_BUILDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfSuccessfulBuilds(Integer numberOfSuccessfulBuilds) {
    this.numberOfSuccessfulBuilds = numberOfSuccessfulBuilds;
  }


  public Author triggeredBuildResults(List<ResultsSummary> triggeredBuildResults) {
    this.triggeredBuildResults = triggeredBuildResults;
    return this;
  }

  public Author addTriggeredBuildResultsItem(ResultsSummary triggeredBuildResultsItem) {
    if (this.triggeredBuildResults == null) {
      this.triggeredBuildResults = new ArrayList<>();
    }
    this.triggeredBuildResults.add(triggeredBuildResultsItem);
    return this;
  }

   /**
   * Get triggeredBuildResults
   * @return triggeredBuildResults
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_TRIGGERED_BUILD_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ResultsSummary> getTriggeredBuildResults() {
    return triggeredBuildResults;
  }


  @JsonProperty(JSON_PROPERTY_TRIGGERED_BUILD_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTriggeredBuildResults(List<ResultsSummary> triggeredBuildResults) {
    this.triggeredBuildResults = triggeredBuildResults;
  }


  public Author allTriggeredBuildResults(List<ResultsSummary> allTriggeredBuildResults) {
    this.allTriggeredBuildResults = allTriggeredBuildResults;
    return this;
  }

  public Author addAllTriggeredBuildResultsItem(ResultsSummary allTriggeredBuildResultsItem) {
    if (this.allTriggeredBuildResults == null) {
      this.allTriggeredBuildResults = new ArrayList<>();
    }
    this.allTriggeredBuildResults.add(allTriggeredBuildResultsItem);
    return this;
  }

   /**
   * Get allTriggeredBuildResults
   * @return allTriggeredBuildResults
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_ALL_TRIGGERED_BUILD_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ResultsSummary> getAllTriggeredBuildResults() {
    return allTriggeredBuildResults;
  }


  @JsonProperty(JSON_PROPERTY_ALL_TRIGGERED_BUILD_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllTriggeredBuildResults(List<ResultsSummary> allTriggeredBuildResults) {
    this.allTriggeredBuildResults = allTriggeredBuildResults;
  }


  public Author numberOfTriggeredBuilds(Integer numberOfTriggeredBuilds) {
    this.numberOfTriggeredBuilds = numberOfTriggeredBuilds;
    return this;
  }

   /**
   * Get numberOfTriggeredBuilds
   * @return numberOfTriggeredBuilds
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_TRIGGERED_BUILDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberOfTriggeredBuilds() {
    return numberOfTriggeredBuilds;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_TRIGGERED_BUILDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfTriggeredBuilds(Integer numberOfTriggeredBuilds) {
    this.numberOfTriggeredBuilds = numberOfTriggeredBuilds;
  }


  public Author fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFullName() {
    return fullName;
  }


  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }


  public Author linkedUserName(String linkedUserName) {
    this.linkedUserName = linkedUserName;
    return this;
  }

   /**
   * Get linkedUserName
   * @return linkedUserName
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_LINKED_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLinkedUserName() {
    return linkedUserName;
  }


  @JsonProperty(JSON_PROPERTY_LINKED_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinkedUserName(String linkedUserName) {
    this.linkedUserName = linkedUserName;
  }


  public Author email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(String email) {
    this.email = email;
  }


  public Author name(String name) {
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
   * Return true if this Author object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Author author = (Author) o;
    return Objects.equals(this.breakages, author.breakages) &&
        Objects.equals(this.numberOfBreakages, author.numberOfBreakages) &&
        Objects.equals(this.fixes, author.fixes) &&
        Objects.equals(this.numberOfFixes, author.numberOfFixes) &&
        Objects.equals(this.failedBuilds, author.failedBuilds) &&
        Objects.equals(this.numberOfFailedBuilds, author.numberOfFailedBuilds) &&
        Objects.equals(this.successfulBuilds, author.successfulBuilds) &&
        Objects.equals(this.numberOfSuccessfulBuilds, author.numberOfSuccessfulBuilds) &&
        Objects.equals(this.triggeredBuildResults, author.triggeredBuildResults) &&
        Objects.equals(this.allTriggeredBuildResults, author.allTriggeredBuildResults) &&
        Objects.equals(this.numberOfTriggeredBuilds, author.numberOfTriggeredBuilds) &&
        Objects.equals(this.fullName, author.fullName) &&
        Objects.equals(this.linkedUserName, author.linkedUserName) &&
        Objects.equals(this.email, author.email) &&
        Objects.equals(this.name, author.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(breakages, numberOfBreakages, fixes, numberOfFixes, failedBuilds, numberOfFailedBuilds, successfulBuilds, numberOfSuccessfulBuilds, triggeredBuildResults, allTriggeredBuildResults, numberOfTriggeredBuilds, fullName, linkedUserName, email, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Author {\n");
    sb.append("    breakages: ").append(toIndentedString(breakages)).append("\n");
    sb.append("    numberOfBreakages: ").append(toIndentedString(numberOfBreakages)).append("\n");
    sb.append("    fixes: ").append(toIndentedString(fixes)).append("\n");
    sb.append("    numberOfFixes: ").append(toIndentedString(numberOfFixes)).append("\n");
    sb.append("    failedBuilds: ").append(toIndentedString(failedBuilds)).append("\n");
    sb.append("    numberOfFailedBuilds: ").append(toIndentedString(numberOfFailedBuilds)).append("\n");
    sb.append("    successfulBuilds: ").append(toIndentedString(successfulBuilds)).append("\n");
    sb.append("    numberOfSuccessfulBuilds: ").append(toIndentedString(numberOfSuccessfulBuilds)).append("\n");
    sb.append("    triggeredBuildResults: ").append(toIndentedString(triggeredBuildResults)).append("\n");
    sb.append("    allTriggeredBuildResults: ").append(toIndentedString(allTriggeredBuildResults)).append("\n");
    sb.append("    numberOfTriggeredBuilds: ").append(toIndentedString(numberOfTriggeredBuilds)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    linkedUserName: ").append(toIndentedString(linkedUserName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

