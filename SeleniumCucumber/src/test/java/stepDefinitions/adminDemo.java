package stepDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.AddCustomerPage;
import pageObjects.LoginPage;
import pageObjects.SearchCustomerPage;

public class adminDemo extends BaseClass {

	 
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() throws IOException {
		logger = Logger.getLogger("SeleniumCucumber");
		PropertyConfigurator.configure("log4j.properties");
		
		openBroswer();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		logger.info("********Launching Browser**********");
		lp = new LoginPage(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_URL(String url) {
		logger.info("********Opening URL**********");
		driver.get(url);
	}

	@When("User enter Email as {string} and Password as {string}")
	public void user_enter_Email_as_and_Password_as(String email, String passs) {
		logger.info("********Provinding login Details**********");
		lp.setEmailID(email);
		lp.setPassword(passs);

	}

	@When("Click on Login")
	public void click_on_Login() {
		logger.info("********Started Loggin**********");
		lp.ClickonlogintBtn();
	}

	@Then("The page Title should be {string}")
	public void the_page_Title_should_be(String title) {
		if (driver.getPageSource().contains("Login was unsuccessful.")) {
			driver.close();
			logger.info("********Logging pass**********");
			Assert.assertTrue(false);
		} else {
			logger.info("********Logging Failed**********");
			Assert.assertEquals(title, driver.getTitle());
		}

	}

	@When("User click on logout link")
	public void user_click_on_logout_link() {
		logger.info("Logout");
		lp.ClickonlogOutBtn();
	}


	@Then("Close the browser")
	public void close_the_browser() throws InterruptedException {
		logger.info("Closed the Browser");
		Thread.sleep(1000);
		driver.close();
	} 
	
	//Add new Customer feature file
	
	
	@Then("User can view DashBoard")
	public void user_can_view_DashBoard() throws InterruptedException {
		addcust = new AddCustomerPage(driver);
		Thread.sleep(3000);
		String pagetitle = addcust.getpageTitle();
		Assert.assertEquals("Dashboard / nopCommerce administration",pagetitle);
		logger.info("On Dashboard");
	}

	@When("User click on the customer Menu")
	public void user_click_on_the_customer_Menu() throws InterruptedException {
		Thread.sleep(2000);
		logger.info("On CsutomerMenu");
		addcust.ClickOnCustomerListMenu();
	}

	@When("Click on customers Menu Item")
	public void click_on_customers_Menu_Item() throws InterruptedException {
		Thread.sleep(2000);
		logger.info("Customer list is open");
		addcust.ClickOnCustomerListItem();
	}

	@When("Click on add new button")
	public void click_on_add_new_button() throws InterruptedException {
		Thread.sleep(2000);
		logger.info("Adding New Customer");
		addcust.ClickOnAddNewCustomer();
	}

	@Then("User can view add new customer page")
	public void user_can_view_add_new_customer_page() throws InterruptedException {
		logger.info("On New Customer page");
		Assert.assertEquals("Add a new customer / nopCommerce administration", addcust.getpageTitle());
	}

	@When("User enter customer info")
	public void user_enter_customer_info() {
		logger.info("********Adding New Customer**********");
		logger.info("********Provinding customer Details**********");
		String email = randomString()+"@gmail.com";
		addcust.setEmail(email);
		addcust.setFirstName("Vaibhav");
		addcust.setLastName("More");
		addcust.setPassword("admin");
		addcust.setCompanyName("TaTa Motors");
		addcust.setDobirth("7/05/2021");
		addcust.setadminComment("This is for the test ");
		addcust.setCustomerRoles("Registered");
	}

	@When("Click on Save button")
	public void click_on_Save_button() {
		logger.info("Clicking on save button");
		addcust.ClickOnSaveBtn();
	}

	@Then("User can View Confimation message {string}")
	public void user_can_View_Confimation_message(String string) {
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("The new customer has been added successfully"));
		logger.info("New User Added Successfully");
	}

	//Searching a customer using email id
	@When("Enter Customer Email")
	public void enter_Customer_Email() {
		
		logger.info("********Searching a customer using email id**********");
		serachCust = new SearchCustomerPage(driver);
		serachCust.setEmail("steve_gates@nopCommerce.com");
	}

	@When("Click on Seach button")
	public void click_on_Seach_button() throws InterruptedException {
		logger.info("Click on Serach Button");
		serachCust.ClickOnSearchButton();
		Thread.sleep(2000);
	}

	@Then("User should found the email id in table")
	public void user_should_found_the_email_id_in_table() {
	    boolean status = serachCust.serachCustomerByEmail("steve_gates@nopCommerce.com");
		Assert.assertTrue(status);
		logger.info("User Details Available in table");
	}
	@Then("Close Browser")
	public void close_Browser() {
		logger.info("Closing the Browser");
		driver.close();
	}
}
