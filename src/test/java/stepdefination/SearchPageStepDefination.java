package stepdefination;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.LandingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import util.TestContextSetup;

public class SearchPageStepDefination {
	public TestContextSetup testContextSetup;
	
	public SearchPageStepDefination(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
	}
	
	@Given("^user is on greencart page landing page$")
    public void user_is_on_greencart_page_landing_page() throws Throwable {
    
	}

    @When("^when user search with search name \"([^\"]*)\"$")
    public void when_user_search_with_search_name_something(String strArg1) throws Throwable {
    	LandingPage landing =testContextSetup.pageOjectManager.getLandingPageObject();
    	
    	landing.searchObject(strArg1);
    Thread.sleep(2000);
    testContextSetup.productNameOnProduct = landing.getProduct().split("-")[0].trim();
    }

   
}
