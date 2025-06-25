package com.OBBE.Testcases;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.OBBE.PageObjects.LoginPageObjects;
import com.OBBE.PageObjects.OnboardingPageObjects;
import com.OBBE.PageObjects.OnboardingPageObjects2;
import com.OBBE.PageObjects.PrismPageObjects;

public class Onboarding extends BaseTest {
	
	String randssn=generateRandomSSN();
	String firstname="John"+generateRandomNames();
	String lastname="Levis"+ generateRandomNames();
	String preferredname= "Tom"+generateRandomNames();
	String stext="New Hire";
	
	
	@Test(enabled=true)
	public void newhire() throws IOException {

		PrismPageObjects pm=new PrismPageObjects(driver);
		try {
			driver.get("https://qa86.prismhr.com/QA86/");
			pm.login("sgupta", "Ninja@78901234");
			pm.searchbox.sendKeys(stext);
			driver.findElement(By.id("tdxrdesignbaisdropv1x3z1x10")).click();
			String txt = driver.findElement(By.id("tdxspan21v1x2z2")).getText();
			String clientid = txt.substring(txt.indexOf("(") + 1, txt.indexOf(")"));
			
			
			if(clientid.equalsIgnoreCase("001821")) {
				
				pm.OBnewhire(randssn,firstname,lastname,preferredname);
			}
			else {
				driver.findElement(By.id("tdxspan21v1x2z2")).click();
				driver.findElement(By.id("text13v2")).sendKeys("001821");
				driver.findElement(By.id("button24v2")).click();
				int rows = pm.table2.findElements(By.tagName("tr")).size();
				for (int i = 1; i <= rows; i++) {
					String webtxt = driver.findElement(By.id(pm.bid + i + pm.aid)).getText();
					if (webtxt.equalsIgnoreCase("001821")) {
						driver.findElement(By.id(pm.bid + i + pm.aid)).click();
						break;
					}
				}
				pm.OBnewhire(randssn,firstname,lastname,preferredname);
				
			}
			//pm.signout();
			System.out.println(firstname);
			driver.get("https://eeqa86-qa-ep.prismhr.com/uex/#/auth/login");
			pm.Register(randssn, firstname, lastname);
			driver.get("https://qa86.prismhr.com/QA86/");
			pm.users(firstname);
			pm.signout();
			driver.get("https://eeqa86-qa-ep.prismhr.com/uex/#/auth/login");
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	
	@Test(enabled=true, dependsOnMethods= {"newhire"})
	public void Eplogin() {
			
			try {
			LoginPageObjects lp=new LoginPageObjects(driver);
			//driver.get(prop.getProperty("epurl"));
			System.out.println(firstname);
			lp.loginPage(firstname, "Ninja@78901234");
			}catch(Exception e) {
				e.printStackTrace();
			}
	}
	
	@Test(enabled=true, dependsOnMethods= {"Eplogin"})
	public void onboardingi9section1() {
			
			try {
			OnboardingPageObjects2 ob=new OnboardingPageObjects2(driver);
//			String lastname=prop.getProperty("lastname");
//			String firstname=prop.getProperty("firstname");
			String bdate=prop.getProperty("birthdate");
//			String sn=prop.getProperty("ssn");
			String add=prop.getProperty("address");
			String city=prop.getProperty("city");
			String sta=prop.getProperty("state");
			String zp=prop.getProperty("zip");
			String rnumber=prop.getProperty("rountingnumber");
			//ob.Onboarding(lastname,firstname,bdate,randssn,add,city,sta,zp,rnumber);
			ob.initialVisit();
			ob.electronicConsent();
			ob.i9SectionOne(lastname,firstname,bdate,randssn,add,city,sta,zp,rnumber);
			ob.employeeInformation();
			ob.directDeposit();
			ob.Disability();
			ob.tax();
			ob.elect();
			ob.race();
			ob.veteran();
			ob.onboardingsummary();
			ob.submit();
			}catch(Exception e) {
				e.printStackTrace();
			}
		
	}
	
	@Test(dependsOnMethods= {"onboardingi9section1"})
	public void onboardingi9section2() throws InterruptedException {
		
		PrismPageObjects pp=new PrismPageObjects(driver);
		OnboardingPageObjects ob=new OnboardingPageObjects(driver);

		String uname=prop.getProperty("prismmanagerusername");
		String pass=prop.getProperty("prismmanagerpassword");
		//String fname=prop.getProperty("firstname");
		
		try {
			driver.get(prop.getProperty("prismurl"));
			pp.login(uname, pass);
			
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		try {
			ob.i9section2(firstname);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
			

	}
	
	
	
	
	

}
