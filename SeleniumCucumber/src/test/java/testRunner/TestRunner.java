package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C://Users//Vaibhav//eclipse-workspace//SeleniumCucumber//Features//OrangeHrm.feature",
		glue = "stepDefinitions"
		)

public class TestRunner {

}
