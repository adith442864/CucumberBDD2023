package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddUser 
{
	
	@When("Admin clicks on user")
	public void admin_clicks_on_user() {
	    
		System.out.println("Admin is able to click on new user");
	}
	
	@Then("User information should be displayed")
	public void user_information_should_be_displayed() {
	    	System.out.println("User information displayed");
	}

	
	@Given("Application is up and running")
	public void application_is_up_and_running() {

		/*
		 *  UI
		 *  API
		 *  Mobile
		 *  Sysout
		 * 
		 */
		
		System.out.println("App is up and running");
		
		
	}

	@Given("All APIs are working correctly")
	public void all_ap_is_are_working_correctly() 
	{
		System.out.println("API's are up");
	}

	@When("User login with admin credentials")
	public void user_login_with_admin_credentials() 
	{
		System.out.println("Admin is able to login");
	}

	@When("Click on add user")
	public void click_on_add_user() 
	{
		System.out.println("Clicked on add user");
	}

	@When("Fills all mandatory details")
	public void fills_all_mandatory_details() 
	{	
		System.out.println("Admin fills all details");
	}

	@When("Click on save")
	public void click_on_save() 
	{
		System.out.println("Clicked on save button");
	}

	@Then("User should be created on portal")
	public void user_should_be_created_on_portal() 
	{
		System.out.println("User created");
	}

	@Then("Admin should be able to check in existing user.")
	public void admin_should_be_able_to_check_in_existing_user() 
	{
		System.out.println("User exist in table view");
	}

	

}
