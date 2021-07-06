package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C://Users//Vaibhav//eclipse-workspace//SeleniumCucumber//Features//Customers.feature",
		glue = "stepDefinitions",
		dryRun = false,
		monochrome = true,
		plugin = { "pretty","html:test-output"}
		//tags= {"@Sanity"},
		//tags= {"@Sanity @Regression"},
		)

public class AddNewCustomerTestRunner {

}
