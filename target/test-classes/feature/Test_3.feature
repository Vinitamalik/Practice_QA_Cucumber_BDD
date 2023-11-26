@Logger_Functionality
Feature: Logger Creation Functionality

  @Create_Logger_for_Type_1_and_Type_2
  Scenario Outline: Create Logger for <LoggerType>
    Given Call lORA configuration API to create Logger using "<LoggerType>" and assert max 16 HEX chars only
    Then Return the response Body
    Then user should get response status code as "<StatusCode>"
    And Return the Status Line as "HTTP/1.1 201 Created" and verify the status Line should be "HTTP/1.1 201 Created" in case of "Creation of Loggers"

    Examples:
      | LoggerType                   | StatusCode |
      | MR_812P                       | 201        |
      | MR_810T                       | 201        |


  @Create_Logger_for_Type_1_and_Type_2_All_negative_cases
  Scenario Outline: Create Logger for negative <Scenario>
    Given Call lORA configuration API to create Logger using "<LoggerType>" and "<loggerNumber>" against "<Scenario>"
    Then Return the response Body
    Then user should get response status code as "<StatusCode>"
    Then response should contain message "<message>"


    Examples:
  |Scenario                            | LoggerType      |loggerNumber          | StatusCode|  message                                         |
  | Using Non-Hex 16 chars key         | MR_812P         | 012345QRT89AFBCD     | 400       |  Hex id 01YU45QRT89AFBCD  couldn't be parsed      |
  | Using Non-Hex 16 chars key         | MR_810T         | 01YU45QRT89AFBCD     | 400       |  Hex id 01YU45QRT89AFBCD  couldn't be parsed      |
  | Using 17 Hex Chars Key             | MR_812P         | 0123456789AFBCDE1    | 400       |  Hex id 0123456789AFBCDE1 couldn't be parsed     |
  | Using 20 Hex Chars Key             | MR_810T         | 0123456789AFBCDE1234 | 400       |  Hex id 0123456789AFBCDE1234 couldn't be parsed   |
  | Using 0 chars Hex Key              | MR_810T         |                      | 400       |  Hex id   couldn't be parsed                                                |
  | Using 0 chars Hex Key              | MR_812P         |                      | 400       |  Hex id   couldn't be parsed                                                 |
  | Using Invalid Logger Type          | 810T            | 0123456789AFBCDE     | 500       |  Server Error: Cannot deserialize value of type `ch.skycell.repository.entities.enums.DeviceType` from String \"810T\": not one of the values accepted for Enum class: [MR_813, MR_812P, MR_815, CL_TT_7100, MR_810T, SKYCELL_SAVY_BLE, CARTASENSE_M, CARTASENSE, MR_814, SKYCELL, LIBERO_GL, CL_BUTTERFLY]\n at [Source: (io.quarkus.vertx.http.runtime.VertxInputStream); line: 1, column: 15] (through reference chain: ch.skycell.lora.configuration.dto.LoraConfigurationDto[\"loggerType\"])                                                |
  | Using without Logger Type          |                 | 0123456789AFBCDE     | 500       |  Server Error: Cannot coerce empty String (\"\") to `ch.skycell.repository.entities.enums.DeviceType` value (but could if coercion was enabled using `CoercionConfig`)\n at [Source: (io.quarkus.vertx.http.runtime.VertxInputStream); line: 1, column: 15] (through reference chain: ch.skycell.lora.configuration.dto.LoraConfigurationDto[\"loggerType\"])                                                |

  @Invalid_Content_type
  Scenario Outline: Create Logger for Invalid <Invalid_Content>
    Given Call lORA configuration API to create Logger using "<LoggerType>" and "<loggerNumber>" against "<Invalid_Content>"
    Then Return the response Body
    Then user should get response status code as "<StatusCode>"
    Then response should contain error "<error>"


    Examples:
      |Invalid_Content                    | LoggerType      |loggerNumber         | StatusCode|  error                                         |
      |Invalid Content Type               | MR_812P         | 012345678            |  415     |  RESTEASY003065: Cannot consume content type      |

  @Invalid_Authorization
  Scenario Outline: Create Logger for Invalid Auth <Auth_Scenario>
    Given Call lORA configuration API to create Logger using "<LoggerType>" and "<loggerNumber>" against "<Auth_Scenario>"
    Then Return the response Body
    Then user should get response status code as "<StatusCode>"

    Examples:
      |Auth_Scenario                       | LoggerType      |loggerNumber          | StatusCode|
      | Invalid API KEY                    | MR_810T         | 012345678            | 403       |
      | Empty API KEy                      | MR_812P         | 012345678            | 403       |



