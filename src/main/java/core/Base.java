package core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Base {

	public static WebDriver driver;
	public static Properties properties;

		private String propertiesPath = System.getProperty("user.dir");
	private String ProjectPropertyPath = propertiesPath
			+ "\\src\\test\\resources\\Properties\\ProjectProperty.properties";

	

	public Base() {

		
		try {
			BufferedReader reader;
			reader = new BufferedReader(new FileReader(ProjectPropertyPath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static String browserName() {

		String browser = properties.getProperty("browserName");
		return browser;

	}

	public static String getURL() {

		String url = properties.getProperty("url");
		return url;

	}

	public static long getPageLoadTimeOut() {

		String pageLoadTimeOut = properties.getProperty("pageLoadTimeOut");

		return Long.parseLong(pageLoadTimeOut);

	}

	public static long getImplicitlyWait() {
		String implicitlyWait = properties.getProperty("implicitlyWait");

		return Long.parseLong(implicitlyWait);
	}

	public static void initializeDriver() {

		driver.get(getURL());

	}

}
