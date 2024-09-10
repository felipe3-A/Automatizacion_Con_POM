Feature: Search Element for List
  The user need use the list
  Scenario: Search and to Organize
    Given he user enter in teh page
    When  he user enter the credentials
      | user           | password        |
      | standard_user  | secret_sauce    |
    And the user select the select list
    Then the user seen info