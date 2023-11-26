package StepDefinition;

import Common.API;
import Common.ApiHelper;
import com.jayway.jsonpath.JsonPath;
import com.jayway.restassured.response.Response;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import PageFactory.Implementation_Class;


import java.io.IOException;

public class stepdefinition {
    Implementation_Class pg = new Implementation_Class();
    ApiHelper api = new ApiHelper();
    Response responseBody;
    API restMethods = new API();
    String responseBodyReturned;


    public stepdefinition() throws IOException {

    }

    @When("Create the Token for customer user")
    public void createToken() throws Throwable {
        pg.createToken();

    }

    @Then("Return the response Body")
    public void returningResponseBody() throws Throwable {
        pg.returnResponseBody(responseBodyReturned);
    }

    @And("Return the Status code as \"([^\"]*)\" and verify the status code should be \"([^\"]*)\" in case of \"([^\"]*)\"$")
    public void returnAndVerifyStatusCode(int statuscode,int ActualResponsecode,String scenarioName) throws Throwable {
        pg.verifyStatusCode(statuscode,ActualResponsecode,scenarioName);
    }

    @And("Return the Status Line as \"([^\"]*)\" and verify the status Line should be \"([^\"]*)\" in case of \"([^\"]*)\"$")
    public void returnAndVerifyStatusLine(String statusline,String actualStatusline,String scenarioName) throws Throwable {
        pg.verifyStatusline(statusline,actualStatusline,scenarioName);
    }

    @And("Get the Token Value$")
    public void getToken() throws Throwable {
        pg.getToken();
    }

    @When("user calls the Token api {string}")
    public void Token_api(String Scenario) throws Throwable {
        pg.Token_api_Invalid_cases(Scenario);
    }

    @Then("user should get response status code as {string}")
    public void Invalid_cases(String StatusCode) throws Throwable {
        pg.status_code(StatusCode);
    }

    @Then("response should contain {string}")
    public void Invalid_Response(String error_description) throws Throwable {
        pg.get_error_description(error_description);
    }

    @Then("response should contain error {string}")
    public void Invalid_Content_Type(String error) throws Throwable {
        pg.get_error(error);
    }

    @Given("Call lORA configuration API to create Logger using {string} and assert max 16 HEX chars only")
    public void Create_logger_Type(String LoggerType) throws Throwable {
        pg.create_logger_type(LoggerType);
    }

    @Given("Call lORA configuration API to create Logger using {string} and {string} against {string}")
    public void Positive_Negative_cases(String LoggerType,String loggerNumber, String Scenario) throws Throwable {
        pg.Logger_Positive_Negative_cases(LoggerType,loggerNumber,Scenario);
    }

    @Then("response should contain message {string}")
    public void messages(String message) throws Throwable {
        pg.get_message_description(message);
    }

}
