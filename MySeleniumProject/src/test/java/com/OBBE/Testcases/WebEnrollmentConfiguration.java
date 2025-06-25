package com.OBBE.Testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.OBBE.PageObjects.PrismPageObjects;

@Listeners(CustomListener.class)
public class WebEnrollmentConfiguration extends BaseTest {

	@Test(retryAnalyzer=Analyzer.RetryAnalyzer.class)
	public void WebEnrollmentConfig(String cleid, String empid) throws InterruptedException, IOException {
		
		try {

		PrismPageObjects pm = new PrismPageObjects(driver);
		prop=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\config.properties");
		prop.load(fis);
		driver.get(prop.getProperty("prismurl"));
		String uname = prop.getProperty("prismusername");
		String pass = prop.getProperty("prismpassword");
		String stext = prop.getProperty("searchtextweb");
		//String eid = prop.getProperty("beempid");
		String eid=empid;
		String etype = prop.getProperty("enrollmenttype");
		//String cid = prop.getProperty("clientid");
		String cid=cleid;
		pm.login(uname, pass);
		pm.search(stext);
		String txt = driver.findElement(By.id("tdxspan21v1x2z2")).getText();
		String clientid = txt.substring(txt.indexOf("(") + 1, txt.indexOf(")"));
		System.out.println(clientid);
		if (clientid.equalsIgnoreCase(cid)) {
			//Assert.assertEquals(false, true);
			pm.details(eid);
			pm.delete();
			pm.popup();
			Thread.sleep(2000);
			Alertaccept();
			pm.createenrollment(eid, etype);
			Thread.sleep(2000);
			Alertaccept();

		} else {
			//Assert.assertEquals(false, true);
			driver.findElement(By.id("tdxspan21v1x2z2")).click();
			driver.findElement(By.id("text13v2")).sendKeys(cid);
			driver.findElement(By.id("button24v2")).click();
			int rows = pm.table2.findElements(By.tagName("tr")).size();
			for (int i = 1; i <= rows; i++) {
				String webtxt = driver.findElement(By.id(pm.bid + i + pm.aid)).getText();
				if (webtxt.equalsIgnoreCase(cid)) {
					driver.findElement(By.id(pm.bid + i + pm.aid)).click();
					break;
				}
			}
			pm.details(eid);
			pm.delete();
			pm.popup();
			Thread.sleep(2000);
			Alertaccept();
			pm.createenrollment(eid, etype);
			Thread.sleep(2000);
			Alertaccept();
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		//pm.signout();

	}
	
	


}
