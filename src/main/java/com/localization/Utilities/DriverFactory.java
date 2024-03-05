package com.localization.Utilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class DriverFactory {
	
	public static ThreadLocal<WebDriver> threadLocal = new ThreadLocal<WebDriver>();
	
	@Parameters({"browser"})
	@BeforeMethod
	public void setDriver(String browserType) {
		threadLocal.set(BrowserFactory.createDriverInstance(browserType));
	}
	
	public static WebDriver getDriver() {
		return threadLocal.get();
	}
	
	@AfterMethod
	public void closeDriver() {
		if(getDriver() != null) {
			getDriver().quit();
		}
		threadLocal.remove();	
	}

}
