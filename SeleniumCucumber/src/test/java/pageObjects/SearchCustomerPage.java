package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


import Utilities.WaitHelper;

public class SearchCustomerPage {

	public WebDriver ldriver;
	WaitHelper waitHelper;
	
	
	@FindBy(how = How.ID, using ="SearchEmail") private WebElement mail;
	@FindBy(how = How.ID, using ="SearchFirstName") private WebElement searchFirstName;
	@FindBy(how = How.ID, using ="SearchLastName") private WebElement searchLastName;
	@FindBy(how = How.ID, using ="search-customers") private WebElement searchCustomersBtn;
	
	@FindBy(how = How.XPATH, using= "//table[@id='customers-grid']") private WebElement tabledata;
	
	@FindBy(how = How.XPATH, using="//table[@id='customers-grid']//tbody//tr") private List<WebElement> tableRows;
	@FindBy(how = How.XPATH, using="//table[@id='customers-grid']//tbody//tr//td") private List<WebElement> tableColumns;
	

	public SearchCustomerPage(WebDriver driver) {
		ldriver = driver;
		PageFactory.initElements(ldriver, this);
		waitHelper = new WaitHelper(driver);
	}

	public void setEmail(String emailid) {
		waitHelper.WaitForElement(mail, 20);
		mail.clear();
		mail.sendKeys(emailid);
	}
	public void setFirstName(String firstName) {
		searchFirstName.clear();
		searchFirstName.sendKeys(firstName);
		
	}
	
	public void setLastName(String lastName) {
		searchLastName.clear();
		searchLastName.sendKeys(lastName);
	}
	
	public void ClickOnSearchButton() {
		searchCustomersBtn.click();
		waitHelper.WaitForElement(searchCustomersBtn, 10);
	}
	
	public int getNoOfRows() {
		return(tableRows.size());
	}
	
	public int getNoOfColumn() {
		return (tableColumns.size());
	}
	
	public boolean serachCustomerByEmail(String mail) {
		boolean flag = false;
		for(int i = 1; i<=getNoOfRows(); i++) {
			String emailID = tabledata.findElement(By.xpath("//table[@id='customers-grid']//tbody//tr["+i+"]//td[2]")).getText();
			if(emailID.equals("steve_gates@nopCommerce.com")) {
				flag = true;
			}
		}
		return flag;
	}
	
	
	
}
