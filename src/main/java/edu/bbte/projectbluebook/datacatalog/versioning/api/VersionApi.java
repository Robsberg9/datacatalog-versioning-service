/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package edu.bbte.projectbluebook.datacatalog.versioning.api;

import edu.bbte.projectbluebook.datacatalog.versioning.model.ErrorResponse;
import edu.bbte.projectbluebook.datacatalog.versioning.model.VersionRequest;
import edu.bbte.projectbluebook.datacatalog.versioning.model.VersionResponse;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Validated
@Api(value = "Version", description = "the Version API")
public interface VersionApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /assets/{assetId}/versions
     * Creates a new version of the asset, with the current content of the asset.  Responds with &#x60;404&#x60; if the asset is not found, and with &#x60;422&#x60; if the request body is invalid.
     *
     * @param assetId The unique identifier of the asset. (required)
     * @param versionRequest  (optional)
     * @return Created (status code 201)
     *         or Not Found (status code 404)
     *         or Unprocessable Entity (WebDAV) (status code 422)
     */
    @ApiOperation(value = "", nickname = "createAssetVersion", notes = "Creates a new version of the asset, with the current content of the asset.  Responds with `404` if the asset is not found, and with `422` if the request body is invalid.", authorizations = {
        @Authorization(value = "JWT")
    }, tags={ "Version", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 404, message = "Not Found"),
        @ApiResponse(code = 422, message = "Unprocessable Entity (WebDAV)", response = ErrorResponse.class) })
    @RequestMapping(value = "/assets/{assetId}/versions",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> createAssetVersion(@ApiParam(value = "The unique identifier of the asset.",required=true) @PathVariable("assetId") String assetId,@ApiParam(value = ""  )  @Valid @RequestBody(required = false) VersionRequest versionRequest) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /assets/{assetId}/versions/{name}
     * Deletes the sepcified version of the asset.  Responds with &#x60;404&#x60; if the asset or the version is not found. Details about the failure in the &#x60;message&#x60; field of the error response.
     *
     * @param assetId The unique identifier of the asset. (required)
     * @param name The name of an asset version. (required)
     * @return No Content (status code 204)
     *         or Not Found (status code 404)
     */
    @ApiOperation(value = "", nickname = "deleteAssetVersion", notes = "Deletes the sepcified version of the asset.  Responds with `404` if the asset or the version is not found. Details about the failure in the `message` field of the error response.", authorizations = {
        @Authorization(value = "JWT")
    }, tags={ "Version", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 404, message = "Not Found", response = ErrorResponse.class) })
    @RequestMapping(value = "/assets/{assetId}/versions/{name}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> deleteAssetVersion(@ApiParam(value = "The unique identifier of the asset.",required=true) @PathVariable("assetId") String assetId,@ApiParam(value = "The name of an asset version.",required=true) @PathVariable("name") String name) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /assets/{assetId}/versions/{name} : A version of an asset
     * Returns the required version of the asset.  Responds with &#x60;404&#x60; if the asset or the version is not found. Details about the failure in the &#x60;message&#x60; field of the response object.
     *
     * @param assetId The unique identifier of the asset. (required)
     * @param name The name of an asset version. (required)
     * @return OK (status code 200)
     *         or Not Found (status code 404)
     */
    @ApiOperation(value = "A version of an asset", nickname = "getAssetVersion", notes = "Returns the required version of the asset.  Responds with `404` if the asset or the version is not found. Details about the failure in the `message` field of the response object.", response = VersionResponse.class, tags={ "Version", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VersionResponse.class),
        @ApiResponse(code = 404, message = "Not Found", response = ErrorResponse.class) })
    @RequestMapping(value = "/assets/{assetId}/versions/{name}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<VersionResponse> getAssetVersion(@ApiParam(value = "The unique identifier of the asset.",required=true) @PathVariable("assetId") String assetId,@ApiParam(value = "The name of an asset version.",required=true) @PathVariable("name") String name) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\", \"contents\" : [ { \"size\" : 176, \"name\" : \"users.csv\", \"id\" : \"id\", \"lastModified\" : \"2020-12-02T12:51:33Z\" }, { \"size\" : 176, \"name\" : \"users.csv\", \"id\" : \"id\", \"lastModified\" : \"2020-12-02T12:51:33Z\" } ], \"assetId\" : \"assetId\", \"name\" : \"1.0.0\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /assets/{assetId}/versions : List the versions of an asset
     * Lists all the available versions of the asset.  Responds with &#x60;404&#x60; if the asset is not found.
     *
     * @param assetId The unique identifier of the asset. (required)
     * @return OK (status code 200)
     *         or Not Found (status code 404)
     */
    @ApiOperation(value = "List the versions of an asset", nickname = "getAssetVersions", notes = "Lists all the available versions of the asset.  Responds with `404` if the asset is not found.", response = VersionResponse.class, responseContainer = "List", tags={ "Version", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = VersionResponse.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "Not Found", response = ErrorResponse.class) })
    @RequestMapping(value = "/assets/{assetId}/versions",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<VersionResponse>> getAssetVersions(@ApiParam(value = "The unique identifier of the asset.",required=true) @PathVariable("assetId") String assetId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\", \"contents\" : [ { \"size\" : 176, \"name\" : \"users.csv\", \"id\" : \"id\", \"lastModified\" : \"2020-12-02T12:51:33Z\" }, { \"size\" : 176, \"name\" : \"users.csv\", \"id\" : \"id\", \"lastModified\" : \"2020-12-02T12:51:33Z\" } ], \"assetId\" : \"assetId\", \"name\" : \"1.0.0\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
