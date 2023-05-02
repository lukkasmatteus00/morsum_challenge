$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/addProduct.feature");
formatter.feature({
  "name": "Add product to cart",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user open the saucedemo page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.user_open_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logged into the app as \u0027standard_user\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.user_logged_into_the_app_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user sorts by prices high to low",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.user_sorts_by_prices_high_to_low()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "[002] Add product \"Sauce Labs Bike Light\" to cart from PDP",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@addProduct"
    }
  ]
});
formatter.step({
  "name": "user selects \u0027Sauce Labs Bike Light\u0027 product from the list",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.user_selects_product_from_the_list(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user add this element to cart",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.user_add_this_element_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user goes to cart",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.user_goes_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user validate that all products selected are in the cart",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.user_validate_that_all_products_selected_are_in_the_cart()"
});
formatter.result({
  "status": "passed"
});
});