package com.OBBE.PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.OBBE.Testcases.BaseTest;

public class LoginPageObjects extends BaseTest {
	
	public LoginPageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(id="username")
	WebElement txt_username;
	
	@FindBy(id="password")
	WebElement txt_password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement lgn_btn;
	
	@FindBy(id="benefit-enrollment-widget-button")
	WebElement continue_btn;
	
	@FindBy(xpath="//i[contains(@class,'fa-heart-pulse fal nav-icon')]")
	WebElement Bene_link;
	
	@FindBy(xpath="//li[@title='Benefits Enrollment']")
	WebElement BE_link;
	
	@FindBy(id="btn-next")
	WebElement btn_nxt;
	
	
	public void loginPage(String username, String password) throws InterruptedException {
		WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));
		txt_username.clear();
		txt_username.sendKeys(username);
		txt_password.clear();
		txt_password.sendKeys(password);
		
		lgn_btn.click();
		
	}




}
