package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	public WebDriver ldriver;
	
	//Declaration of Elements
	
	@FindBy(xpath="//a[@href='#']//p[contains(text(),'Customers')]") private WebElement CustomerListMenu;
	@FindBy(xpath="//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]") private WebElement CustomerListItem;
	@FindBy(xpath="//a[@href='/Admin/Customer/Create']") private WebElement AddNewCustomer;
	
	@FindBy(xpath = "//input[@id='Email']") private WebElement emailid;
	@FindBy(xpath = "//input[@id='Password']") private WebElement passw;
	@FindBy(xpath = "//input[@id='FirstName']") private WebElement firstName;
	@FindBy(xpath = "//input[@id='LastName']") private WebElement LastName;
	@FindBy(xpath="//input[@id='Gender_Male']") private WebElement rdGenderMale;
	@FindBy(xpath="//input[@id='Gender_Female']") private WebElement rdGenderFemale;
	@FindBy(xpath="//input[@id='DateOfBirth']") private WebElement dob;
	@FindBy(xpath="//input[@id='Company']") private WebElement companyName;
	@FindBy(xpath="//input[@id='IsTaxExempt']") private WebElement isTaxExempt;
	@FindBy(xpath="//textarea[@id='AdminComment']") private WebElement adminComment;
	@FindBy(xpath = "(//input[@class='k-input'])[2]") private WebElement customerRoles;	
	@FindBy(xpath="//button[@name='save']") private WebElement saveBtn;
	//button[@name='save']
	
	
	//Intialization of elements
	
	public AddCustomerPage(WebDriver driver) {
		ldriver = driver;
		PageFactory.initElements(ldriver, this);
	}
	
	//Action Methods 
	
	public String getpageTitle() throws InterruptedException {
		return ldriver.getTitle();
	}
	
	public void ClickOnCustomerListMenu() {
		CustomerListMenu.click();
	}
	
	public void ClickOnCustomerListItem() {
		CustomerListItem.click();
	}
	
	public void ClickOnAddNewCustomer() {
		AddNewCustomer.click();
	}
	
	public void setEmail(String email) {
		emailid.clear();
		emailid.sendKeys(email);
	}
	
	public void setPassword(String pass) {
		passw.clear();
		passw.sendKeys(pass);
	}
	
	public void setFirstName(String name) {
		firstName.clear();
		firstName.sendKeys(name);
	}
	
	public void setLastName(String lastname) {
		LastName.clear();
		LastName.sendKeys(lastname);
	}
	
	
	public void setCompanyName(String company) {
		companyName.clear();
		companyName.sendKeys(company);
	}
	
	public void setDobirth(String DOB) {
		dob.clear();
		dob.sendKeys(DOB);
	}
	
	public void setadminComment(String admincomments) {
		adminComment.clear();
		adminComment.sendKeys(admincomments);
	}
	
	public void setCustomerRoles(String role) {

		Actions actobj = new Actions(ldriver);
		
		if (role.equals("Administrators")) {
			WebElement admins = ldriver.findElement(By.xpath(
					"//div[@class='k-list-scroller']//ul[@class='k-list k-reset']//li[text()= 'Administrators']"));
			actobj.moveToElement(admins).click().build().perform();
		} else if (role.equals("Forum Moderators")) {

			WebElement admins = ldriver.findElement(By.xpath(
					"//div[@class='k-list-scroller']//ul[@class='k-list k-reset']//li[text()= 'Forum Moderators']"));
			actobj.moveToElement(admins).click().build().perform();

		} else if (role.equals("Guests")) {
			WebElement Forum_Moderators = ldriver.findElement(
					By.xpath("//div[@class='k-list-scroller']//ul[@class='k-list k-reset']//li[text()= 'Guests']"));
			actobj.moveToElement(Forum_Moderators).click().build().perform();

		}
//			else if (role.equals("Registered")) {
//			WebElement Registered = ldriver.findElement(
//					By.xpath("//div[@class='k-list-scroller']//ul[@class='k-list k-reset']//li[text()= 'Registered']"));
//			actobj.moveToElement(Registered).click().build().perform();
//
//		} 
			else if (role.equals("Registered")) {
			
			WebElement list = ldriver.findElement(By.xpath("(//div[@class='k-multiselect-wrap k-floatwrap'])[2]"));
			actobj.moveToElement(list).click().build().perform();
			WebElement delete_icon = ldriver.findElement(By.xpath("//ul/li[@class='k-button']//span[@title='delete']"));
			actobj.moveToElement(delete_icon).click().build().perform();
			WebElement Vendors = ldriver.findElement(
			By.xpath("//div[@class='k-list-scroller']//ul[@class='k-list k-reset']//li[text()= 'Registered']"));
			actobj.moveToElement(Vendors).click().build().perform();
		}
	}
	
	public void ClickOnSaveBtn() {
		saveBtn.click();
	}
}
