package library_files;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public WebDriver driver;

	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tellstar\\eclipse-workspace\\MavenProject\\Browser\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dashboard.playboxtv.in/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

}
