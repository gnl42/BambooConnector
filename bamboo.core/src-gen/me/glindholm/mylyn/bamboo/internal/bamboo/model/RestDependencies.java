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
import me.glindholm.mylyn.bamboo.internal.bamboo.model.Link;
import me.glindholm.mylyn.bamboo.internal.bamboo.model.RestPlanList;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RestDependencies
 */
@JsonPropertyOrder({
  RestDependencies.JSON_PROPERTY_EXPAND,
  RestDependencies.JSON_PROPERTY_LINK,
  RestDependencies.JSON_PROPERTY_DEPENDENCIES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-08T20:39:31.812169500-07:00[America/Vancouver]")
public class RestDependencies implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_EXPAND = "expand";
  private String expand;

  public static final String JSON_PROPERTY_LINK = "link";
  private Link link;

  public static final String JSON_PROPERTY_DEPENDENCIES = "dependencies";
  private RestPlanList dependencies;

  public RestDependencies() { 
  }

  public RestDependencies expand(String expand) {
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


  public RestDependencies link(Link link) {
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


  public RestDependencies dependencies(RestPlanList dependencies) {
    this.dependencies = dependencies;
    return this;
  }

   /**
   * Get dependencies
   * @return dependencies
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_DEPENDENCIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RestPlanList getDependencies() {
    return dependencies;
  }


  @JsonProperty(JSON_PROPERTY_DEPENDENCIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDependencies(RestPlanList dependencies) {
    this.dependencies = dependencies;
  }


  /**
   * Return true if this RestDependencies object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestDependencies restDependencies = (RestDependencies) o;
    return Objects.equals(this.expand, restDependencies.expand) &&
        Objects.equals(this.link, restDependencies.link) &&
        Objects.equals(this.dependencies, restDependencies.dependencies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expand, link, dependencies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestDependencies {\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
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
