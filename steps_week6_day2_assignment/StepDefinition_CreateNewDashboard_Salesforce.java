package steps_week6_day2_assignment;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition_CreateNewDashboard_Salesforce extends Baseclass_Salesforce 

{
	@When("Click Dashboards from App launcher")
	public void clickDashboard() 
	{
		WebElement findElement = driver.findElement(By.xpath("//p[text()='Dashboards']"));
		driver.executeScript("arguments[0].click();", findElement);
	}
	
	@When("Click on New Dashboard option")
	public void clickDashboardOption() 
	{
		driver.findElement(By.xpath("//div[text()='New Dashboard']")).click();
	}
	
	@Given("Enter Name as {string} for New Dashboard")
	public void enterName(String name) 
	{
		WebElement findElement2 = driver.findElement(By.xpath("//iframe[@title='dashboard']"));
		driver.switchTo().frame(findElement2);
		driver.findElement(By.xpath("(//div[@class='slds-form-element__control'])[1]//input")).sendKeys(name);
	}
	
	@When("Click on create for New Dashboard")
	public void clickCreateForNewDashboard() 
	{
		driver.findElement(By.id("submitBtn")).click();
	}
	
	@When("Click on save for New Dashboard")
	public void clickSaveForNewDashboard() 
	{
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_neutral save']")).click();
	}
	
	@Then("Verify Dashboard name for New Dashboard")
	public void verifyDashboardName() throws InterruptedException, IOException 
	{
		Thread.sleep(10000);
		File source1 = driver.getScreenshotAs(OutputType.FILE);
		File target1 = new File("./screenshot/VerifyNewDashboard.png");
		FileUtils.copyFile(source1, target1);
	}
	
	
	
	
	
	
	
	
	
	
	

}
