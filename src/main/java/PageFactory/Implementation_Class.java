package PageFactory;

import Common.API;
import Common.ApiHelper;
import Test_Data_Modules.TestData;
import com.jayway.jsonpath.JsonPath;
import com.jayway.restassured.response.Response;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Implementation_Class {

    /** Initializing API utilities class **/
    ApiHelper api = new ApiHelper();
    API restMethods = new API();

    Response responseBody;
    Map<String, Object> headers = new HashMap<String, Object>();
    String Token_endpoint = TestData.Token_endpoint.getValue();
    String Token_path_resources= TestData.Token_path_resources.getValue();
    String Token_content_Type= TestData.Token_content_Type.getValue();
    String Token_Req_Body = TestData.Token_Req_Body.getValue();
    String Token_Req_Body_invalidUser_name= TestData.Token_Req_Body_invalidUser_name.getValue();
    String Token_Req_Body_Invalid_Password= TestData.Token_Req_Body_Invalid_Password.getValue();
    String Token_REQ_Body_Invalid_Client_ID= TestData.Token_REQ_Body_Invalid_Client_ID.getValue();
    String Token_Req_Body_invalid_GrantType= TestData.Token_Req_Body_invalid_GrantType.getValue();
    String Token_Invalid_Content_Type = TestData.Token_Invalid_Content_Type.getValue();

    public void createToken() throws IOException {
        System.out.println("Getting token data...");

        headers.put("Content-Type",Token_content_Type );
        responseBody = restMethods.apiPostRequest(Token_endpoint,Token_path_resources, headers, Token_Req_Body);

    }

    public void returnResponseBody(String responsebody)
    {
        responsebody= (api.getResponseBody(responseBody)).asString();

    }

    /** this method is to return and verify the status code **/

    public void verifyStatusCode(int statuscode,int ActualResponsecode,String scenarioName)
    {
        ActualResponsecode = responseBody.getStatusCode();
        api.assertStatusCode("verify Expected" + statuscode + "and actual" + ActualResponsecode +"for scenarion:" + scenarioName, statuscode, responseBody);
    }

    /** this method is to return and verify the status line **/

    public void verifyStatusline(String statusline,String actualStatusline,String scenarioName)
    {
        actualStatusline = responseBody.getStatusLine().toString();
        api.assertStatusLine("verify Expected" + statusline + "and actual" + actualStatusline+ "for scenarion:" + scenarioName, statusline, responseBody);
    }

    public String getToken() throws Throwable {
        String responsebody= (api.getResponseBody(responseBody)).asString();
        String tokenValue = JsonPath.read(responsebody, "$.access_token").toString();
        System.out.println("Token Value" + " " + tokenValue);
        return tokenValue;
    }

    public void Token_api_Invalid_cases(String Scenario) throws IOException {
        if (Scenario.equals("Invalid_UserName")){
            headers.put("Content-Type",Token_content_Type );
            responseBody = restMethods.apiPostRequest(Token_endpoint,Token_path_resources, headers, Token_Req_Body_invalidUser_name);
        }else if(Scenario.equals("Invalid Password")){
            headers.put("Content-Type",Token_content_Type );
            responseBody = restMethods.apiPostRequest(Token_endpoint,Token_path_resources, headers, Token_Req_Body_Invalid_Password);

        }else if(Scenario.equals("Invalid Client ID")){
            headers.put("Content-Type",Token_content_Type );
            responseBody = restMethods.apiPostRequest(Token_endpoint,Token_path_resources, headers, Token_REQ_Body_Invalid_Client_ID);

        }else if(Scenario.equals("Invalid Grant_Type")){
            headers.put("Content-Type",Token_content_Type );
            responseBody = restMethods.apiPostRequest(Token_endpoint,Token_path_resources, headers, Token_Req_Body_invalid_GrantType);

        }else if(Scenario.equals("Unsupported Conetent_Type")){
            headers.put("Content-Type",Token_Invalid_Content_Type );
            responseBody = restMethods.apiPostRequest(Token_endpoint,Token_path_resources, headers, Token_Req_Body_invalidUser_name);

        }

    }

    public void get_error(String Scenario) throws IOException {
        if (Scenario.equals("Unsupported Conetent_Type")){
            headers.put("Content-Type",Token_Invalid_Content_Type );
            responseBody = restMethods.apiPostRequest(Token_endpoint,Token_path_resources, headers, Token_Req_Body_invalidUser_name);
        }


    }

    public void status_code(String StatusCode)
    {
        StatusCode = String.valueOf(responseBody.getStatusCode());
        System.out.println("StatusCode" + StatusCode);

    }

    public void get_error_description(String error_description)
    {
        String responsebody= (api.getResponseBody(responseBody)).asString();
        error_description = JsonPath.read(responsebody, "$.error_description").toString();


    }

}
