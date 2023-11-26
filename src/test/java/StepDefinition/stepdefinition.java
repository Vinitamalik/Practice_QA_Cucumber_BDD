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

    @Given("Call sensor API to create Logger using LoggerNumber {string}")
    public void Send_Sensor_Data(String Scenario) throws Throwable {
        pg.create_Sensor_Data(Scenario);
    }

    /** Battery Level : Test 1**/

    @Given("the customer has access to the cloud platform")
    public void Select_Location() throws Throwable {

    }
    @When("the customer dynamically selects specific locations for battery replacements")
    public void Select_Location_when() throws Throwable {

    }
    @Then("the system should use these selected locations for battery replacements")
    public void Select_Location_Then() throws Throwable {

    }

    @Given("the battery level of a logger is below the dynamically set threshold")
    public void battery() throws Throwable {

    }
    @When("the customer dynamically sets the battery level configuration")
    public void Set_Location_when() throws Throwable {

    }
    @Then("the system should use this configuration for monitoring battery levels")
    public void Set_Location_then() throws Throwable {

    }

    @And("the logger is in a location selected for battery replacements")
    public void location() throws Throwable {

    }
    @When("the system checks the battery level")
    public void Set_level() throws Throwable {

    }
    @When("the LED outside the logger should blink")
    public void Set_blink() throws Throwable {

    }
    @When("the LED in other locations should remain off")
    public void Set_off() throws Throwable {

    }

    @When("the system has identified a logger in a location for battery replacement")
    public void replace() throws Throwable {

    }
    @When("the customer initiates the battery replacement process")
    public void Set() throws Throwable {

    }
    @When("the system should update the battery with a new one")
    public void update() throws Throwable {

    }
    @When("the logger should resume normal operation")
    public void resume() throws Throwable {

    }



}
