package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class OrangeHRMSteps extends BaseClass {
	
	//WebDriver driver;
	
	@Given("I luanch the chrome browser")
	public void i_luanch_the_chrome_browser() throws IOException {
		openBroswer();
	}

	@When("I open OrangeHRM homepage")
	public void i_open_OrangeHRM_homepage() {
	   driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@Then("I verify that the logo presence on page")
	public void i_verify_that_the_logo_presence_on_page() {
	  Boolean img = driver.findElement(By.xpath("//div[@id='divLogo']/img")).isDisplayed();
	  Boolean exp = true;
	  Assert.assertEquals(exp, img);
	 
	}

	@Then("close browser")
	public void close_browser() {
		driver.quit();
	}



}
