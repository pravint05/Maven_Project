package module_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath = "//input[@name='email']")
	private WebElement Mail;
	@FindBy(xpath = "//input[@type='password']")
	private WebElement PSW;
	@FindBy(xpath = "//button[@class='login100-form-btn']")
	private WebElement Login;

	public LoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	public void EnterMail(String MailID) {
		Mail.sendKeys(MailID);

	}
	
	public void EnterPSW(String Password2) {
		PSW.sendKeys(Password2);

	}
	
	public void ClickBTN() {
		Login.click();

	}
}
