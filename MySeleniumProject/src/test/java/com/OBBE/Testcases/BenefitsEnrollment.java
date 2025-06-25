package com.OBBE.Testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.OBBE.PageObjects.BenefitEnrollmentPageObjects;
import com.OBBE.PageObjects.LoginPageObjects;
import com.OBBE.PageObjects.PrismPageObjects;
import com.OBBE.PageObjects.WelcomePageObjects;

import junit.framework.Assert;

public class BenefitsEnrollment extends BaseTest {
	
	String randssn=generateRandomSSN();
	String firstname="John"+generateRandomNames();
	String lastname="Levis"+ generateRandomNames();
	String preferredname= "Tom"+generateRandomNames();
	String stext="New Hire";
	

	
	@Test(enabled=false)
	public void newhire() throws IOException {
		PrismPageObjects pm=new PrismPageObjects(driver);
		try {
			driver.get("https://qa86.prismhr.com/QA86/");
			pm.login("sgupta", "Ninja@78901234");
			pm.searchbox.sendKeys(stext);
			driver.findElement(By.id("tdxrdesignbaisdropv1x3z1x10")).click();
			String txt = driver.findElement(By.id("tdxspan21v1x2z2")).getText();
			String clientid = txt.substring(txt.indexOf("(") + 1, txt.indexOf(")"));
			
			
			if(clientid.equalsIgnoreCase("2032")) {
				
				pm.BENewhire(randssn, firstname, lastname, preferredname);
			}
			else {
				driver.findElement(By.id("tdxspan21v1x2z2")).click();
				driver.findElement(By.id("text13v2")).sendKeys("2032");
				driver.findElement(By.id("button24v2")).click();
				int rows = pm.table2.findElements(By.tagName("tr")).size();
				for (int i = 1; i <= rows; i++) {
					String webtxt = driver.findElement(By.id(pm.bid + i + pm.aid)).getText();
					if (webtxt.equalsIgnoreCase("2032")) {
						driver.findElement(By.id(pm.bid + i + pm.aid)).click();
						break;
					}
				}
				pm.BENewhire(randssn, firstname, lastname, preferredname);
				
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
	
	@Test(enabled=true, priority=1)
	public void webenrollment() {
		WebEnrollmentConfiguration we=new WebEnrollmentConfiguration();
		try {
			we.WebEnrollmentConfig("2032","W00994");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	@Test(enabled=true, priority=2)
	public void dependent() {
		PrismPageObjects pm=new PrismPageObjects(driver);
		try {
			pm.EmployeeDependents();
			pm.signout();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	@Test(enabled=true, priority=3) //dependsOnMethods= {"newhire"})
	public void Eplogin() {
			
			try {
			//driver.get("https://eeqa86-qa-ep.prismhr.com/uex/#/auth/login");
			LoginPageObjects lp=new LoginPageObjects(driver);
			driver.get(prop.getProperty("epurl"));
			lp.loginPage("JohnVuQ", "Ninja@78901234"); //W00994
			}catch(Exception e) {
				e.printStackTrace();
			}
	}
	
	
	@Test(enabled=true, dependsOnMethods= {"Eplogin"})
	public void BenefitEnrollment() throws IOException {
		
		
		try {

			BenefitEnrollmentPageObjects be=new BenefitEnrollmentPageObjects(driver);
			be.Benefits();
			be.Welcome();
			be.CurrentBenefits();
			be.Dependents();
			be.Medical();
			be.Dental();
			be.Vision();
			be.Telehealth();
			be.DomesticVision();
			be.Gap();
			be.DomesticDental();
			be.DomesticMedical();
			be.Ancillary();
			be.CriticalIllness();
			be.Add();
			be.Accident();
			be.Legal();
			be.Identity();
			be.VolHos();
			be.Cancer();
			be.CriticalIll();
			be.Pet();
			be.Voluntary();
			be.AddLtd();
			be.Std();
			be.Ltd();
			be.Astd();
			be.BasicLifeExtra();
			be.WholeLifePrebuilt();
			be.SuppDep();
			be.SuppSpouse();
			be.BasicLife();
			be.VolLife();
			be.Hsa();
			be.Fsa();
			be.Commuter();
			be.DepFsa();
			be.BenefitSummary();
			be.Confirmation();
			
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	


}
