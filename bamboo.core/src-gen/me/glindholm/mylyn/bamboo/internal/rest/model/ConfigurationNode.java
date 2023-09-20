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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ConfigurationNode
 */
@JsonPropertyOrder({
  ConfigurationNode.JSON_PROPERTY_ATTRIBUTE,
  ConfigurationNode.JSON_PROPERTY_PARENT_NODE,
  ConfigurationNode.JSON_PROPERTY_REFERENCE,
  ConfigurationNode.JSON_PROPERTY_CHILDREN,
  ConfigurationNode.JSON_PROPERTY_ATTRIBUTE_COUNT,
  ConfigurationNode.JSON_PROPERTY_CHILDREN_COUNT,
  ConfigurationNode.JSON_PROPERTY_NAME,
  ConfigurationNode.JSON_PROPERTY_VALUE,
  ConfigurationNode.JSON_PROPERTY_ATTRIBUTES,
  ConfigurationNode.JSON_PROPERTY_DEFINED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConfigurationNode implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ATTRIBUTE = "attribute";
  private Boolean attribute;

  public static final String JSON_PROPERTY_PARENT_NODE = "parentNode";
  private ConfigurationNode parentNode;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private Object reference;

  public static final String JSON_PROPERTY_CHILDREN = "children";
  private List<Object> children;

  public static final String JSON_PROPERTY_ATTRIBUTE_COUNT = "attributeCount";
  private Integer attributeCount;

  public static final String JSON_PROPERTY_CHILDREN_COUNT = "childrenCount";
  private Integer childrenCount;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Object value;

  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private List<Object> attributes;

  public static final String JSON_PROPERTY_DEFINED = "defined";
  private Boolean defined;

  public ConfigurationNode() { 
  }

  public ConfigurationNode attribute(Boolean attribute) {
    this.attribute = attribute;
    return this;
  }

   /**
   * Get attribute
   * @return attribute
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_ATTRIBUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAttribute() {
    return attribute;
  }


  @JsonProperty(JSON_PROPERTY_ATTRIBUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttribute(Boolean attribute) {
    this.attribute = attribute;
  }


  public ConfigurationNode parentNode(ConfigurationNode parentNode) {
    this.parentNode = parentNode;
    return this;
  }

   /**
   * Get parentNode
   * @return parentNode
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_PARENT_NODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConfigurationNode getParentNode() {
    return parentNode;
  }


  @JsonProperty(JSON_PROPERTY_PARENT_NODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParentNode(ConfigurationNode parentNode) {
    this.parentNode = parentNode;
  }


  public ConfigurationNode reference(Object reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getReference() {
    return reference;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(Object reference) {
    this.reference = reference;
  }


  public ConfigurationNode children(List<Object> children) {
    this.children = children;
    return this;
  }

  public ConfigurationNode addChildrenItem(Object childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * Get children
   * @return children
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_CHILDREN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getChildren() {
    return children;
  }


  @JsonProperty(JSON_PROPERTY_CHILDREN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChildren(List<Object> children) {
    this.children = children;
  }


  public ConfigurationNode attributeCount(Integer attributeCount) {
    this.attributeCount = attributeCount;
    return this;
  }

   /**
   * Get attributeCount
   * @return attributeCount
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_ATTRIBUTE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAttributeCount() {
    return attributeCount;
  }


  @JsonProperty(JSON_PROPERTY_ATTRIBUTE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttributeCount(Integer attributeCount) {
    this.attributeCount = attributeCount;
  }


  public ConfigurationNode childrenCount(Integer childrenCount) {
    this.childrenCount = childrenCount;
    return this;
  }

   /**
   * Get childrenCount
   * @return childrenCount
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_CHILDREN_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getChildrenCount() {
    return childrenCount;
  }


  @JsonProperty(JSON_PROPERTY_CHILDREN_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChildrenCount(Integer childrenCount) {
    this.childrenCount = childrenCount;
  }


  public ConfigurationNode name(String name) {
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


  public ConfigurationNode value(Object value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(Object value) {
    this.value = value;
  }


  public ConfigurationNode attributes(List<Object> attributes) {
    this.attributes = attributes;
    return this;
  }

  public ConfigurationNode addAttributesItem(Object attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getAttributes() {
    return attributes;
  }


  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttributes(List<Object> attributes) {
    this.attributes = attributes;
  }


  public ConfigurationNode defined(Boolean defined) {
    this.defined = defined;
    return this;
  }

   /**
   * Get defined
   * @return defined
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_DEFINED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDefined() {
    return defined;
  }


  @JsonProperty(JSON_PROPERTY_DEFINED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefined(Boolean defined) {
    this.defined = defined;
  }


  /**
   * Return true if this ConfigurationNode object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigurationNode configurationNode = (ConfigurationNode) o;
    return Objects.equals(this.attribute, configurationNode.attribute) &&
        Objects.equals(this.parentNode, configurationNode.parentNode) &&
        Objects.equals(this.reference, configurationNode.reference) &&
        Objects.equals(this.children, configurationNode.children) &&
        Objects.equals(this.attributeCount, configurationNode.attributeCount) &&
        Objects.equals(this.childrenCount, configurationNode.childrenCount) &&
        Objects.equals(this.name, configurationNode.name) &&
        Objects.equals(this.value, configurationNode.value) &&
        Objects.equals(this.attributes, configurationNode.attributes) &&
        Objects.equals(this.defined, configurationNode.defined);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attribute, parentNode, reference, children, attributeCount, childrenCount, name, value, attributes, defined);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigurationNode {\n");
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
    sb.append("    parentNode: ").append(toIndentedString(parentNode)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    attributeCount: ").append(toIndentedString(attributeCount)).append("\n");
    sb.append("    childrenCount: ").append(toIndentedString(childrenCount)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    defined: ").append(toIndentedString(defined)).append("\n");
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
