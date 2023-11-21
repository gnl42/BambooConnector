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
import me.glindholm.mylyn.bamboo.internal.rest.model.Key;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ResultKey
 */
@JsonPropertyOrder({
  ResultKey.JSON_PROPERTY_ENTITY_KEY,
  ResultKey.JSON_PROPERTY_RESULT_NUMBER,
  ResultKey.JSON_PROPERTY_RESULT_NUMBER_LONG,
  ResultKey.JSON_PROPERTY_KEY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ResultKey implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ENTITY_KEY = "entityKey";
  private Key entityKey;

  public static final String JSON_PROPERTY_RESULT_NUMBER = "resultNumber";
  private Integer resultNumber;

  public static final String JSON_PROPERTY_RESULT_NUMBER_LONG = "resultNumberLong";
  private Long resultNumberLong;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public ResultKey() { 
  }

  public ResultKey entityKey(Key entityKey) {
    this.entityKey = entityKey;
    return this;
  }

   /**
   * Get entityKey
   * @return entityKey
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_ENTITY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Key getEntityKey() {
    return entityKey;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityKey(Key entityKey) {
    this.entityKey = entityKey;
  }


  public ResultKey resultNumber(Integer resultNumber) {
    this.resultNumber = resultNumber;
    return this;
  }

   /**
   * Get resultNumber
   * @return resultNumber
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_RESULT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getResultNumber() {
    return resultNumber;
  }


  @JsonProperty(JSON_PROPERTY_RESULT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResultNumber(Integer resultNumber) {
    this.resultNumber = resultNumber;
  }


  public ResultKey resultNumberLong(Long resultNumberLong) {
    this.resultNumberLong = resultNumberLong;
    return this;
  }

   /**
   * Get resultNumberLong
   * @return resultNumberLong
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_RESULT_NUMBER_LONG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getResultNumberLong() {
    return resultNumberLong;
  }


  @JsonProperty(JSON_PROPERTY_RESULT_NUMBER_LONG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResultNumberLong(Long resultNumberLong) {
    this.resultNumberLong = resultNumberLong;
  }


  public ResultKey key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
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


  /**
   * Return true if this ResultKey object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultKey resultKey = (ResultKey) o;
    return Objects.equals(this.entityKey, resultKey.entityKey) &&
        Objects.equals(this.resultNumber, resultKey.resultNumber) &&
        Objects.equals(this.resultNumberLong, resultKey.resultNumberLong) &&
        Objects.equals(this.key, resultKey.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityKey, resultNumber, resultNumberLong, key);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultKey {\n");
    sb.append("    entityKey: ").append(toIndentedString(entityKey)).append("\n");
    sb.append("    resultNumber: ").append(toIndentedString(resultNumber)).append("\n");
    sb.append("    resultNumberLong: ").append(toIndentedString(resultNumberLong)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

