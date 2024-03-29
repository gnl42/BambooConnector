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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import me.glindholm.mylyn.bamboo.internal.rest.model.RestEphemeralPodLogs;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * GetEphemeralAgentPodLogs200Response
 */
@JsonPropertyOrder({
  GetEphemeralAgentPodLogs200Response.JSON_PROPERTY_SELF,
  GetEphemeralAgentPodLogs200Response.JSON_PROPERTY_PREV,
  GetEphemeralAgentPodLogs200Response.JSON_PROPERTY_NEXT,
  GetEphemeralAgentPodLogs200Response.JSON_PROPERTY_START,
  GetEphemeralAgentPodLogs200Response.JSON_PROPERTY_LIMIT,
  GetEphemeralAgentPodLogs200Response.JSON_PROPERTY_RESULTS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetEphemeralAgentPodLogs200Response implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SELF = "self";
  private String self;

  public static final String JSON_PROPERTY_PREV = "prev";
  private String prev;

  public static final String JSON_PROPERTY_NEXT = "next";
  private String next;

  public static final String JSON_PROPERTY_START = "start";
  private BigDecimal start;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private BigDecimal limit;

  public static final String JSON_PROPERTY_RESULTS = "results";
  private List<RestEphemeralPodLogs> results;

  public GetEphemeralAgentPodLogs200Response() { 
  }

  public GetEphemeralAgentPodLogs200Response self(String self) {
    this.self = self;
    return this;
  }

   /**
   * Get self
   * @return self
  **/
  @jakarta.annotation.Nullable
  @Schema(example = "http://localhost:8085/rest/api/latest/../paginate?limit=25&start=25", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_SELF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSelf() {
    return self;
  }


  @JsonProperty(JSON_PROPERTY_SELF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSelf(String self) {
    this.self = self;
  }


  public GetEphemeralAgentPodLogs200Response prev(String prev) {
    this.prev = prev;
    return this;
  }

   /**
   * Get prev
   * @return prev
  **/
  @jakarta.annotation.Nullable
  @Schema(example = "http://localhost:8085/rest/api/latest/../paginate?limit=25&start=0", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_PREV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrev() {
    return prev;
  }


  @JsonProperty(JSON_PROPERTY_PREV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrev(String prev) {
    this.prev = prev;
  }


  public GetEphemeralAgentPodLogs200Response next(String next) {
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @jakarta.annotation.Nullable
  @Schema(example = "http://localhost:8085/rest/api/latest/../paginate?limit=25&start=50", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_NEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNext() {
    return next;
  }


  @JsonProperty(JSON_PROPERTY_NEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNext(String next) {
    this.next = next;
  }


  public GetEphemeralAgentPodLogs200Response start(BigDecimal start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @jakarta.annotation.Nullable
  @Schema(example = "25", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getStart() {
    return start;
  }


  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStart(BigDecimal start) {
    this.start = start;
  }


  public GetEphemeralAgentPodLogs200Response limit(BigDecimal limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @jakarta.annotation.Nullable
  @Schema(example = "25", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getLimit() {
    return limit;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimit(BigDecimal limit) {
    this.limit = limit;
  }


  public GetEphemeralAgentPodLogs200Response results(List<RestEphemeralPodLogs> results) {
    this.results = results;
    return this;
  }

  public GetEphemeralAgentPodLogs200Response addResultsItem(RestEphemeralPodLogs resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RestEphemeralPodLogs> getResults() {
    return results;
  }


  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResults(List<RestEphemeralPodLogs> results) {
    this.results = results;
  }


  /**
   * Return true if this getEphemeralAgentPodLogs_200_response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetEphemeralAgentPodLogs200Response getEphemeralAgentPodLogs200Response = (GetEphemeralAgentPodLogs200Response) o;
    return Objects.equals(this.self, getEphemeralAgentPodLogs200Response.self) &&
        Objects.equals(this.prev, getEphemeralAgentPodLogs200Response.prev) &&
        Objects.equals(this.next, getEphemeralAgentPodLogs200Response.next) &&
        Objects.equals(this.start, getEphemeralAgentPodLogs200Response.start) &&
        Objects.equals(this.limit, getEphemeralAgentPodLogs200Response.limit) &&
        Objects.equals(this.results, getEphemeralAgentPodLogs200Response.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, prev, next, start, limit, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEphemeralAgentPodLogs200Response {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

