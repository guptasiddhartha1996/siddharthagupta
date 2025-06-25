package com.OBBE.PageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.OBBE.Testcases.BaseTest;

public class OnboardingPageObjects extends BaseTest {
	
	public OnboardingPageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//Initial Visit Page Objects
	@FindBy(xpath="//button[@type='button']")
	WebElement continue_btn;
	
	@FindBy(xpath="//span[@class='welcome-message']")
	WebElement welcome_message;
	
	@FindBy(xpath="//span[@title='Initial Visit']")
	WebElement initial_visit;
	
	@FindBy(xpath="//span[@title='Return Visit']")
	WebElement return_visit;
	
	
	//Electronic Consent Page Objects
	@FindBy(id="signature")
	WebElement signature;
	
	@FindBy(xpath="//button[@type='button' and @class='btn btn-primary btn-in-page-margin-cls btn-grow-cls']")
	WebElement accept_btn;
	
	@FindBy(xpath="//div[@class=\"signature-name ng-star-inserted\"]//b")
	WebElement date;
	
	
	//I9 Section 1 Page Objects
	@FindBy(id="preparerNo")
	WebElement no;
	
	@FindBy(xpath="//button[@class='btn btn-footer-primary']")
	WebElement next_btn;
	
	@FindBy(id="radioZ01")
	WebElement citizen_radio;
	
	@FindBy(id="i9List1Docs")
	WebElement document_drop;
	
	@FindBy(xpath="(//a[@class='uploadbox-link'])[1]")
	WebElement selectafile;
	
	@FindBy(xpath="//a[@class='ng-star-inserted']")
	WebElement deletetrash;
	
	@FindBy(xpath="(//a[@class='uploadbox-link'])")
	WebElement secondselectafile;
	
	@FindBy(id="uSDOption")
	WebElement checkbox;
	
	@FindBy(id="i9LastName")
	WebElement last_name;
	
	@FindBy(id="i9FirstName")
	WebElement first_name;
	
	@FindBy(id="i9BirthDate")
	WebElement birth_date;
	
	@FindBy(id="i9SSN")
	WebElement ssn;
	
	@FindBy(id="i9Address")
	WebElement address;
	
	@FindBy(id="i9City")
	WebElement city;
	
	@FindBy(id="i9State")
	WebElement state;
	
	@FindBy(id="i9Zip")
	WebElement zip;
	
	@FindBy(id="signature")
	WebElement check_sign;
	
	@FindBy(xpath="//button[@class='btn btn-footer-primary ng-star-inserted']")
	WebElement submit_btn;
	
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement yes_btn;
	
	
	//Employee Information Page Objects
	@FindBy(xpath="//button[@class='btn btn-footer-primary footer-primary-cutom100']")
	WebElement nxt_btn;
	
	@FindBy(xpath="//button[@class='btn btn-footer-primary btn-footer-primary-custom ng-star-inserted']")
	WebElement sub_btn;
	
	
	//Direct Deposit PageObjects
	@FindBy(xpath="//button[@class='btn btn-footer-primary footer-custom-btn btn-primary-txt ng-star-inserted']")
	WebElement setupdirectdeposit_btn;
	
	@FindBy(id="addAccount3")
	WebElement addaccount_btn;
	
	@FindBy(id="addAccount1")
	WebElement addaccount1;
	
	@FindBy(id="accountType")
	WebElement account_type;
	
	@FindBy(id="depositMethod")
	WebElement depositmethod;
	
	@FindBy(id="amount")
	WebElement amount;
	
	@FindBy(id="routingNumber")
	WebElement rountingnumber;
	
	@FindBy(id="accountNumber")
	WebElement accountnumber;
	
	@FindBy(id="accountNumberConfirm")
	WebElement confirmaccountnumber;
	
	@FindBy(xpath="//button[@class='btn btn-footer-primary']")
	WebElement save_btn;
	
	@FindBy(id="checkbox")
	WebElement check_box;
	
