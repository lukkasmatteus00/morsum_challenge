package com.saucedemo.pages;

import com.microsoft.playwright.Page;

public class MenuPage {
    private Page page;

    public MenuPage(Page page) {
        this.page = page;
    }

    public void clickCartButton() {
        page.click("[class='shopping_cart_container']");
    }
}
