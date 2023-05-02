package com.saucedemo.pages;

import static org.junit.Assert.*;
import com.microsoft.playwright.Page;

public class CartPage {
    private Page page;

    public CartPage(Page page) {
        this.page = page;
    }

    public void assertItem(String expected) {
        String actual = page.locator("[class='inventory_item_name']").textContent();
        assertEquals(expected, actual);
    }

    public void assertQuantanty(Integer expected) {
        String actual = page.locator("[class='cart_quantity']").textContent();
        assertEquals(expected.toString(), actual);
    }
}
