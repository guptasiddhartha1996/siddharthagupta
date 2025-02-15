package TestCases;

import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	//WebDriver driver=null;
	
	@BeforeTest
	public void tearup() {
		WebDriver driver = null;
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/home");
	}
	
	@AfterTest
	public void teardown() {
		WebDriver driver = null;
		driver.quit();
	}


}
