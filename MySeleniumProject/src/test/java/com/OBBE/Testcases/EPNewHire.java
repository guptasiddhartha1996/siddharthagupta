package com.OBBE.Testcases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.OBBE.PageObjects.PrismPageObjects;

@Listeners(CustomListener.class)
public class EPNewHire extends BaseTest {
	
	@Test(retryAnalyzer=Analyzer.RetryAnalyzer.class)
	public void newhire() throws InterruptedException {
		PrismPageObjects pm=new PrismPageObjects(driver);
		driver.get("https://eeqa86-qa-ep.prismhr.com/uex/#/auth/login");
		pm.epLogin("jacob", "Ninja@78901234");
		pm.EPNewHire("abc","abc");
	}

}
