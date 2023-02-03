package steps_week6_day2_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition_CreateNewOpportunity_Salesforce extends Baseclass_Salesforce
{
	
	@When("Click Sales from App launcher")
	public void clickSales() 
	{
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
	}
	
	@When("Click on Opportunities tab")
	public void clickOpportunitiesTab() 
	{
		WebElement findElement = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();", findElement);
	}

	@When("Click on New button")
	public void clickNewButton() 
	{
		driver.findElement(By.xpath("//div[text()='New']")).click();
	}

	@Given("Enter Opportunity name as {string}")
	public void enterOpportunityName(String opportunityName) throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(opportunityName);
		String attribute = driver.findElement(By.xpath("//input[@name='Name']")).getAttribute("value");
		System.out.println(attribute);
	}

	@Given("Choose Close Date as (.*)$")
	public void chooseCloseDate(String closeDate) 
	{
		driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys(closeDate);
	}

	@Given("Select Stage")
	public void selectStage()
	{
		driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[1]")).click();
	}

	@Given("Select Need Analysis in Stage")
	public void selectNeedAnalysis() 
	{
		driver.findElement(By.xpath("(//span[@title='Needs Analysis'])")).click();
	}

	@When("Click on save")
	public void clickSave() 
	{
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	}

	@Then("Verify Opportunity name")
	public void verifyOpportunityName() 
	{
		String attribute = driver.findElement(By.xpath("//input[@name='Name']")).getAttribute("value");
		String text = driver.findElement(By.xpath("//slot[@name='primaryField']//lightning-formatted-text")).getText();
		System.out.println(text);
		if(attribute.equals(text)) 
		{ 
			System.out.println("Both are same"); 
		} 
		else 
		{
			System.out.println("Both are not same"); 
		}

	}

}
