package com.saucedemo.pages;

import com.microsoft.playwright.Page;

public class InventaroryItemPage {

    private Page page;

    public InventaroryItemPage(Page page) {
        this.page = page;
    }

    public void clickAddToCart() {
        page.click(".btn_inventory");
    }
}