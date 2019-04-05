package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Book
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-05T05:57:49.407Z")

public class Book   {
  @JsonProperty("bookingID")
  private Integer bookingID = null;

  @JsonProperty("airtportID")
  private Integer airtportID = null;

  @JsonProperty("parkingID")
  private Integer parkingID = null;

  @JsonProperty("dateTime")
  private OffsetDateTime dateTime = null;

  public Book bookingID(Integer bookingID) {
    this.bookingID = bookingID;
    return this;
  }

  /**
   * Get bookingID
   * @return bookingID
  **/
  @ApiModelProperty(example = "1", value = "")


  public Integer getBookingID() {
    return bookingID;
  }

  public void setBookingID(Integer bookingID) {
    this.bookingID = bookingID;
  }

  public Book airtportID(Integer airtportID) {
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

  public Book parkingID(Integer parkingID) {
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

  public Book dateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  /**
   * Get dateTime
   * @return dateTime
  **/
  @ApiModelProperty(example = "2017-07-21T17:32:28.000Z", required = true, value = "")
  @NotNull

  @Valid

  public OffsetDateTime getDateTime() {
    return dateTime;
  }

  public void setDateTime(OffsetDateTime dateTime) {
    this.dateTime = dateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Book book = (Book) o;
    return Objects.equals(this.bookingID, book.bookingID) &&
        Objects.equals(this.airtportID, book.airtportID) &&
        Objects.equals(this.parkingID, book.parkingID) &&
        Objects.equals(this.dateTime, book.dateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookingID, airtportID, parkingID, dateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Book {\n");
    
    sb.append("    bookingID: ").append(toIndentedString(bookingID)).append("\n");
    sb.append("    airtportID: ").append(toIndentedString(airtportID)).append("\n");
    sb.append("    parkingID: ").append(toIndentedString(parkingID)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
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

