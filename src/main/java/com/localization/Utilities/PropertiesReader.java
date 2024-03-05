package com.localization.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

	Properties p = new Properties();
	File file = null;
	FileInputStream inputStream = null;

	public Properties getConfigProperties() throws IOException {
		file = new File("./src/main/resources/configuration/config.properties");
		inputStream = new FileInputStream(file);
		p.load(inputStream);
		return p;
	}

	public Properties getLanguageProperties() throws IOException {
		if(getConfigProperties().getProperty("language").equals("Fr")) {
			file = new File("./src/main/resources/configuration/fr.properties");
		}else {
			file = new File("./src/main/resources/configuration/en.properties");	
		}
		inputStream = new FileInputStream(file);
		p.load(inputStream);
		return p;
	}

}
