package steps_week6.day1.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition_Leaftaps {
	public ChromeDriver driver;
	
	@Given("Launch the chrome browser")
	public void launchBrowser() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@Given("Load the application URL as {string}")
	public void loadApplicationUrl(String url) 
	{
		driver.get(url);
	}
	
	@Given("Enter the username as {string}")
	public void enterUsername(String uName) 
	{
		WebElement findElement = driver.findElement(By.id("username"));
		findElement.sendKeys(uName);
	}
	
	@Given("Enter the password as {string}")
	public void enterPassword(String pWord) 
	{
		WebElement findElement2 = driver.findElement(By.id("password"));
		findElement2.sendKeys(pWord);
	}
	
	@When("Click on login button")
	public void clickLoginButton() 
	{
		WebElement findElement3 = driver.findElement(By.className("decorativeSubmit"));
		findElement3.click();
	}
	
	@When("Click on CRMSFA link")
	public void clickCRM() 
	{
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	@When("Click on leads")
	public void clickLeads() 
	{
		driver.findElement(By.linkText("Leads")).click();
	}
	
	@When("Click on create lead")
	public void clickCreateLead()
	{
		driver.findElement(By.linkText("Create Lead")).click();
	}
	
	@Given("Enter the company name as {string}")
	public void enterCompanyNameCreate(String cNameCreate) 
	{	
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cNameCreate);
	}
	
	@Given("Enter the first name as {string}")
	public void enterFirstNameCreate(String fNameCreate) 
	{
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fNameCreate);
	}
	
	@Given("Enter the last name as {string}")
	public void enterLastName(String lName) 
	{
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
	}
	
	@Given("Enter the mobile number as (.*)$")
	public void enterMobileNumber(String mobileNo) 
	{
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(mobileNo);
	}
	
	@Given("Enter the Email as {string}")
	public void enterEmail(String email) 
	{
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(email);
	}
	
	@When("Click on create button")
	public void clickCreateButton() 
	{	
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
	}
	
	@Then("The lead should be created")
	public void verifyLeadCreated() 
	{
		System.out.println("Lead is created");
	}
	
	
	@When("Click find leads")
	public void clickFindLeads() 
	{
		driver.findElement(By.linkText("Find Leads")).click();
	}
	
	@Given("Enter the first name to Edit as {string}")
	public void enterFirstNameEdit(String fNameEdit) 
	{
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(fNameEdit);
	}
	
	@When("Click find leads button")
	public void clickFindLeadsButton() 
	{
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[6]")).click();
	}
	
	@When("Click on the first resulting lead")
	public void clickFirstResultingLead() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
	}
	
	
	@Then("Verify the title of the page")
	public void verifyPageTitle() 
	{
		System.out.println("The Title of the page is: " + driver.getTitle());
	}
	
	
	@When("Click on Edit")
	public void ClickEdit() 
	{
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
	}
	
	
	@Given("Change the company name as {string}")
	public void changeCompanyName(String cNameEdit) 
	{
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cNameEdit);
	}
	
	
	@When("Click on update")
	public void clickUpdate() 
	{
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
	}
	
	
	@Then("Confirm the changed name appears")
	public void verifyChangedNameAppears() 
	{
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("The changed name of the company is " +text);

	}
	
	@When("Click find leads Duplicate lead")
	public void clickFindLeadButtonDuplicateLead() 
	{
		driver.findElement(By.linkText("Find Leads")).click();
	}
	
	@When("Click on Email")
	public void clickEmailDuplicateLead() 
	{
		driver.findElement(By.linkText("Email")).click();
	}
	
	@Given("Enter Email as {string}")
	public void enterEmailDuplicateLead(String emailDuplicateLead) 
	{
		driver.findElement(By.xpath("(//input[@name='emailAddress'])[1]")).sendKeys(emailDuplicateLead);
	}
	
	@When("Click find leads button for Duplicate lead")
	public void clickFindLeadDuplicateLead() 
	{
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[6]")).click();
	}
	
	@Then("Capture name of First resulting lead")
	public void captureFirstResultingLead() throws InterruptedException 
	{
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
		System.out.println("The First lead ID in the List is " +text);
	}
	
	@When("Click on the first resulting lead for Duplicate lead")
	public void clickFirstResultingLeadDuplicateLead() 
	{
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
	}
	
	@When("Click on Duplicate lead")
	public void clickDuplicateLead() 
	{
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[1]")).click();
	}
	
	@Then("Verify the title of the page of Duplicate lead")
	public void verifyPageTitleDuplicateLead() 
	{
		System.out.println("The Title of the page is: " + driver.getTitle());
	}
	
	@When("Click on create lead of Duplicate lead")
	public void clickCreateLeadDuplicateLead() 
	{
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	}
	
	@Then("Confirm the duplicated lead name is same as captured name")
	public void confirmDuplicatedN() {
		String attribute = driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).getAttribute("value");
		System.out.println(attribute);
		String res = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		System.out.println(res);
		if(attribute.equals(res))
		{
			System.out.println("Same Name");
		}
		else
		{
			System.out.println("Different name");
		}
	}
	
	@When("Click find leads Delete lead")
	public void clickFindLeadsDeleteLead() 
	{
		driver.findElement(By.linkText("Find Leads")).click();
	}
	
	@When("Click on Phone")
	public void clickPhone() 
	{
		driver.findElement(By.linkText("Phone")).click();
	}
	
	@Given("Enter Phone number Delete Lead as (.*)$")
	public void enterPhoneNumberDeleteLead(String pNum) 
	{
		driver.findElement(By.xpath("//input[contains(@name,'phoneNumber')]")).sendKeys(pNum);
	}
	
	@When("Click find leads button Delete lead")
	public void clickFindLeadButtonDeleteLead() 
	{
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[6]")).click();
	}
	
	@Then("Capture lead ID for first resulting lead")
	public void captureLeadID() throws InterruptedException 
	{
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
		System.out.println("The First lead ID in the List is " +text);
	}
	
	@When("Click first resulting lead Delete lead")
	public void clickFirstResultingLeadDeleteLead() 
	{
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
	}
	
	@When("Click Delete")
	public void clickDelete() 
	{
		driver.findElement(By.className("subMenuButtonDangerous")).click();
	}
	
	@When("Click find leads button for Delete lead")
	public void clickFindLeadsButtonDeleteLead() 
	{
		driver.findElement(By.linkText("Find Leads")).click();
	}
	
	@Given("Enter captured lead ID")
	public void enterCapturedLeadID() 
	{
		String text = driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
		driver.findElement(By.name("id")).sendKeys(text);
	}
	
	@When("Click find leads button for Delete lead final")
	public void clickFindLeadsButtonDeleteLeadFinal() 
	{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	
	@Then("Verify deleted message")
	public void verifyDeletedMessage() 
	{
		String text2 = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		System.out.println(text2);
	}
	
	
	}


