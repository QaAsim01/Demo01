package util;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.PageObjectManager;

public class TestContextSetup {
	
	public WebDriver driver;
	public String productNameOnProduct;
	public PageObjectManager pageOjectManager;
	public TestBase testBase;
	public GenericUtils genericUtils;
	
	public TestContextSetup() throws IOException {
	      testBase = new TestBase();
		 pageOjectManager = new PageObjectManager(testBase.WebdriverManaGer());
		 genericUtils = new GenericUtils(testBase.WebdriverManaGer());
	}

}
