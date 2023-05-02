package com.saucedemo.config;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public final class ConfigDriver{
	public static Browser setFireFoxBrowser() {
		 return Playwright.create()
				.firefox()
				.launch(new BrowserType.LaunchOptions()
						.setHeadless(false)
						.setSlowMo(500));
	}

	public static Page openPage(Browser browser,String url){
		Page page = browser.newPage();
		page.navigate(url);
		return page;
	}

	public static void finishDriver(Browser browser) {
		browser.close();
	}

}
