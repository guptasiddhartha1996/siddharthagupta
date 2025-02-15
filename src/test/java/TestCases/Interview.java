package TestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.beust.jcommander.Parameter;

import junit.framework.Assert;

public class Interview extends BaseTest {
	
	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void interview(String browser) {
		
		if(browser.equals("chrome")) {
			System.out.println("Open Chrome Browser");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.linkedin.com/home");
		}else if(browser.equals("firefox")) {
			System.out.println("Open FireFox Browser");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.linkedin.com/home");
		}
		driver.switchTo().window(browser);
		System.out.println("System");
	}

}
