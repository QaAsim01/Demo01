package stepdefination;

import java.io.IOException;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import util.TestContextSetup;

public class Hooks {

	public TestContextSetup testContextSetup;
	public Hooks(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
	}
	
	
	
	@After ("@searchTest")
	public void afterValidation() throws IOException {
		testContextSetup.testBase.WebdriverManaGer().quit();
	}
	
	
}
