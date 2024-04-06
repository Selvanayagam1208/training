package Stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Mainsteps {
	@Given("User should navigate the application")
	public void user_should_navigate_the_application() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User should navigate the application");	
}
	@Given("user clicks on the login link")
	public void user_clicks_on_the_login_link() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user clicks on the login link");	
	}
	@Given("User enter the username as {string}")
	public void user_enter_the_username_as(String username) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("username is-->"+username);
	}
	@Given("User enter the password as {string}")
	public void user_enter_the_password_as(String password) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("password is-->"+password);
	}

	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User clicks the login button");	
	}
	@Then("Login should be success")
	public void login_should_be_success() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Login should be success");	
	}

}
