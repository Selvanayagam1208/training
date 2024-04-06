package Stepdefinition;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before("@login")
	public void loginsetup() {
		System.out.println("********************");
		System.out.println("setup for login");
	}
	@Before("@signup")
	public void singup()
	{
		System.out.println("################");
		System.out.println("setup for signup");
	}
	@After
	public void teardown()
	{
		System.out.println("exit");
		Assert.assertTrue(false);
	}
}
