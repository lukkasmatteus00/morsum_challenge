package com.saucedemo.pages;

import com.microsoft.playwright.Page;

public class InventaroryPage {

    private Page page;

    public InventaroryPage(Page page) {
        this.page = page;
    }

    public void clickFilter(String option) {
        String selector = "[data-test='product_sort_container']";
        page.click(selector);
        page.selectOption(selector, option);
    }

    public void selectItemByPosition(Integer position) {
        page.click("#inventory_container > div > div:nth-child("+position+") div.inventory_item_label > a");
    }

    public void addItemByPosition(Integer position) {
        page.click("#inventory_container > div > div:nth-child("+position+") button");
    }

    public void selectItemByName(String productName) {
        page.click("text="+productName);
    }

    public String getItemName(Integer position) {
        if (position == 1)
            return page.locator("#inventory_container > div > div:nth-child("+position+") div.inventory_item_label > a").first().textContent();
        else
            return page.locator("#inventory_container > div > div:nth-child("+position+") div.inventory_item_label > a").textContent();
    }


    public void clickRemoveToCart(Integer position) {
        page.locator("btn_inventory").getByAltText("Remove").click();
    }

}