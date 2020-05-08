@Web @Categories
Feature: Categories

  Scenario: Create Categories
    Given User open moka backoffice login page
    And User input email "zakiakhmadf20@gmail.com" on backoffice login page
    And User input password "abc12345" on backoffice login page
    And User click Sign in on backoffice login page
    And User successfully login on backoffice
    When User go to menu categories on backoffice
    And User click Create Category button on categories page
    And User input random category name
    And User click Save button on categories page
    Then User see successful created category message
    And User see that the created category exists

  Scenario: Create Category with Not Adding Name
    Given User open moka backoffice login page
    And User input email "zakiakhmadf20@gmail.com" on backoffice login page
    And User input password "abc12345" on backoffice login page
    And User click Sign in on backoffice login page
    And User successfully login on backoffice
    When User go to menu categories on backoffice
    And User click Create Category button on categories page
    And User click Save button on categories page
    Then User see red border on category name field


