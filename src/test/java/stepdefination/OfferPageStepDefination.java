package stepdefination;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.LandingPage;
import PageObjects.OffersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import util.TestContextSetup;

public class OfferPageStepDefination {
	
	public TestContextSetup testContextSetup;
	public String productNameOnOfferpage;
	
	public OfferPageStepDefination(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
	}
	
	

    @Then("^user search \"([^\"]*)\" shortname on offerspage$")
    public void user_search_something_shortname_on_offerspage(String strArg1) throws Throwable {
    	
    	
    switchToWindow();
    OffersPage offer = testContextSetup.pageOjectManager.getOffersPageObject();
    offer.searchProduct(strArg1);
    Thread.sleep(2000);
   productNameOnOfferpage = offer.getProduct();
     
    }
    
    public void switchToWindow() {
    	LandingPage landing =testContextSetup.pageOjectManager.getLandingPageObject();
    	landing.selectTopdeals();
    	testContextSetup.genericUtils.switchWindowToChild();
    }
    
    @And("^validate product with both homepage and offerpage$")
    public void validate_product_with_both_homepage_and_offerpage() throws Throwable {
       Assert.assertEquals(productNameOnOfferpage, testContextSetup.productNameOnProduct);
    }
}
