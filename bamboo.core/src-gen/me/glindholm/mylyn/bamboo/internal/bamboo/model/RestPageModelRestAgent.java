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
import me.glindholm.mylyn.bamboo.internal.bamboo.model.RestAgent;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RestPageModelRestAgent
 */
@JsonPropertyOrder({
  RestPageModelRestAgent.JSON_PROPERTY_LIMIT,
  RestPageModelRestAgent.JSON_PROPERTY_NEXT,
  RestPageModelRestAgent.JSON_PROPERTY_PREV,
  RestPageModelRestAgent.JSON_PROPERTY_RESULTS,
  RestPageModelRestAgent.JSON_PROPERTY_SELF,
  RestPageModelRestAgent.JSON_PROPERTY_START
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-08T20:39:31.812169500-07:00[America/Vancouver]")
public class RestPageModelRestAgent implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Integer limit;

  public static final String JSON_PROPERTY_NEXT = "next";
  private String next;

  public static final String JSON_PROPERTY_PREV = "prev";
  private String prev;

  public static final String JSON_PROPERTY_RESULTS = "results";
  private List<RestAgent> results;

  public static final String JSON_PROPERTY_SELF = "self";
  private String self;

  public static final String JSON_PROPERTY_START = "start";
  private Integer start;

  public RestPageModelRestAgent() { 
  }

  @JsonCreator
  public RestPageModelRestAgent(
    @JsonProperty(JSON_PROPERTY_SELF) String self
  ) {
  this();
    this.self = self;
  }

  public RestPageModelRestAgent limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLimit() {
    return limit;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public RestPageModelRestAgent next(String next) {
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
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


  public RestPageModelRestAgent prev(String prev) {
    this.prev = prev;
    return this;
  }

   /**
   * Get prev
   * @return prev
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
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


  public RestPageModelRestAgent results(List<RestAgent> results) {
    this.results = results;
    return this;
  }

  public RestPageModelRestAgent addResultsItem(RestAgent resultsItem) {
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

  public List<RestAgent> getResults() {
    return results;
  }


  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResults(List<RestAgent> results) {
    this.results = results;
  }


   /**
   * Get self
   * @return self
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_SELF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSelf() {
    return self;
  }




  public RestPageModelRestAgent start(Integer start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStart() {
    return start;
  }


  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStart(Integer start) {
    this.start = start;
  }


  /**
   * Return true if this RestPageModelRestAgent object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestPageModelRestAgent restPageModelRestAgent = (RestPageModelRestAgent) o;
    return Objects.equals(this.limit, restPageModelRestAgent.limit) &&
        Objects.equals(this.next, restPageModelRestAgent.next) &&
        Objects.equals(this.prev, restPageModelRestAgent.prev) &&
        Objects.equals(this.results, restPageModelRestAgent.results) &&
        Objects.equals(this.self, restPageModelRestAgent.self) &&
        Objects.equals(this.start, restPageModelRestAgent.start);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, next, prev, results, self, start);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestPageModelRestAgent {\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
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

