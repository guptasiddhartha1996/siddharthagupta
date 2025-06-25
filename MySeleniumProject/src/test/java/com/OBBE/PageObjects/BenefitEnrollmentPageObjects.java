package com.OBBE.PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.OBBE.Testcases.BaseTest;

import junit.framework.Assert;

public class BenefitEnrollmentPageObjects extends BaseTest{
	
	public BenefitEnrollmentPageObjects(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="benefit-enrollment-widget-button")
	WebElement review_btn;
	
	@FindBy(xpath="//div[@class='get-started-box panel be-welcome']/h1")
	WebElement welcomemessage;
	
	@FindBy(id="btn-next")
	WebElement nxt_btn;
	
	@FindBy(xpath="//button[@class='dependent-tile add-dependent-button height-10rem']")
	WebElement adddependent_btn;
	
	@FindBy(id="relationship")
	WebElement relationshipdrodpown;
	
	@FindBy(id="firstName")
	WebElement firstname;
	
	@FindBy(id="lastName")
	WebElement lastName;
	
	@FindBy(name="dob")
	WebElement dob;
	
	@FindBy(name="gender1")
	WebElement gender;
	
	@FindBy(name="ssn")
	WebElement ssn;
	
	@FindBy(name="addressLine1")
	WebElement address;
	
	@FindBy(name="zip")
	WebElement zip;
	
	@FindBy(name="homePhone")
	WebElement primaryphone;
	
	
	@FindBy(id="dnb-edit-save")
	WebElement save_btn;
	
	@FindBy(id="spouseWaiveReason")
	WebElement spouseWaiveReason;
	
	@FindBy(xpath="//input[@type='checkbox' and @id='SGMEDHDHP']")
	WebElement sgmedhdhpcheckbox;
	
	@FindBy(xpath="//div[@class='modal-header']/h3")
	WebElement pcptext;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement physicianname;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement pcpid;
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement save_button;
	
	@FindBy(xpath="//input[@type='checkbox' and @id='SGDEN']")
	WebElement sgdencheckbox;
	
	@FindBy(xpath="//div[@class='pcpReq']")
	WebElement pcpmodal;
	
	@FindBy(xpath="//input[@type='checkbox' and @id='SGVIS']")
	WebElement sgvischeckbox;
	
	@FindBy(xpath="//input[@type='checkbox' and @id='SGTELE1']")
	WebElement telecheckbox;
	
	@FindBy(xpath="//input[@type='checkbox' and @id='SGGAP']")
	WebElement sggap;
	
	@FindBy(xpath="//input[@type='checkbox' and @id='SGCI']")
	WebElement sgcri;
	
	@FindBy(xpath="//input[@type='checkbox' and @id='SGADD']")
	WebElement sgadd;
	
	@FindBy(id="JSACC")
	WebElement jsacc;
	
	@FindBy(id="SGLEGAL")
	WebElement legal;
	
	@FindBy(id="0_0")
	WebElement r;
	
	@FindBy(xpath="//div[@class='banner-description ng-star-inserted']")
	WebElement complete_txt;
	
	@FindBy(id="dnb-edit-save")
	WebElement finishbtn;
	
	@FindBy(id="SGHOS")
	WebElement sghos;
	
	@FindBy(id="0_0")
	WebElement firstradio;
	
	@FindBy(id="1_0")
	WebElement secondradio;
	
	@FindBy(id="2_0")
	WebElement thirdradio;
	
	@FindBy(id="SGCAN")
	WebElement cancer;
	
	@FindBy(id="1_1")
	WebElement secondradio_1;
	
	@FindBy(id="2_2")
	WebElement thirdradio_1;
	
	@FindBy(id="SGLIFECRL")
	WebElement sglifecrl;
	
	@FindBy(id="SGPET1")
	WebElement pet;
	
	@FindBy(id="SGVOLSTD")
	WebElement sgvollstd;
	
	@FindBy(id="SGLDA")
	WebElement sglda;
	
	@FindBy(id="SGSTD3M")
	WebElement sgstd;
	
