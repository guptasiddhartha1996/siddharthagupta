package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestCases.BaseTest;


public class LoginPageObjects extends BaseTest {
	
	public LoginPageObjects(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login_Layer")
	WebElement loginbutton;
	
	@FindBy(xpath="//input[@placeholder='Enter your active Email ID / Username']")
	WebElement username;
	
	@FindBy(xpath="//input[@placeholder='Enter your password']")
	WebElement password;
	
	@FindBy(xpath="//button[text()='Login']")
	WebElement loginbtn;
	
	@FindBy(xpath="//div[@class='nI-gNb-drawer__icon']")
	WebElement profilebutton;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logout;
	
	public void login() {
		loginbutton.click();
		username.sendKeys("guptasiddhartha96@yahoo.in");
		password.sendKeys("7669803450");
		loginbtn.click();
		
	}
	
	public void logout() {
		profilebutton.click();
		logout.click();
	}
	

}
