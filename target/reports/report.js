$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/feature/Test_2.feature");
formatter.feature({
  "name": "Token Generation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@TokenGeneration"
    }
  ]
});
formatter.scenario({
  "name": "createToken for Customer user and verify Status as \u0027200\u0027",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@TokenGeneration"
    },
    {
      "name": "@Generate_and_Get_Token_Value"
    }
  ]
});
formatter.step({
  "name": "Create the Token for customer user",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinition.createToken()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Return the response Body",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.returningResponseBody()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Return the Status code as \"200\" and verify the status code should be \"200\" in case of \"Token Generation\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.returnAndVerifyStatusCode(int,int,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Return the Status Line as \"HTTP/1.1 200 OK\" and verify the status Line should be \"HTTP/1.1 200 OK\" in case of \"Token Generation\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.returnAndVerifyStatusLine(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Get the Token Value",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.getToken()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "This is to verify the token bearer in case of Invalid \u003cScenario\u003e",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@createdToken_UnsingInvalidCredentials"
    }
  ]
});
formatter.step({
  "name": "user calls the Token api \"\u003cScenario\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Return the response Body",
  "keyword": "Then "
});
formatter.step({
  "name": "user should get response status code as \"\u003cStatusCode\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "response should contain \"\u003cerror_description\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Scenario",
        "StatusCode",
        "error_description"
      ]
    },
    {
      "cells": [
        "Invalid_UserName",
        "401",
        "Invalid user credentials"
      ]
    },
    {
      "cells": [
        "Invalid Password",
        "401",
        "Invalid user credentials"
      ]
    },
    {
      "cells": [
        "Invalid Client ID",
        "401",
        "Invalid client or Invalid client credentials"
      ]
    },
    {
      "cells": [
        "Invalid Grant_Type",
        "400",
        "Unsupported grant_type"
      ]
    }
  ]
});
formatter.scenario({
  "name": "This is to verify the token bearer in case of Invalid Invalid_UserName",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TokenGeneration"
    },
    {
      "name": "@createdToken_UnsingInvalidCredentials"
    }
  ]
});
formatter.step({
  "name": "user calls the Token api \"Invalid_UserName\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinition.Token_api(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Return the response Body",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.returningResponseBody()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should get response status code as \"401\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.Invalid_cases(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "response should contain \"Invalid user credentials\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.Invalid_Response(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "This is to verify the token bearer in case of Invalid Invalid Password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TokenGeneration"
    },
    {
      "name": "@createdToken_UnsingInvalidCredentials"
    }
  ]
});
formatter.step({
  "name": "user calls the Token api \"Invalid Password\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinition.Token_api(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Return the response Body",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.returningResponseBody()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should get response status code as \"401\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.Invalid_cases(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "response should contain \"Invalid user credentials\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.Invalid_Response(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "This is to verify the token bearer in case of Invalid Invalid Client ID",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TokenGeneration"
    },
    {
      "name": "@createdToken_UnsingInvalidCredentials"
    }
  ]
});
formatter.step({
  "name": "user calls the Token api \"Invalid Client ID\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinition.Token_api(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Return the response Body",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.returningResponseBody()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should get response status code as \"401\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.Invalid_cases(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "response should contain \"Invalid client or Invalid client credentials\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.Invalid_Response(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "This is to verify the token bearer in case of Invalid Invalid Grant_Type",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TokenGeneration"
    },
    {
      "name": "@createdToken_UnsingInvalidCredentials"
    }
  ]
});
formatter.step({
  "name": "user calls the Token api \"Invalid Grant_Type\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinition.Token_api(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Return the response Body",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.returningResponseBody()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should get response status code as \"400\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.Invalid_cases(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "response should contain \"Unsupported grant_type\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.Invalid_Response(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "This is to verify the token bearer in case of Invalid \u003cScenario\u003e",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@createdToken_using_Unsupported_ContentType"
    }
  ]
});
formatter.step({
  "name": "user calls the Token api \"\u003cScenario\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Return the response Body",
  "keyword": "Then "
});
formatter.step({
  "name": "user should get response status code as \"\u003cStatusCode\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "response should contain error \"\u003cerror\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Scenario",
        "StatusCode",
        "error"
      ]
    },
    {
      "cells": [
        "Unsupported Conetent_Type",
        "415",
        "RESTEASY003065: Cannot consume content type"
      ]
    }
  ]
});
formatter.scenario({
  "name": "This is to verify the token bearer in case of Invalid Unsupported Conetent_Type",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@TokenGeneration"
    },
    {
      "name": "@createdToken_using_Unsupported_ContentType"
    }
  ]
});
formatter.step({
  "name": "user calls the Token api \"Unsupported Conetent_Type\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinition.Token_api(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Return the response Body",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.returningResponseBody()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should get response status code as \"415\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.Invalid_cases(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "response should contain error \"RESTEASY003065: Cannot consume content type\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.Invalid_Content_Type(String)"
});
formatter.result({
  "status": "passed"
});
});