package com.OBBE.PageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.OBBE.Testcases.BaseTest;

import junit.framework.Assert;



public class WelcomePageObjects extends BaseTest {
	
	public WelcomePageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='get-started-box panel be-welcome']/h1")
	WebElement Welcome_txt;
	
	@FindBy(id="btn-next")
	WebElement btn_nxt;
	

	
	public void Welcome() throws InterruptedException {
		Assert.assertEquals(Welcome_txt, " Welcome ");
		
		btn_nxt.click();
		
		
	}

}
