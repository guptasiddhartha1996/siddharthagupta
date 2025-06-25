package com.OBBE.Testcases;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.testng.annotations.*;

import com.OBBE.Utilities.Xls_Reader;
import com.google.common.collect.Table.Cell;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	
	public static WebDriver driver;
	public Properties prop;
	
	WebDriver wait;
	
	@BeforeClass
	public WebDriver setup() throws IOException {
		prop=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\config.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome")){	
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--incognito");

			driver=new ChromeDriver(option);
		}
		else if (browserName.equalsIgnoreCase("Edge")) {
			
			driver=new EdgeDriver();
		}else if (browserName.equalsIgnoreCase("firefox")) {
			
			driver=new FirefoxDriver();
		}
		int implicitwait=Integer.valueOf(prop.getProperty("implicitwait"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitwait));
		driver.manage().window().maximize();
		
		
		return driver;
		
	}
	
	public void Alertaccept() {
		Alert alt=driver.switchTo().alert();
		String alt_txt=driver.switchTo().alert().getText();
		System.out.println(alt_txt);
		alt.accept();
	}
	
	public String failed(String Testcasename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File scrfile = ts.getScreenshotAs(OutputType.FILE);
		String destfile=System.getProperty("user.dir")+"\\Screenshots\\"+Testcasename+".png";
		FileUtils.copyFile(scrfile, new File(destfile));
		return destfile;
	}
	
	public static String generateRandomNames() {
		
		String randomstr=RandomStringUtils.randomAlphabetic(3);
		return randomstr;
	}
	
	public static String generateRandomSSN() {
	    int m = (int) Math.pow(10, 7);
	    int x= m + new Random().nextInt(9 * m);
	    return "1"+x;
	   
	}
	
//	public static Object[][] writedatatosheet(Object[][] tdata) throws IOException {
//		FileOutputStream file=new FileOutputStream("C:\\Users\\sigupta\\OneDrive - Employer Solutions\\Desktop\\New Hire.xlsx");
//		XSSFWorkbook workbook=new XSSFWorkbook();
//		XSSFSheet sheet=workbook.createSheet("Test Data");
//		int rows=tdata.length;
//		System.out.println("ROWS: "+rows);
//		int cols=tdata[0].length;
//		System.out.println("COLS: "+cols);
//		
//		for(int r=0;r<rows;r++) {
//			
//			XSSFRow row=sheet.createRow(r);
//			
//			for(int c=0;c<cols;c++) {
//				
//				XSSFCell cell=row.createCell(c);
//				Object value=tdata[r][c];
//				
//				if(value instanceof String) {
//					cell.setCellValue((String)value);
//				}
//				if(value instanceof Integer) {
//					cell.setCellValue((Integer)value);
//				}
//				if(value instanceof Boolean) {
//					cell.setCellValue((Boolean) value);
//				}
//			}
//		}
//		
//		workbook.write(file);
//		file.close();
//		System.out.println("File is created");
//		return tdata;	
//		
//	}
	

	
	
	
	public void robot() throws InterruptedException {
		StringSelection filepathselection= new StringSelection("C:\\Users\\sigupta\\OneDrive - Employer Solutions\\Desktop\\abc.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepathselection, null);
		Robot rb;
		try {
			rb = new Robot();
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(2000);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			e.printStackTrace();
		}
		
	}
	

	
	@AfterClass
	public void teardown() throws IOException {	
		driver.quit(); 
	}
	
	
	
	
	

}
