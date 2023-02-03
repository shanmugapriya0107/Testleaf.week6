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

public class StepDefinition_CreateAccounts_Salesforce extends Baseclass_Salesforce
{
	
	@When("Click sales from App Launcher for Accounts")
	public void clickSalesForAccounts() 
	{
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
	}
	
	@When("Click on Accounts tab")
	public void clickAccountsTab() 
	{
		WebElement findElement = driver.findElement(By.xpath("//span[text()='Accounts']"));
		driver.executeScript("arguments[0].click();", findElement);
	}
	
	@When("Click on New button for Accounts")
	public void clickNewButtonForAccounts() 
	{
		driver.findElement(By.xpath("//div[text()='New']")).click();
	}
	
	@Given("Enter {string} as account name")
	public void enterAccountName(String aName) 
	{
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(aName);
	}
	
	@When("Click Ownership")
	public void clickOwnership() 
	{
		WebElement findElement2 = driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[3]"));
		driver.executeScript("arguments[0].click();", findElement2);
	}
	
	@When("Select Ownership as Public")
	public void selectOwnership() 
	{
		driver.findElement(By.xpath("//span[text()='Public']")).click();
	}
	
	@When("Click on save for Accounts")
	public void clickSaveForAccounts() 
	{
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	}
	
	@Then("Verify account name")
	public void verifyAccountName() throws InterruptedException, IOException 
	{
		Thread.sleep(3000);
		File source1 = driver.getScreenshotAs(OutputType.FILE);
		File target1 = new File("./screenshot/VerifyAccountName.png");
		FileUtils.copyFile(source1, target1);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
