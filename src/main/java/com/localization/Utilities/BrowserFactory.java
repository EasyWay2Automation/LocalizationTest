package com.localization.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class BrowserFactory {
	
	public static WebDriver driver = null;
	
	public static WebDriver createDriverInstance(String browserType) {
		
		if(browserType.toUpperCase().equals("CHROME")) {
			ChromeOptions chromeOpt = new ChromeOptions();
			chromeOpt.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(chromeOpt);
		}else if(browserType.toUpperCase().equals("MS EDGE")) {
			EdgeOptions edgeOpt = new EdgeOptions();
			driver = new EdgeDriver(edgeOpt);			
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		return driver;
		
	}

}
