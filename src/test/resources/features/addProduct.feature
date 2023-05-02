#language: en
#Author: lukkasmatteus@gmail.com
Feature: ...

  Background:
    Given user open the saucedemo page

  @addProduct
  Scenario: [001] Add product to cart from PDP
    Given user logged into the app as 'standard_user'
    When user sorts by prices high to low
    And user selects second item from the list
    And user add this element to cart
    And user goes to cart
    Then user validate that all products selected are in the cart
