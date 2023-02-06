package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = {"./src/test/java/features/Register.feature"},
		glue= {"stepdefination"},
		dryRun=true
		)
	


public class CucumberRunner extends AbstractTestNGCucumberTests {

}