	@FindBy(xpath="//button[@class='btn btn-footer-primary']")
	WebElement submit_btnn;
	
	@FindBy(xpath="(//button[@class='btn btn-primary'])[3]")
	WebElement yessubmitbutton;
	
	@FindBy(xpath="//a[@class='btn btn-outline-gray-30 d-none d-md-inline cursor ml-3']")
	WebElement deletebutton;
	
	@FindBy(xpath="(//button[@class='btn btn-primary'])[3]")
	WebElement yesbutton;
	
	
	//Disability Page Objectes
	@FindBy(id="disabilityStatus")
	WebElement disabilitystatus;
	
	@FindBy(xpath="//button[@class='btn btn-footer-primary footer-primary-cutom100']")
	WebElement submitdisability;
	
	
	//Tax Page Objects
	@FindBy(id="option_federalGuidedQ1_standardFormW4")
	WebElement federal;
	
	@FindBy(xpath="//button[@class='spf-button spf-confirm-button']")
	WebElement confirm_btn;
	
	@FindBy(id="option_federalGuidedQ2_standardFormEnglish")
	WebElement language;
	
	@FindBy(id="option_isTerminatingMilitarySpouseExemption_false")
	WebElement miliatry;
	
	@FindBy(id="option_maGuidedQ1_notExempt")
	WebElement maguided;
	
	@FindBy(id="option_survey_all")
	WebElement jobs;
	
	@FindBy(id="option_survey_none")
	WebElement none;
	
	@FindBy(id="option_paGuidedQ1_allPittsNoneNoLst")
	WebElement none1;
	
	@FindBy(id="option_isNra_false")
	WebElement nonresidient;
	
	@FindBy(id="option_isExempt_notExempt")
	WebElement notexempt;
	
	@FindBy(id="option_filingStatus_HEAD_OF_HOUSEHOLD")
	WebElement headofhouse;
	
	@FindBy(id="option_step2Survey_none")
	WebElement none2;
	
	@FindBy(id="option_dependentsSurvey_false")
	WebElement claim;
	
	@FindBy(id="option_otherAdjustmentsSurvey_false")
	WebElement nop;
	
	@FindBy(id="attestation")
	WebElement federalcheckbox;
	
	@FindBy(id="option_fullTimeStudent_false")
	WebElement none3;
	
	@FindBy(id="option_personalExemption_0")
	WebElement zero;
	
	@FindBy(id="option_maritalStatus_false")
	WebElement none4;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement number;
	
	@FindBy(xpath="//button[@class='spf-button spf-confirm-button']")
	WebElement cnf_btn;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement number1;
	
	@FindBy(id="option_additionalExemptions_headOfHousehold")
	WebElement willfile;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement dollar;
	
	@FindBy(id="attestation")
	WebElement attestation;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement psdcode;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement eitrate;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	WebElement municipality;
	
	@FindBy(xpath="(//input[@type='text'])[4]")
	WebElement county;
	
	@FindBy(xpath="//input[@type='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@type='tel']")
	WebElement tel;
	
	@FindBy(id="attestation")
	WebElement attestation1;
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement continuebutton;
	
	@FindBy(xpath="//button[@class='btn btn-footer-primary footer-primary-cutom100 ng-star-inserted']")
	WebElement submitbutton;
	
	
	//Elect W-2 Page Objects
	@FindBy(id="w2electStatus")
	WebElement electstatus;
	
	@FindBy(xpath="//button[@class='btn btn-footer-primary footer-primary-cutom100']")
	WebElement submitbtn;
	
	
	//Race/Ethinicity Page Objects
	@FindBy(id="raceAndEthnicity")
	WebElement race;
	
	@FindBy(xpath="//button[@class='btn btn-footer-primary footer-primary-cutom100']")
	WebElement s_btn;
	
	
	//Amanda Test form Page Objects
	@FindBy(id="signature")
	WebElement elec_sign;
	
