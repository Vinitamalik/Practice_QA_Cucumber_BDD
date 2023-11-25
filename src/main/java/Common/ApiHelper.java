package Common;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.config.RestAssuredConfig;
import com.jayway.restassured.filter.log.RequestLoggingFilter;
import com.jayway.restassured.filter.log.ResponseLoggingFilter;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ResponseBody;
import com.jayway.restassured.specification.RequestSpecification;
import gherkin.deps.com.google.gson.Gson;
import gherkin.deps.com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.Map;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.specification.ProxySpecification.host;


public class ApiHelper {

    private Gson gson;

    protected RequestSpecification givenConfig(String urlKey) {
        // RestAssured.baseURI = Props.getProp(urlKey);
        RestAssured.useRelaxedHTTPSValidation();
        return given().
                header("Content-Type", "application/json").
                config(com.jayway.restassured.RestAssured.config().encoderConfig(com.jayway.restassured.config.EncoderConfig.encoderConfig().appendDefaultContentCharsetToContentTypeIfUndefined(false))).
                header("Accept", "application/json")
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    }


    protected RequestSpecification givenConfig(String urlKey,  Map<String, Object> headers) {
        //   urlKey = Props.getProp(urlKey);

        RestAssured.baseURI = urlKey;
        RestAssured.useRelaxedHTTPSValidation();
        return given().config(com.jayway.restassured.RestAssured.config().encoderConfig(com.jayway.restassured.config.EncoderConfig.encoderConfig().appendDefaultContentCharsetToContentTypeIfUndefined(false))).
                headers(headers)
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    }

    protected RequestSpecification givenConfig(String urlKey,  Map<String, Object> headers, RestAssuredConfig restAssuredConfig) {

        RestAssured.baseURI = urlKey;
        RestAssured.useRelaxedHTTPSValidation();
        return given().config(com.jayway.restassured.RestAssured.config().encoderConfig(com.jayway.restassured.config.EncoderConfig.encoderConfig().appendDefaultContentCharsetToContentTypeIfUndefined(false))).
                headers(headers)
                .config(restAssuredConfig)
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    }

    protected RequestSpecification givenConfigForAccessToken(String urlKey, String headerAuth) {

        RestAssured.useRelaxedHTTPSValidation();
        return given().
                header("Content-Type", "application/json").
                config(com.jayway.restassured.RestAssured.config().encoderConfig(com.jayway.restassured.config.EncoderConfig.encoderConfig().appendDefaultContentCharsetToContentTypeIfUndefined(false))).
                header("Accept", "application/json").
                header("Cookie", "Authorization=" + headerAuth)
                .filters(new RequestLoggingFilter(), new ResponseLoggingFilter());

    }

    public void setProxy(String urlKey, String portkey) {
        String proxyURL = urlKey;
        String portAsString = portkey;
        int port = Integer.parseInt(portAsString);
        RestAssured.proxy = host(proxyURL).withPort(port);
    }

    public void resetProxy() {
        RestAssured.reset();
    }

    //Specify all one time default Gson config
    public Gson gson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gson = gson(gsonBuilder);
        return gson;
    }

    //Custom Gson config to override Default Gson  configuration
    public Gson gson(GsonBuilder gsonBuilder) {
        gson = gsonBuilder.create();
        return gson;
    }
    //

    public String ResponseCodes(String responsecode) {
        String statuscode = responsecode;
        return statuscode;
    }

    protected RequestSpecification multipleHeaders(ArrayList<Object> headerNames, ArrayList<Object> headerValues) {
        RequestSpecification headers = null;
        for (int i = 0; i < headerNames.size(); i++) {
            headers = given().header(headerNames.get(i).toString(), headerValues.get(i).toString()).filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
        }
        return headers;
    }


    /**
     * Get the status code of the response.
     *
     * @param response
     *          the response body
     * @return The {@ink int} The status code of the response
     */
    public int getStatusCode(Response response)

    {
        return response.getStatusCode();
    }

    /**
     * Returns the response body.
     *
     * @param response
     *          the response body
     * @return The {@ink Response} response body.
     */

    public ResponseBody<?> getResponseBody(final Response response)
    {
        return response.getBody();
    }

    /**
     * get the status line of the response.
     *
     * @param response
     *          the response body
     * @return The {@ink String} status line of the response.
     */

    public String getStatusLine(Response response)
    {
        return response.getStatusLine();
    }

    /**
     * method to assert the status code from the response.
     *
     * @param statusCode
     *          is the actual status code
     *
     * @param response
     *          the response body.
     */

    public void assertStatusCode(int statusCode, Response response)
    {
        assertThat(statusCode, equalTo(response.getStatusCode()));

    }
    public void assertStatusCode(String desc, int statusCode, Response response)
    {
        assertThat(desc,statusCode,equalTo(response.getStatusCode()));
    }

    /**
     * method to assert the status line from the response.
     *
     * @param statusLine
     *          is the actual status line
     *
     * @param response
     *          the response body.
     */

    public static void assertStatusLine(String statusLine, Response response)
    {
        assertThat(statusLine, equalTo(response.getStatusLine()));
    }

    public static void assertStatusLine(String desc,String statusLine, Response response)
    {
        assertThat(desc,statusLine, equalTo(response.getStatusLine()));
    }
}
