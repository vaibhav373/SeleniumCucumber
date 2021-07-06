package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C://Users//Vaibhav//eclipse-workspace//SeleniumCucumber//Features//Login.feature", 
		glue = "stepDefinitions" ,
		dryRun = true,
		monochrome= true,
		plugin = {"pretty", "html:test-output"}
		
		)
public class AdminDemoTestRunner {

}
