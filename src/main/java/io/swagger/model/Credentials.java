package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Credentials
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-05T05:57:49.407Z")

public class Credentials   {
  @JsonProperty("email")
  private String email = null;

  @JsonProperty("passHash")
  private String passHash = null;

  public Credentials email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "john.snow@foo.com", required = true, value = "")
  @NotNull


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Credentials passHash(String passHash) {
    this.passHash = passHash;
    return this;
  }

  /**
   * Get passHash
   * @return passHash
  **/
  @ApiModelProperty(example = "91162629d258a876ee994e9233b2ad87", required = true, value = "")
  @NotNull


  public String getPassHash() {
    return passHash;
  }

  public void setPassHash(String passHash) {
    this.passHash = passHash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Credentials credentials = (Credentials) o;
    return Objects.equals(this.email, credentials.email) &&
        Objects.equals(this.passHash, credentials.passHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, passHash);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Credentials {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    passHash: ").append(toIndentedString(passHash)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

