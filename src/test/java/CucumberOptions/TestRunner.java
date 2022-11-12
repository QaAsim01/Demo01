package CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue = "stepdefination", stepNotifications = true,
		 plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json",
				"junit:target/cucumber.xml"} , dryRun = false , monochrome = true
		)
public class TestRunner {
  
	
}
