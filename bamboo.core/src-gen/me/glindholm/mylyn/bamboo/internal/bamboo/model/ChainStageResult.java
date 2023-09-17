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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import me.glindholm.mylyn.bamboo.internal.bamboo.model.BuildResultsSummary;
import me.glindholm.mylyn.bamboo.internal.bamboo.model.ChainResultsSummary;
import me.glindholm.mylyn.bamboo.internal.bamboo.model.StageVariableContext;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ChainStageResult
 */
@JsonPropertyOrder({
  ChainStageResult.JSON_PROPERTY_CHAIN_RESULT,
  ChainStageResult.JSON_PROPERTY_BUILD_RESULTS,
  ChainStageResult.JSON_PROPERTY_SORTED_BUILD_RESULTS,
  ChainStageResult.JSON_PROPERTY_FAILED_BUILD_RESULTS,
  ChainStageResult.JSON_PROPERTY_SUCCESSFUL_BUILD_RESULTS,
  ChainStageResult.JSON_PROPERTY_COMPLETED,
  ChainStageResult.JSON_PROPERTY_ALL_JOBS_EXIST,
  ChainStageResult.JSON_PROPERTY_ALL_NOT_SUCCESSFUL_JOBS_EXIST,
  ChainStageResult.JSON_PROPERTY_MANUAL,
  ChainStageResult.JSON_PROPERTY_FINAL,
  ChainStageResult.JSON_PROPERTY_RUNNABLE,
  ChainStageResult.JSON_PROPERTY_MANUAL_VARIABLES,
  ChainStageResult.JSON_PROPERTY_MANUAL_VARIABLES_ENCRYPTED,
  ChainStageResult.JSON_PROPERTY_RESTARTABLE,
  ChainStageResult.JSON_PROPERTY_FAILED,
  ChainStageResult.JSON_PROPERTY_NOT_BUILT,
  ChainStageResult.JSON_PROPERTY_SUCCESSFUL,
  ChainStageResult.JSON_PROPERTY_LIFE_CYCLE_STATE,
  ChainStageResult.JSON_PROPERTY_PENDING,
  ChainStageResult.JSON_PROPERTY_FINISHED,
  ChainStageResult.JSON_PROPERTY_PROCESSING_DURATION,
  ChainStageResult.JSON_PROPERTY_STATE,
  ChainStageResult.JSON_PROPERTY_ID,
  ChainStageResult.JSON_PROPERTY_DESCRIPTION,
  ChainStageResult.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-08T20:39:31.812169500-07:00[America/Vancouver]")
public class ChainStageResult implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CHAIN_RESULT = "chainResult";
  private ChainResultsSummary chainResult;

  public static final String JSON_PROPERTY_BUILD_RESULTS = "buildResults";
  private Set<BuildResultsSummary> buildResults;

  public static final String JSON_PROPERTY_SORTED_BUILD_RESULTS = "sortedBuildResults";
  private List<BuildResultsSummary> sortedBuildResults;

  public static final String JSON_PROPERTY_FAILED_BUILD_RESULTS = "failedBuildResults";
  private List<BuildResultsSummary> failedBuildResults;

  public static final String JSON_PROPERTY_SUCCESSFUL_BUILD_RESULTS = "successfulBuildResults";
  private List<BuildResultsSummary> successfulBuildResults;

  public static final String JSON_PROPERTY_COMPLETED = "completed";
  private Boolean completed;

  public static final String JSON_PROPERTY_ALL_JOBS_EXIST = "allJobsExist";
  private Boolean allJobsExist;

  public static final String JSON_PROPERTY_ALL_NOT_SUCCESSFUL_JOBS_EXIST = "allNotSuccessfulJobsExist";
  private Boolean allNotSuccessfulJobsExist;

  public static final String JSON_PROPERTY_MANUAL = "manual";
  private Boolean manual;

  public static final String JSON_PROPERTY_FINAL = "final";
  private Boolean _final;

  public static final String JSON_PROPERTY_RUNNABLE = "runnable";
  private Boolean runnable;

  public static final String JSON_PROPERTY_MANUAL_VARIABLES = "manualVariables";
  private List<StageVariableContext> manualVariables;

  public static final String JSON_PROPERTY_MANUAL_VARIABLES_ENCRYPTED = "manualVariablesEncrypted";
  private List<StageVariableContext> manualVariablesEncrypted;

  public static final String JSON_PROPERTY_RESTARTABLE = "restartable";
  private Boolean restartable;

  public static final String JSON_PROPERTY_FAILED = "failed";
  private Boolean failed;

  public static final String JSON_PROPERTY_NOT_BUILT = "notBuilt";
  private Boolean notBuilt;

  public static final String JSON_PROPERTY_SUCCESSFUL = "successful";
  private Boolean successful;

  /**
   * Gets or Sets lifeCycleState
   */
  public enum LifeCycleStateEnum {
    PENDING("Pending"),
    
    QUEUED("Queued"),
    
    INPROGRESS("InProgress"),
    
    FINISHED("Finished"),
    
    NOTBUILT("NotBuilt");

    private String value;

    LifeCycleStateEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LifeCycleStateEnum fromValue(String value) {
      for (LifeCycleStateEnum b : LifeCycleStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_LIFE_CYCLE_STATE = "lifeCycleState";
  private LifeCycleStateEnum lifeCycleState;

  public static final String JSON_PROPERTY_PENDING = "pending";
  private Boolean pending;

  public static final String JSON_PROPERTY_FINISHED = "finished";
  private Boolean finished;

  public static final String JSON_PROPERTY_PROCESSING_DURATION = "processingDuration";
  private Long processingDuration;

  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    UNKNOWN("Unknown"),
    
    SUCCESSFUL("Successful"),
    
    FAILED("Failed");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATE = "state";
  private StateEnum state;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public ChainStageResult() { 
  }

  public ChainStageResult chainResult(ChainResultsSummary chainResult) {
    this.chainResult = chainResult;
    return this;
  }

   /**
   * Get chainResult
   * @return chainResult
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_CHAIN_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ChainResultsSummary getChainResult() {
    return chainResult;
  }


  @JsonProperty(JSON_PROPERTY_CHAIN_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChainResult(ChainResultsSummary chainResult) {
    this.chainResult = chainResult;
  }


  public ChainStageResult buildResults(Set<BuildResultsSummary> buildResults) {
    this.buildResults = buildResults;
    return this;
  }

  public ChainStageResult addBuildResultsItem(BuildResultsSummary buildResultsItem) {
    if (this.buildResults == null) {
      this.buildResults = new LinkedHashSet<>();
    }
    this.buildResults.add(buildResultsItem);
    return this;
  }

   /**
   * Get buildResults
   * @return buildResults
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_BUILD_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<BuildResultsSummary> getBuildResults() {
    return buildResults;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_BUILD_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuildResults(Set<BuildResultsSummary> buildResults) {
    this.buildResults = buildResults;
  }


  public ChainStageResult sortedBuildResults(List<BuildResultsSummary> sortedBuildResults) {
    this.sortedBuildResults = sortedBuildResults;
    return this;
  }

  public ChainStageResult addSortedBuildResultsItem(BuildResultsSummary sortedBuildResultsItem) {
    if (this.sortedBuildResults == null) {
      this.sortedBuildResults = new ArrayList<>();
    }
    this.sortedBuildResults.add(sortedBuildResultsItem);
    return this;
  }

   /**
   * Get sortedBuildResults
   * @return sortedBuildResults
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_SORTED_BUILD_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<BuildResultsSummary> getSortedBuildResults() {
    return sortedBuildResults;
  }


  @JsonProperty(JSON_PROPERTY_SORTED_BUILD_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSortedBuildResults(List<BuildResultsSummary> sortedBuildResults) {
    this.sortedBuildResults = sortedBuildResults;
  }


  public ChainStageResult failedBuildResults(List<BuildResultsSummary> failedBuildResults) {
    this.failedBuildResults = failedBuildResults;
    return this;
  }

  public ChainStageResult addFailedBuildResultsItem(BuildResultsSummary failedBuildResultsItem) {
    if (this.failedBuildResults == null) {
      this.failedBuildResults = new ArrayList<>();
    }
    this.failedBuildResults.add(failedBuildResultsItem);
    return this;
  }

   /**
   * Get failedBuildResults
   * @return failedBuildResults
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_FAILED_BUILD_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<BuildResultsSummary> getFailedBuildResults() {
    return failedBuildResults;
  }


  @JsonProperty(JSON_PROPERTY_FAILED_BUILD_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailedBuildResults(List<BuildResultsSummary> failedBuildResults) {
    this.failedBuildResults = failedBuildResults;
  }


  public ChainStageResult successfulBuildResults(List<BuildResultsSummary> successfulBuildResults) {
    this.successfulBuildResults = successfulBuildResults;
    return this;
  }

  public ChainStageResult addSuccessfulBuildResultsItem(BuildResultsSummary successfulBuildResultsItem) {
    if (this.successfulBuildResults == null) {
      this.successfulBuildResults = new ArrayList<>();
    }
    this.successfulBuildResults.add(successfulBuildResultsItem);
    return this;
  }

   /**
   * Get successfulBuildResults
   * @return successfulBuildResults
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_SUCCESSFUL_BUILD_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<BuildResultsSummary> getSuccessfulBuildResults() {
    return successfulBuildResults;
  }


  @JsonProperty(JSON_PROPERTY_SUCCESSFUL_BUILD_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuccessfulBuildResults(List<BuildResultsSummary> successfulBuildResults) {
    this.successfulBuildResults = successfulBuildResults;
  }


  public ChainStageResult completed(Boolean completed) {
    this.completed = completed;
    return this;
  }

   /**
   * Get completed
   * @return completed
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_COMPLETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCompleted() {
    return completed;
  }


  @JsonProperty(JSON_PROPERTY_COMPLETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompleted(Boolean completed) {
    this.completed = completed;
  }


  public ChainStageResult allJobsExist(Boolean allJobsExist) {
    this.allJobsExist = allJobsExist;
    return this;
  }

   /**
   * Get allJobsExist
   * @return allJobsExist
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_ALL_JOBS_EXIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllJobsExist() {
    return allJobsExist;
  }


  @JsonProperty(JSON_PROPERTY_ALL_JOBS_EXIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllJobsExist(Boolean allJobsExist) {
    this.allJobsExist = allJobsExist;
  }


  public ChainStageResult allNotSuccessfulJobsExist(Boolean allNotSuccessfulJobsExist) {
    this.allNotSuccessfulJobsExist = allNotSuccessfulJobsExist;
    return this;
  }

   /**
   * Get allNotSuccessfulJobsExist
   * @return allNotSuccessfulJobsExist
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_ALL_NOT_SUCCESSFUL_JOBS_EXIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllNotSuccessfulJobsExist() {
    return allNotSuccessfulJobsExist;
  }


  @JsonProperty(JSON_PROPERTY_ALL_NOT_SUCCESSFUL_JOBS_EXIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllNotSuccessfulJobsExist(Boolean allNotSuccessfulJobsExist) {
    this.allNotSuccessfulJobsExist = allNotSuccessfulJobsExist;
  }


  public ChainStageResult manual(Boolean manual) {
    this.manual = manual;
    return this;
  }

   /**
   * Get manual
   * @return manual
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_MANUAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getManual() {
    return manual;
  }


  @JsonProperty(JSON_PROPERTY_MANUAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManual(Boolean manual) {
    this.manual = manual;
  }


  public ChainStageResult _final(Boolean _final) {
    this._final = _final;
    return this;
  }

   /**
   * Get _final
   * @return _final
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_FINAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFinal() {
    return _final;
  }


  @JsonProperty(JSON_PROPERTY_FINAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFinal(Boolean _final) {
    this._final = _final;
  }


  public ChainStageResult runnable(Boolean runnable) {
    this.runnable = runnable;
    return this;
  }

   /**
   * Get runnable
   * @return runnable
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_RUNNABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRunnable() {
    return runnable;
  }


  @JsonProperty(JSON_PROPERTY_RUNNABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRunnable(Boolean runnable) {
    this.runnable = runnable;
  }


  public ChainStageResult manualVariables(List<StageVariableContext> manualVariables) {
    this.manualVariables = manualVariables;
    return this;
  }

  public ChainStageResult addManualVariablesItem(StageVariableContext manualVariablesItem) {
    if (this.manualVariables == null) {
      this.manualVariables = new ArrayList<>();
    }
    this.manualVariables.add(manualVariablesItem);
    return this;
  }

   /**
   * Get manualVariables
   * @return manualVariables
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_MANUAL_VARIABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<StageVariableContext> getManualVariables() {
    return manualVariables;
  }


  @JsonProperty(JSON_PROPERTY_MANUAL_VARIABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManualVariables(List<StageVariableContext> manualVariables) {
    this.manualVariables = manualVariables;
  }


  public ChainStageResult manualVariablesEncrypted(List<StageVariableContext> manualVariablesEncrypted) {
    this.manualVariablesEncrypted = manualVariablesEncrypted;
    return this;
  }

  public ChainStageResult addManualVariablesEncryptedItem(StageVariableContext manualVariablesEncryptedItem) {
    if (this.manualVariablesEncrypted == null) {
      this.manualVariablesEncrypted = new ArrayList<>();
    }
    this.manualVariablesEncrypted.add(manualVariablesEncryptedItem);
    return this;
  }

   /**
   * Get manualVariablesEncrypted
   * @return manualVariablesEncrypted
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_MANUAL_VARIABLES_ENCRYPTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<StageVariableContext> getManualVariablesEncrypted() {
    return manualVariablesEncrypted;
  }


  @JsonProperty(JSON_PROPERTY_MANUAL_VARIABLES_ENCRYPTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManualVariablesEncrypted(List<StageVariableContext> manualVariablesEncrypted) {
    this.manualVariablesEncrypted = manualVariablesEncrypted;
  }


  public ChainStageResult restartable(Boolean restartable) {
    this.restartable = restartable;
    return this;
  }

   /**
   * Get restartable
   * @return restartable
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_RESTARTABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRestartable() {
    return restartable;
  }


  @JsonProperty(JSON_PROPERTY_RESTARTABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRestartable(Boolean restartable) {
    this.restartable = restartable;
  }


  public ChainStageResult failed(Boolean failed) {
    this.failed = failed;
    return this;
  }

   /**
   * Get failed
   * @return failed
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_FAILED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFailed() {
    return failed;
  }


  @JsonProperty(JSON_PROPERTY_FAILED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailed(Boolean failed) {
    this.failed = failed;
  }


  public ChainStageResult notBuilt(Boolean notBuilt) {
    this.notBuilt = notBuilt;
    return this;
  }

   /**
   * Get notBuilt
   * @return notBuilt
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_NOT_BUILT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNotBuilt() {
    return notBuilt;
  }


  @JsonProperty(JSON_PROPERTY_NOT_BUILT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotBuilt(Boolean notBuilt) {
    this.notBuilt = notBuilt;
  }


  public ChainStageResult successful(Boolean successful) {
    this.successful = successful;
    return this;
  }

   /**
   * Get successful
   * @return successful
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_SUCCESSFUL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSuccessful() {
    return successful;
  }


  @JsonProperty(JSON_PROPERTY_SUCCESSFUL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }


  public ChainStageResult lifeCycleState(LifeCycleStateEnum lifeCycleState) {
    this.lifeCycleState = lifeCycleState;
    return this;
  }

   /**
   * Get lifeCycleState
   * @return lifeCycleState
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_LIFE_CYCLE_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LifeCycleStateEnum getLifeCycleState() {
    return lifeCycleState;
  }


  @JsonProperty(JSON_PROPERTY_LIFE_CYCLE_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLifeCycleState(LifeCycleStateEnum lifeCycleState) {
    this.lifeCycleState = lifeCycleState;
  }


  public ChainStageResult pending(Boolean pending) {
    this.pending = pending;
    return this;
  }

   /**
   * Get pending
   * @return pending
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_PENDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPending() {
    return pending;
  }


  @JsonProperty(JSON_PROPERTY_PENDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPending(Boolean pending) {
    this.pending = pending;
  }


  public ChainStageResult finished(Boolean finished) {
    this.finished = finished;
    return this;
  }

   /**
   * Get finished
   * @return finished
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_FINISHED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFinished() {
    return finished;
  }


  @JsonProperty(JSON_PROPERTY_FINISHED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFinished(Boolean finished) {
    this.finished = finished;
  }


  public ChainStageResult processingDuration(Long processingDuration) {
    this.processingDuration = processingDuration;
    return this;
  }

   /**
   * Get processingDuration
   * @return processingDuration
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_PROCESSING_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getProcessingDuration() {
    return processingDuration;
  }


  @JsonProperty(JSON_PROPERTY_PROCESSING_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProcessingDuration(Long processingDuration) {
    this.processingDuration = processingDuration;
  }


  public ChainStageResult state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StateEnum getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(StateEnum state) {
    this.state = state;
  }


  public ChainStageResult id(Long id) {
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


  public ChainStageResult description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public ChainStageResult name(String name) {
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
   * Return true if this ChainStageResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChainStageResult chainStageResult = (ChainStageResult) o;
    return Objects.equals(this.chainResult, chainStageResult.chainResult) &&
        Objects.equals(this.buildResults, chainStageResult.buildResults) &&
        Objects.equals(this.sortedBuildResults, chainStageResult.sortedBuildResults) &&
        Objects.equals(this.failedBuildResults, chainStageResult.failedBuildResults) &&
        Objects.equals(this.successfulBuildResults, chainStageResult.successfulBuildResults) &&
        Objects.equals(this.completed, chainStageResult.completed) &&
        Objects.equals(this.allJobsExist, chainStageResult.allJobsExist) &&
        Objects.equals(this.allNotSuccessfulJobsExist, chainStageResult.allNotSuccessfulJobsExist) &&
        Objects.equals(this.manual, chainStageResult.manual) &&
        Objects.equals(this._final, chainStageResult._final) &&
        Objects.equals(this.runnable, chainStageResult.runnable) &&
        Objects.equals(this.manualVariables, chainStageResult.manualVariables) &&
        Objects.equals(this.manualVariablesEncrypted, chainStageResult.manualVariablesEncrypted) &&
        Objects.equals(this.restartable, chainStageResult.restartable) &&
        Objects.equals(this.failed, chainStageResult.failed) &&
        Objects.equals(this.notBuilt, chainStageResult.notBuilt) &&
        Objects.equals(this.successful, chainStageResult.successful) &&
        Objects.equals(this.lifeCycleState, chainStageResult.lifeCycleState) &&
        Objects.equals(this.pending, chainStageResult.pending) &&
        Objects.equals(this.finished, chainStageResult.finished) &&
        Objects.equals(this.processingDuration, chainStageResult.processingDuration) &&
        Objects.equals(this.state, chainStageResult.state) &&
        Objects.equals(this.id, chainStageResult.id) &&
        Objects.equals(this.description, chainStageResult.description) &&
        Objects.equals(this.name, chainStageResult.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chainResult, buildResults, sortedBuildResults, failedBuildResults, successfulBuildResults, completed, allJobsExist, allNotSuccessfulJobsExist, manual, _final, runnable, manualVariables, manualVariablesEncrypted, restartable, failed, notBuilt, successful, lifeCycleState, pending, finished, processingDuration, state, id, description, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChainStageResult {\n");
    sb.append("    chainResult: ").append(toIndentedString(chainResult)).append("\n");
    sb.append("    buildResults: ").append(toIndentedString(buildResults)).append("\n");
    sb.append("    sortedBuildResults: ").append(toIndentedString(sortedBuildResults)).append("\n");
    sb.append("    failedBuildResults: ").append(toIndentedString(failedBuildResults)).append("\n");
    sb.append("    successfulBuildResults: ").append(toIndentedString(successfulBuildResults)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    allJobsExist: ").append(toIndentedString(allJobsExist)).append("\n");
    sb.append("    allNotSuccessfulJobsExist: ").append(toIndentedString(allNotSuccessfulJobsExist)).append("\n");
    sb.append("    manual: ").append(toIndentedString(manual)).append("\n");
    sb.append("    _final: ").append(toIndentedString(_final)).append("\n");
    sb.append("    runnable: ").append(toIndentedString(runnable)).append("\n");
    sb.append("    manualVariables: ").append(toIndentedString(manualVariables)).append("\n");
    sb.append("    manualVariablesEncrypted: ").append(toIndentedString(manualVariablesEncrypted)).append("\n");
    sb.append("    restartable: ").append(toIndentedString(restartable)).append("\n");
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    notBuilt: ").append(toIndentedString(notBuilt)).append("\n");
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    lifeCycleState: ").append(toIndentedString(lifeCycleState)).append("\n");
    sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
    sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
    sb.append("    processingDuration: ").append(toIndentedString(processingDuration)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

