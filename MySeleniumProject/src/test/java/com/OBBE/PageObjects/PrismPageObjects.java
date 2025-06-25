package com.OBBE.PageObjects;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.OBBE.Testcases.BaseTest;
import com.OBBE.Testcases.OBNewhire;

import junit.framework.Assert;

public class PrismPageObjects extends BaseTest{
	
	public PrismPageObjects(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//td[text()='Client / Dashboard / Enhanced Dashboard']")
	WebElement dashboardtext;
	
	@FindBy(xpath="//td[@title='Profile']")
	WebElement profile;
	
	@FindBy(xpath="//td[text()='Sign Out']")
	WebElement signout;
	
	@FindBy(name="HrpyWorkWUser")
	WebElement txt_username;
	
	@FindBy(name="HrpyWorkWPassword")
	WebElement txt_password;
	
	@FindBy(xpath="//button[@name='HrpyWorkBLogin']")
	WebElement btn_login;
	
	@FindBy(id="username")
	WebElement epusername;
	
	@FindBy(id="password")
	WebElement eppassword;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement epsigninbutton;
	
	@FindBy(id="manager-toggle-clickbox")
	WebElement togglebutton;
	
	@FindBy(xpath="//li[@tabindex='0']//p[text()='New Hire Dashboard']")
	WebElement newhiredashboard;
	
	@FindBy(xpath="//button[text()=' Hire New Employee ']")
	WebElement newhireemployeebutton;
	
	@FindBy(xpath="//input[@aria-label='First Name input']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@aria-label='Last Name input']")
	WebElement lastname;
	
	@FindBy(xpath="(//input[@id='type-ahead-dropdown-input'])[1]")
	WebElement wrklocation;
	
//	@FindBy(xpath="//div[@id='dbmasterdiv2']//a[@id='dbclosewindow2']")
//	WebElement crossbutton;
	
	@FindAll({
		@FindBy(xpath="//div[@id='dbmasterdiv2']//a[@id='dbclosewindow2']")
		 
		})
		private List<WebElement> crossbutton;
	
	@FindBy(xpath="//div[text()='Set Up Later']")
	WebElement setuplater;
	
	@FindBy(id="button17v1")
	WebElement send_btn;
	
	@FindBy(name="HrpyWorkWGlobalSearch")
	public WebElement searchbox;
	
	@FindBy(id="body_rdesignbaisdropv1")
	public WebElement searchtable;
	
	
	
	@FindBy(name="HrpUsersUserId")
	public WebElement userid;
	
	@FindBy(id="checkbox95v1")
	public WebElement checkbox;
	
	@FindBy(name="HrpUsersSmfaUserEnabled")
	public WebElement smfa;
	
	@FindBy(name="HrpUsersBSavefirst")
	public WebElement save;
	
	@FindBy(id="dbclosewindow2")
	public WebElement closewindow;
	
	//@FindBy(id="tdxrdesignbaisdropv1x3z1x10")
	@FindBy(xpath="(//td[contains(@id,'tdxrdesignbaisdropv1x')])[2]")
	WebElement searchenter;
	
	@FindBy(id="tdxrdesignbaisdropv1x2z1x10")
	WebElement workflow;
	
//	@FindBy(id="text39v1")
	@FindBy(name="HrpyWorkWGlobalSearch1")
	WebElement Eid;
	
//	@FindBy(id="select47v1")
	@FindBy(name="WebEnrollmentsObbeFlowType")
	WebElement Enrollmenttype;
	
	@FindBy(name="WebEnrollmentsObbeBDelete")
	WebElement Dlt_btn;
	
	@FindBy(id="popup_yes")
	WebElement popyes;
	
	@FindBy(name="WebEnrollmentsObbeBCreate")
	WebElement btn_create;
	
	@FindBy(id="select51v1")
	WebElement worktype;
	
	@FindBy(id="select52v1")
	WebElement action;
	
	@FindBy(id="text53v1")
	WebElement clientid;
	
	@FindBy(id="button46v1")
	WebElement searchbtn;
	
	@FindBy(id="radio67v2")
	public
	WebElement radio_btn;
	
	@FindBy(id="button52v2")
	public
	WebElement Continue_btn;
	
	@FindBy(id="popup_yes")
	public
	WebElement yes_btn;
	
	@FindBy(id="body_span50v1")
	public WebElement table;
	
	@FindBy(id="radio63v2")
	public WebElement r_btn;
	
	@FindBy(id="body_span2v2")
	public WebElement table2;

	
	public String beforeid="tdxspan50v1x";
	public String afterid="z3";
	
	public String bid="tdxspan2v2x";
	public String aid="z2";
	
	@FindBy(id="body_rdesignbaisdropv1")
	public WebElement table3;
	
	public String befid="tdrrdesignbaisdropv1x";
	
	@FindBy(name="EmployeeActionFormsLocnCode")
	public WebElement worklocation;
	
	@FindBy(name="EmployeeActionFormsWEmployerId")
	public WebElement employerid;
	
	@FindBy(name="EmployeeActionFormsWKeySsn")
	public WebElement ssn;
	
	@FindBy(name="EmployeeActionFormsHireTypeWk")
	public WebElement hiretype;
	
	@FindBy(name="EmployeeActionFormsUseOnboard")
	public WebElement useonboarding;
	
	@FindBy(name="EmployeeActionFormsFirstName")
	public WebElement fname;
	
	@FindBy(name="EmployeeActionFormsLastName")
	public WebElement lname;
	
	@FindBy(name="EmployeeActionFormsPreferredName")
	public WebElement prefname;
	
	@FindBy(name="EmployeeActionFormsBirthDate")
	public WebElement birthdate;
	
	@FindBy(name="EmployeeActionFormsGender")
	public WebElement gender;
	
	@FindBy(name="EmployeeActionFormsEthnicCode")
	public WebElement ethniccode;
	
	@FindBy(name="EmployeeActionFormsMaritalStatus")
	public WebElement maritalstatus;
	
	@FindBy(name="EmployeeActionFormsAddressOne")
	WebElement addlineone;
	
	@FindBy(name="EmployeeActionFormsZipCode")
	WebElement zipcode;
	
	@FindBy(id="popup_yes")
	WebElement popupyes;
	
	
	
	
	@FindBy(name="EmployeeActionFormsEmailAddress")
	public WebElement pemailadd;
	
	@FindBy(name="EmployeeActionFormsHireDate")
	public WebElement clientstartdate;
	
	@FindBy(xpath="//select[@class='ui-datepicker-month']")
	WebElement monthdropdown;
	
	
	
	@FindBy(name="EmployeeActionFormsBPositionSel")
	public WebElement positionlink;
	
	@FindBy(id="body_span4v2")
	public WebElement positiontable;
	
	
	String beforid="tdxspan4v2x";
	String Afteid="z2";
	
	@FindBy(xpath="(//table[@id='body_span4v2']//td[@class='vReportBody'])[1]")
	WebElement firstelement;
	
	@FindBy(name="EmployeeActionFormsJobCode")
	public WebElement position;
	
	@FindBy(name="EmployeeActionFormsStatus")
	public WebElement employmentstatus;
	
	@FindBy(name="EmployeeActionFormsType")
	public WebElement employementtype;
	
	@FindBy(name="EmployeeActionFormsBenefitGroup")
	public WebElement benefitgroup;
	
	@FindBy(name="EmployeeActionFormsBPayGroupSel")
	public WebElement paygrouplink;
	
	@FindBy(id="body_span4v2")
	public WebElement paygrouptable;
	
	String beid="tdxspan4v2x";
	String afid="z3";
	
	@FindBy(xpath="(//table[@id='body_span4v2']//td[@class='vReportBody'])[2]")
	WebElement frstele;
	
	@FindBy(xpath="//input[@name='EmployeeActionFormsPayGroup']")
	public WebElement paygroup;
	
	@FindBy(xpath="//select[@name='EmployeeActionFormsPayMethod']")
	public WebElement paymethod;
	
	@FindBy(xpath="//input[@name='EmployeeActionFormsPayRate']")
	public WebElement payrate;
	
	@FindBy(name="EmployeeActionFormsPayPer")
	public WebElement payratebasis;
	
	@FindBy(name="EmployeeActionFormsAutoTsHours")
	public WebElement EmployeeActionFormsAutoTsHours;
	
	@FindBy(name="EmployeeActionFormsFirstPayPeriodHours")
	public WebElement firstpayperiod;
	
	@FindBy(xpath="//input[@name='EmployeeActionFormsStdPeriodHrs']")
	public WebElement standardhours;
	
	@FindBy(name="EmployeeActionFormsResW4FilingStatus")
	public WebElement residentstatus;
	
	@FindBy(name="EmployeeActionFormsResW4StatusAllows")
	public WebElement exemptions;
	
	@FindBy(name="EmployeeActionFormsFsFed")
	public WebElement filingstatus;
	
	@FindBy(name="EmployeeActionFormsWaFed")
	public WebElement totalexempt;
	
	@FindBy(xpath="//button[@name='EmployeeActionFormsBContinue']")
	public WebElement newhiresavebtn;
	
	@FindBy(name="EmployeeActionFormsBContinue")
	public WebElement newhiresavebtnbe;
	
	@FindBy(id="label60v1")
	public WebElement empid;
	
	@FindBy(xpath="//button[@name='EmployeeActionFormsBReset']")
	public WebElement done;
	
	@FindBy(linkText="Register")
	public WebElement register;
	
	
	@FindBy(xpath="(//input[@type='text' and @aria-describedby='basic-addon1'])[1]")
	public WebElement lnme;
	
	@FindBy(id="input-control-input")
	public WebElement qrqaonlyid;
	
	
	@FindBy(xpath="(//input[@class='form-control ng-untouched ng-pristine ng-invalid'])[1]")
	public WebElement ssnn;
	
	@FindBy(id="identifierType-input")
	public WebElement qrqaonlyssn;
	
	//@FindBy(id="input-control-input")
	@FindBy(xpath="(//input[@type='text' and @aria-describedby='basic-addon1'])[3]")
	public WebElement username;
	
	@FindBy(xpath="//input[@id='input-control-input' and @aria-label='Username input']")
	public WebElement qrqaonlyusername;
	
	
	
	@FindBy(xpath="(//input[@type='password' and @class='form-control clear-ms-input-icons ng-untouched ng-pristine ng-invalid'])[1]")
	public WebElement password;
	
	@FindBy(xpath="(//input[@name='password'])[1]")
	public WebElement qrqaonlypassword;
	
	@FindBy(xpath="(//input[@name='password'])[2]")
	public WebElement cpassword;
	
	@FindBy(xpath="(//input[@name='password'])[2]")
	public WebElement qrqaonlyconfirmpassword;
	
	
	@FindBy(id="save")
	public WebElement sve;
	
	@FindBy(xpath="//button[text()=' Return To Login ']")
	WebElement returntosignin;
	
	@FindBy(xpath="//button[text()=' Sign In ' or text()=' Log In ']")
	public WebElement signinbtn;
	
	@FindBy(id="button265v2")
	public WebElement submitbutton;
	
	@FindBy(name="HrpyWorkWGlobalSearch1")
	public WebElement employeeid;
	
	@FindBy(name="DependentsBDependentId")
	WebElement dependent;
	
	@FindBy(id="body_span21v2")
	WebElement tableid;
	
	@FindBy(name="DependentsBDelete")
	WebElement deletebutton;
	
	@FindBy(id="popup_yes")
	WebElement poyes;
	
	
	
	
	
	public void login(String username, String password) throws InterruptedException {
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(txt_username));
			txt_username.sendKeys(username);
			txt_password.sendKeys(password);
			btn_login.click();

	}
	
