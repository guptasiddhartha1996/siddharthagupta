package com.OBBE.Testcases;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.OBBE.PageObjects.PrismPageObjects;
import com.OBBE.Utilities.Xls_Reader;


@Listeners(CustomListener.class)
public class OBNewhire extends BaseTest{
	
	
	@Test(retryAnalyzer=Analyzer.RetryAnalyzer.class)
	public void newhire(String cltid,String usname,String pasw, int count, String env) throws IOException, InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		PrismPageObjects pm = new PrismPageObjects(driver);
//		String uname = prop.getProperty("prismusername");
//		String pass = prop.getProperty("prismpassword");
//		String stext = prop.getProperty("searchtextnew");
//		String cid = prop.getProperty("clientid");
		
		String uname=usname;
		String pass=pasw;
		String stext="New Hire";
		String cid=cltid;
		int ct=count;
		HashMap<String,String> map=new HashMap<String,String>();
		System.out.println("count is: "+ct);
		

		//driver.get(prop.getProperty("prismurl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		for(int k=0;k<ct;k++) {
			
			switch (env) {
				
			case "QA86":
				driver.get("https://qa86.prismhr.com/QA86/");
				break;
			
			case "QRQA":
				driver.get("https://qrqa.prismhr.com/qrqa/");
				break;
				
			case "QRSTG":
				driver.get("https://qrstg.prismhr.com/qrstg/");
				break;
			
			case "MR1QA":
				driver.get("https://mr1qa.prismhr.com/mr1qa/");
				break;
				
			case "MR2QA":
				driver.get("https://mr2qa.prismhr.com/mr2qa/");
				break;
				
			case "MRSTG":
				driver.get("https://mrstg.prismhr.com/mrstg/");
				break;
			
			case "DB50":
				driver.get("https://qaphr50.prismhr.com/qaphr50/");
				break;
				
			case "DB51":
				driver.get("https://qaphr51.prismhr.com/qaphr51/");
				break;
				
			case "DB52":
				driver.get("https://qaphr52.prismhr.com/qaphr52/");
				break;
				
			case "DB53":
				driver.get("https://qaphr53.prismhr.com/qaphr53/");
				break;
				
			case "DB54":
				driver.get("https://qaphr54.prismhr.com/qaphr54/");
				break;
				
			case "DB55":
				driver.get("https://qaphr55.prismhr.com/qaphr55/");
				break;
				
			case "DB56":
				driver.get("https://qaphr56.prismhr.com/qaphr56/");
				break;
				
			case "DB57":
				driver.get("https://qaphr57.prismhr.com/qaphr57/");
				break;
				
			case "DB58":
				driver.get("https://qaphr58.prismhr.com/qaphr58/");
				break;
				
			case "DB59":
				driver.get("https://qaphr59.prismhr.com/qaphr59/");
				break;
				
			case "DB60":
				driver.get("https://qaphr60.prismhr.com/qaphr60/");
				break;
				
			case "DB61":
				driver.get("https://qaphr61.prismhr.com/qaphr61/");
				break;
				
			case "DB62":
				driver.get("https://qaphr62.prismhr.com/qaphr62/");
				break;
				
			case "DB63":
				driver.get("https://qaphr63.prismhr.com/qaphr63/");
				break;
				
			case "DB64":
				driver.get("https://qaphr64.prismhr.com/qaphr64/");
				break;
				
			case "DB65":
				driver.get("https://qaphr65.prismhr.com/qaphr65/");
				break;
				
			case "DB66":
				driver.get("https://qaphr66.prismhr.com/qaphr66/");
				break;
				
			case "DB67":
				driver.get("https://qapthr67.prismhr.com/qapthr67/");
				break;
				
			case "DB68":
				driver.get("https://qaphr68.prismhr.com/qaphr68/");
				break;
				
			case "DB69":
				driver.get("https://qaphr69.prismhr.com/qaphr69/");
				break;
				
			case "DB70":
				driver.get("https://qaphr70.prismhr.com/qaphr70/");
				break;
				
			case "DB71":
				driver.get("https://qaphr71.prismhr.com/qaphr71/");
				break;
				
			case "DB72":
				driver.get("https://qaphr72.prismhr.com/qaphr72/");
				break;
				
			case "DB73":
				driver.get("https://qapthr73.prismhr.com/qapthr73/");
				break;
				
			case "DB74":
				driver.get("https://qaphr74.prismhr.com/qaphr74/");
				break;
				
			case "DB75":
				driver.get("https://qaphr75.prismhr.com/qaphr75/");
				break;
				
			case "DB76":
				driver.get("https://qaphr76.prismhr.com/qaphr76/");
				break;
				
			case "DB77":
				driver.get("https://qaphr77.prismhr.com/qaphr77/");
				break;
				
			case "DB78":
				driver.get("https://qaphr78.prismhr.com/qaphr78/");
				break;
				
			case "DB79":
				driver.get("https://qaphr79.prismhr.com/qaphr79/");
				break;
				
			case "DB80":
				driver.get("https://qaphr80.prismhr.com/qaphr80/");
				break;
				
			case "DB81":
				driver.get("https://qaphr81.prismhr.com/qaphr81/");
				break;
				
			case "DB82":
				driver.get("https://qaphr82.prismhr.com/qaphr82/");
				break;
				
			case "DB83":
				driver.get("https://qaphr83.prismhr.com/qaphr83/");
				break;
				
			case "DB84":
				driver.get("https://qaphr84.prismhr.com/qaphr84/");
				break;
				
			case "DB85":
				driver.get("https://qaphr85.prismhr.com/qaphr85/");
				break;
				
			case "PRODQA":
				driver.get("https://prodqa.prismhr.com/prodqa/");
				break;
				
			case "PRODSTG":
				driver.get("https://prodstg.prismhr.com/prodstg/");
				break;
				
			case "ORD11":
				driver.get("https://2qaphr011.prismhr.com/2qaphr011/");
				break;
				
			case "PRE-RELEASE":
				driver.get("https://qaphrpredemo.prismhr.com/qaphrpre.demo/");
				break;
			}
			
