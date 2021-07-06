//Add all common things in this class
package stepDefinitions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import pageObjects.AddCustomerPage;
import pageObjects.LoginPage;
import pageObjects.SearchCustomerPage;

public class BaseClass {
	public static WebDriver driver;
	public LoginPage lp;
	public AddCustomerPage addcust;
	public SearchCustomerPage serachCust;
	public static Logger logger;
	public static Properties configProp;

	public static void openBroswer() throws IOException {

		configProp = new Properties();
		FileInputStream configpropFile = new FileInputStream("config.properties");
		configProp.load(configpropFile);
		String br = configProp.getProperty("browser");

// Driver configuration		
		
		if (br.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", configProp.getProperty("chromepath"));
			// System.setProperty("webdriver.chrome.driver",
			// "C:\\Users\\Vaibhav\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (br.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", configProp.getProperty("firefoxpath"));
			driver = new FirefoxDriver();
		} else if (br.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", configProp.getProperty("iepath"));
			driver = new InternetExplorerDriver();
		}

		logger.info("***********Launching Browser*******************");
	}

	// Create random string for Unique mail id
	public static String randomString() {
		String generetedString = RandomStringUtils.randomAlphabetic(5);
		return generetedString;
	}

}
