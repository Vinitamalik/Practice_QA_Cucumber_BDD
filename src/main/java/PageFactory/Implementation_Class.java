package PageFactory;

import Common.API;
import Common.ApiHelper;
import Common.JSONUtils;
import Test_Data_Modules.TestData;
import com.jayway.jsonpath.JsonPath;
import com.jayway.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class Implementation_Class {

    /** Initializing API utilities class **/
    ApiHelper api = new ApiHelper();
    API restMethods = new API();

    JSONUtils json = new JSONUtils();

    Response responseBody;
    Map<String, Object> headers = new HashMap<String, Object>();
    JSONObject models = new JSONObject();
    String Token_endpoint = TestData.Token_endpoint.getValue();
    String Token_path_resources= TestData.Token_path_resources.getValue();
    String Token_content_Type= TestData.Token_content_Type.getValue();
    String Sensor_REQ_MR_812P= TestData.Sensor_REQ_MR_812P.getValue();
    String Sensor_REQ_MR_MR_810T= TestData.Sensor_REQ_MR_MR_810T.getValue();

    String Token_Req_Body = TestData.Token_Req_Body.getValue();
    String Token_Req_Body_invalidUser_name= TestData.Token_Req_Body_invalidUser_name.getValue();
    String Token_Req_Body_Invalid_Password= TestData.Token_Req_Body_Invalid_Password.getValue();
    String Token_REQ_Body_Invalid_Client_ID= TestData.Token_REQ_Body_Invalid_Client_ID.getValue();
    String Token_Req_Body_invalid_GrantType= TestData.Token_Req_Body_invalid_GrantType.getValue();
    String Token_Invalid_Content_Type = TestData.Token_Invalid_Content_Type.getValue();
    String Lora_Config_Endpoints = TestData.Lora_Config_Endpoints.getValue();
    String Lora_config_resources= TestData.Lora_config_resources.getValue();
    String Sensor_config_resources= TestData.Sensor_config_resources.getValue();
    String Content_Type= TestData.Content_Type.getValue();
    String APIKEY = TestData.APIKEY.getValue();
    String loggerNumber_Type_MR_812P= TestData.loggerNumber_Type_MR_812P.getValue();
    String loggerNumber_Type_MR_810T= TestData.loggerNumber_Type_MR_810T.getValue();
    String baseInterval= TestData.baseInterval.getValue();
    String Invalid_APIKEY = TestData.Invalid_APIKEY.getValue();
    String Empty_APIKEY= TestData.Empty_APIKEY.getValue();
    String unsupported_Content_Type = TestData.unsupported_Content_Type.getValue();
    boolean loggerNumberLengthfor_Type_812P = (loggerNumber_Type_MR_812P).length()<=16;
    boolean loggerNumberLengthfor_Type_810T = (loggerNumber_Type_MR_810T).length()<=16;
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
        String ActualStatuscode = String.valueOf(responseBody.getStatusCode());
        api.assertStatusCode("verify Expected" + StatusCode + ActualStatuscode, Integer.parseInt(StatusCode), responseBody);
        System.out.println("StatusCode" + StatusCode);

    }

    public void get_error_description(String error_description)
    {
        String responsebody= (api.getResponseBody(responseBody)).asString();
        error_description = JsonPath.read(responsebody, "$.error_description").toString();


    }

    public static boolean isValidHexaCode(String input) {
        // Define the regular expression pattern for a valid hexadecimal color code
        // It matches either a 0-character to 16-character code, preceded by a #
        Pattern hexaPattern = Pattern.compile("^#([a-fA-F0-9]{0,16})$");

        // Create a Matcher object to match the input against the pattern
        Matcher matcher = hexaPattern.matcher(input);

        // Return true if the input matches the pattern, otherwise false
        return matcher.matches();
    }



    public void create_logger_type(String LoggerType) throws IOException {
        headers.put("Content-Type",Content_Type);
        headers.put("APIKEY",APIKEY );
        if(LoggerType.equals("MR_812P")){
        assert loggerNumberLengthfor_Type_812P == true;
        assert (isValidHexaCode("#"+ loggerNumber_Type_MR_812P)) == true;

            /** add testdata into the JSONObject **/
            models.put("loggerNumber", loggerNumber_Type_MR_812P);
            models.put("loggerType", LoggerType);
            models.put("baseInterval", baseInterval);
            responseBody = restMethods.apiPostRequest(Lora_Config_Endpoints, Lora_config_resources, headers, models);
        }
           else if(LoggerType.equals("MR_810T")){
           assert loggerNumberLengthfor_Type_810T == true;
           assert (isValidHexaCode("#"+ loggerNumber_Type_MR_810T)) == true;
                   /** add testdata into the JSONObject **/
                    models.put("loggerNumber", loggerNumber_Type_MR_810T);
                    models.put("loggerType", LoggerType);
                    models.put("baseInterval", baseInterval);
                    responseBody = restMethods.apiPostRequest(Lora_Config_Endpoints, Lora_config_resources, headers, models);
                }

        }

    public void Logger_Positive_Negative_cases(String LoggerType,String loggerNumber, String Scenario) throws IOException {

        if (Scenario.equals("Using Non-Hex 16 chars key")){
            headers.put("Content-Type",Content_Type);
            headers.put("APIKEY",APIKEY );
            /** add testdata into the JSONObject **/
            models.put("loggerNumber", loggerNumber);
            models.put("loggerType", LoggerType);
            models.put("baseInterval", baseInterval);
            responseBody = restMethods.apiPostRequest(Lora_Config_Endpoints, Lora_config_resources, headers, models);
        }else if(Scenario.equals("Using Non-Hex 16 chars key")){
            headers.put("Content-Type",Content_Type);
            headers.put("APIKEY",APIKEY );
            /** add testdata into the JSONObject **/
            models.put("loggerNumber", loggerNumber);
            models.put("loggerType", LoggerType);
            models.put("baseInterval", baseInterval);
            responseBody = restMethods.apiPostRequest(Token_endpoint,Token_path_resources, headers, Token_Req_Body_Invalid_Password);

        }else if(Scenario.equals("Using 16 Hex chars Key")){
            headers.put("Content-Type",Content_Type);
            headers.put("APIKEY",APIKEY );
            /** add testdata into the JSONObject **/
            models.put("loggerNumber", loggerNumber);
            models.put("loggerType", LoggerType);
            models.put("baseInterval", baseInterval);
            responseBody = restMethods.apiPostRequest(Lora_Config_Endpoints, Lora_config_resources, headers, models);

        }else if(Scenario.equals("Using 15 Hex chars key")){
            headers.put("Content-Type",Content_Type);
            headers.put("APIKEY",APIKEY );
            /** add testdata into the JSONObject **/
            models.put("loggerNumber", loggerNumber);
            models.put("loggerType", LoggerType);
            models.put("baseInterval", baseInterval);
            responseBody = restMethods.apiPostRequest(Lora_Config_Endpoints, Lora_config_resources, headers, models);

        }else if(Scenario.equals("Using 17 Hex Chars Key")){
            headers.put("Content-Type",Content_Type);
            headers.put("APIKEY",APIKEY );
            /** add testdata into the JSONObject **/
            models.put("loggerNumber", loggerNumber);
            models.put("loggerType", LoggerType);
            models.put("baseInterval", baseInterval);
            responseBody = restMethods.apiPostRequest(Lora_Config_Endpoints, Lora_config_resources, headers, models);

        }else if(Scenario.equals("Using 20 Hex Chars Key")){
            headers.put("Content-Type",Content_Type);
            headers.put("APIKEY",APIKEY );
            /** add testdata into the JSONObject **/
            models.put("loggerNumber", loggerNumber);
            models.put("loggerType", LoggerType);
            models.put("baseInterval", baseInterval);
            responseBody = restMethods.apiPostRequest(Lora_Config_Endpoints, Lora_config_resources, headers, models);

        }else if(Scenario.equals("Using 0 chars Hex Key")){
            headers.put("Content-Type",Content_Type);
            headers.put("APIKEY",APIKEY );
            /** add testdata into the JSONObject **/
            models.put("loggerNumber", loggerNumber);
            models.put("loggerType", LoggerType);
            models.put("baseInterval", baseInterval);
            responseBody = restMethods.apiPostRequest(Lora_Config_Endpoints, Lora_config_resources, headers, models);

        }else if(Scenario.equals("Using 0 chars Hex Key")){
            headers.put("Content-Type",Content_Type);
            headers.put("APIKEY",APIKEY );
            /** add testdata into the JSONObject **/
            models.put("loggerNumber", loggerNumber);
            models.put("loggerType", LoggerType);
            models.put("baseInterval", baseInterval);
            responseBody = restMethods.apiPostRequest(Lora_Config_Endpoints, Lora_config_resources, headers, models);

        }else if(Scenario.equals("Using 8 Hex chars Key")){
            headers.put("Content-Type",Content_Type);
            headers.put("APIKEY",APIKEY );
            /** add testdata into the JSONObject **/
            models.put("loggerNumber", loggerNumber);
            models.put("loggerType", LoggerType);
            models.put("baseInterval", baseInterval);
            responseBody = restMethods.apiPostRequest(Lora_Config_Endpoints, Lora_config_resources, headers, models);

        }else if(Scenario.equals("Using Invalid Logger Type")){
            headers.put("Content-Type",Content_Type);
            headers.put("APIKEY",APIKEY );
            /** add testdata into the JSONObject **/
            models.put("loggerNumber", loggerNumber);
            models.put("loggerType", LoggerType);
            models.put("baseInterval", baseInterval);
            responseBody = restMethods.apiPostRequest(Lora_Config_Endpoints, Lora_config_resources, headers, models);

        }else if(Scenario.equals("Using without Logger Type")){
            headers.put("Content-Type",Content_Type);
            headers.put("APIKEY",APIKEY );
            /** add testdata into the JSONObject **/
            models.put("loggerNumber", loggerNumber);
            models.put("loggerType", LoggerType);
            models.put("baseInterval", baseInterval);
            responseBody = restMethods.apiPostRequest(Lora_Config_Endpoints, Lora_config_resources, headers, models);

        }else if(Scenario.equals("Invalid API KEY")){
            headers.put("Content-Type",Content_Type);
            headers.put("APIKEY",Invalid_APIKEY );
            /** add testdata into the JSONObject **/
            models.put("loggerNumber", loggerNumber);
            models.put("loggerType", LoggerType);
            models.put("baseInterval", baseInterval);
            responseBody = restMethods.apiPostRequest(Lora_Config_Endpoints, Lora_config_resources, headers, models);

        }
        else if(Scenario.equals("Empty API KEy")){
            headers.put("Content-Type",Content_Type);
            headers.put("APIKEY",Empty_APIKEY );
            /** add testdata into the JSONObject **/
            models.put("loggerNumber", loggerNumber);
            models.put("loggerType", LoggerType);
            models.put("baseInterval", baseInterval);
            responseBody = restMethods.apiPostRequest(Lora_Config_Endpoints, Lora_config_resources, headers, models);

        }
        else if(Scenario.equals("Invalid Content Type")){
            headers.put("Content-Type",unsupported_Content_Type);
            headers.put("APIKEY",Invalid_APIKEY );
            /** add testdata into the JSONObject **/
            models.put("loggerNumber", loggerNumber);
            models.put("loggerType", LoggerType);
            models.put("baseInterval", baseInterval);
            responseBody = restMethods.apiPostRequest(Lora_Config_Endpoints, Lora_config_resources, headers, models);

        }
    }

    public void get_message_description(String message)
    {
        String responsebody= (api.getResponseBody(responseBody)).asString();
        JSONArray jsonArray = new JSONArray(responsebody);
        for(int i=0;i<jsonArray.length();i++)
        {
            JSONObject jsonObject1 = jsonArray.getJSONObject(i);
            String value1 = jsonObject1.optString("message");
            System.out.println(value1);

        }

    }

    public void create_Sensor_Data(String Scenario) throws IOException {
        headers.put("Content-Type",Content_Type);
        headers.put("APIKEY",APIKEY );
        if(Scenario.equals("Create sensor data for MR_812P")){

            responseBody = restMethods.apiPostRequest_1(Lora_Config_Endpoints, Sensor_config_resources, headers, Sensor_REQ_MR_812P);
            System.out.println(responseBody);
        }
        else if(Scenario.equals("Create sensor data for MR_810T")){

            responseBody = restMethods.apiPostRequest_1(Lora_Config_Endpoints, Sensor_config_resources, headers, Sensor_REQ_MR_MR_810T);
        }

    }

}


