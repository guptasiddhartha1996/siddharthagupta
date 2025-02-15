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

public class LoginTest{
	
	WebDriver driver;
	SoftAssert softassert=new SoftAssert();
	
	
	@Test
	@Parameters("browser")
	public void logintest(String browser) {
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
		softassert.assertEquals(false, true);
		//Assert.assertEquals(false, true);
		System.out.println("Hello world");
		driver.findElement(By.partialLinkText("Sign in")).click();
		driver.findElement(By.id("username")).sendKeys("guptasiddhartha96@gmail.com");
		driver.findElement(By.id("password")).sendKeys("sid@7669803450");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.id("ember16")).click();
		driver.findElement(By.xpath("//a[@class='global-nav__secondary-link mv1']")).click();
		softassert.assertAll();
		driver.quit();
	}
	
	@Test()
	public void sampletest() {
		System.out.println("This is testing the sample  test: ");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.quit();
	}

}
