package steps_week6_day2_assignment;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinition_CreateOpportunityWithoutMandatoryFields_Salesforce extends Baseclass_Salesforce 
{
	@When("Click Sales from App launcher for Without Mandatory fields")
	public void clickSalesFromAppLauncher() 
	{
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
	}
	
	@When("Click on Opportunity tab for Without Mandatory fields")
	public void clickOpportunityTabWithoutMandatoryFields() 
	{
		WebElement findElement = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();", findElement);
	}
	
	@When("Click on New button for Without Mandatory fields")
	public void clickNewButtonWithoutMandatoryFields() 
	{
		driver.findElement(By.xpath("//div[text()='New']")).click();
	}
	
	@Given("Choose Close Date for Without Mandatory fields as (.*)$")
	public void chooseCloseDateMandatoryFields(String closeDateWithoutMandatory) 
	{
		driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys(closeDateWithoutMandatory);
	}
	
	@When("Click on save for Without Mandatory fields")
	public void clickSaveWithoutMandatoryFields() 
	{
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	}
	
	@But("Verify the alert message for Without Mandatory fields")
	public void verifyAlertMessage() throws InterruptedException, IOException 
	{
		Thread.sleep(3000);
		File source1 = driver.getScreenshotAs(OutputType.FILE);
		File target1 = new File("./screenshot/VerifyAlertMessage.png");
		FileUtils.copyFile(source1, target1);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
