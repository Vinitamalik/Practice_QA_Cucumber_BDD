$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/feature/Test_1.feature");
formatter.feature({
  "name": "Battery Replacements and Dynamically set the battery level configuration",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Customer dynamically selects locations for battery replacements",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the customer has access to the cloud platform",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinition.Select_Location()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the customer dynamically selects specific locations for battery replacements",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinition.Select_Location_when()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the system should use these selected locations for battery replacements",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.Select_Location_Then()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Customer dynamically sets battery level threshold configuration",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the customer has access to the cloud platform",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinition.Select_Location()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the customer dynamically sets the battery level configuration",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinition.Set_Location_when()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the system should use this configuration for monitoring battery levels",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.Set_Location_then()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "LED blinks when battery level is below the threshold in selected locations",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the battery level of a logger is below the dynamically set threshold",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinition.battery()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the logger is in a location selected for battery replacements",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.location()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the system checks the battery level",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinition.Set_level()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the LED outside the logger should blink",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.Set_blink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the LED in other locations should remain off",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.Set_off()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Customer replaces the battery in selected locations",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the system has identified a logger in a location for battery replacement",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinition.replace()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the customer initiates the battery replacement process",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinition.Set()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the system should update the battery with a new one",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.update()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the logger should resume normal operation",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.resume()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/feature/Test_2.feature");
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
formatter.uri("file:src/test/resources/feature/Test_3.feature");
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
formatter.scenarioOutline({
  "name": "Create Logger for negative \u003cScenario\u003e",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Create_Logger_for_Type_1_and_Type_2_All_negative_cases"
    }
  ]
});
formatter.step({
  "name": "Call lORA configuration API to create Logger using \"\u003cLoggerType\u003e\" and \"\u003cloggerNumber\u003e\" against \"\u003cScenario\u003e\"",
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
  "name": "response should contain message \"\u003cmessage\u003e\"",
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
        "LoggerType",
        "loggerNumber",
        "StatusCode",
        "message"
      ]
    },
    {
      "cells": [
        "Using Non-Hex 16 chars key",
        "MR_812P",
        "012345QRT89AFBCD",
        "400",
        "Hex id 01YU45QRT89AFBCD  couldn\u0027t be parsed"
      ]
    },
    {
      "cells": [
        "Using Non-Hex 16 chars key",
        "MR_810T",
        "01YU45QRT89AFBCD",
        "400",
        "Hex id 01YU45QRT89AFBCD  couldn\u0027t be parsed"
      ]
    },
    {
      "cells": [
        "Using 17 Hex Chars Key",
        "MR_812P",
        "0123456789AFBCDE1",
        "400",
        "Hex id 0123456789AFBCDE1 couldn\u0027t be parsed"
      ]
    },
    {
      "cells": [
        "Using 20 Hex Chars Key",
        "MR_810T",
        "0123456789AFBCDE1234",
        "400",
        "Hex id 0123456789AFBCDE1234 couldn\u0027t be parsed"
      ]
    },
    {
      "cells": [
        "Using 0 chars Hex Key",
        "MR_810T",
        "",
        "400",
        "Hex id   couldn\u0027t be parsed"
      ]
    },
    {
      "cells": [
        "Using 0 chars Hex Key",
        "MR_812P",
        "",
        "400",
        "Hex id   couldn\u0027t be parsed"
      ]
    },
    {
      "cells": [
        "Using Invalid Logger Type",
        "810T",
        "0123456789AFBCDE",
        "400",
        "Server Error: Cannot deserialize value of type `ch.skycell.repository.entities.enums.DeviceType` from String \\\"810T\\\": not one of the values accepted for Enum class: [MR_813, MR_812P, MR_815, CL_TT_7100, MR_810T, SKYCELL_SAVY_BLE, CARTASENSE_M, CARTASENSE, MR_814, SKYCELL, LIBERO_GL, CL_BUTTERFLY]\n at [Source: (io.quarkus.vertx.http.runtime.VertxInputStream); line: 1, column: 15] (through reference chain: ch.skycell.lora.configuration.dto.LoraConfigurationDto[\\\"loggerType\\\"])"
      ]
    },
    {
      "cells": [
        "Using without Logger Type",
        "",
        "0123456789AFBCDE",
        "400",
        "Server Error: Cannot coerce empty String (\\\"\\\") to `ch.skycell.repository.entities.enums.DeviceType` value (but could if coercion was enabled using `CoercionConfig`)\n at [Source: (io.quarkus.vertx.http.runtime.VertxInputStream); line: 1, column: 15] (through reference chain: ch.skycell.lora.configuration.dto.LoraConfigurationDto[\\\"loggerType\\\"])"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Create Logger for negative Using Non-Hex 16 chars key",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Logger_Functionality"
    },
    {
      "name": "@Create_Logger_for_Type_1_and_Type_2_All_negative_cases"
    }
  ]
});
formatter.step({
  "name": "Call lORA configuration API to create Logger using \"MR_812P\" and \"012345QRT89AFBCD\" against \"Using Non-Hex 16 chars key\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinition.Positive_Negative_cases(String,String,String)"
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
  "name": "response should contain message \"Hex id 01YU45QRT89AFBCD  couldn\u0027t be parsed\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.messages(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create Logger for negative Using Non-Hex 16 chars key",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Logger_Functionality"
    },
    {
      "name": "@Create_Logger_for_Type_1_and_Type_2_All_negative_cases"
    }
  ]
});
formatter.step({
  "name": "Call lORA configuration API to create Logger using \"MR_810T\" and \"01YU45QRT89AFBCD\" against \"Using Non-Hex 16 chars key\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinition.Positive_Negative_cases(String,String,String)"
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
  "name": "response should contain message \"Hex id 01YU45QRT89AFBCD  couldn\u0027t be parsed\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.messages(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create Logger for negative Using 17 Hex Chars Key",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Logger_Functionality"
    },
    {
      "name": "@Create_Logger_for_Type_1_and_Type_2_All_negative_cases"
    }
  ]
});
formatter.step({
  "name": "Call lORA configuration API to create Logger using \"MR_812P\" and \"0123456789AFBCDE1\" against \"Using 17 Hex Chars Key\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinition.Positive_Negative_cases(String,String,String)"
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
  "error_message": "java.lang.AssertionError: verify Expected400201\nExpected: \u003c201\u003e\n     but: was \u003c400\u003e\r\n\tat org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:20)\r\n\tat Common.ApiHelper.assertStatusCode(ApiHelper.java:165)\r\n\tat PageFactory.Implementation_Class.status_code(Implementation_Class.java:129)\r\n\tat StepDefinition.stepdefinition.Invalid_cases(stepdefinition.java:62)\r\n\tat ✽.user should get response status code as \"400\"(file:src/test/resources/feature/Test_3.feature:21)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "response should contain message \"Hex id 0123456789AFBCDE1 couldn\u0027t be parsed\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.messages(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Create Logger for negative Using 20 Hex Chars Key",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Logger_Functionality"
    },
    {
      "name": "@Create_Logger_for_Type_1_and_Type_2_All_negative_cases"
    }
  ]
});
formatter.step({
  "name": "Call lORA configuration API to create Logger using \"MR_810T\" and \"0123456789AFBCDE1234\" against \"Using 20 Hex Chars Key\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinition.Positive_Negative_cases(String,String,String)"
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
  "name": "response should contain message \"Hex id 0123456789AFBCDE1234 couldn\u0027t be parsed\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.messages(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create Logger for negative Using 0 chars Hex Key",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Logger_Functionality"
    },
    {
      "name": "@Create_Logger_for_Type_1_and_Type_2_All_negative_cases"
    }
  ]
});
formatter.step({
  "name": "Call lORA configuration API to create Logger using \"MR_810T\" and \"\" against \"Using 0 chars Hex Key\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinition.Positive_Negative_cases(String,String,String)"
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
  "name": "response should contain message \"Hex id   couldn\u0027t be parsed\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.messages(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create Logger for negative Using 0 chars Hex Key",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Logger_Functionality"
    },
    {
      "name": "@Create_Logger_for_Type_1_and_Type_2_All_negative_cases"
    }
  ]
});
formatter.step({
  "name": "Call lORA configuration API to create Logger using \"MR_812P\" and \"\" against \"Using 0 chars Hex Key\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinition.Positive_Negative_cases(String,String,String)"
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
  "name": "response should contain message \"Hex id   couldn\u0027t be parsed\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.messages(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create Logger for negative Using Invalid Logger Type",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Logger_Functionality"
    },
    {
      "name": "@Create_Logger_for_Type_1_and_Type_2_All_negative_cases"
    }
  ]
});
formatter.step({
  "name": "Call lORA configuration API to create Logger using \"810T\" and \"0123456789AFBCDE\" against \"Using Invalid Logger Type\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinition.Positive_Negative_cases(String,String,String)"
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
  "error_message": "java.lang.AssertionError: verify Expected400500\nExpected: \u003c500\u003e\n     but: was \u003c400\u003e\r\n\tat org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:20)\r\n\tat Common.ApiHelper.assertStatusCode(ApiHelper.java:165)\r\n\tat PageFactory.Implementation_Class.status_code(Implementation_Class.java:129)\r\n\tat StepDefinition.stepdefinition.Invalid_cases(stepdefinition.java:62)\r\n\tat ✽.user should get response status code as \"400\"(file:src/test/resources/feature/Test_3.feature:21)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "response should contain message \"Server Error: Cannot deserialize value of type `ch.skycell.repository.entities.enums.DeviceType` from String \\\"810T\\\": not one of the values accepted for Enum class: [MR_813, MR_812P, MR_815, CL_TT_7100, MR_810T, SKYCELL_SAVY_BLE, CARTASENSE_M, CARTASENSE, MR_814, SKYCELL, LIBERO_GL, CL_BUTTERFLY]\n at [Source: (io.quarkus.vertx.http.runtime.VertxInputStream); line: 1, column: 15] (through reference chain: ch.skycell.lora.configuration.dto.LoraConfigurationDto[\\\"loggerType\\\"])\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.messages(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Create Logger for negative Using without Logger Type",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Logger_Functionality"
    },
    {
      "name": "@Create_Logger_for_Type_1_and_Type_2_All_negative_cases"
    }
  ]
});
formatter.step({
  "name": "Call lORA configuration API to create Logger using \"\" and \"0123456789AFBCDE\" against \"Using without Logger Type\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinition.Positive_Negative_cases(String,String,String)"
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
  "error_message": "java.lang.AssertionError: verify Expected400500\nExpected: \u003c500\u003e\n     but: was \u003c400\u003e\r\n\tat org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:20)\r\n\tat Common.ApiHelper.assertStatusCode(ApiHelper.java:165)\r\n\tat PageFactory.Implementation_Class.status_code(Implementation_Class.java:129)\r\n\tat StepDefinition.stepdefinition.Invalid_cases(stepdefinition.java:62)\r\n\tat ✽.user should get response status code as \"400\"(file:src/test/resources/feature/Test_3.feature:21)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "response should contain message \"Server Error: Cannot coerce empty String (\\\"\\\") to `ch.skycell.repository.entities.enums.DeviceType` value (but could if coercion was enabled using `CoercionConfig`)\n at [Source: (io.quarkus.vertx.http.runtime.VertxInputStream); line: 1, column: 15] (through reference chain: ch.skycell.lora.configuration.dto.LoraConfigurationDto[\\\"loggerType\\\"])\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.messages(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenarioOutline({
  "name": "Create Logger for Invalid \u003cInvalid_Content\u003e",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Invalid_Content_type"
    }
  ]
});
formatter.step({
  "name": "Call lORA configuration API to create Logger using \"\u003cLoggerType\u003e\" and \"\u003cloggerNumber\u003e\" against \"\u003cInvalid_Content\u003e\"",
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
        "Invalid_Content",
        "LoggerType",
        "loggerNumber",
        "StatusCode",
        "error"
      ]
    },
    {
      "cells": [
        "Invalid Content Type",
        "MR_812P",
        "012345678",
        "415",
        "RESTEASY003065: Cannot consume content type"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Create Logger for Invalid Invalid Content Type",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Logger_Functionality"
    },
    {
      "name": "@Invalid_Content_type"
    }
  ]
});
formatter.step({
  "name": "Call lORA configuration API to create Logger using \"MR_812P\" and \"012345678\" against \"Invalid Content Type\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinition.Positive_Negative_cases(String,String,String)"
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
formatter.scenarioOutline({
  "name": "Create Logger for Invalid Auth \u003cAuth_Scenario\u003e",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Invalid_Authorization"
    }
  ]
});
formatter.step({
  "name": "Call lORA configuration API to create Logger using \"\u003cLoggerType\u003e\" and \"\u003cloggerNumber\u003e\" against \"\u003cAuth_Scenario\u003e\"",
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
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Auth_Scenario",
        "LoggerType",
        "loggerNumber",
        "StatusCode"
      ]
    },
    {
      "cells": [
        "Invalid API KEY",
        "MR_810T",
        "012345678",
        "403"
      ]
    },
    {
      "cells": [
        "Empty API KEy",
        "MR_812P",
        "012345678",
        "403"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Create Logger for Invalid Auth Invalid API KEY",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Logger_Functionality"
    },
    {
      "name": "@Invalid_Authorization"
    }
  ]
});
formatter.step({
  "name": "Call lORA configuration API to create Logger using \"MR_810T\" and \"012345678\" against \"Invalid API KEY\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinition.Positive_Negative_cases(String,String,String)"
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
  "name": "user should get response status code as \"403\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.Invalid_cases(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Create Logger for Invalid Auth Empty API KEy",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Logger_Functionality"
    },
    {
      "name": "@Invalid_Authorization"
    }
  ]
});
formatter.step({
  "name": "Call lORA configuration API to create Logger using \"MR_812P\" and \"012345678\" against \"Empty API KEy\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinition.Positive_Negative_cases(String,String,String)"
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
  "name": "user should get response status code as \"403\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.Invalid_cases(String)"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/feature/Test_4.feature");
formatter.feature({
  "name": "Sensor Data creation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Test_4_Functionality"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Send data to server against the Logger number \"\u003cScenario\u003e\"",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Logger_sending_Data_to_server"
    }
  ]
});
formatter.step({
  "name": "Call sensor API to create Logger using LoggerNumber \"\u003cScenario\u003e\"",
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
        "Scenario",
        "StatusCode"
      ]
    },
    {
      "cells": [
        "Create sensor data for MR_812P",
        "201"
      ]
    },
    {
      "cells": [
        "Create sensor data for MR_810T",
        "201"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Send data to server against the Logger number \"Create sensor data for MR_812P\"",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Test_4_Functionality"
    },
    {
      "name": "@Logger_sending_Data_to_server"
    }
  ]
});
formatter.step({
  "name": "Call sensor API to create Logger using LoggerNumber \"Create sensor data for MR_812P\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinition.Send_Sensor_Data(String)"
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
  "name": "Send data to server against the Logger number \"Create sensor data for MR_810T\"",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Test_4_Functionality"
    },
    {
      "name": "@Logger_sending_Data_to_server"
    }
  ]
});
formatter.step({
  "name": "Call sensor API to create Logger using LoggerNumber \"Create sensor data for MR_810T\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinition.Send_Sensor_Data(String)"
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