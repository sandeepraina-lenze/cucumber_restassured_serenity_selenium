package com.nat.mosaiq.qa.stepdefinitions.employee;

import com.nat.mosaiq.qa.integration.employeeAddSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class employeeAdd {
	@Steps
	employeeAddSteps employeeaddSteps;
		
	@Given("I want to a add a new employee")
	public void getTheApiLink() {
		employeeaddSteps.getTheApiLink();		
	}

	@When("I give the employee name {string} , employee age {int} and employee salary {double}")
	public void searchByKeyword(String employeeName, int employeeAge, double employeeSalary) {
		employeeaddSteps.addData(employeeName, employeeAge, employeeSalary);		
	}

	@Then("I verify the response code received as {string} to ensure data is added successfully")
	public void resultsForACategoryAndKeywordInARegion(String keyword) {
		employeeaddSteps.employeeAddRequestIsSuccessfull(keyword);	
	}
}