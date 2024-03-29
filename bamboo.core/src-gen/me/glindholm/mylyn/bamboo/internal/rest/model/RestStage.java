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
import java.util.Arrays;
import me.glindholm.mylyn.bamboo.internal.rest.model.RestPageModelRestJob;
import me.glindholm.mylyn.bamboo.internal.rest.model.RestPlanList;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RestStage
 */
@JsonPropertyOrder({
  RestStage.JSON_PROPERTY_SELF,
  RestStage.JSON_PROPERTY_ID,
  RestStage.JSON_PROPERTY_NAME,
  RestStage.JSON_PROPERTY_DESCRIPTION,
  RestStage.JSON_PROPERTY_MANUAL,
  RestStage.JSON_PROPERTY_JOBS,
  RestStage.JSON_PROPERTY_PLANS,
  RestStage.JSON_PROPERTY_INDEX,
  RestStage.JSON_PROPERTY_FINAL
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RestStage implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SELF = "self";
  private String self;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_MANUAL = "manual";
  private Boolean manual;

  public static final String JSON_PROPERTY_JOBS = "jobs";
  private RestPageModelRestJob jobs;

  public static final String JSON_PROPERTY_PLANS = "plans";
  private RestPlanList plans;

  public static final String JSON_PROPERTY_INDEX = "index";
  private Integer index;

  public static final String JSON_PROPERTY_FINAL = "final";
  private Boolean _final;

  public RestStage() { 
  }

  @JsonCreator
  public RestStage(
    @JsonProperty(JSON_PROPERTY_SELF) String self
  ) {
  this();
    this.self = self;
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




  public RestStage id(Long id) {
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


  public RestStage name(String name) {
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


  public RestStage description(String description) {
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


  public RestStage manual(Boolean manual) {
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


  public RestStage jobs(RestPageModelRestJob jobs) {
    this.jobs = jobs;
    return this;
  }

   /**
   * Get jobs
   * @return jobs
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_JOBS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestPageModelRestJob getJobs() {
    return jobs;
  }


  @JsonProperty(JSON_PROPERTY_JOBS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJobs(RestPageModelRestJob jobs) {
    this.jobs = jobs;
  }


  public RestStage plans(RestPlanList plans) {
    this.plans = plans;
    return this;
  }

   /**
   * Get plans
   * @return plans
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_PLANS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestPlanList getPlans() {
    return plans;
  }


  @JsonProperty(JSON_PROPERTY_PLANS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlans(RestPlanList plans) {
    this.plans = plans;
  }


  public RestStage index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIndex() {
    return index;
  }


  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndex(Integer index) {
    this.index = index;
  }


  public RestStage _final(Boolean _final) {
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


  /**
   * Return true if this RestStage object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestStage restStage = (RestStage) o;
    return Objects.equals(this.self, restStage.self) &&
        Objects.equals(this.id, restStage.id) &&
        Objects.equals(this.name, restStage.name) &&
        Objects.equals(this.description, restStage.description) &&
        Objects.equals(this.manual, restStage.manual) &&
        Objects.equals(this.jobs, restStage.jobs) &&
        Objects.equals(this.plans, restStage.plans) &&
        Objects.equals(this.index, restStage.index) &&
        Objects.equals(this._final, restStage._final);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, id, name, description, manual, jobs, plans, index, _final);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestStage {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    manual: ").append(toIndentedString(manual)).append("\n");
    sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
    sb.append("    plans: ").append(toIndentedString(plans)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    _final: ").append(toIndentedString(_final)).append("\n");
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

