package io.swagger.api;

import io.swagger.model.Parking;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-05T05:57:49.407Z")

@Controller
public class ParkingApiController implements ParkingApi {

    private static final Logger log = LoggerFactory.getLogger(ParkingApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ParkingApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addParkingLot(@ApiParam(value = "Inventory item to add"  )  @Valid @RequestBody Parking inventoryItem) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Parking>> searchParking(@Min(0) @Max(100) @ApiParam(value = "Identifier of airport") @Valid @RequestParam(value = "airtportID", required = false) Integer airtportID) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Parking>>(objectMapper.readValue("[ {  \"price\" : 1,  \"name\" : \"Glasgow Airpotrt\",  \"airtportID\" : 1,  \"spaces\" : 1,  \"parkingID\" : 1}, {  \"price\" : 1,  \"name\" : \"Glasgow Airpotrt\",  \"airtportID\" : 1,  \"spaces\" : 1,  \"parkingID\" : 1} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Parking>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Parking>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
