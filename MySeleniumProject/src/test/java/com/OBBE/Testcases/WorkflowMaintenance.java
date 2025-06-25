package com.OBBE.Testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.OBBE.PageObjects.PrismPageObjects;

@Listeners(CustomListener.class)
public class WorkflowMaintenance extends BaseTest {
	
	@Test(retryAnalyzer=Analyzer.RetryAnalyzer.class)	
	public void WorkflowMaintenanc () throws InterruptedException, IOException {
		
		PrismPageObjects pm=new PrismPageObjects(driver);
		prop=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\config.properties");
		prop.load(fis);
		driver.get(prop.getProperty("prismurl"));
		String uname=prop.getProperty("prismusername");
		String pass=prop.getProperty("prismpassword");
		String stext=prop.getProperty("searchtextwork");
		String wtype=prop.getProperty("workflowtype");
		String act=prop.getProperty("Action1");
		String act1=prop.getProperty("Action2");
		String cid=prop.getProperty("clientid");
		pm.login(uname, pass);
		pm.searchworkflow(stext);
		pm.suspendworkflow(wtype, act, cid);
		int rows=pm.table.findElements(By.tagName("tr")).size();
		//System.out.println(rows);
		
		for(int i=1;i<=rows;i++) {
			String webtxt=driver.findElement(By.id(pm.beforeid+i+pm.afterid)).getText();
			//System.out.println(webtxt);
			if(webtxt.equalsIgnoreCase(prop.getProperty("empid"))) {
				driver.findElement(By.id(pm.beforeid+i+pm.afterid)).click();
				break;
			}
			
		}
		pm.radio_btn.click();
		pm.Continue_btn.click();
		pm.yes_btn.click();
		
		pm.LaunchNewWorkflow(act1);
		for(int i=1;i<=rows;i++) {
			String webtxt=driver.findElement(By.id(pm.beforeid+i+pm.afterid)).getText();
			//System.out.println(webtxt);
			if(webtxt.equalsIgnoreCase(prop.getProperty("empid"))) {
				driver.findElement(By.id(pm.beforeid+i+pm.afterid)).click();
				break;
			}
			
		}
		pm.r_btn.click();
		pm.Continue_btn.click();
		pm.yes_btn.click();
		pm.signout();
				
		
	}

}