	public void epLogin(String username, String password) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(epusername));
		epusername.sendKeys(username);
		eppassword.sendKeys(password);
		epsigninbutton.click();
	}
	
	
	public void signout() throws InterruptedException {
		try {
		
			profile.click();
			Thread.sleep(1000);
			signout.click();
		}catch(Exception e) {
			
		}
		
	}
	
	public void search(String searchtext) {
		
		searchbox.sendKeys(searchtext);
		searchenter.click();	

	}
	
	public void searchOkta(String searchtext) throws InterruptedException {
		
		try {
			if(crossbutton.size()!=0) {
				crossbutton.get(0).click();
				Thread.sleep(2000);
				searchbox.sendKeys(searchtext);
				
			}
			else {
				searchbox.sendKeys(searchtext);
				
			}
			//searchbox.sendKeys(searchtext);
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}
	
	public void searchworkflow(String searchtext) {
		searchbox.sendKeys(searchtext);
		workflow.click();
	}
	
	public void details(String Employeeid) {
		Eid.sendKeys(Employeeid);
	}
	
	public void delete() {
		Dlt_btn.click();
	}
	
	public void popup() {
		popyes.click();
	}
	
	public void createenrollment(String Employeeid, String enrolltype) {
		Eid.sendKeys(Employeeid);
		Select slt=new Select(Enrollmenttype);
		slt.selectByVisibleText(enrolltype);
		btn_create.click();
		
	}
	
	public void suspendworkflow(String workflowtype, String act, String cid) throws InterruptedException {
		Select sel=new Select(worktype);
		sel.selectByVisibleText(workflowtype);
		
		Select sel1=new Select(action);
		sel1.selectByVisibleText(act);
		
		clientid.sendKeys(cid);
		Thread.sleep(1000);
		searchbtn.click();
		Thread.sleep(2000);
		searchbtn.click();
		
	}
	
	public void LaunchNewWorkflow(String act1) throws InterruptedException {
		
		Select sel2=new Select(action);
		sel2.selectByVisibleText(act1);
		Thread.sleep(1000);
		searchbtn.click();
		
	}
	
	Random rand=new Random();
	
	//String firstname="John"+generateRandomNames();
	//String lastname="Levis"+ generateRandomNames();
	//String preferredname= "Tom"+generateRandomNames();
	//String randssn=generateRandomSSN();
	
	
	
	//Onboarding New Hire
	public void OBnewhire(String randssn, String firstname,String lastname, String preferredname) throws InterruptedException{
		worklocation.sendKeys("1");
		worklocation.sendKeys(Keys.ENTER);
		try {
			if(submitbutton.isDisplayed()) {
				submitbutton.click();
			}
		}
		catch(Exception e) {
			
		}
		
		Select sel3=new Select(employerid);
		List<WebElement> option=sel3.getOptions();
		if(option.size()==1) {
			sel3.selectByIndex(0);
		}
		else {
			sel3.selectByIndex(1);
		}
		//sel3.selectByVisibleText("Jody's Employer");
		System.out.println("SSN is: "+randssn);
		ssn.sendKeys(randssn);
		ssn.sendKeys(Keys.ENTER);
		Select sel4=new Select(hiretype);
		List<WebElement> options=sel4.getOptions();
		System.out.println(options);
		if(options.size()==1) {
			sel4.selectByIndex(0);
		}else {
			sel4.selectByIndex(1);
		}
		Select sel5=new Select(useonboarding);
		sel5.selectByIndex(2);	
		System.out.println("First name is: "+firstname);
		System.out.println("Last name is: "+lastname);
		System.out.println("Preferred name is: "+preferredname);
		fname.sendKeys(firstname);
		lname.sendKeys(lastname);
		prefname.sendKeys(preferredname);
		birthdate.sendKeys("01/01/1990");
		pemailadd.sendKeys("sigupta@prismhr.com");
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
//		LocalDateTime now = LocalDateTime.now();
//		System.out.println(dtf.format(now));
//		clientstartdate.sendKeys(dtf.format(now));
		clientstartdate.click();
		Select selectdate=new Select(monthdropdown);
		selectdate.selectByIndex(0);
		List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		System.out.println("Count of Dates are: "+ dates.size());
		for(int i=0;i<dates.size();i++) {
			if(dates.get(i).getText().equalsIgnoreCase("1")) {
				dates.get(i).click();
			}
		}
		
		positionlink.click();
		int rows=positiontable.findElements(By.tagName("tr")).size();
		for(int i=1;i<=rows;i++) {
			String positionname=driver.findElement(By.id(beforid + i + Afteid)).getText();
			if(positionname.equalsIgnoreCase("Employee") || positionname.equalsIgnoreCase("EE")) {
				driver.findElement(By.id(beforid + i + Afteid)).click();
				break;
			}
			else {
				firstelement.click();
				break;
			}
		}
		//position.sendKeys("Employee");
		employmentstatus.sendKeys("A");
		employementtype.sendKeys("F");
		benefitgroup.sendKeys("1");
		paygrouplink.click();
		int ro=paygrouptable.findElements(By.tagName("tr")).size();
		for(int x=1;x<=ro;x++) {
			String paygroupname=driver.findElement(By.id(beid+x+afid)).getText();
			if(paygroupname.equalsIgnoreCase("BW") || paygroupname.equalsIgnoreCase("BiWeekly") ) {
				driver.findElement(By.id(beid+x+afid)).click();
				break;
			}else {
				frstele.click();
				break;
			}
		}
		//paygroup.sendKeys("M");
		Select sel6=new Select(paymethod);
		sel6.selectByVisibleText("Salary");
		payrate.sendKeys("1000000");
		Select sltc=new Select(payratebasis);
		sltc.selectByVisibleText("Bi-Weekly");
		EmployeeActionFormsAutoTsHours.sendKeys("80");
		if(firstpayperiod.isDisplayed()) {
			firstpayperiod.sendKeys("80");
		}
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", newhiresavebtn);
		//newhiresavebtn.click();
		String employeeid=empid.getText();
		Thread.sleep(2000);
		System.out.println(employeeid);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(done));
		done.click();	
		}
	
	
	
	
	
	//Benefit Enrollment New Hire
	public void BENewhire(String randssn, String firstname,String lastname, String preferredname) throws InterruptedException {
		worklocation.sendKeys("1");
		worklocation.sendKeys(Keys.ENTER);
		try {
			if(submitbutton.isDisplayed()) {
				submitbutton.click();
			}
		}catch(Exception e) {
			//e.printStackTrace();
		}		
		Select sel3=new Select(employerid);
		List<WebElement> option=sel3.getOptions();
		if(option.size()==1) {
			sel3.selectByIndex(0);
		}
		else {
			sel3.selectByIndex(1);
		}
		//sel3.selectByVisibleText("Jody's Employer");
		ssn.sendKeys(randssn);
		ssn.sendKeys(Keys.ENTER);
		Select sel4=new Select(hiretype);
		List<WebElement> options=sel4.getOptions();
		System.out.println(options);
		if(options.size()==1) {
			sel4.selectByIndex(0);
		}else {
			sel4.selectByIndex(1);
		}
		
		Select sel5=new Select(useonboarding);
		sel5.selectByIndex(1);
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(preferredname);
		fname.sendKeys(firstname);
		lname.sendKeys(lastname);
		prefname.sendKeys(preferredname);
		birthdate.sendKeys("01/01/1990");
		Select gen=new Select(gender);
		gen.selectByIndex(1);
		Select ec=new Select(ethniccode);
		ec.selectByIndex(1);
		Select marital=new Select(maritalstatus);
		marital.selectByIndex(1);
		addlineone.sendKeys("100 main street");
		zipcode.sendKeys("02301");
		zipcode.sendKeys(Keys.ENTER);
		popupyes.click();
		pemailadd.sendKeys("sigupta@prismhr.com");
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
//		LocalDateTime now = LocalDateTime.now();
//		System.out.println(dtf.format(now));
//		clientstartdate.sendKeys(dtf.format(now));
		clientstartdate.click();
		Select selectdate=new Select(monthdropdown);
		selectdate.selectByIndex(0);
		List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		System.out.println("Count of Dates are: "+ dates.size());
		for(int i=0;i<dates.size();i++) {
			if(dates.get(i).getText().equalsIgnoreCase("1")) {
				dates.get(i).click();
			}
		}
		positionlink.click();
		int rows=positiontable.findElements(By.tagName("tr")).size();
		for(int i=1;i<=rows;i++) {
			String positionname=driver.findElement(By.id(beforid + i + Afteid)).getText();
			if(positionname.equalsIgnoreCase("Employee") || positionname.equalsIgnoreCase("EE")) {
				driver.findElement(By.id(beforid + i + Afteid)).click();
				break;
			}
			else {
				firstelement.click();
				break;
			}
		}
		//position.sendKeys("Employee");
		employmentstatus.sendKeys("A");
		employementtype.sendKeys("F");
		benefitgroup.sendKeys("1");
		paygrouplink.click();
		int ro=paygrouptable.findElements(By.tagName("tr")).size();
		for(int x=1;x<=ro;x++) {
			String paygroupname=driver.findElement(By.id(beid+x+afid)).getText();
			if(paygroupname.equalsIgnoreCase("BW") || paygroupname.equalsIgnoreCase("BiWeekly") ) {
				driver.findElement(By.id(beid+x+afid)).click();
				break;
			}else {
				frstele.click();
				break;
			}
		}
		//paygroup.sendKeys("M");
		Select sel6=new Select(paymethod);
		sel6.selectByVisibleText("Salary");
		payrate.sendKeys("1000000");
		Select sltc=new Select(payratebasis);
		sltc.selectByVisibleText("Bi-Weekly");
		EmployeeActionFormsAutoTsHours.sendKeys("80");
		if(firstpayperiod.isDisplayed()) {
			firstpayperiod.sendKeys("80");
		}
		//firstpayperiod.sendKeys("80");
		Select filing=new Select(filingstatus);
		filing.selectByVisibleText("Head of Household");
		totalexempt.sendKeys("0");
		Select status=new Select(residentstatus);
		status.selectByVisibleText("Other than Head of Household");
		exemptions.sendKeys("0");
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", newhiresavebtnbe);
		String employeeid=empid.getText();
		Thread.sleep(2000);
		System.out.println(employeeid);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(done));
		done.click();	
	}
	
	
	
	public void EPNewHire(String fname,String lname ) throws InterruptedException {
		togglebutton.click();
		Thread.sleep(2000);
		newhiredashboard.click();
		Thread.sleep(2000);
		newhireemployeebutton.click();
		Thread.sleep(2000);
		firstname.sendKeys(fname);
		Thread.sleep(1000);
		lastname.sendKeys(lname);
		Thread.sleep(1000);
	}
	
	
	
	//Register on EP
	public void Register(String randssn, String firstname,String lastname) throws InterruptedException, IOException {
		
		try {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		String ttle=driver.getTitle();
		Assert.assertEquals("Employee Portal", ttle);
		wait.until(ExpectedConditions.visibilityOf(register));
		register.click();
		Thread.sleep(2000);
		lnme.sendKeys(lastname);
		Thread.sleep(2000);
		System.out.println(randssn);
		ssnn.sendKeys(randssn);
		Thread.sleep(2000);
		System.out.println("Firstname: " + firstname);
		username.sendKeys(firstname);
		Thread.sleep(2000);
		password.sendKeys("Ninja@78901234");
		Thread.sleep(2000);
		cpassword.sendKeys("Ninja@78901234");
		Thread.sleep(3000);
		sve.click();
		System.out.println("Successfully registered");
		Thread.sleep(5000);
		returntosignin.click();
		wait.until(ExpectedConditions.visibilityOf(signinbtn));
		Assert.assertEquals("Employee Portal", driver.getTitle());
		System.out.println("Username: "+ firstname);
		System.out.println("Password: "+ "Ninja@78901234");	
		}catch(Exception e) {
			e.printStackTrace();		
		}
	}
	
	//Disabile MFA for EE
	public void users(String firstname) throws InterruptedException {
		
		try {
			if(crossbutton.size()!=0) {
				crossbutton.get(0).click();
				Thread.sleep(1000);
				searchbox.sendKeys("users");
				Thread.sleep(1000);
				
				
			}
			else {
				searchbox.sendKeys("users");
				Thread.sleep(1000);
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
			//searchbox.sendKeys("users");
			
			List<WebElement> lsst=driver.findElements(By.xpath("//table[@id='body_rdesignbaisdropv1']//td//span"));
			System.out.println("Search Table size: "+lsst.size());
			for(int i=0;i<lsst.size();i++) {
				
				if(lsst.get(i).getText().equalsIgnoreCase("Users")) {
					lsst.get(i).click();
					break;
				}
			}
			userid.sendKeys(firstname);
			checkbox.click();
			Select mfs=new Select(smfa);
			mfs.selectByVisibleText("Disabled");
			save.click();
			Thread.sleep(2000);
		
		
		
	
	}
	
	//Register on EP only for QRQA
	public void RegisterQRQA(String randssn, String firstname,String lastname) {
		try {
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
			String ttle=driver.getTitle();
			Assert.assertEquals("Employee Portal", ttle);
			wait.until(ExpectedConditions.visibilityOf(register));
			register.click();
			Thread.sleep(2000);
			qrqaonlyid.sendKeys(lastname);
			Thread.sleep(2000);
			System.out.println(randssn);
			qrqaonlyssn.sendKeys(randssn);
			Thread.sleep(2000);
			System.out.println("Firstname: " + firstname);
			qrqaonlyusername.sendKeys(firstname);
			Thread.sleep(2000);
			qrqaonlypassword.sendKeys("Ninja@78901234");
			Thread.sleep(2000);
			qrqaonlyconfirmpassword.sendKeys("Ninja@78901234");
			Thread.sleep(3000);
			sve.click();
			System.out.println("Successfully registered");
			Thread.sleep(5000);
			returntosignin.click();
			wait.until(ExpectedConditions.visibilityOf(signinbtn));
			Assert.assertEquals("Employee Portal", driver.getTitle());
			System.out.println("Username: "+ firstname);
			System.out.println("Password: "+ "Ninja@78901234");	
		}catch(Exception e) {
			e.printStackTrace();		
		}
	}
	
	public void EmployeeDependents() throws InterruptedException {
		searchbox.sendKeys("Employee Dependents");
		List<WebElement> lsst=driver.findElements(By.xpath("//table[@id='body_rdesignbaisdropv1']//td//span"));
		System.out.println("Search Table size: "+lsst.size());
		for(int i=0;i<lsst.size();i++) {
			
			if(lsst.get(i).getText().equalsIgnoreCase("Employee Dependents")) {
				lsst.get(i).click();
				break;
			}
		}
		employeeid.sendKeys("W00994");
		Thread.sleep(2000);
		dependent.click();
		Thread.sleep(2000);
		List<WebElement> lst=tableid.findElements(By.tagName("tr"));
		System.out.println(lst.size());
		if(lst.size()==0) {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}
		if(lst.size()==1) {
			lst.get(0).click();
		
		deletebutton.click();
		Thread.sleep(2000);
		poyes.click();
		Thread.sleep(2000);
		}
	}
	
	
}
