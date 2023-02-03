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

public class StepDefinition_CreateIndividuals_Salesforce extends Baseclass_Salesforce
{
	@When("Click Individuals from App launcher")
	public void clickIndividuals() 
	{
		WebElement findElement = driver.findElement(By.xpath("//p[text()='Individuals']"));
		driver.executeScript("arguments[0].click();", findElement);
	}
	
	@When("Click on New Individual")
	public void clickNewIndividual() 
	{
		driver.findElement(By.xpath("(//div[@title='New'])[1]")).click();
	}
	
	@Given("Enter last name as {string}")
	public void enterLastName(String lname) 
	{
		driver.findElement(By.xpath("//input[@class='lastName compoundBLRadius compoundBRRadius form-element__row input']")).sendKeys(lname);
	}
	
	@When("Click on save for Individual")
	public void clickSaveForIndividual() 
	{
		driver.findElement(By.xpath(" (//span[@class=' label bBody'])[5]")).click();
	}
	
	@Then("Verify Individuals name")
	public void verifyIndividualsName() throws InterruptedException, IOException 
	{
		Thread.sleep(3000);
		File source1 = driver.getScreenshotAs(OutputType.FILE);
		File target1 = new File("./screenshot/VerifyIndividualName.png");
		FileUtils.copyFile(source1, target1);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
