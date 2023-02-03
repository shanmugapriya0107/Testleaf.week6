package runner_week6_day2_assignment;

import io.cucumber.testng.CucumberOptions;
import steps_week6_day2_assignment.Baseclass_Salesforce;

@CucumberOptions(features="src/test/java/features_week6_day2_assignment",
                 glue="steps_week6_day2_assignment",  
                 monochrome = true, 
                 publish = true,
                 tags = "@smoke or @sanity")
public class Salesforce_CucumberRunnerClass_Assignment extends Baseclass_Salesforce
{

}