		//driver.get("https://qa86.prismhr.com/QA86/");
		try {
			
			pm.login(uname, pass);
		
			pm.searchOkta(stext);
		}catch(Exception e) {
			
		}
		
		
		
		//pm.searchbox.sendKeys(stext);
		try {
			List<WebElement> hire=driver.findElements(By.xpath("//table[@id='body_rdesignbaisdropv1']//tr//td//td/span"));
			for(int i=0;i<hire.size();i++) {
				//System.out.println(hire.get(i).getText());
				if(hire.get(i).getText().equalsIgnoreCase("New Hire")) {
					hire.get(i).click();
					System.out.println("Element found: "+hire.get(i).getText());
					break;
				}
			}
		}catch(Exception e) {
			//e.printStackTrace();
		}
		
		//driver.findElement(By.id("tdxrdesignbaisdropv1x3z1x10")).click();
		String txt = driver.findElement(By.id("tdxspan21v1x2z2")).getText();
		String clientid = txt.substring(txt.indexOf("(") + 1, txt.indexOf(")"));
		
		
			
		String randssn=generateRandomSSN();
		String firstname="John"+generateRandomNames();
		String lastname="Levis"+ generateRandomNames();
		String preferredname= "Tom"+generateRandomNames();
		
		if(clientid.equalsIgnoreCase(cid)) {
			
			pm.OBnewhire(randssn,firstname,lastname,preferredname);
		}
		else {
			try {
			
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
				pm.OBnewhire(randssn,firstname,lastname,preferredname);
			}catch(Exception e) {
				
			}
			
			
			
		}
		pm.signout();
		
