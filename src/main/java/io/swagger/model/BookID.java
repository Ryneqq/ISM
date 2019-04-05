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
 * BookID
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-05T05:57:49.407Z")

public class BookID   {
  @JsonProperty("bookingID")
  private Integer bookingID = null;

  public BookID bookingID(Integer bookingID) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookID bookID = (BookID) o;
    return Objects.equals(this.bookingID, bookID.bookingID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookingID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookID {\n");
    
    sb.append("    bookingID: ").append(toIndentedString(bookingID)).append("\n");
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

