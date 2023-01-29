package runner_week6.day1.assignment;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"src/test/java/features/CreateLead.feature",
		                   "src/test/java/features/EditLead.feature",
		                   "src/test/java/features/DuplicateLead.feature",
		                   "src/test/java/features/DeleteLead.feature"}, 
                 glue="steps",  
                 monochrome = true, 
                 publish = true)
public class Leaftaps_CucumberRunnerClass extends AbstractTestNGCucumberTests {
	

}
