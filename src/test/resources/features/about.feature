Feature: About layouts
  i need see the layouts the About
  Scenario: Part one the About
    Given he user enter in teh page
    When he user enter the credentials
      | user           | password        |
      | standard_user  | secret_sauce    |
    And the user go to layout About
    Then the user will see the layout the About