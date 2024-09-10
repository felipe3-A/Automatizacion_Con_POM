Feature: Social Red
  i need to see rhe red Social

  Scenario: See X
    Given he user enter in teh page
    When  he user enter the credentials
      | user           | password        |
      | standard_user  | secret_sauce    |
    And the user select a red X
    Then the user seen the page web X's

  Scenario: See Facebook
    Given he user enter in teh page
    When  he user enter the credentials
      | user           | password        |
      | standard_user  | secret_sauce    |
    And the user select a red facebook
    Then the user seen the page web facebook

  Scenario: See Linkedin
    Given he user enter in teh page
    When  he user enter the credentials
      | user           | password        |
      | standard_user  | secret_sauce    |
    And the user select a red Linkedin
    Then the user seen the page Linkedin