package com.OBBE.Testcases;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.OBBE.PageObjects.LoginPageObjects;
import com.OBBE.PageObjects.OnboardingPageObjects;

public class BrokenLinks extends BaseTest {
	
	@Test
	public void brokenlinks() {
		
		try {
			
		
		driver.get("https://www.amazon.com");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(WebElement link:links) {
			String attri=link.getAttribute("href");
			if(attri==null || attri.isEmpty()) {
				System.out.println("Not possible to check ");
				continue;
			}
			URL url=new URL(attri);
			
			HttpURLConnection conn=(HttpURLConnection) url.openConnection();
			conn.connect();
			if(conn.getResponseCode()>=400) {
				System.out.println("Broken links are: "+ attri);
			}else
			{
				System.out.println("Not a Broken links: "+ attri);
			}
			
			
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
}
