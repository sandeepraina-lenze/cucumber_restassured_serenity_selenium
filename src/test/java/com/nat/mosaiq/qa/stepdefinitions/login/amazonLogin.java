package com.nat.mosaiq.qa.stepdefinitions.login;

import com.nat.mosaiq.qa.amazon_services.amazonLoginSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class amazonLogin {
	@Steps
	amazonLoginSteps amazonLoginSteps;

	@Given("User is on page {string}")
	public void user_is_on_Home_Page(String pageAddress) {
		amazonLoginSteps.user_is_on_Home_Page(pageAddress); 
	}

	@When("User Navigate to LogIn Page")
	public void user_Navigate_to_LogIn_Page() {
		amazonLoginSteps.user_Navigate_to_LogIn_Page();
	}

	@When("User enters {string} and {string}")
	public void user_enters_UserName_and_Password(String username, String password) {
		amazonLoginSteps.user_enters_UserName_and_Password(username, password);
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_Login_Successfully()
	{
		amazonLoginSteps.message_displayed_Login_Successfully();	 
	}
}
