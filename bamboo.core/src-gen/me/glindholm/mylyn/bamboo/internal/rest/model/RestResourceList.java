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
import me.glindholm.mylyn.bamboo.internal.rest.model.RestResource;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RestResourceList
 */
@JsonPropertyOrder({
  RestResourceList.JSON_PROPERTY_START_INDEX,
  RestResourceList.JSON_PROPERTY_MAX_RESULT,
  RestResourceList.JSON_PROPERTY_SIZE,
  RestResourceList.JSON_PROPERTY_CALLBACK,
  RestResourceList.JSON_PROPERTY_RESOURCE,
  RestResourceList.JSON_PROPERTY_ALL_ELEMENTS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RestResourceList implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_START_INDEX = "start-index";
  private Integer startIndex;

  public static final String JSON_PROPERTY_MAX_RESULT = "max-result";
  private Integer maxResult;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Integer size;

  public static final String JSON_PROPERTY_CALLBACK = "callback";
  private JsonNullable<Object> callback = JsonNullable.<Object>of(null);

  public static final String JSON_PROPERTY_RESOURCE = "resource";
  private List<RestResource> resource;

  public static final String JSON_PROPERTY_ALL_ELEMENTS = "allElements";
  private List<RestResource> allElements;

  public RestResourceList() { 
  }

  public RestResourceList startIndex(Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

   /**
   * Get startIndex
   * @return startIndex
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartIndex() {
    return startIndex;
  }


  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }


  public RestResourceList maxResult(Integer maxResult) {
    this.maxResult = maxResult;
    return this;
  }

   /**
   * Get maxResult
   * @return maxResult
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_MAX_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxResult() {
    return maxResult;
  }


  @JsonProperty(JSON_PROPERTY_MAX_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxResult(Integer maxResult) {
    this.maxResult = maxResult;
  }


  public RestResourceList size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSize() {
    return size;
  }


  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSize(Integer size) {
    this.size = size;
  }


  public RestResourceList callback(Object callback) {
    this.callback = JsonNullable.<Object>of(callback);
    return this;
  }

   /**
   * Get callback
   * @return callback
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonIgnore

  public Object getCallback() {
        return callback.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CALLBACK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getCallback_JsonNullable() {
    return callback;
  }
  
  @JsonProperty(JSON_PROPERTY_CALLBACK)
  public void setCallback_JsonNullable(JsonNullable<Object> callback) {
    this.callback = callback;
  }

  public void setCallback(Object callback) {
    this.callback = JsonNullable.<Object>of(callback);
  }


  public RestResourceList resource(List<RestResource> resource) {
    this.resource = resource;
    return this;
  }

  public RestResourceList addResourceItem(RestResource resourceItem) {
    if (this.resource == null) {
      this.resource = new ArrayList<>();
    }
    this.resource.add(resourceItem);
    return this;
  }

   /**
   * Get resource
   * @return resource
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_RESOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RestResource> getResource() {
    return resource;
  }


  @JsonProperty(JSON_PROPERTY_RESOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResource(List<RestResource> resource) {
    this.resource = resource;
  }


  public RestResourceList allElements(List<RestResource> allElements) {
    this.allElements = allElements;
    return this;
  }

  public RestResourceList addAllElementsItem(RestResource allElementsItem) {
    if (this.allElements == null) {
      this.allElements = new ArrayList<>();
    }
    this.allElements.add(allElementsItem);
    return this;
  }

   /**
   * Get allElements
   * @return allElements
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_ALL_ELEMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RestResource> getAllElements() {
    return allElements;
  }


  @JsonProperty(JSON_PROPERTY_ALL_ELEMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllElements(List<RestResource> allElements) {
    this.allElements = allElements;
  }


  /**
   * Return true if this RestResourceList object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestResourceList restResourceList = (RestResourceList) o;
    return Objects.equals(this.startIndex, restResourceList.startIndex) &&
        Objects.equals(this.maxResult, restResourceList.maxResult) &&
        Objects.equals(this.size, restResourceList.size) &&
        equalsNullable(this.callback, restResourceList.callback) &&
        Objects.equals(this.resource, restResourceList.resource) &&
        Objects.equals(this.allElements, restResourceList.allElements);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(startIndex, maxResult, size, hashCodeNullable(callback), resource, allElements);
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
    sb.append("class RestResourceList {\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    maxResult: ").append(toIndentedString(maxResult)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    allElements: ").append(toIndentedString(allElements)).append("\n");
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

