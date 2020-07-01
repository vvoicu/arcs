package com.apps.reqres.defs;

import static io.restassured.RestAssured.given;

import org.junit.Assert;

import com.tools.Constants;
import com.tools.FieldGenerators;
import com.tools.FieldGenerators.Mode;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//
//import io.restassured.RestAssured.*;
//import io.restassured.matcher.RestAssuredMatchers.*;
//import org.hamcrest.Matchers.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class StepDefinitions {

	private String createUserPayload;
	private Response postResponse;

	@Given("I have user details")
	public void i_have_user_details() {

		RestAssured.baseURI = Constants.BASE_URL;
		createUserPayload = "{\r\n" + "    \"name\": \"" + FieldGenerators.generateRandomString(10, Mode.ALPHA)
				+ "\",\r\n" + "    \"job\": \"" + FieldGenerators.generateRandomString(10, Mode.ALPHA) + "\"\r\n" + "}";
		
		System.out.println("Request Body: " + createUserPayload);
	}

	@When("I post for user creation")
	public void i_post_for_user_creation() {
		postResponse = given().urlEncodingEnabled(true).body(createUserPayload)
				.header("Accept", ContentType.JSON.getAcceptHeader()).post("/api/users");
	}

	@Then("I should see user creation message")
	public void i_should_see_user_creation_message() {

		postResponse.then().statusCode(201);
		String responseBody = postResponse.then().assertThat().extract().body().asString();

		System.out.println("Response Body: " + responseBody);

		Assert.assertTrue("Expected response to contain ID field. Actual: " + responseBody,
				responseBody.contains("\"id\":"));
	}

}
