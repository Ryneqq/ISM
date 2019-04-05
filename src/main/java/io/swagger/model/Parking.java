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
 * Parking
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-05T05:57:49.407Z")

public class Parking   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("airtportID")
  private Integer airtportID = null;

  @JsonProperty("parkingID")
  private Integer parkingID = null;

  @JsonProperty("spaces")
  private Integer spaces = null;

  @JsonProperty("price")
  private Integer price = null;

  public Parking name(String name) {
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

  public Parking airtportID(Integer airtportID) {
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

  public Parking parkingID(Integer parkingID) {
    this.parkingID = parkingID;
    return this;
  }

  /**
   * Get parkingID
   * @return parkingID
  **/
  @ApiModelProperty(example = "1", required = true, value = "")
  @NotNull


  public Integer getParkingID() {
    return parkingID;
  }

  public void setParkingID(Integer parkingID) {
    this.parkingID = parkingID;
  }

  public Parking spaces(Integer spaces) {
    this.spaces = spaces;
    return this;
  }

  /**
   * Get spaces
   * @return spaces
  **/
  @ApiModelProperty(example = "1", required = true, value = "")
  @NotNull


  public Integer getSpaces() {
    return spaces;
  }

  public void setSpaces(Integer spaces) {
    this.spaces = spaces;
  }

  public Parking price(Integer price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(example = "1", required = true, value = "")
  @NotNull


  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Parking parking = (Parking) o;
    return Objects.equals(this.name, parking.name) &&
        Objects.equals(this.airtportID, parking.airtportID) &&
        Objects.equals(this.parkingID, parking.parkingID) &&
        Objects.equals(this.spaces, parking.spaces) &&
        Objects.equals(this.price, parking.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, airtportID, parkingID, spaces, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Parking {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    airtportID: ").append(toIndentedString(airtportID)).append("\n");
    sb.append("    parkingID: ").append(toIndentedString(parkingID)).append("\n");
    sb.append("    spaces: ").append(toIndentedString(spaces)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

