package TestCases;

import java.awt.AWTException;

import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPageObjects;

public class NaukriUpdateResume extends BaseTest{
	
	@Test
	public void login() {
		
		try {
			LoginPageObjects lp=new LoginPageObjects(driver);
			lp.login();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(dependsOnMethods="login")
	public void uploadresume() throws AWTException {
		
		try {
			HomePage hp=new HomePage(driver);
			hp.UpdateResume();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	@Test(dependsOnMethods="uploadresume")
	public void logout() {
		try {
			LoginPageObjects lp=new LoginPageObjects(driver);
			lp.logout();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
