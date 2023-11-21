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
import me.glindholm.mylyn.bamboo.internal.rest.model.Link;
import me.glindholm.mylyn.bamboo.internal.rest.model.Project;
import me.glindholm.mylyn.bamboo.internal.rest.model.RestPlanList;
import me.glindholm.mylyn.bamboo.internal.rest.model.RestProjectUriInfo;
import me.glindholm.mylyn.bamboo.internal.rest.model.User;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RestProject
 */
@JsonPropertyOrder({
  RestProject.JSON_PROPERTY_NAME,
  RestProject.JSON_PROPERTY_KEY,
  RestProject.JSON_PROPERTY_DESCRIPTION,
  RestProject.JSON_PROPERTY_PUBLIC_ACCESS,
  RestProject.JSON_PROPERTY_EXPAND,
  RestProject.JSON_PROPERTY_LINK,
  RestProject.JSON_PROPERTY_PLANS,
  RestProject.JSON_PROPERTY_PROJECT,
  RestProject.JSON_PROPERTY_URI_INFO,
  RestProject.JSON_PROPERTY_USER
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RestProject implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_PUBLIC_ACCESS = "publicAccess";
  private Boolean publicAccess;

  public static final String JSON_PROPERTY_EXPAND = "expand";
  private String expand;

  public static final String JSON_PROPERTY_LINK = "link";
  private Link link;

  public static final String JSON_PROPERTY_PLANS = "plans";
  private RestPlanList plans;

  public static final String JSON_PROPERTY_PROJECT = "project";
  private Project project;

  public static final String JSON_PROPERTY_URI_INFO = "uriInfo";
  private RestProjectUriInfo uriInfo;

  public static final String JSON_PROPERTY_USER = "user";
  private User user;

  public RestProject() { 
  }

  public RestProject name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @Schema(example = "My first project", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
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


  public RestProject key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @jakarta.annotation.Nullable
  @Schema(example = "PROJ", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKey() {
    return key;
  }


  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKey(String key) {
    this.key = key;
  }


  public RestProject description(String description) {
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


  public RestProject publicAccess(Boolean publicAccess) {
    this.publicAccess = publicAccess;
    return this;
  }

   /**
   * Get publicAccess
   * @return publicAccess
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_PUBLIC_ACCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPublicAccess() {
    return publicAccess;
  }


  @JsonProperty(JSON_PROPERTY_PUBLIC_ACCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublicAccess(Boolean publicAccess) {
    this.publicAccess = publicAccess;
  }


  public RestProject expand(String expand) {
    this.expand = expand;
    return this;
  }

   /**
   * Get expand
   * @return expand
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_EXPAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExpand() {
    return expand;
  }


  @JsonProperty(JSON_PROPERTY_EXPAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpand(String expand) {
    this.expand = expand;
  }


  public RestProject link(Link link) {
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Link getLink() {
    return link;
  }


  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLink(Link link) {
    this.link = link;
  }


  public RestProject plans(RestPlanList plans) {
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


  public RestProject project(Project project) {
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_PROJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Project getProject() {
    return project;
  }


  @JsonProperty(JSON_PROPERTY_PROJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProject(Project project) {
    this.project = project;
  }


  public RestProject uriInfo(RestProjectUriInfo uriInfo) {
    this.uriInfo = uriInfo;
    return this;
  }

   /**
   * Get uriInfo
   * @return uriInfo
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_URI_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestProjectUriInfo getUriInfo() {
    return uriInfo;
  }


  @JsonProperty(JSON_PROPERTY_URI_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUriInfo(RestProjectUriInfo uriInfo) {
    this.uriInfo = uriInfo;
  }


  public RestProject user(User user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public User getUser() {
    return user;
  }


  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUser(User user) {
    this.user = user;
  }


  /**
   * Return true if this RestProject object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestProject restProject = (RestProject) o;
    return Objects.equals(this.name, restProject.name) &&
        Objects.equals(this.key, restProject.key) &&
        Objects.equals(this.description, restProject.description) &&
        Objects.equals(this.publicAccess, restProject.publicAccess) &&
        Objects.equals(this.expand, restProject.expand) &&
        Objects.equals(this.link, restProject.link) &&
        Objects.equals(this.plans, restProject.plans) &&
        Objects.equals(this.project, restProject.project) &&
        Objects.equals(this.uriInfo, restProject.uriInfo) &&
        Objects.equals(this.user, restProject.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, key, description, publicAccess, expand, link, plans, project, uriInfo, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestProject {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    publicAccess: ").append(toIndentedString(publicAccess)).append("\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    plans: ").append(toIndentedString(plans)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    uriInfo: ").append(toIndentedString(uriInfo)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

