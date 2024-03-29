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
 * RestNewUser
 */
@JsonPropertyOrder({
  RestNewUser.JSON_PROPERTY_AVATAR_URL,
  RestNewUser.JSON_PROPERTY_EMAIL,
  RestNewUser.JSON_PROPERTY_FULL_NAME,
  RestNewUser.JSON_PROPERTY_NAME,
  RestNewUser.JSON_PROPERTY_PASSWORD,
  RestNewUser.JSON_PROPERTY_PASSWORD_CONFIRM,
  RestNewUser.JSON_PROPERTY_SELF
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RestNewUser implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_AVATAR_URL = "avatarUrl";
  private String avatarUrl;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_FULL_NAME = "fullName";
  private String fullName;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_PASSWORD_CONFIRM = "passwordConfirm";
  private String passwordConfirm;

  public static final String JSON_PROPERTY_SELF = "self";
  private String self;

  public RestNewUser() { 
  }

  @JsonCreator
  public RestNewUser(
    @JsonProperty(JSON_PROPERTY_SELF) String self
  ) {
  this();
    this.self = self;
  }

  public RestNewUser avatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

   /**
   * Get avatarUrl
   * @return avatarUrl
  **/
  @jakarta.annotation.Nullable
  @Schema(example = "http://www.example.com/~admin/avatar.png", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_AVATAR_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAvatarUrl() {
    return avatarUrl;
  }


  @JsonProperty(JSON_PROPERTY_AVATAR_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }


  public RestNewUser email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @jakarta.annotation.Nullable
  @Schema(example = "admin@example.com", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(String email) {
    this.email = email;
  }


  public RestNewUser fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @jakarta.annotation.Nullable
  @Schema(example = "Administrator", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFullName() {
    return fullName;
  }


  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }


  public RestNewUser name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @Schema(example = "admin", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
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


  public RestNewUser password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @jakarta.annotation.Nullable
  @Schema(example = "new_Passw0rd", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPassword() {
    return password;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPassword(String password) {
    this.password = password;
  }


  public RestNewUser passwordConfirm(String passwordConfirm) {
    this.passwordConfirm = passwordConfirm;
    return this;
  }

   /**
   * Get passwordConfirm
   * @return passwordConfirm
  **/
  @jakarta.annotation.Nullable
  @Schema(example = "new_Passw0rd", requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonProperty(JSON_PROPERTY_PASSWORD_CONFIRM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPasswordConfirm() {
    return passwordConfirm;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD_CONFIRM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPasswordConfirm(String passwordConfirm) {
    this.passwordConfirm = passwordConfirm;
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
   * Return true if this RestNewUser object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestNewUser restNewUser = (RestNewUser) o;
    return Objects.equals(this.avatarUrl, restNewUser.avatarUrl) &&
        Objects.equals(this.email, restNewUser.email) &&
        Objects.equals(this.fullName, restNewUser.fullName) &&
        Objects.equals(this.name, restNewUser.name) &&
        Objects.equals(this.password, restNewUser.password) &&
        Objects.equals(this.passwordConfirm, restNewUser.passwordConfirm) &&
        Objects.equals(this.self, restNewUser.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatarUrl, email, fullName, name, password, passwordConfirm, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestNewUser {\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    passwordConfirm: ").append(toIndentedString(passwordConfirm)).append("\n");
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

