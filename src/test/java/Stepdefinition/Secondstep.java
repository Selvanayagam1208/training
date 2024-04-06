package Stepdefinition;

import io.cucumber.java.en.Given;

public class Secondstep {
	@Given("User enter the username the {string}")
	public void user_enter_the_username_the(String user) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("new username"+user);
	}
	@Given("^User enter the password the (.+)$")
	public void user_enter_the_password_the(int pass) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("new password"+pass);
	}
	

}