	@FindBy(xpath="//button[@class='btn btn-footer-primary footer-primary-cutom100 ng-star-inserted']")
	WebElement submit_t;
	
	
	//SidChecking Page Objects
	@FindBy(id="signature")
	WebElement check;
	
	@FindBy(xpath="//button[@class='btn btn-footer-primary footer-primary-cutom100 ng-star-inserted']")
	WebElement subm;
	
	
	//Custom Page Objects
	@FindBy(id="signature")
	WebElement inv_sign;
	
	@FindBy(xpath="//button[@class='btn btn-footer-primary footer-primary-cutom100 ng-star-inserted']")
	WebElement inv_submit;
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement failed_btn;
	
	@FindBy(id="radioCat0")
	WebElement cat;
	
	
	//Veteran Page Objects
	@FindBy(id="veteranStatus")
	WebElement veteran;
	
	@FindBy(xpath="//button[@class='btn btn-footer-primary footer-primary-cutom100']")
	WebElement btn_veteran;
	
	
	//OB Summary Page Objects
	@FindBy(xpath="//button[@class='btn btn-primary mb-4 btn-mobile-view']")
	WebElement ctn_btn;
	
	
	//Submit Page
	@FindBy(id="acknowledgment")
	WebElement ack;
	
	@FindBy(xpath="//button[@class='btn btn-footer-primary footer-primary-cutom100']")
	WebElement s;
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement yeah;
	
	@FindBy(xpath="//button[@class='btn btn-primary width-100 ng-star-inserted']")
	WebElement be_btn;
	
	@FindBy(id="userMenu")
	WebElement usermenu;
	
	@FindBy(xpath="//button[text()=' Log Out ']")
	WebElement logout;
	
	
	//I9 Section 2
	@FindBy(xpath="//td[@title='Approvals']")
	WebElement approvalsbutton;
	
	@FindBy(id="body_span43v1")
	WebElement approvalspendingtableavailabletoyou;
	
	public String beforeid="tdxspan43v1x";
	
	public String afterid="z3";
	public String afid="z1";
	
	@FindBy(id="button48v2")
	WebElement grabbutton;
	
	@FindBy(id="body_span40v1")
	WebElement approvalspendingtableassignedtoyou;
	
	public String bid="tdxspan40v1x";
	public String aid="z3";
	public String aaid="z1";
	
	@FindBy(id="extApp1")
	WebElement iframe;
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement nextbutn;
	
	@FindBy(id="documentNumberStepOne")
	WebElement docnumber;
	
	@FindBy(id="issuingOfAuthorityStepOne")
	WebElement issuingauthority;
	
	@FindBy(id="expirationDateStepOne")
	WebElement expirationdate;
	
	@FindBy(id="apTitle")
	WebElement title;
	
	
	@FindBy(id="signature")
	WebElement sign;
	
	@FindBy(xpath="//button[@class='btn btn-primary float-right']")
	WebElement subbutton;
	
	@FindBy(xpath="//a[@class='btn btn-lg ml15 mr-3']")
	WebElement downloadbutton;
	
	
	
	
	
	
	
	public void Onboarding(String lastname, String firstname, String bdate, String sosn, String add, String cty,String stat, String zp, String routing_number) throws InterruptedException {
		
		try {
			
		
		
		//Initial Visit Page
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(welcome_message));
		Assert.assertEquals(welcome_message.getText(),"We are excited that you are joining our team!");
		Assert.assertEquals(initial_visit.getText(),"Initial Visit");
		continue_btn.click();
		
		//Electronic Consent Page
		signature.sendKeys("Test");
		Thread.sleep(2000);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", accept_btn);
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		Date date = new Date();
		String date1= dateFormat.format(date);
		System.out.println(date1);
		wait.until(ExpectedConditions.elementToBeClickable(continue_btn)).click();
		
		
		//I9 Section 1 Page
		Thread.sleep(2000);
		continue_btn.click();
		Thread.sleep(2000);
		no.click();		
		next_btn.click();
		Thread.sleep(2000);
		citizen_radio.click();
		next_btn.click();
		Thread.sleep(2000);
		
		//File Upload
		Select st=new Select(document_drop);
		st.selectByVisibleText("A - U.S. Passport");
		executor.executeScript("arguments[0].click();", selectafile);
		Thread.sleep(2000);
		robot();
		wait.until(ExpectedConditions.visibilityOf(deletetrash));
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(selectafile));
		executor.executeScript("arguments[0].scrollIntoView(true);",selectafile);
		selectafile.click();
		Thread.sleep(2000);
		robot();
		Thread.sleep(3000);
		
