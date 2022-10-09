package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= ".//feature/signup.feature",
		glue= "StepDefinition",
		dryRun= false,
		format= {"pretty", "html: test-output", "json:target/report-json"}
	)
public class testRunner {

}
