package TestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import com.aventstack.chaintest.plugins.ChainTestListener;

//@Listeners(ChainTestListener.class)
public class BaseTest { 
	
	public static WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	public void baseTest(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("Open a chrome browser");
			 driver=new ChromeDriver();

		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.out.println("Open a firefox browser");
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Edge")) {
			System.out.println("Open a Edge browser");
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/");

		
	}
	
	public String properties()  {
		Properties properties = new Properties();
		try {
			String filepath=System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties";
			FileInputStream fileInputStream = new FileInputStream(filepath);
			properties.load(fileInputStream);
			fileInputStream.close(); 
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties.getProperty("location");
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
