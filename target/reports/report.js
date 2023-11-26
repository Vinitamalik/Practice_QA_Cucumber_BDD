$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/feature/Test_3.feature");
formatter.feature({
  "name": "Logger Creation Functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Logger_Functionality"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Create Logger for \u003cLoggerType\u003e",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Create_Logger_for_Type_1_and_Type_2"
    }
  ]
});
formatter.step({
  "name": "Call lORA configuration API to create Logger using \"\u003cLoggerType\u003e\" and assert max 16 HEX chars only",
  "keyword": "Given "
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
  "name": "Return the Status Line as \"HTTP/1.1 201 Created\" and verify the status Line should be \"HTTP/1.1 201 Created\" in case of \"Creation of Loggers\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "LoggerType",
        "StatusCode"
      ]
    },
    {
      "cells": [
        "MR_812P",
        "201"
      ]
    },
    {
      "cells": [
        "MR_810T",
        "201"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Create Logger for MR_812P",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Logger_Functionality"
    },
    {
      "name": "@Create_Logger_for_Type_1_and_Type_2"
    }
  ]
});
formatter.step({
  "name": "Call lORA configuration API to create Logger using \"MR_812P\" and assert max 16 HEX chars only",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinition.Create_logger_Type(String)"
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
  "name": "user should get response status code as \"201\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.Invalid_cases(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Return the Status Line as \"HTTP/1.1 201 Created\" and verify the status Line should be \"HTTP/1.1 201 Created\" in case of \"Creation of Loggers\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.returnAndVerifyStatusLine(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create Logger for MR_810T",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Logger_Functionality"
    },
    {
      "name": "@Create_Logger_for_Type_1_and_Type_2"
    }
  ]
});
formatter.step({
  "name": "Call lORA configuration API to create Logger using \"MR_810T\" and assert max 16 HEX chars only",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinition.Create_logger_Type(String)"
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
  "name": "user should get response status code as \"201\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.Invalid_cases(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Return the Status Line as \"HTTP/1.1 201 Created\" and verify the status Line should be \"HTTP/1.1 201 Created\" in case of \"Creation of Loggers\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.returnAndVerifyStatusLine(String,String,String)"
});
formatter.result({
  "status": "passed"
});
});