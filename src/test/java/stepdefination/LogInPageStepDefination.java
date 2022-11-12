package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogInPageStepDefination {

	 @Given("^user is on landing page$")
	    public void user_is_on_landing_page() throws Throwable {
	        System.out.println("enter");
	    }

	 @When("^user enter \"([^\"]*)\" and pass \"([^\"]*)\"$")
	    public void user_enter_something_and_pass_something(String strArg1, String strArg2) throws Throwable {
	        System.out.println("user"+strArg1+"pass"+strArg2);
	    }
	 
	 @Then("^homepage directed is \"([^\"]*)\"$")
	    public void homepage_directed_is_something(String strArg1) throws Throwable {
		 System.out.println("homepage display "+strArg1);
	    }

	 @Then("^validate the profile icon is displaying$")
	    public void validate_the_profile_icon_is_displaying() throws Throwable {
	        
	    }
	  
	  @And("^error message should displayed$")
	    public void error_message_should_displayed() throws Throwable {
		  System.out.println("failure");
	    }
	  
	  @When("^user enters (.+) and pass (.+)$")
	    public void user_enter_and_pass(String user, String pass) throws Throwable {
	        
	    }
  // hey hi How
	    //new changes done
	  //ok then
	    
}
