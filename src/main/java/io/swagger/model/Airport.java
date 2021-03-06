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
 * Airport
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-05T05:57:49.407Z")

public class Airport   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("airtportID")
  private Integer airtportID = null;

  public Airport name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Glasgow Airpotrt", required = true, value = "")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Airport airtportID(Integer airtportID) {
    this.airtportID = airtportID;
    return this;
  }

  /**
   * Get airtportID
   * @return airtportID
  **/
  @ApiModelProperty(example = "1", required = true, value = "")
  @NotNull


  public Integer getAirtportID() {
    return airtportID;
  }

  public void setAirtportID(Integer airtportID) {
    this.airtportID = airtportID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Airport airport = (Airport) o;
    return Objects.equals(this.name, airport.name) &&
        Objects.equals(this.airtportID, airport.airtportID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, airtportID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Airport {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    airtportID: ").append(toIndentedString(airtportID)).append("\n");
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