		//checkbox.click();
		
		next_btn.click();
		Thread.sleep(2000);
		last_name.sendKeys(lastname);
		Thread.sleep(2000);
		first_name.sendKeys(firstname);
		Thread.sleep(2000);
		birth_date.sendKeys(bdate);
		Thread.sleep(2000);
		ssn.sendKeys(sosn);
		Thread.sleep(2000);
		address.sendKeys(add);
		Thread.sleep(2000);
		city.sendKeys(cty);
		Thread.sleep(2000);
		Select slt=new Select(state);
		slt.selectByValue(stat);
		zip.sendKeys(zp);
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", check_sign);
		Thread.sleep(2000);
		next_btn.click();
		wait.until(ExpectedConditions.elementToBeClickable(submit_btn)).click();
		yes_btn.click();
		
		
		//Employee Information Page
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(nxt_btn)).click();
		//nxt_btn.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(next_btn)).click();
		//next_btn.click();
		Thread.sleep(2000);
		next_btn.click();
		Thread.sleep(2000);
		sub_btn.click();
		Thread.sleep(2000);
		yes_btn.click();
		
		
		//Direct Deposit Page
		setupdirectdeposit_btn.click();
		Thread.sleep(2000);
		if(addaccount1.isDisplayed()) {
			if(deletebutton.isDisplayed()) {
				deletebutton.click();
				yesbutton.click();
				wait.until(ExpectedConditions.elementToBeClickable(addaccount_btn)).click();
				//addaccount_btn.click();
				Thread.sleep(1000);
				Select slt1=new Select(account_type);
				slt1.selectByValue("Saving");
				Thread.sleep(1000);
				Select slt2=new Select(depositmethod);
				slt2.selectByVisibleText("Fixed Amount");
				Thread.sleep(1000);
				amount.sendKeys("200");
				Thread.sleep(1000);
				rountingnumber.sendKeys("026009593");
				Thread.sleep(1000);
				accountnumber.sendKeys("123456");
				Thread.sleep(1000);
				confirmaccountnumber.sendKeys("123456");
				Thread.sleep(1000);
				save_btn.click();
				Thread.sleep(1000);
				
			}

				
		}
		else {
		addaccount_btn.click();
		Thread.sleep(1000);
		Select slt1=new Select(account_type);
		slt1.selectByValue("Saving");
		Thread.sleep(1000);
		Select slt2=new Select(depositmethod);
		slt2.selectByVisibleText("Fixed Amount");
		Thread.sleep(1000);
		amount.sendKeys("200");
		Thread.sleep(1000);
		rountingnumber.sendKeys("026009593");
		Thread.sleep(1000);
		accountnumber.sendKeys("123456");
		Thread.sleep(1000);
		confirmaccountnumber.sendKeys("123456");
		Thread.sleep(1000);
		save_btn.click();
		Thread.sleep(1000);
		}
		executor.executeScript("arguments[0].click();", check_box);
		Thread.sleep(1000);
		submit_btnn.click();
		Thread.sleep(1000);
		yessubmitbutton.click();
		
		
		
		//Disability Page
		Thread.sleep(2000);
		Select select=new Select(disabilitystatus);
		select.selectByVisibleText(" No, I do not have a disability and have not had one in the past ");
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", submitdisability);
		//submitdisability.click();
		
		
		//Tax form page
		try {
			
		wait.until(ExpectedConditions.elementToBeClickable(federal)).click();
		confirm_btn.click();
		wait.until(ExpectedConditions.elementToBeClickable(language)).click();
		Thread.sleep(2000);
		confirm_btn.click();
		wait.until(ExpectedConditions.elementToBeClickable(miliatry)).click();
		Thread.sleep(2000);
		confirm_btn.click();
		wait.until(ExpectedConditions.elementToBeClickable(maguided)).click();
		Thread.sleep(2000);
		confirm_btn.click();
		Thread.sleep(2000);
		jobs.click();
		Thread.sleep(2000);
		confirm_btn.click();
		Thread.sleep(2000);
		none.click();
		Thread.sleep(2000);
		confirm_btn.click();
		wait.until(ExpectedConditions.elementToBeClickable(none1)).click();
		Thread.sleep(2000);
		confirm_btn.click();
		wait.until(ExpectedConditions.elementToBeClickable(nonresidient)).click();
		Thread.sleep(2000);
		confirm_btn.click();
		wait.until(ExpectedConditions.elementToBeClickable(notexempt)).click();
		Thread.sleep(2000);
		confirm_btn.click();
		wait.until(ExpectedConditions.elementToBeClickable(headofhouse)).click();
		Thread.sleep(2000);
		confirm_btn.click();
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", none2);
		Thread.sleep(2000);
		confirm_btn.click();
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", claim);
		Thread.sleep(2000);
		confirm_btn.click();
		wait.until(ExpectedConditions.elementToBeClickable(nop)).click();
		Thread.sleep(2000);
		confirm_btn.click();
		wait.until(ExpectedConditions.elementToBeClickable(federalcheckbox)).click();
		Thread.sleep(2000);
		confirm_btn.click();
		wait.until(ExpectedConditions.elementToBeClickable(none3)).click();
		Thread.sleep(2000);
		confirm_btn.click();
		wait.until(ExpectedConditions.elementToBeClickable(zero)).click();
		Thread.sleep(2000);
		confirm_btn.click();
		wait.until(ExpectedConditions.elementToBeClickable(none4)).click();
		Thread.sleep(2000);
		confirm_btn.click();
		Thread.sleep(2000);
		number.sendKeys("0");
		Thread.sleep(2000);
		confirm_btn.click();
		Thread.sleep(2000);
		number1.sendKeys("0");
		Thread.sleep(2000);
		confirm_btn.click();
		wait.until(ExpectedConditions.elementToBeClickable(willfile)).click();
		Thread.sleep(2000);
		confirm_btn.click();
		Thread.sleep(2000);
		dollar.sendKeys("0");
		Thread.sleep(2000);
		confirm_btn.click();
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", attestation);
		Thread.sleep(2000);
		confirm_btn.click();
		Thread.sleep(3000);
		psdcode.sendKeys("0");
		Thread.sleep(2000);
		eitrate.sendKeys("0");
		Thread.sleep(2000);
		municipality.sendKeys("M");
		Thread.sleep(2000);
		county.sendKeys("M");
		Thread.sleep(2000);
		confirm_btn.click();
		Thread.sleep(2000);
		confirm_btn.click();
		Thread.sleep(2000);
		email.sendKeys("abc@test.com");
		Thread.sleep(2000);
		tel.sendKeys("9865544333");
		Thread.sleep(2000);
		confirm_btn.click();
		wait.until(ExpectedConditions.elementToBeClickable(attestation1)).click();
		Thread.sleep(2000);
		confirm_btn.click();
		//wait.until(ExpectedConditions.elementToBeClickable(continuebutton)).click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(submitbutton));
		submitbutton.click();
		Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		//Elect W-2 Page
		Thread.sleep(3000);
		executor.executeScript("arguments[0].click();", electstatus);
		Thread.sleep(2000);
		submitbtn.click();
		
		//Race/Ethnicity
		Select select1=new Select(race);
		select1.selectByVisibleText("UKNOWN");
		Thread.sleep(2000);
		s_btn.click();
		
		//Amanda Test form Page
		Thread.sleep(3000);
		executor.executeScript("arguments[0].click();", elec_sign);
		Thread.sleep(2000);
		submit_t.click();
		
		//SidChecking Page
		Thread.sleep(3000);
		executor.executeScript("arguments[0].click();", check);
		Thread.sleep(3000);
		subm.click();
		
		//Custom Page INV Page1
		Thread.sleep(5000);
		executor.executeScript("arguments[0].click();", inv_sign);
		Thread.sleep(2000);
		inv_submit.click();
		
		
		//INV Page 2
		Thread.sleep(5000);
		executor.executeScript("arguments[0].click();", inv_sign);
		Thread.sleep(2000);
		inv_submit.click();
		
		//INV Page 3
		Thread.sleep(5000);
		executor.executeScript("arguments[0].click();", inv_sign);
		Thread.sleep(3000);
		inv_submit.click();
		Thread.sleep(2000);
		
		cat.click();
		Thread.sleep(2000);
		inv_submit.click();
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", inv_sign);
		Thread.sleep(3000);
		inv_submit.click();
		Thread.sleep(3000);
		executor.executeScript("arguments[0].click();", inv_sign);
		Thread.sleep(3000);
		inv_submit.click();
		
		
		//Veteran Page
		Thread.sleep(3000);
		Select select2=new Select(veteran);
		select2.selectByVisibleText("I am NOT a veteran");
		Thread.sleep(2000);
		btn_veteran.click();
		
		
		//Onboarding Summary
		Thread.sleep(2000);
		ctn_btn.click();
		
		
		//Submit Page
		executor.executeScript("arguments[0].click();", ack);
		Thread.sleep(2000);
		s.click();
		Thread.sleep(2000);
		yeah.click();
		System.out.println(be_btn.getText());
		Assert.assertEquals(be_btn.getText(), "Benefit Enrollment");
		usermenu.click();
		logout.click();
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void i9section2(String firstname) throws InterruptedException {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		approvalsbutton.click();
		Thread.sleep(2000);
		List<WebElement> rows=approvalspendingtableavailabletoyou.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		for(int i=1;i<=rows.size();i++) {
			String value=driver.findElement(By.id(beforeid+i+afterid)).getText();
			System.out.println(value);
			if(value.contains(firstname)) {
				driver.findElement(By.id(beforeid+i+afid)).click();
				break;
				
			}
		}
		Thread.sleep(2000);
		grabbutton.click();
		Thread.sleep(2000);
		
		List<WebElement> rw=approvalspendingtableassignedtoyou.findElements(By.tagName("tr"));
		System.out.println(rw.size());
		for(int i=1;i<=rw.size();i++) {
			String txt=driver.findElement(By.id(bid+i+aid)).getText();
			if(txt.contains(firstname)) {
				driver.findElement(By.id(bid+i+aaid)).click();
				break;
			}
			
			
		}
		
		driver.switchTo().frame(iframe);
		wait.until(ExpectedConditions.elementToBeClickable(nextbutn)).click();
		executor.executeScript("arguments[0].click();",nextbutn);
		Thread.sleep(2000);
		docnumber.sendKeys("52452452");
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(issuingauthority));
		Select sl=new Select(issuingauthority);
		sl.selectByVisibleText(" U.S. Department of State");
		Thread.sleep(2000);
		expirationdate.sendKeys("12/31/2031");
		Thread.sleep(2000);
		nextbutn.click();
		Thread.sleep(3000);
		nextbutn.click();
		Thread.sleep(3000);
		title.sendKeys("Mr");
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();",sign);
		Thread.sleep(2000);
		nextbutn.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(subbutton));
		subbutton.click();
		wait.until(ExpectedConditions.visibilityOf(nextbutn));
		nextbutn.click();
		wait.until(ExpectedConditions.elementToBeClickable(nextbutn));
		//downloadbutton.click();
		Thread.sleep(2000);
		nextbutn.click();	

	}
	
	
	
	
	
	
	
	
	
	
	

}
