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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * BuildLogger
 */
@JsonPropertyOrder({
  BuildLogger.JSON_PROPERTY_LOG_ENTRY_COUNT,
  BuildLogger.JSON_PROPERTY_PERSISTENT,
  BuildLogger.JSON_PROPERTY_TIME_OF_LAST_LOG,
  BuildLogger.JSON_PROPERTY_INTERCEPTOR_STACK,
  BuildLogger.JSON_PROPERTY_MUTATOR_STACK
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-08T20:39:31.812169500-07:00[America/Vancouver]")
public class BuildLogger implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_LOG_ENTRY_COUNT = "logEntryCount";
  private Integer logEntryCount;

  public static final String JSON_PROPERTY_PERSISTENT = "persistent";
  private Boolean persistent;

  public static final String JSON_PROPERTY_TIME_OF_LAST_LOG = "timeOfLastLog";
  private Long timeOfLastLog;

  public static final String JSON_PROPERTY_INTERCEPTOR_STACK = "interceptorStack";
  private JsonNullable<Object> interceptorStack = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_MUTATOR_STACK = "mutatorStack";
  private JsonNullable<Object> mutatorStack = JsonNullable.<Object>of(null);

  public BuildLogger() { 
  }

  public BuildLogger logEntryCount(Integer logEntryCount) {
    this.logEntryCount = logEntryCount;
    return this;
  }

   /**
   * Get logEntryCount
   * @return logEntryCount
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_LOG_ENTRY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLogEntryCount() {
    return logEntryCount;
  }


  @JsonProperty(JSON_PROPERTY_LOG_ENTRY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogEntryCount(Integer logEntryCount) {
    this.logEntryCount = logEntryCount;
  }


  public BuildLogger persistent(Boolean persistent) {
    this.persistent = persistent;
    return this;
  }

   /**
   * Get persistent
   * @return persistent
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_PERSISTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPersistent() {
    return persistent;
  }


  @JsonProperty(JSON_PROPERTY_PERSISTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPersistent(Boolean persistent) {
    this.persistent = persistent;
  }


  public BuildLogger timeOfLastLog(Long timeOfLastLog) {
    this.timeOfLastLog = timeOfLastLog;
    return this;
  }

   /**
   * Get timeOfLastLog
   * @return timeOfLastLog
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_TIME_OF_LAST_LOG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTimeOfLastLog() {
    return timeOfLastLog;
  }


  @JsonProperty(JSON_PROPERTY_TIME_OF_LAST_LOG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeOfLastLog(Long timeOfLastLog) {
    this.timeOfLastLog = timeOfLastLog;
  }


  public BuildLogger interceptorStack(Object interceptorStack) {
    this.interceptorStack = JsonNullable.<Object>of(interceptorStack);
    return this;
  }

   /**
   * Get interceptorStack
   * @return interceptorStack
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonIgnore

  public Object getInterceptorStack() {
        return interceptorStack.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INTERCEPTOR_STACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getInterceptorStack_JsonNullable() {
    return interceptorStack;
  }
  
  @JsonProperty(JSON_PROPERTY_INTERCEPTOR_STACK)
  public void setInterceptorStack_JsonNullable(JsonNullable<Object> interceptorStack) {
    this.interceptorStack = interceptorStack;
  }

  public void setInterceptorStack(Object interceptorStack) {
    this.interceptorStack = JsonNullable.<Object>of(interceptorStack);
  }


  public BuildLogger mutatorStack(Object mutatorStack) {
    this.mutatorStack = JsonNullable.<Object>of(mutatorStack);
    return this;
  }

   /**
   * Get mutatorStack
   * @return mutatorStack
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonIgnore

  public Object getMutatorStack() {
        return mutatorStack.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MUTATOR_STACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getMutatorStack_JsonNullable() {
    return mutatorStack;
  }
  
  @JsonProperty(JSON_PROPERTY_MUTATOR_STACK)
  public void setMutatorStack_JsonNullable(JsonNullable<Object> mutatorStack) {
    this.mutatorStack = mutatorStack;
  }

  public void setMutatorStack(Object mutatorStack) {
    this.mutatorStack = JsonNullable.<Object>of(mutatorStack);
  }


  /**
   * Return true if this BuildLogger object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuildLogger buildLogger = (BuildLogger) o;
    return Objects.equals(this.logEntryCount, buildLogger.logEntryCount) &&
        Objects.equals(this.persistent, buildLogger.persistent) &&
        Objects.equals(this.timeOfLastLog, buildLogger.timeOfLastLog) &&
        equalsNullable(this.interceptorStack, buildLogger.interceptorStack) &&
        equalsNullable(this.mutatorStack, buildLogger.mutatorStack);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(logEntryCount, persistent, timeOfLastLog, hashCodeNullable(interceptorStack), hashCodeNullable(mutatorStack));
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
    sb.append("class BuildLogger {\n");
    sb.append("    logEntryCount: ").append(toIndentedString(logEntryCount)).append("\n");
    sb.append("    persistent: ").append(toIndentedString(persistent)).append("\n");
    sb.append("    timeOfLastLog: ").append(toIndentedString(timeOfLastLog)).append("\n");
    sb.append("    interceptorStack: ").append(toIndentedString(interceptorStack)).append("\n");
    sb.append("    mutatorStack: ").append(toIndentedString(mutatorStack)).append("\n");
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
