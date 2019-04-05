/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.4).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Parking;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-05T05:57:49.407Z")

@Api(value = "parking", description = "the parking API")
public interface ParkingApi {

    @ApiOperation(value = "adds an parking lot to the system", nickname = "addParkingLot", notes = "Adds an parking lot to the system", authorizations = {
        @Authorization(value = "Bearer")
    }, tags={ "admins", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "item created"),
        @ApiResponse(code = 400, message = "invalid input, object invalid"),
        @ApiResponse(code = 409, message = "an existing item already exists") })
    @RequestMapping(value = "/parking",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> addParkingLot(@ApiParam(value = "Inventory item to add"  )  @Valid @RequestBody Parking inventoryItem);


    @ApiOperation(value = "searches for parkings based on airport id", nickname = "searchParking", notes = "By passing in the appropriate airtportID, you can search for available parking lots in the system ", response = Parking.class, responseContainer = "List", tags={ "users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "search results matching criteria", response = Parking.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "bad input parameter"),
        @ApiResponse(code = 404, message = "not found") })
    @RequestMapping(value = "/parking",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Parking>> searchParking(@Min(0) @Max(100) @ApiParam(value = "Identifier of airport") @Valid @RequestParam(value = "airtportID", required = false) Integer airtportID);

}
