package com.saucedemo.pages;

import com.microsoft.playwright.Page;
import static org.junit.Assert.*;

import java.util.List;
import java.util.stream.Collectors;

public class LoginPage {

    private Page page;

    public LoginPage(Page page) {
        this.page = page;
    }

    public void inputUserName(String userName) {
        page.fill("[data-test='username']", userName);
    }

    public void inputPassword(String password) {
        page.fill("[data-test='password']", password);
    }

    public void clickLoginButton() {
        page.click("[data-test='login-button']");
    }

    public void assertErrorMessage(String expected) {
        String value = page.locator("[data-test='error']").toString();
        assertEquals("Error Message", expected, value);
    }

    public void assertLogo(String expected) {
        String value = page.locator(".login_logo").toString();
        assertEquals("Error Message", expected, value);
    }

}