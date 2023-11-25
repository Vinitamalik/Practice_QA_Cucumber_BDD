package Common;

import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;
import org.json.JSONObject;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class API extends ApiHelper{

    private RequestSpecification request;
    private Response response;

    /** public constructor **/

    public API()
    {

    }

    /**
     * GET REQUEST
     **/

    public Response apiGetRequest(String urlKey, String endpoint) {
        return givenConfig(urlKey).when().log().all().get(endpoint);
    }

    public Response apiGetRequestWithHeader(String urlKey, String headerAuth, String endpoint)
    {
        return givenConfigForAccessToken(urlKey,headerAuth).when().log().all().get(endpoint);
    }

    public Response apiGetRequest(String urlKey, Map<String, Object> headers, String endpoint) {
        return givenConfig(urlKey, headers).when().log().all().get(endpoint);
    }


    /* CGI_MS_AUTOM_START_<12/11/19> */
    public Response apiGetRequest(String urlKey, Map<String, Object> headers, Map<String, String> queryParameters, String endpoint) {
        return givenConfig(urlKey, headers).params(queryParameters).when().log().all().get(endpoint);
    }


    /**
     * POST REQUEST
     *
     * @return
     **/

    public Response apiPostRequest(String urlKey, String path,  Map<String, Object> headers) {
        return givenConfig(urlKey, headers).when().post(path);
    }

    public Response apiPostRequest(String urlKey, String path,  Map<String, Object> headers, List<Map<String, String>> models) {
        return givenConfig(urlKey, headers).body(gson().toJson(models)).when().post(path);
    }

    public Response apiPostRequest(String urlKey, String path, Map<String, Object> headers, JSONObject models) {
        return givenConfig(urlKey, headers).body(models.toString()).log().all().when().post(path);
    }

    public Response apiPostRequest(String urlKey, String path, Map<String, Object> headers, String jsonString) throws IOException {
        return givenConfig(urlKey, headers).body(jsonString).log().all().when().post(path);
    }

    public Response apiPostRequest(String urlKey, String path, Map<String, Object> headers, Map<String, String> queryParameters, JSONObject models) {
        return givenConfig(urlKey, headers).queryParameters(queryParameters).body(models.toString()).log().all().when().post(path);

    }





    /**
     * PUT REQUEST
     *
     * @return
     **/
    public Response apiPutRequest(String urlKey, String path, Map<String, Object> headers, String jsonString) throws IOException {
        return givenConfig(urlKey, headers).body(jsonString).log().all().when().put(path);
    }

    public Response apiPutRequest(String urlKey, String path, Map<String, String> models) {
        return givenConfig(urlKey).
                body(gson().toJson(models)).
                when().
                put(path);
    }

    public Response apiPutRequest(String urlKey, String path, Map<String, Object> headers, Map<String, String> models) {
        return givenConfig(urlKey, headers).body(gson().toJson(models)).when().put(path);
    }


    /**
     * PATCH REQUEST
     *
     * @return
     **/
    public Response apiPatchRequest(String urlKey, String path, Map<String, Object> headers, Map<String, String> models) {
        return givenConfig(urlKey, headers).body(gson().toJson(models)).when().patch(path);
    }

    public Response apiPatchRequest(String urlKey, String path, Map<String, Object> headers, String jsonString) {
        return givenConfig(urlKey, headers).body(jsonString).log().all().when().patch(path);
    }

    public Response apiPatchRequestMethodNotAllowed(String urlKey, String path, Map<String, Object> headers, Map<String, String> queryParameters) {
        return givenConfig(urlKey,headers).params(queryParameters).log().all().when().patch(path);
    }

    /**
     * DELETE REQUEST
     *
     * @return
     **/
    public Response apiDeleteRequest(String urlKey, Map<String, Object> headers, String path) {
        return givenConfig(urlKey, headers).log().all().when().delete(path);
    }


}
