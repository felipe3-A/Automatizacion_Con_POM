Feature: Logout
  I need Logout
  Scenario: Logout Complete
    Given  he user enter in teh page
    When he user enter the credentials
      | user           | password        |
      | standard_user  | secret_sauce    |
    And he user go to Logout
    Then the user cold to be logout
