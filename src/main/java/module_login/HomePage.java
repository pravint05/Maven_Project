package module_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//h6[text()='TELLSTAR']")
	private WebElement Title;
	@FindBy(xpath = "//a[@href='/logout']")
	private WebElement Logout;
	
	public HomePage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}
	
	public String Verify()
	{
		String getActResult=Title.getText();
		return getActResult;
	}

	public void clickLogout()
	{
		Logout.click();
	}
	
}
