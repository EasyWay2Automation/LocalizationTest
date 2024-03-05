package com.localization.Utilities;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ElementUtils {

	public WebElement getWebElement(Properties p, String objectType, String objectName) {

			return DriverFactory.getDriver().findElement(getObject(p, objectType, objectName));

	}

	private By getObject(Properties p, String objectType, String objectname) {
		By object = null;
		switch(objectType.toUpperCase()) {
		case "ID":
			object = By.id(p.getProperty(objectname));
			break;
		case "XPATH":
		object = By.xpath(p.getProperty(objectname));
		break;
		case "CSS":
		object = By.cssSelector(p.getProperty(objectname));
		break;
		case "LINK TEXT":
		object = By.linkText(p.getProperty(objectname));
		break;
		case "PARTIAL LINK TEXT":
		object = By.partialLinkText(p.getProperty(objectname));
		break;
		case "NAME":
		object = By.name(p.getProperty(objectname));
		break;
		case "CLASS NAME":
		object = By.className(p.getProperty(objectname));
		break;
		case "TAG NAME":
		object = By.tagName(p.getProperty(objectname));
		break;
		default:
			System.out.println("Incorrect Object Type : " + objectType);

		}

		return object;

	}

}
