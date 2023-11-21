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
import java.util.Date;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RestScheduledJob
 */
@JsonPropertyOrder({
  RestScheduledJob.JSON_PROPERTY_GROUP_NAME,
  RestScheduledJob.JSON_PROPERTY_NAME,
  RestScheduledJob.JSON_PROPERTY_NEXT_SCHEDULED_TIME,
  RestScheduledJob.JSON_PROPERTY_SELF
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RestScheduledJob implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_GROUP_NAME = "groupName";
  private String groupName;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NEXT_SCHEDULED_TIME = "nextScheduledTime";
  private Date nextScheduledTime;

  public static final String JSON_PROPERTY_SELF = "self";
  private String self;

  public RestScheduledJob() { 
  }

  @JsonCreator
  public RestScheduledJob(
    @JsonProperty(JSON_PROPERTY_NEXT_SCHEDULED_TIME) Date nextScheduledTime, 
    @JsonProperty(JSON_PROPERTY_SELF) String self
  ) {
  this();
    this.nextScheduledTime = nextScheduledTime;
    this.self = self;
  }

  public RestScheduledJob groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

   /**
   * Get groupName
   * @return groupName
  **/
  @jakarta.annotation.Nullable
  @Schema(example = "Plans", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupName() {
    return groupName;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }


  public RestScheduledJob name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @Schema(example = "Plan Cleanup", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
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
   * Get nextScheduledTime
   * @return nextScheduledTime
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_NEXT_SCHEDULED_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getNextScheduledTime() {
    return nextScheduledTime;
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




  /**
   * Return true if this RestScheduledJob object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestScheduledJob restScheduledJob = (RestScheduledJob) o;
    return Objects.equals(this.groupName, restScheduledJob.groupName) &&
        Objects.equals(this.name, restScheduledJob.name) &&
        Objects.equals(this.nextScheduledTime, restScheduledJob.nextScheduledTime) &&
        Objects.equals(this.self, restScheduledJob.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupName, name, nextScheduledTime, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestScheduledJob {\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nextScheduledTime: ").append(toIndentedString(nextScheduledTime)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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

