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
import me.glindholm.mylyn.bamboo.internal.rest.model.RestUserResponsible;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RestResponsibleUsers
 */
@JsonPropertyOrder({
  RestResponsibleUsers.JSON_PROPERTY_RESPONSIBLE_USERS,
  RestResponsibleUsers.JSON_PROPERTY_PLAN_RESULT_KEY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RestResponsibleUsers implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_RESPONSIBLE_USERS = "responsibleUsers";
  private List<RestUserResponsible> responsibleUsers;

  public static final String JSON_PROPERTY_PLAN_RESULT_KEY = "planResultKey";
  private String planResultKey;

  public RestResponsibleUsers() { 
  }

  public RestResponsibleUsers responsibleUsers(List<RestUserResponsible> responsibleUsers) {
    this.responsibleUsers = responsibleUsers;
    return this;
  }

  public RestResponsibleUsers addResponsibleUsersItem(RestUserResponsible responsibleUsersItem) {
    if (this.responsibleUsers == null) {
      this.responsibleUsers = new ArrayList<>();
    }
    this.responsibleUsers.add(responsibleUsersItem);
    return this;
  }

   /**
   * Get responsibleUsers
   * @return responsibleUsers
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_RESPONSIBLE_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RestUserResponsible> getResponsibleUsers() {
    return responsibleUsers;
  }


  @JsonProperty(JSON_PROPERTY_RESPONSIBLE_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResponsibleUsers(List<RestUserResponsible> responsibleUsers) {
    this.responsibleUsers = responsibleUsers;
  }


  public RestResponsibleUsers planResultKey(String planResultKey) {
    this.planResultKey = planResultKey;
    return this;
  }

   /**
   * Get planResultKey
   * @return planResultKey
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_PLAN_RESULT_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPlanResultKey() {
    return planResultKey;
  }


  @JsonProperty(JSON_PROPERTY_PLAN_RESULT_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlanResultKey(String planResultKey) {
    this.planResultKey = planResultKey;
  }


  /**
   * Return true if this RestResponsibleUsers object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestResponsibleUsers restResponsibleUsers = (RestResponsibleUsers) o;
    return Objects.equals(this.responsibleUsers, restResponsibleUsers.responsibleUsers) &&
        Objects.equals(this.planResultKey, restResponsibleUsers.planResultKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responsibleUsers, planResultKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestResponsibleUsers {\n");
    sb.append("    responsibleUsers: ").append(toIndentedString(responsibleUsers)).append("\n");
    sb.append("    planResultKey: ").append(toIndentedString(planResultKey)).append("\n");
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

