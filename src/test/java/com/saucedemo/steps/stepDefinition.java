package com.saucedemo.steps;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.saucedemo.config.ConfigDriver;
import com.saucedemo.pages.*;
import cucumber.api.java.en.*;

public class stepDefinition {
    LoginPage loginPage;
    InventaroryPage inventaroryPage;
    InventaroryItemPage inventaroryItemPage;
    CartPage cartPage;
    MenuPage menuPage;
    Browser browser;
    Page page;
    String itemName = "";

    @Given("user open the saucedemo page")
    public void user_open_the_browser() {
        browser = ConfigDriver.setFireFoxBrowser();
        page = ConfigDriver.openPage(browser, "https://www.saucedemo.com/");
        loginPage = new LoginPage(page);
        inventaroryPage = new InventaroryPage(page);
        inventaroryItemPage = new InventaroryItemPage(page);
        menuPage = new MenuPage(page);
        cartPage = new CartPage(page);
    }

    @Given("user logged into the app as {string}")
    public void user_logged_into_the_app_as(String user){
        loginPage.inputUserName(user);
        loginPage.inputPassword("secret_sauce");
        loginPage.clickLoginButton();
    }

    @When("user sorts by prices high to low")
    public void user_sorts_by_prices_high_to_low(){
        inventaroryPage.clickFilter("hilo");
    }

    @When("user selects second item from the list")
    public void user_selects_second_item_from_the_list(){
        Integer position = 2;
        itemName = inventaroryPage.getItemName(position);
        inventaroryPage.selectItem(position);
    }

    @When("user add this element to cart")
    public void user_add_this_element_to_cart(){
        inventaroryItemPage.clickAddToCart();
    }

    @When("user goes to cart")
    public void user_goes_to_cart(){
        menuPage.clickCartButton();
    }

    @Then("user validate that all products selected are in the cart")
    public void user_validate_that_all_products_selected_are_in_the_cart(){
        cartPage.assertItem(itemName);
        cartPage.assertQuantanty(1);

        ConfigDriver.finishDriver(browser);
    }
}
