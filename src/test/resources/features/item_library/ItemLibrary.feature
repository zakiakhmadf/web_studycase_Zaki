@Web @ItemLibrary
Feature: Item Library

  Scenario: Create Item
    Given User open moka backoffice login page
    And User input email "zakiakhmadf20@gmail.com" on backoffice login page
    And User input password "abc12345" on backoffice login page
    And User click Sign in on backoffice login page
    And User successfully login on backoffice
    When User go to menu item library on backoffice
    And User click Create Item button on item library page
    And User input random item name
    And User input "Pasta" as category
    And User click Add Variant button on item library page
    And User click add Variant button on add variant pop up
    And User input "Medium" as first variant name
    And User input random first variant price
    And User input random first variant SKU
    And User input "Large" as second variant name
    And User input random second variant price
    And User input random second variant SKU
    And User click Confirm button on add variant pop up
    And User choose "Toppings" as modifier
    And User click Save button on item library page
    Then User see successful created item message
    And User see that the created item exists
#    When User is on moka start page
#    And User click sign in button on moka start page
#    And User input email "zakiakhmadf20@gmail.com" on moka sign in page
#    And User input password "abc12345" on moka sign in page
#    And User click Sign in button on moka sign in page
#    And User click Library menu on moka POS page
#    And User choose random category that has been created
#    And User choose the item in that category
#    And User click Save Button on the order pop up
#    And User click charge on library page
#    And User choose suggested exact cash to pay on checkout popup
#    And User click charge on checkout pop up
#    Then User is on receipt page
