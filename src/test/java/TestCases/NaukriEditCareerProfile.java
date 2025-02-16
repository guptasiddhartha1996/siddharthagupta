package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPageObjects;

public class NaukriEditCareerProfile extends BaseTest {
	
	@Test
	public void Login() {
		
		try {
			LoginPageObjects lp=new LoginPageObjects(driver);
			lp.login();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test(dependsOnMethods="Login")
	public void homepage() {
		
		try {
			HomePage hp=new HomePage(driver);
			hp.CareerProfile(properties());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(dependsOnMethods="homepage")
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
