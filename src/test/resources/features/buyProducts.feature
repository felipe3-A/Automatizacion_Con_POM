Feature: Buy products
  i need buy a product
  Scenario: Buy Product
    Given he user enter in teh page
    When he user select a product
      | user           | password        |
      | standard_user  | secret_sauce    |
      And he user complete the dates for the buy
      |name     |last_name   | zip           |
      |Andres   |Gonzalez    |  Cra 3 N34    |
    Then he user seen the products

  Scenario: Delete Product
    Given he user enter in teh page
    When he user select a product
      | user           | password        |
      | standard_user  | secret_sauce    |
    And the user select a product for delete
    Then the user would have deleted a product

    Scenario: See Product
      Given he user enter in teh page
      When he user enter the credentials
        | user           | password        |
        | standard_user  | secret_sauce    |
      And the user select a product
      Then the user seen info the product

  Scenario: Register Incomplete
    Given he user enter in teh page
    When he user enter the credentials
      | user           | password        |
      | standard_user  | secret_sauce    |
    And the user ignore a buttons
    Then the user seen ia message error

