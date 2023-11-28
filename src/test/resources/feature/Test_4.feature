@Test_4_Functionality
Feature: Sensor Data creation

  @Logger_sending_Data_to_server
  Scenario Outline: Send data to server against the Logger number "<Scenario>"
    Given Call sensor API to create Logger using LoggerNumber "<Scenario>"
    Then Return the response Body
    Then user should get response status code as "<StatusCode>"
    And Return the Status Line as "HTTP/1.1 201 Created" and verify the status Line should be "HTTP/1.1 201 Created" in case of "Creation of Loggers"

    Examples:
      |Scenario                                | StatusCode |
      | Create sensor data for MR_812P         | 201        |
      | Create sensor data for MR_810T         | 201        |







