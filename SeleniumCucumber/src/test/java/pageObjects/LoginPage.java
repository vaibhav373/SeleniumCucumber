package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath = "//input[@id='Email']") private WebElement email;
	@FindBy(xpath = "//input[@class='password']") private WebElement password;
	@FindBy(xpath = "//button[text()='Log in']") private WebElement loginbtn;
	@FindBy(xpath = "//a[text()='Logout']") private WebElement logoutbtn;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setEmailID(String emailid) {
		email.clear();
		email.sendKeys(emailid);
	}

	public void setPassword(String pass) {
		password.clear();
		password.sendKeys(pass);
	}

	public void ClickonlogintBtn() {
		loginbtn.click();
	}

	public void ClickonlogOutBtn() {
		logoutbtn.click();
	}
}
