package com.nat.mosaiq.qa.stepdefinitions.employee;

import com.nat.mosaiq.qa.integration.employeeSearchSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class employeeSearch {	
	@Steps
	employeeSearchSteps employeesearchSteps;
		
	@Given("I want to get the list of all the employee details")
	public void getTheApiLink() {
		employeesearchSteps.getTheApiLink();		
	}

	@When("I give the URL {string}")
	public void searchByKeyword(String keyword) {
		employeesearchSteps.searchByKeyword(keyword);		
	}

	@Then("I verify the response code received as {string}")
	public void resultsForACategoryAndKeywordInARegion(String keyword) {
		employeesearchSteps.resultsForACategoryAndKeywordInARegion(keyword);	
	}
	
	@And("Verify the employee with name {string} is present in the list")
	public void verifyEmployeeNameIsnotAvailable(String keyword) {
		employeesearchSteps.verifyEmployeeNameIsnotAvailable(keyword);
	}
}