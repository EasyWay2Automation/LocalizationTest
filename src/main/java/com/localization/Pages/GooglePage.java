package com.localization.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import com.localization.Utilities.Constants;
import com.localization.Utilities.ElementUtils;
import com.localization.Utilities.PropertiesReader;

public class GooglePage {
	
	ElementUtils element = new ElementUtils();
	PropertiesReader reader = new PropertiesReader();
	
	public WebElement getChangeToFrenchLink() throws IOException {
		return element.getWebElement(reader.getLanguageProperties(), Constants.XPATH, "lnk_ChangeToFrench");
	}

	public WebElement getGoogleSearchBtn() throws IOException {
		return element.getWebElement(reader.getLanguageProperties(), Constants.XPATH, "btn_GooleSearch");
	}
	public WebElement getFeelingLuckyBtn() throws IOException {
		return element.getWebElement(reader.getLanguageProperties(), Constants.XPATH, "btn_FeelinkLucky");
	}
}
