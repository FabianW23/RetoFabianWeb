#lenguage: en
#encoding: UTF-8
Feature: As user of automationpractice web page
  i want to search some products and buy them

  Scenario: buy products
    Given the user access to the home page
    When the user enter all login data correctly
    When The user search some products
    Then he can see the total value
    When The user pay the products
    Then The user can see the order confirmation message
      | Your order on My Store is complete. |