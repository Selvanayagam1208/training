package Stepdefinition;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Datadriventeststep {
	@Given("user clicks on the signup link")
	public void user_clicks_on_the_signup_link(List<String> data) {
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));

	   	}
	@When("User clicks the sign in button")
	public void user_clicks_the_sign_in_button() {
		System.out.println("User clicks the sign in button");
	}
	@Then("register should be success")
	public void register_should_be_success() {
		
		System.out.println("register should be success");
	   	}
	@Given("download setup files")
	public void download_setup_files() {
		System.out.println("********************");
	System.out.println("download setup files");  
	}
	@When("pass the url of webpage")
	public void pass_the_url_of_webpage() {
	  System.out.println("pass the url of webpage");
	}
	@Then("home page displayed")
	public void home_page_displayed() {
	    System.out.println("home page displayed");
	}


}
