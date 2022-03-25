#lenguage: en
#encoding: UTF-8
Feature: As user of automationpractice web page
  i want to login on the page to be able to buy products

  Scenario: Login successfully
    Given the user access to the home page
    When the user enter all login data correctly
    Then the user can see his name in the page

  Scenario: Login failed
    Given the user access to the home page
    When the user enter all login with bad data
    Then the user can see an error message
      | Authentication failed. |