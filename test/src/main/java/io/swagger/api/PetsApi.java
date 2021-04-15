/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.25).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.InlineResponse500;
import io.swagger.model.InventoryItem;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
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
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-04-15T13:52:03.251Z[GMT]")
@Validated
public interface PetsApi {

    @Operation(summary = "", description = "", tags={ "MY-TAG" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Beschreibung", content = @Content(schema = @Schema(implementation = InventoryItem.class))),
        
        @ApiResponse(responseCode = "500", description = "Invalid request", content = @Content(schema = @Schema(implementation = InlineResponse500.class))) })
    @RequestMapping(value = "/pets",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InventoryItem> petsGet(@Min(0)@Parameter(in = ParameterIn.QUERY, description = "The number of items to skip before returning the results" ,schema=@Schema(allowableValues={  }
)) @Valid @RequestParam(value = "offset", required = false) Integer offset, @Min(1) @Max(100) @Parameter(in = ParameterIn.QUERY, description = "The number of items to return" ,schema=@Schema(allowableValues={  }, minimum="1", maximum="100"
, defaultValue="20")) @Valid @RequestParam(value = "limit", required = false, defaultValue="20") Integer limit);


    @Operation(summary = "", description = "", tags={ "MY-TAG" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Beschreibung", content = @Content(schema = @Schema(implementation = InventoryItem.class))) })
    @RequestMapping(value = "/pets",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<InventoryItem> postPets(@Parameter(in = ParameterIn.DEFAULT, description = "A JSON object containing item data", required=true, schema=@Schema()) @Valid @RequestBody Integer body);

}

