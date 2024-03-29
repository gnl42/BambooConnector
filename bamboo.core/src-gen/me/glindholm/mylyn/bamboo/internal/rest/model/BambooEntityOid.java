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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * BambooEntityOid
 */
@JsonPropertyOrder({
  BambooEntityOid.JSON_PROPERTY_ENTITY_TYPE,
  BambooEntityOid.JSON_PROPERTY_SERVER_KEY,
  BambooEntityOid.JSON_PROPERTY_ENTITY_OID,
  BambooEntityOid.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BambooEntityOid implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Gets or Sets entityType
   */
  public enum EntityTypeEnum {
    CHAIN("CHAIN"),
    
    STAGE("STAGE"),
    
    JOB("JOB"),
    
    REPOSITORY("REPOSITORY"),
    
    CHAIN_BRANCH("CHAIN_BRANCH"),
    
    JOB_BRANCH("JOB_BRANCH"),
    
    TASK("TASK"),
    
    PROJECT("PROJECT"),
    
    ARTIFACT_DEFINITION("ARTIFACT_DEFINITION"),
    
    DEPLOYMENT_PROJECT("DEPLOYMENT_PROJECT"),
    
    SHARED_CREDENTIAL("SHARED_CREDENTIAL");

    private String value;

    EntityTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EntityTypeEnum fromValue(String value) {
      for (EntityTypeEnum b : EntityTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ENTITY_TYPE = "entityType";
  private EntityTypeEnum entityType;

  public static final String JSON_PROPERTY_SERVER_KEY = "serverKey";
  private Integer serverKey;

  public static final String JSON_PROPERTY_ENTITY_OID = "entityOid";
  private Long entityOid;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Long value;

  public BambooEntityOid() { 
  }

  public BambooEntityOid entityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
    return this;
  }

   /**
   * Get entityType
   * @return entityType
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EntityTypeEnum getEntityType() {
    return entityType;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
  }


  public BambooEntityOid serverKey(Integer serverKey) {
    this.serverKey = serverKey;
    return this;
  }

   /**
   * Get serverKey
   * @return serverKey
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_SERVER_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getServerKey() {
    return serverKey;
  }


  @JsonProperty(JSON_PROPERTY_SERVER_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServerKey(Integer serverKey) {
    this.serverKey = serverKey;
  }


  public BambooEntityOid entityOid(Long entityOid) {
    this.entityOid = entityOid;
    return this;
  }

   /**
   * Get entityOid
   * @return entityOid
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_ENTITY_OID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getEntityOid() {
    return entityOid;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_OID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityOid(Long entityOid) {
    this.entityOid = entityOid;
  }


  public BambooEntityOid value(Long value) {
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

  public Long getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(Long value) {
    this.value = value;
  }


  /**
   * Return true if this BambooEntityOid object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BambooEntityOid bambooEntityOid = (BambooEntityOid) o;
    return Objects.equals(this.entityType, bambooEntityOid.entityType) &&
        Objects.equals(this.serverKey, bambooEntityOid.serverKey) &&
        Objects.equals(this.entityOid, bambooEntityOid.entityOid) &&
        Objects.equals(this.value, bambooEntityOid.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityType, serverKey, entityOid, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BambooEntityOid {\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    serverKey: ").append(toIndentedString(serverKey)).append("\n");
    sb.append("    entityOid: ").append(toIndentedString(entityOid)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