	@FindBy(id="SGLTD")
	WebElement sgltd;
	
	
	@FindBy(id="SGSDA")
	WebElement sgsda;
	
	@FindBy(id="SGBL2")
	WebElement sgbl2;
	
	@FindBy(id="SGWL")
	WebElement sgwl;
	
	@FindBy(id="1")
	WebElement spousechekbox;
	
	@FindBy(id="BASICLIFESPOUSE")
	WebElement basiclifespouse;
	
	@FindBy(id="SGGTL")
	WebElement sggtl;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement primaryamount;
	
	@FindBy(name="planId")
	WebElement fsa;
	
	@FindBy(name="planId")
	WebElement transit;
	
	@FindBy(id="close-button")
	WebElement closebutton;
	
	@FindBy(id="HSA:2025-03-06")
	WebElement hsa;
	
	@FindBy(name="planId")
	WebElement depfsa;
	
	@FindBy(xpath="//span[@class='summary-plan-terms-font color-red-40']")
	WebElement tnc;
	
	@FindBy(id="radioTrueMED0")
	WebElement radiomed;
	
	@FindBy(id="radioTrueLIF28")
	WebElement radiolife;
	
	@FindBy(xpath="//button[text()='Submit']")
	WebElement submitbutton;
	
	@FindBy(id="signature")
	WebElement sign;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement signtext;
	
	@FindBy(xpath="//button[text()='Complete Enrollment']")
	WebElement complete;
	
	@FindBy(xpath="(//div[@class='panel-body']//p)[1]")
	WebElement confirmationstatement;
	
	@FindBy(xpath="(//div[@class='second-column']//div[@class='report-header-info'])[2]")
	WebElement empid;
	
	
	
	public void Benefits() throws InterruptedException {
		Thread.sleep(2000);
		if(closebutton.isDisplayed()) {
			closebutton.click();
			review_btn.click();
		}
		else {
			review_btn.click();
		}	
	}
	
