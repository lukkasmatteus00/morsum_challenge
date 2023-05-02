#language: en
#Author: lukkasmatteus@gmail.com
Feature: Add product to cart

  Background:
    Given user open the saucedemo page
    And user logged into the app as 'standard_user'
    When user sorts by prices high to low

  @addSecondItem
  Scenario: [001] Add product to cart from PDP
    When user selects second item from the list
    And user add this element to cart
    And user goes to cart
    Then user validate that all products selected are in the cart

  @addProduct
  Scenario: [002] Add product "Sauce Labs Bike Light" to cart from PDP
    When user selects 'Sauce Labs Bike Light' product from the list
    And user add this element to cart
    And user goes to cart
    Then user validate that all products selected are in the cart
