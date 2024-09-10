Feature: Login Successful
  i need Login
  Scenario: Login successful
    Given he user enter in teh page
    When he user enter the credentials
      | user                      | password        |
      | standard_user             | secret_sauce    |
    Then  he user could login

  Scenario: Login incorrect
    i not need a product
    Given he user enter in teh page
    When he user enter the credentials incorrects
      | user           | password        |
      | stand_user  | ret_sauce    |
    Then  he user not could login


