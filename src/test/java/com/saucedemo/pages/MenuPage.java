package com.saucedemo.pages;

import com.microsoft.playwright.Page;

import static org.junit.Assert.assertEquals;

public class MenuPage {
    private Page page;

    public MenuPage(Page page) {
        this.page = page;
    }

    public void clickCartButton() {
        page.click("[class='shopping_cart_container']");
    }

    public void assertCartItemsNumber(Integer expected){
        String actual = page.locator("[class='shopping_cart_badge']").textContent();
        assertEquals(expected.toString(), actual);
    }
}