		switch (env) {
		
		case "QA86":
			driver.get("https://eeqa86-qa-ep.prismhr.com/uex/#/auth/login");
			break;
		
		case "QRQA":
			driver.get("https://qrqa-ep.prismhr.com/#/auth/login");
			break;
			
		case "QRSTG":
			driver.get("https://qrstg-ep.prismhr.com/uex/#/auth/login");
			break;
		
		case "MR1QA":
			driver.get("https://mr1qa.prismhr.com/mr1qa/auth/#/login?lang=en");
			break;
			
		case "MR2QA":
			driver.get("https://mr2qa.prismhr.com/mr2qa/auth/#/login?lang=en");
			break;
			
		case "MRSTG":
			driver.get("https://mrstg.prismhr.com/mrstg/auth/#/login?lang=en");
			break;
		
		case "DB50":
			driver.get("https://qaphr50.prismhr.com/qaphr50/auth/#/login?lang=en");
			break;
			
		case "DB51":
			driver.get("https://qaphr51.prismhr.com/qaphr51/auth/#/login?lang=en");
			break;
			
		case "DB52":
			driver.get("https://qaphr52.prismhr.com/qaphr52/auth/#/login?lang=en");
			break;
			
		case "DB53":
			driver.get("https://qaphr53.prismhr.com/qaphr53/auth/#/login?lang=en");
			break;
			
		case "DB54":
			driver.get("https://qaphr54.prismhr.com/qaphr54/auth/#/login?lang=en");
			break;
			
		case "DB55":
			driver.get("https://qaphr55.prismhr.com/qaphr55/auth/#/login?lang=en");
			break;
			
		case "DB56":
			driver.get("https://qaphr56.prismhr.com/qaphr56/auth/#/login?lang=en");
			break;
			
		case "DB57":
			driver.get("https://qaphr57.prismhr.com/qaphr57/auth/#/login?lang=en");
			break;
			
		case "DB58":
			driver.get("https://qaphr58.prismhr.com/qaphr58/auth/#/login?lang=en");
			break;
			
		case "DB59":
			driver.get("https://qaphr59.prismhr.com/qaphr59/auth/#/login?lang=en");
			break;
			
		case "DB60":
			driver.get("https://qaphr60.prismhr.com/qaphr60/auth/#/login?lang=en");
			break;
			
		case "DB61":
			driver.get("https://qaphr61.prismhr.com/qaphr61/auth/#/login?lang=en");
			break;
			
		case "DB62":
			driver.get("https://qaphr62.prismhr.com/qaphr62/auth/#/login?lang=en");
			break;
			
		case "DB63":
			driver.get("https://qaphr63.prismhr.com/qaphr63/auth/#/login?lang=en");
			break;
			
		case "DB64":
			driver.get("https://qaphr64.prismhr.com/qaphr64/auth/#/login?lang=en");
			break;
			
		case "DB65":
			driver.get("https://qaphr65.prismhr.com/qaphr65/auth/#/login?lang=en");
			break;
			
		case "DB66":
			driver.get("https://qaphr66.prismhr.com/qaphr66/auth/#/login?lang=en");
			break;
			
		case "DB67":
			driver.get("https://qapthr67.prismhr.com/qapthr67/auth/#/login?lang=en");
			break;
			
		case "DB68":
			driver.get("https://qaphr68.prismhr.com/qaphr68/auth/#/login?lang=en");
			break;
			
		case "DB69":
			driver.get("https://qaphr69.prismhr.com/qaphr69/auth/#/login?lang=en");
			break;
			
		case "DB70":
			driver.get("https://qaphr70.prismhr.com/qaphr70/auth/#/login?lang=en");
			break;
			
		case "DB71":
			driver.get("https://qaphr71.prismhr.com/qaphr71/auth/#/login?lang=en");
			break;
			
		case "DB72":
			driver.get("https://qaphr72.prismhr.com/qaphr72/auth/#/login?lang=en");
			break;
			
		case "DB73":
			driver.get("https://qapthr73.prismhr.com/qapthr73/auth/#/login?lang=en");
			break;
			
		case "DB74":
			driver.get("https://qaphr74.prismhr.com/qaphr74/auth/#/login?lang=en");
			break;
			
		case "DB75":
			driver.get("https://qaphr75.prismhr.com/qaphr75/auth/#/login?lang=en");
			break;
			
		case "DB76":
			driver.get("https://qaphr76.prismhr.com/qaphr76/auth/#/login?lang=en");
			break;
			
		case "DB77":
			driver.get("https://qaphr77.prismhr.com/qaphr77/auth/#/login?lang=en");
			break;
			
		case "DB78":
			driver.get("https://qaphr78.prismhr.com/qaphr78/auth/#/login?lang=en");
			break;
			
		case "DB79":
			driver.get("https://qaphr79.prismhr.com/qaphr79/auth/#/login?lang=en");
			break;
			
		case "DB80":
			driver.get("https://qaphr80.prismhr.com/qaphr80/auth/#/login?lang=en");
			break;
			
		case "DB81":
			driver.get("https://qaphr81.prismhr.com/qaphr81/auth/#/login?lang=en");
			break;
			
		case "DB82":
			driver.get("https://qaphr82.prismhr.com/qaphr82/auth/#/login?lang=en");
			break;
			
		case "DB83":
			driver.get("https://qaphr83.prismhr.com/qaphr83/auth/#/login?lang=en");
			break;
			
		case "DB84":
			driver.get("https://qaphr84.prismhr.com/qaphr84/auth/#/login?lang=en");
			break;
			
		case "DB85":
			driver.get("https://qaphr85.prismhr.com/qaphr85/auth/#/login?lang=en");
			break;
			
		case "PRODQA":
			driver.get("https://prodqa-ep.prismhr.com/uex/#/auth/login");
			break;
			
		case "PRODSTG":
			driver.get("https://prodstg.prismhr.com/prodstg/auth/#/login?lang=en");
			break;
			
		case "ORD11":
			driver.get("https://2qaphr011.prismhr.com/2qaphr011/auth/#/login?lang=en");
			break;
			
		case "PRE-RELEASE":
			driver.get("https://qaphrpredemo.prismhr.com/qaphrpre.demo/auth/#/login?lang=en");
			break;
		
		
		}
		
