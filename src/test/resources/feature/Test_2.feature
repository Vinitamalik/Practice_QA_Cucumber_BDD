@TokenGeneration
Feature: Token Generation

  @Generate_and_Get_Token_Value
  Scenario: createToken for Customer user and verify Status as '200'
    When Create the Token for customer user
    Then Return the response Body
    And Return the Status code as "200" and verify the status code should be "200" in case of "Token Generation"
    And Return the Status Line as "HTTP/1.1 200 OK" and verify the status Line should be "HTTP/1.1 200 OK" in case of "Token Generation"
    # This step to store the token and it in all test cases.
    And Get the Token Value

  @createdToken_UnsingInvalidCredentials
  Scenario Outline: This is to verify the token bearer in case of Invalid <Scenario>
    When user calls the Token api "<Scenario>"
    Then Return the response Body
     Then user should get response status code as "<StatusCode>"
     Then response should contain "<error_description>"

    Examples:
      | Scenario                   | StatusCode | error_description                                                       |
      | Invalid_UserName           | 401        | Invalid user credentials             |
      | Invalid Password           | 401        | Invalid user credentials  |
      | Invalid Client ID          | 401        | Invalid client or Invalid client credentials |
      | Invalid Grant_Type         | 400        | Unsupported grant_type |


  @createdToken_using_Unsupported_ContentType
  Scenario Outline: This is to verify the token bearer in case of Invalid <Scenario>
    When user calls the Token api "<Scenario>"
    Then Return the response Body
    Then user should get response status code as "<StatusCode>"
    Then response should contain error "<error>"

    Examples:
      | Scenario                   | StatusCode | error                                       |
      | Unsupported Conetent_Type  | 415        | RESTEASY003065: Cannot consume content type |



