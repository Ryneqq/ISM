/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.4).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Credentials;
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

@Api(value = "authenticate", description = "the authenticate API")
public interface AuthenticateApi {

    @ApiOperation(value = "log in", nickname = "logIn", notes = "By passing account credentials you can obtain authorization token ", response = Object.class, tags={ "users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "search results matching criteria", response = Object.class),
        @ApiResponse(code = 400, message = "invalid input, object invalid"),
        @ApiResponse(code = 401, message = "unauthorized") })
    @RequestMapping(value = "/authenticate",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Object> logIn();


    @ApiOperation(value = "Create an account", nickname = "signIn", notes = "Creates an account for an user", response = Object.class, tags={ "users", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "item created", response = Object.class),
        @ApiResponse(code = 400, message = "invalid input, object invalid") })
    @RequestMapping(value = "/authenticate",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Object> signIn(@ApiParam(value = "Inventory item to add"  )  @Valid @RequestBody Credentials inventoryItem);

}
