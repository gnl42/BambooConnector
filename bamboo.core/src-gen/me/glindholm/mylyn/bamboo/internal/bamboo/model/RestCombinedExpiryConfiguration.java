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
 * RestCombinedExpiryConfiguration
 */
@JsonPropertyOrder({
  RestCombinedExpiryConfiguration.JSON_PROPERTY_DURATION,
  RestCombinedExpiryConfiguration.JSON_PROPERTY_PERIOD,
  RestCombinedExpiryConfiguration.JSON_PROPERTY_BUILDS_TO_KEEP,
  RestCombinedExpiryConfiguration.JSON_PROPERTY_MAXIMUM_BUILDS_TO_KEEP,
  RestCombinedExpiryConfiguration.JSON_PROPERTY_DEPLOYMENTS_TO_KEEP,
  RestCombinedExpiryConfiguration.JSON_PROPERTY_MAXIMUM_IGNORED_LOG_SIZE,
  RestCombinedExpiryConfiguration.JSON_PROPERTY_EXPIRE_RESULTS,
  RestCombinedExpiryConfiguration.JSON_PROPERTY_EXPIRE_ARTIFACTS,
  RestCombinedExpiryConfiguration.JSON_PROPERTY_EXPIRE_LOGS,
  RestCombinedExpiryConfiguration.JSON_PROPERTY_LABELS_TO_EXCLUDE,
  RestCombinedExpiryConfiguration.JSON_PROPERTY_CRON_EXPRESSION
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-08T20:39:31.812169500-07:00[America/Vancouver]")
public class RestCombinedExpiryConfiguration implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Integer duration;

  public static final String JSON_PROPERTY_PERIOD = "period";
  private String period;

  public static final String JSON_PROPERTY_BUILDS_TO_KEEP = "buildsToKeep";
  private Integer buildsToKeep;

  public static final String JSON_PROPERTY_MAXIMUM_BUILDS_TO_KEEP = "maximumBuildsToKeep";
  private Integer maximumBuildsToKeep;

  public static final String JSON_PROPERTY_DEPLOYMENTS_TO_KEEP = "deploymentsToKeep";
  private Integer deploymentsToKeep;

  public static final String JSON_PROPERTY_MAXIMUM_IGNORED_LOG_SIZE = "maximumIgnoredLogSize";
  private Long maximumIgnoredLogSize;

  public static final String JSON_PROPERTY_EXPIRE_RESULTS = "expireResults";
  private Boolean expireResults;

  public static final String JSON_PROPERTY_EXPIRE_ARTIFACTS = "expireArtifacts";
  private Boolean expireArtifacts;

  public static final String JSON_PROPERTY_EXPIRE_LOGS = "expireLogs";
  private Boolean expireLogs;

  public static final String JSON_PROPERTY_LABELS_TO_EXCLUDE = "labelsToExclude";
  private String labelsToExclude;

  public static final String JSON_PROPERTY_CRON_EXPRESSION = "cronExpression";
  private String cronExpression;

  public RestCombinedExpiryConfiguration() { 
  }

  public RestCombinedExpiryConfiguration duration(Integer duration) {
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

  public Integer getDuration() {
    return duration;
  }


  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDuration(Integer duration) {
    this.duration = duration;
  }


  public RestCombinedExpiryConfiguration period(String period) {
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPeriod() {
    return period;
  }


  @JsonProperty(JSON_PROPERTY_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeriod(String period) {
    this.period = period;
  }


  public RestCombinedExpiryConfiguration buildsToKeep(Integer buildsToKeep) {
    this.buildsToKeep = buildsToKeep;
    return this;
  }

   /**
   * Get buildsToKeep
   * @return buildsToKeep
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_BUILDS_TO_KEEP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBuildsToKeep() {
    return buildsToKeep;
  }


  @JsonProperty(JSON_PROPERTY_BUILDS_TO_KEEP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuildsToKeep(Integer buildsToKeep) {
    this.buildsToKeep = buildsToKeep;
  }


  public RestCombinedExpiryConfiguration maximumBuildsToKeep(Integer maximumBuildsToKeep) {
    this.maximumBuildsToKeep = maximumBuildsToKeep;
    return this;
  }

   /**
   * Get maximumBuildsToKeep
   * @return maximumBuildsToKeep
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_MAXIMUM_BUILDS_TO_KEEP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaximumBuildsToKeep() {
    return maximumBuildsToKeep;
  }


  @JsonProperty(JSON_PROPERTY_MAXIMUM_BUILDS_TO_KEEP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaximumBuildsToKeep(Integer maximumBuildsToKeep) {
    this.maximumBuildsToKeep = maximumBuildsToKeep;
  }


  public RestCombinedExpiryConfiguration deploymentsToKeep(Integer deploymentsToKeep) {
    this.deploymentsToKeep = deploymentsToKeep;
    return this;
  }

   /**
   * Get deploymentsToKeep
   * @return deploymentsToKeep
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_DEPLOYMENTS_TO_KEEP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDeploymentsToKeep() {
    return deploymentsToKeep;
  }


  @JsonProperty(JSON_PROPERTY_DEPLOYMENTS_TO_KEEP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeploymentsToKeep(Integer deploymentsToKeep) {
    this.deploymentsToKeep = deploymentsToKeep;
  }


  public RestCombinedExpiryConfiguration maximumIgnoredLogSize(Long maximumIgnoredLogSize) {
    this.maximumIgnoredLogSize = maximumIgnoredLogSize;
    return this;
  }

   /**
   * Get maximumIgnoredLogSize
   * @return maximumIgnoredLogSize
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_MAXIMUM_IGNORED_LOG_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMaximumIgnoredLogSize() {
    return maximumIgnoredLogSize;
  }


  @JsonProperty(JSON_PROPERTY_MAXIMUM_IGNORED_LOG_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaximumIgnoredLogSize(Long maximumIgnoredLogSize) {
    this.maximumIgnoredLogSize = maximumIgnoredLogSize;
  }


  public RestCombinedExpiryConfiguration expireResults(Boolean expireResults) {
    this.expireResults = expireResults;
    return this;
  }

   /**
   * Get expireResults
   * @return expireResults
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_EXPIRE_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getExpireResults() {
    return expireResults;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRE_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpireResults(Boolean expireResults) {
    this.expireResults = expireResults;
  }


  public RestCombinedExpiryConfiguration expireArtifacts(Boolean expireArtifacts) {
    this.expireArtifacts = expireArtifacts;
    return this;
  }

   /**
   * Get expireArtifacts
   * @return expireArtifacts
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_EXPIRE_ARTIFACTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getExpireArtifacts() {
    return expireArtifacts;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRE_ARTIFACTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpireArtifacts(Boolean expireArtifacts) {
    this.expireArtifacts = expireArtifacts;
  }


  public RestCombinedExpiryConfiguration expireLogs(Boolean expireLogs) {
    this.expireLogs = expireLogs;
    return this;
  }

   /**
   * Get expireLogs
   * @return expireLogs
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_EXPIRE_LOGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getExpireLogs() {
    return expireLogs;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRE_LOGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpireLogs(Boolean expireLogs) {
    this.expireLogs = expireLogs;
  }


  public RestCombinedExpiryConfiguration labelsToExclude(String labelsToExclude) {
    this.labelsToExclude = labelsToExclude;
    return this;
  }

   /**
   * Get labelsToExclude
   * @return labelsToExclude
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_LABELS_TO_EXCLUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLabelsToExclude() {
    return labelsToExclude;
  }


  @JsonProperty(JSON_PROPERTY_LABELS_TO_EXCLUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabelsToExclude(String labelsToExclude) {
    this.labelsToExclude = labelsToExclude;
  }


  public RestCombinedExpiryConfiguration cronExpression(String cronExpression) {
    this.cronExpression = cronExpression;
    return this;
  }

   /**
   * Get cronExpression
   * @return cronExpression
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_CRON_EXPRESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCronExpression() {
    return cronExpression;
  }


  @JsonProperty(JSON_PROPERTY_CRON_EXPRESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCronExpression(String cronExpression) {
    this.cronExpression = cronExpression;
  }


  /**
   * Return true if this RestCombinedExpiryConfiguration object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestCombinedExpiryConfiguration restCombinedExpiryConfiguration = (RestCombinedExpiryConfiguration) o;
    return Objects.equals(this.duration, restCombinedExpiryConfiguration.duration) &&
        Objects.equals(this.period, restCombinedExpiryConfiguration.period) &&
        Objects.equals(this.buildsToKeep, restCombinedExpiryConfiguration.buildsToKeep) &&
        Objects.equals(this.maximumBuildsToKeep, restCombinedExpiryConfiguration.maximumBuildsToKeep) &&
        Objects.equals(this.deploymentsToKeep, restCombinedExpiryConfiguration.deploymentsToKeep) &&
        Objects.equals(this.maximumIgnoredLogSize, restCombinedExpiryConfiguration.maximumIgnoredLogSize) &&
        Objects.equals(this.expireResults, restCombinedExpiryConfiguration.expireResults) &&
        Objects.equals(this.expireArtifacts, restCombinedExpiryConfiguration.expireArtifacts) &&
        Objects.equals(this.expireLogs, restCombinedExpiryConfiguration.expireLogs) &&
        Objects.equals(this.labelsToExclude, restCombinedExpiryConfiguration.labelsToExclude) &&
        Objects.equals(this.cronExpression, restCombinedExpiryConfiguration.cronExpression);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, period, buildsToKeep, maximumBuildsToKeep, deploymentsToKeep, maximumIgnoredLogSize, expireResults, expireArtifacts, expireLogs, labelsToExclude, cronExpression);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestCombinedExpiryConfiguration {\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    buildsToKeep: ").append(toIndentedString(buildsToKeep)).append("\n");
    sb.append("    maximumBuildsToKeep: ").append(toIndentedString(maximumBuildsToKeep)).append("\n");
    sb.append("    deploymentsToKeep: ").append(toIndentedString(deploymentsToKeep)).append("\n");
    sb.append("    maximumIgnoredLogSize: ").append(toIndentedString(maximumIgnoredLogSize)).append("\n");
    sb.append("    expireResults: ").append(toIndentedString(expireResults)).append("\n");
    sb.append("    expireArtifacts: ").append(toIndentedString(expireArtifacts)).append("\n");
    sb.append("    expireLogs: ").append(toIndentedString(expireLogs)).append("\n");
    sb.append("    labelsToExclude: ").append(toIndentedString(labelsToExclude)).append("\n");
    sb.append("    cronExpression: ").append(toIndentedString(cronExpression)).append("\n");
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