	public void Welcome() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		//Welcome Page
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(welcomemessage));
		String txt=welcomemessage.getText();
		System.out.println(txt);
		Assert.assertEquals("Welcome", txt);
		nxt_btn.click();
		
	}
	
	public void CurrentBenefits() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		//Current Benefits  Page
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(nxt_btn)).click();
	}
	
	public void Dependents() {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		//Dependents Page
		wait.until(ExpectedConditions.elementToBeClickable(adddependent_btn)).click();
		//adddependent_btn.click();
		Select slt=new Select(relationshipdrodpown);
		slt.selectByVisibleText("SPOUSE");
		firstname.sendKeys("Sid");
		lastName.sendKeys("Gupta");
		dob.sendKeys("01/01/1990");
		gender.click();
		ssn.sendKeys("112-32-2321");
		address.sendKeys("100 main street");
		zip.sendKeys("02301");
		primaryphone.sendKeys("9879871234");
		save_btn.click();
		nxt_btn.click();
	}
	
	public void Medical() {
		//Medical Page
		Select slt1=new Select(spouseWaiveReason);
		slt1.selectByVisibleText(" Will cover later with spanish ");
		sgmedhdhpcheckbox.click();
		if(pcptext.isDisplayed()) {
			physicianname.sendKeys("a");
			pcpid.sendKeys("a");
			save_button.click();
		}
		nxt_btn.click();
	}
	
	public void Dental() {
		//Dental Page
		sgdencheckbox.click();
		if(pcpmodal.isDisplayed()) {
			physicianname.sendKeys("a");
			pcpid.sendKeys("a");
			save_button.click();
		}
		nxt_btn.click();
	}
		
	public void Vision() throws InterruptedException {
		//Vision Page
		Thread.sleep(2000);
		sgvischeckbox.click();
		nxt_btn.click();
		Thread.sleep(2000);
	}
		
	public void Telehealth() throws InterruptedException {
		//Telehealth prebuilt
		Thread.sleep(2000);
		telecheckbox.click();
		nxt_btn.click();
		Thread.sleep(2000);
	}
		
	public void DomesticVision() throws InterruptedException {
		//Domestic Partner Vision
		Thread.sleep(2000);
		nxt_btn.click();
		Thread.sleep(2000);
	}
		
	public void Gap() throws InterruptedException {
		//Gap Insurance
		Thread.sleep(2000);
		sggap.click();
		nxt_btn.click();
		Thread.sleep(2000);
	}
		
	public void DomesticDental() throws InterruptedException {
		//Domestic Partner Dental
		Thread.sleep(2000);
		nxt_btn.click();
		Thread.sleep(2000);
	}
		

	public void DomesticMedical() throws InterruptedException {
		//Domestic Partner Medical
		Thread.sleep(2000);
		nxt_btn.click();
		Thread.sleep(2000);
	}

	public void Ancillary() throws InterruptedException {
		//Ancillary
		Thread.sleep(2000);
		nxt_btn.click();
	}

	public void CriticalIllness() throws InterruptedException {
		//Critical Illness
		Thread.sleep(2000);
		sgcri.click();
		nxt_btn.click();
	}

	public void Add() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		//Accidental Death and Dismemberment
		Thread.sleep(2000);
		sgadd.click();
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(save_button));
		save_button.click();
		wait.until(ExpectedConditions.visibilityOf(nxt_btn)).click();
		nxt_btn.click();
	}

	public void Accident() throws InterruptedException {
		//Accident
		Thread.sleep(2000);
		jsacc.click();
		nxt_btn.click();
		Thread.sleep(2000);
	}

		
	public void Legal() throws InterruptedException {
		//Legal PreBuilt
		Thread.sleep(2000);
		legal.click();
		Thread.sleep(2000);
		r.click();
		Assert.assertEquals("Complete. You qualify to enroll in this plan.", complete_txt.getText());
		finishbtn.click();
		nxt_btn.click();
		Thread.sleep(2000);
	}
		
	public void Identity() throws InterruptedException {
		//Identity Theft
		Thread.sleep(2000);
		nxt_btn.click();
		Thread.sleep(2000);
	}
		
	public void VolHos() throws InterruptedException {
		//Voluntary Hospitalization
		Thread.sleep(2000);
		sghos.click();
		Thread.sleep(1000);
		firstradio.click();
		secondradio.click();
		thirdradio.click();
		Assert.assertEquals("Complete. You qualify to enroll in this plan.", complete_txt.getText());
		finishbtn.click();
		nxt_btn.click();
		Thread.sleep(2000);
	}
		
	public void Cancer() throws InterruptedException {
		//Cancer
		Thread.sleep(2000);
		cancer.click();
		firstradio.click();
		secondradio_1.click();
		thirdradio_1.click();
		Assert.assertEquals("Complete. You qualify to enroll in this plan.", complete_txt.getText());
		finishbtn.click();
		nxt_btn.click();
		Thread.sleep(2000);
	}
		

	public void CriticalIll() throws InterruptedException {
		//Critical Illness for Life prebuilt
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		sglifecrl.click();
		Thread.sleep(1000);
		save_button.click();
		js.executeScript("arguments[0].click();", nxt_btn);
		//nxt_btn.click();
		Thread.sleep(2000);
	}

		
	public void Pet() throws InterruptedException {
		//Pet Benefits
		Thread.sleep(2000);
		pet.click();
		Thread.sleep(2000);
		nxt_btn.click();
		Thread.sleep(2000);
	}
		

	public void Voluntary() throws InterruptedException {
		//Voluntary
		Thread.sleep(2000);
		sgvollstd.click();
		nxt_btn.click();
		Thread.sleep(2000);
	}

	public void AddLtd() throws InterruptedException {
		//Additional LTD
		Thread.sleep(2000);
		sglda.click();
		nxt_btn.click();
		Thread.sleep(2000);
	}

	public void Std() throws InterruptedException {
		//Short Term Disability
		Thread.sleep(2000);
		sgstd.click();
		firstradio.click();
		Assert.assertEquals("Complete. You qualify to enroll in this plan.", complete_txt.getText());
		finishbtn.click();
		nxt_btn.click();
		Thread.sleep(2000);
	}
	
	public void Ltd() throws InterruptedException {
		//Long Term Disability
		Thread.sleep(2000);
		sgltd.click();
		firstradio.click();
		secondradio.click();
		thirdradio_1.click();
		Assert.assertEquals("Complete. You qualify to enroll in this plan.", complete_txt.getText());
		finishbtn.click();
		nxt_btn.click();
		Thread.sleep(2000);
	}
		
	public void Astd() throws InterruptedException {
		//Additional STD
		Thread.sleep(2000);
		sgsda.click();
		nxt_btn.click();
		Thread.sleep(2000);
	}
		
	public void BasicLifeExtra() throws InterruptedException {
		//Basic Life Extra
		Thread.sleep(2000);
		sgbl2.click();
		Thread.sleep(1000);
		save_button.click();
		nxt_btn.click();
		Thread.sleep(2000);
	}
		
	public void WholeLifePrebuilt() throws InterruptedException {
		//Whole Life PreBuilt
		Thread.sleep(2000);
		sgwl.click();
		nxt_btn.click();
		Thread.sleep(2000);
	}


	public void SuppDep() throws InterruptedException {
		//Supplemental Life Dependents
		Thread.sleep(2000);
		nxt_btn.click();
		Thread.sleep(2000);
	}

		
	public void SuppSpouse() throws InterruptedException {
		//Supplemental Life Spouse
		Thread.sleep(2000);
		spousechekbox.click();
		Thread.sleep(2000);
		basiclifespouse.click();
		Thread.sleep(2000);
		save_button.click();
		nxt_btn.click();
		Thread.sleep(2000);
	}
		

		public void BasicLife() throws InterruptedException {
			//Basic Life
			Thread.sleep(2000);
			nxt_btn.click();
			Thread.sleep(2000);
		}

		public void VolLife() throws InterruptedException {
			//Voluntary Life
			Thread.sleep(2000);
			sggtl.click();
			Thread.sleep(1000);
			save_button.click();
			primaryamount.sendKeys("100");
			nxt_btn.click();
			Thread.sleep(2000);
		}

		
		public void Hsa() throws InterruptedException {
			//HSA
			Thread.sleep(2000);
			hsa.sendKeys("200");
			Thread.sleep(2000);
			nxt_btn.click();
			Thread.sleep(2000);
		}
		
		public void Fsa() throws InterruptedException {
			//FSA
			Thread.sleep(2000);
			fsa.sendKeys("200");
			Thread.sleep(2000);
			nxt_btn.click();
			Thread.sleep(2000);
		}
		
		public void Commuter() throws InterruptedException {
			//Commuter
			Thread.sleep(2000);
			transit.sendKeys("200");
			Thread.sleep(2000);
			nxt_btn.click();
			Thread.sleep(2000);
		}
		

		public void DepFsa() throws InterruptedException {
			//DEPFSA
			Thread.sleep(2000);
			depfsa.sendKeys("200");
			Thread.sleep(2000);
			nxt_btn.click();
			Thread.sleep(2000);
		}

		
		public void BenefitSummary() throws InterruptedException {
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			JavascriptExecutor js=(JavascriptExecutor)driver;
			//Benefit Summary
			Thread.sleep(2000);
			tnc.click();
			Thread.sleep(3000);
			js.executeScript("arguments[0].click();", radiomed);
			Thread.sleep(2000);
			js.executeScript("arguments[0].click();", radiolife);
			Thread.sleep(2000);
			submitbutton.click();
			Thread.sleep(2000);
		}
		
		public void Confirmation() throws InterruptedException {
			//Confirmation
			Thread.sleep(2000);
			sign.click();
			Thread.sleep(2000);
			signtext.sendKeys("JohnVuQ"+" "+"Leviszep");
			Thread.sleep(2000);
			complete.click();
		}
		

		public void ConfirmationStatement() {
			
			Assert.assertEquals("W00994", empid.getText().contains("W00994"));
			String txt="This is a summary of the benefits you have confirmed. You may want to print a copy for your own records using the Print button. "
					+ "You can also find a copy of this statement in the Employee Portal.";
			Assert.assertEquals(txt, confirmationstatement.getText());
		}
		
		
		
	}


