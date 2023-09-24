package com.kg.restAssured.application;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import com.kg.restAssured.application.payload.AddPlacePayload;

import io.restassured.RestAssured;

public class AddPlace {

	public static void main(String[] args) {
		// Remove the scope attribute from the dependency
		RestAssured.baseURI="https://rahulshettyacademy.com";
		given().queryParam("key", "qaclick123")
		.queryParam("content-type", "application/json")
		.body(AddPlacePayload.getAddPlacePayload())
		.when().get("/maps/api/place/add/json").then().assertThat().log().all().statusCode(200)
		//Validation on response
		// We use log in then() method that is why we have to received response in console
		.body("scope",equalTo("APP"));
	}
}
