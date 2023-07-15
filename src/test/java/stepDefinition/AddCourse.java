package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddCourse {

	@Given("Admin is able to login with {string} and {string}")
	public void admin_is_able_to_login_with_and(String uname, String pass) {
		System.out.println("Admin is logged in with " +uname +"and " +pass);
	}

	@When("Admin clicks on add button course")
	public void admin_clicks_on_add_button_course() {
		System.out.println("Admin clicked on add course button");
	}

	@When("Fill all mandatory details")
	public void fill_all_mandatory_details() {
		System.out.println("Admin filled all details");
	}

	@Then("Admin should be able to add course")
	public void admin_should_be_able_to_add_course() {
		System.out.println("Admin can see newly created course");
	}

}
