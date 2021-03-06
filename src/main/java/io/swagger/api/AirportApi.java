/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.4).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Airport;
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

@Api(value = "airport", description = "the airport API")
public interface AirportApi {

    @ApiOperation(value = "searches for airport based on searching phrase", nickname = "searchAirport", notes = "By passing in the search phrase, you can search for available airports in the system ", response = Airport.class, responseContainer = "List", tags={ "users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "search results matching criteria", response = Airport.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "bad input parameter"),
        @ApiResponse(code = 404, message = "not found") })
    @RequestMapping(value = "/airport",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Airport>> searchAirport(@ApiParam(value = "searchnig phrase which helps find appropriate airport") @Valid @RequestParam(value = "searchPhrase", required = false) String searchPhrase);

}
