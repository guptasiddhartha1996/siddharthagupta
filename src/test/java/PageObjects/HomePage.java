package PageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestCases.BaseTest;

public class HomePage extends BaseTest {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="(//a[contains(text(),'View')])[1]")
	WebElement viewprofile;
	
	@FindBy(partialLinkText="Complete")
	WebElement completeprofile;
	
	@FindBy(xpath="//span[text()='Career profile']")
	WebElement careerprofile;
	
	@FindBy(xpath="//span[text()='Career profile']/following-sibling::*")
	WebElement editicon;
	
	@FindBy(xpath="//label[text()='Full time']")
	WebElement type;
	
	@FindBy(id="locationSugg")
	WebElement location;
	
	@FindBy(id="sugDrp_locationSugg")
	WebElement suggestions;
	
	@FindBy(xpath="//ul[@class='Sdrop']/li")
	WebElement lst;
	
	@FindBy(xpath="//div[@class='waves-effect chip']/span")
	List<WebElement> selectedlocation;
	
	@FindBy(xpath="//div[@class='waves-effect chip']/a")
	List<WebElement> cross;
	
	@FindBy(xpath="//ul[@class='Sdrop']/li")
	List<WebElement> ls;
	
	@FindBy(id="saveDesiredProfile")
	WebElement savebutton;
	
	@FindBy(xpath="//span[text()='Resume']")
	WebElement resume;
	
	@FindBy(xpath="//span[text()='Upload resume']")
	WebElement uploadbutton;
	
	@FindBy(xpath="//span[@data-title='delete-resume']")
	WebElement trashbutton;
	
	@FindBy(xpath="(//button[text()='Delete'])[2]")
	WebElement deletebutton;
	
	
	
	public void CareerProfile(String loc, String lc) throws InterruptedException {
	
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(viewprofile)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(careerprofile)).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(editicon)).click();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", type);
		System.out.println(selectedlocation.size());
		System.out.println(cross.size());
		System.out.println(ls.size());
		for(int i=0;i<selectedlocation.size();i++) {
			if(selectedlocation.get(i).getText().equalsIgnoreCase(loc)) {
				Thread.sleep(2000);
				cross.get(i).click();
				Thread.sleep(2000);
				break;
			}
		}
		location.sendKeys(lc);
		Thread.sleep(3000);
		ls.get(0).click();
		Thread.sleep(2000);
		savebutton.click();
		
	}
	
	public void UpdateResume() throws InterruptedException, AWTException {
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(viewprofile)).click();
		Thread.sleep(2000);
		resume.click();
		if(trashbutton.isDisplayed()) {
			trashbutton.click();
			Thread.sleep(2000);
			deletebutton.click();
			Thread.sleep(2000);
		}
		
		resume.click();
		Thread.sleep(2000);
		uploadbutton.click();
		Thread.sleep(2000);
		StringSelection filepathselection=new StringSelection("C:\\Users\\gupta\\Downloads\\Siddhartha_QA_6.5yrs_Resume.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepathselection, null);
		
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	}
	
	

}
