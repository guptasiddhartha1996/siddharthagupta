package com.OBBE.Testcases;


import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBus {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		getWeekEndDates("Mar 2025");	
	}
	
	public static void getWeekEndDates(String date) {
		ChromeOptions options =new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("i.sc-cSHVUG.NyvQv.icon.icon-datev2")).click();
		
		WebElement ele=driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[2]"));
		System.out.println(ele.getText());
		
		//driver.quit();
		
		
	}
	
	
	
	

}
