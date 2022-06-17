package com.nat.mosaiq.qa.integration;

import java.util.HashMap;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import net.thucydides.core.annotations.Step;

public class employeeAddSteps {
	private RequestSpecification request;
	private ValidatableResponse response;
		
	public employeeAddSteps()
	{
		request = RestAssured.with(); 
	}		
	
	@Step
	public void getTheApiLink() {
		request.given()
		.proxy("fra4.sme.zscaler.net", 10181)
		.contentType(ContentType.JSON)
		.baseUri("http://dummy.restapiexample.com/api/v1")
		.contentType("application/json")
		.accept("application/json");
	}

	@Step
	public void addData(String employeeName, int employeeAge, double employeeSalary) {
		HashMap<String , Object> jsonPostMappedData = new HashMap<>();
		jsonPostMappedData.put("name", employeeName);
		jsonPostMappedData.put("salary", employeeSalary);
		jsonPostMappedData.put("age", employeeAge);
		
		response = request.body(jsonPostMappedData).when().post("/create").then();
				
	}

	@Step
	public void employeeAddRequestIsSuccessfull(String keyword) {
		response.statusCode(Integer.parseInt(keyword));		
	}
}