		//driver.get("https://eeqa86-qa-ep.prismhr.com/uex/#/auth/login");
		try {
			if(env.equalsIgnoreCase("QRQA") || env.equalsIgnoreCase("PRODQA")) {
				pm.RegisterQRQA(randssn, firstname, lastname);
			}
			else {
				pm.Register(randssn,firstname,lastname);
			}
			//pm.Register(randssn,firstname,lastname);
			map.put(firstname, "Ninja@78901234");
			System.out.println(map);
			XSSFWorkbook workbook=new XSSFWorkbook(); 
	        XSSFSheet sheet=workbook.createSheet("Test Data");
	        int rowno=0;   
	      
	        for(HashMap.Entry entry:map.entrySet()) { 
	            XSSFRow row=sheet.createRow(rowno++); 
	            row.createCell(0).setCellValue((String)entry.getKey()); 
	            row.createCell(1).setCellValue((String)entry.getValue());
	           
	        } 
	         
	        
	        FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\"+env+" OB New Hire.xlsx");
	        workbook.write(file); 
	        file.close(); 
	        System.out.println("Data Copied to Excel");
	        

	        
	        switch (env) {
			
			case "QA86":
				driver.get("https://qa86.prismhr.com/QA86/");
				break;
			
			case "QRQA":
				driver.get("https://qrqa.prismhr.com/qrqa/");
				break;
				
			case "QRSTG":
				driver.get("https://qrstg.prismhr.com/qrstg/");
				break;
			
			case "MR1QA":
				driver.get("https://mr1qa.prismhr.com/mr1qa/");
				break;
				
			case "MR2QA":
				driver.get("https://mr2qa.prismhr.com/mr2qa/");
				break;
				
			case "MRSTG":
				driver.get("https://mrstg.prismhr.com/mrstg/");
				break;
				
			case "DB50":
				driver.get("https://qaphr50.prismhr.com/qaphr50/");
				break;
				
			case "DB51":
				driver.get("https://qaphr51.prismhr.com/qaphr51/");
				break;
				
			case "DB52":
				driver.get("https://qaphr52.prismhr.com/qaphr52/");
				break;
				
			case "DB53":
				driver.get("https://qaphr53.prismhr.com/qaphr53/");
				break;
				
			case "DB54":
				driver.get("https://qaphr54.prismhr.com/qaphr54/");
				break;
				
			case "DB55":
				driver.get("https://qaphr55.prismhr.com/qaphr55/");
				break;
				
			case "DB56":
				driver.get("https://qaphr56.prismhr.com/qaphr56/");
				break;
				
			case "DB57":
				driver.get("https://qaphr57.prismhr.com/qaphr57/");
				break;
				
			case "DB58":
				driver.get("https://qaphr58.prismhr.com/qaphr58/");
				break;
				
			case "DB59":
				driver.get("https://qaphr59.prismhr.com/qaphr59/");
				break;
				
			case "DB60":
				driver.get("https://qaphr60.prismhr.com/qaphr60/");
				break;
				
			case "DB61":
				driver.get("https://qaphr61.prismhr.com/qaphr61/");
				break;
				
			case "DB62":
				driver.get("https://qaphr62.prismhr.com/qaphr62/");
				break;
				
			case "DB63":
				driver.get("https://qaphr63.prismhr.com/qaphr63/");
				break;
				
			case "DB64":
				driver.get("https://qaphr64.prismhr.com/qaphr64/");
				break;
				
			case "DB65":
				driver.get("https://qaphr65.prismhr.com/qaphr65/");
				break;
				
			case "DB66":
				driver.get("https://qaphr66.prismhr.com/qaphr66/");
				break;
				
			case "DB67":
				driver.get("https://qapthr67.prismhr.com/qapthr67/");
				break;
				
			case "DB68":
				driver.get("https://qaphr68.prismhr.com/qaphr68/");
				break;
				
			case "DB69":
				driver.get("https://qaphr69.prismhr.com/qaphr69/");
				break;
				
			case "DB70":
				driver.get("https://qaphr70.prismhr.com/qaphr70/");
				break;
				
			case "DB71":
				driver.get("https://qaphr71.prismhr.com/qaphr71/");
				break;
				
			case "DB72":
				driver.get("https://qaphr72.prismhr.com/qaphr72/");
				break;
				
			case "DB73":
				driver.get("https://qapthr73.prismhr.com/qapthr73/");
				break;
				
			case "DB74":
				driver.get("https://qaphr74.prismhr.com/qaphr74/");
				break;
				
			case "DB75":
				driver.get("https://qaphr75.prismhr.com/qaphr75/");
				break;
				
			case "DB76":
				driver.get("https://qaphr76.prismhr.com/qaphr76/");
				break;
				
			case "DB77":
				driver.get("https://qaphr77.prismhr.com/qaphr77/");
				break;
				
			case "DB78":
				driver.get("https://qaphr78.prismhr.com/qaphr78/");
				break;
				
			case "DB79":
				driver.get("https://qaphr79.prismhr.com/qaphr79/");
				break;
				
			case "DB80":
				driver.get("https://qaphr80.prismhr.com/qaphr80/");
				break;
				
			case "DB81":
				driver.get("https://qaphr81.prismhr.com/qaphr81/");
				break;
				
			case "DB82":
				driver.get("https://qaphr82.prismhr.com/qaphr82/");
				break;
				
			case "DB83":
				driver.get("https://qaphr83.prismhr.com/qaphr83/");
				break;
				
			case "DB84":
				driver.get("https://qaphr84.prismhr.com/qaphr84/");
				break;
				
			case "DB85":
				driver.get("https://qaphr85.prismhr.com/qaphr85/");
				break;
				
			case "PRODQA":
				driver.get("https://prodqa.prismhr.com/prodqa/");
				break;
				
			case "PRODSTG":
				driver.get("https://prodstg.prismhr.com/prodstg/");
				break;
				
			case "ORD11":
				driver.get("https://2qaphr011.prismhr.com/2qaphr011/");
				break;
				
			case "PRE-RELEASE":
				driver.get("https://qaphrpredemo.prismhr.com/qaphrpre.demo/");
				break;
			
			}
			pm.login(uname, pass);
			try {
				pm.users(firstname);
			}catch(Exception e) {
				
			}
			
			pm.signout();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		}
		
		driver.quit();
		
	}

}
