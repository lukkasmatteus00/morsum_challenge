package com.saucedemo.pages;

import static org.junit.Assert.*;
import com.microsoft.playwright.Page;

import java.util.ArrayList;

public class CartPage {
    private Page page;

    public CartPage(Page page) {
        this.page = page;
    }

    public void assertProdudctsName(ArrayList<String> expected) {
        for (String productName: expected) {
            String actual = page.getByText(productName).first().textContent();
            assertEquals(productName, actual);
        }

    }
}
