package com.nat.mosaiq.qa.integration;

import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import net.thucydides.core.annotations.Step;

public class employeeSearchSteps {
	private RequestSpecification request;
	private ValidatableResponse response;
		
	public employeeSearchSteps()
	{
		request = RestAssured.with(); 
	}		
	
	@Step
	public void getTheApiLink() {
		request.given()
		.proxy("fra4.sme.zscaler.net", 10181)
		.contentType(ContentType.JSON)
		.baseUri("http://dummy.restapiexample.com/api/v1");		
	}

	@Step
	public void searchByKeyword(String keyword) {
		response = request.get(keyword).then();		
	}

	@Step
	public void resultsForACategoryAndKeywordInARegion(String keyword) {
		response.statusCode(Integer.parseInt(keyword));		
	}
	
	@Step
	public void verifyEmployeeNameIsnotAvailable(String keyword) {
		assertThat(response.extract().jsonPath().getList("employee_name", String.class), Matchers.hasItem(keyword));		
	}
}
