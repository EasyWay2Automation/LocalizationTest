package com.localization.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.localization.Pages.GooglePage;
import com.localization.Utilities.DriverFactory;
import com.localization.Utilities.PropertiesReader;

public class GoogleTest extends DriverFactory {
	
	PropertiesReader reader = new PropertiesReader();
	GooglePage googlePage = new GooglePage();
	
	@Test
	public void verifyGoogleSearchBtn() throws IOException {
		getDriver().get("https://www.google.com/");
		if(reader.getConfigProperties().get("language").equals("Fr")) {
			googlePage.getChangeToFrenchLink().click();
		}
		
		Assert.assertTrue(googlePage.getGoogleSearchBtn().isDisplayed());
		
	}
	
	@Test
	public void verifyFeelingLuckyhBtn() throws IOException {
		getDriver().get("https://www.google.com/");
		if(reader.getConfigProperties().get("language").equals("Fr")) {
			googlePage.getChangeToFrenchLink().click();
		}
		
		Assert.assertTrue(googlePage.getFeelingLuckyBtn().isDisplayed());
		
	}
	
	

}
