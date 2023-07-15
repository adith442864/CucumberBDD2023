package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MultiLogin {
	

	@Given("User opens the application in incognito mode")
	public void user_opens_the_application_in_incognito_mode() {
	  System.out.println("User is able to open app in incognito");
	}
	
	@When("user login with {string} and {string}")
	public void user_login_with_and(String uname, String pass) {
	    System.out.println("User provided login with " +uname +" and " +pass);
	}
	
	@When("click on login")
	public void click_on_login() {
	   System.out.println("User clicked on login button");
	}
	
	@Then("User is able to login")
	public void user_is_able_to_login() {
	   System.out.println("User is successfully able to login");
	}
	
	

}
