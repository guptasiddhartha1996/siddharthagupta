package com.OBBE.Testcases;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.OBBE.PageObjects.LoginPageObjects;
import com.OBBE.PageObjects.OnboardingPageObjects;
import com.OBBE.PageObjects.OnboardingPageObjects2;
import com.OBBE.PageObjects.PrismPageObjects;

public class Onboarding2 extends BaseTest {
	
	
	@Test(enabled=true)
	public void workflowmaintenance() {
		
			try {			
			WorkflowMaintenance wm=new WorkflowMaintenance();
			wm.WorkflowMaintenanc();
			}catch(Exception e) {
				e.printStackTrace();
			}
	}

	
	@Test(enabled=true, dependsOnMethods= {"workflowmaintenance"})
	public void Eplogin() {
			
			try {
			LoginPageObjects lp=new LoginPageObjects(driver);
			driver.get(prop.getProperty("epurl"));
			System.out.println(prop.getProperty("obusername"));
			lp.loginPage(prop.getProperty("obusername"), "Ninja@78901234");
			}catch(Exception e) {
				e.printStackTrace();
			}
	}
	
	@Test(enabled=true, dependsOnMethods= {"Eplogin"})
	public void onboardingi9section1() {
			
			try {
			OnboardingPageObjects ob=new OnboardingPageObjects(driver);
			String lastname=prop.getProperty("lastname");
			String firstname=prop.getProperty("firstname");
			String bdate=prop.getProperty("birthdate");
			String sn=prop.getProperty("ssn");
			String add=prop.getProperty("address");
			String city=prop.getProperty("city");
			String sta=prop.getProperty("state");
			String zp=prop.getProperty("zip");
			String rnumber=prop.getProperty("rountingnumber");
			ob.Onboarding(lastname,firstname,bdate,sn,add,city,sta,zp,rnumber);
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
		driver.get(prop.getProperty("prismurl"));
		try {
			
			pp.login(uname, pass);
			
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		try {
			ob.i9section2(prop.getProperty("firstname"));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	

}
