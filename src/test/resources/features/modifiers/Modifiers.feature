@Web @Modifiers
Feature: Modifiers

  Scenario: Create Random Name Modifier with One Option
    Given User open moka backoffice login page
    And User input email "zakiakhmadf20@gmail.com" on backoffice login page
    And User input password "abc12345" on backoffice login page
    And User click Sign in on backoffice login page
    And User successfully login on backoffice
    When User go to menu modifiers on backoffice
    And User click Create Modifier button on modifier page
    And User input random modifier name
    And User click Add Options button
    And User click Add Options button on add options pop up
    And User input "Cheese" as the first option name
    And User input "7000" as the first option price
    And User click Save button on add options pop up
    And User click Save button on modifiers page
    Then User see successful created modifier message
    And User see that the created modifier exists

  Scenario: Create Random Name Modifier with No Option
    Given User open moka backoffice login page
    And User input email "zakiakhmadf20@gmail.com" on backoffice login page
    And User input password "abc12345" on backoffice login page
    And User click Sign in on backoffice login page
    And User successfully login on backoffice
    When User go to menu modifiers on backoffice
    And User click Create Modifier button on modifier page
    And User input random modifier name
    And User click Save button on modifiers page
    Then User see error message says to save at least one option