package com.kg.restAssured.application;

import static io.restassured.RestAssured.given;

import com.kg.restAssured.application.payload.UpdatePlacePayload;

import io.restassured.RestAssured;

public class UpdatePlace {

	public static void main(String[] args) {
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		given().queryParam("key", "qaclick123")
		.queryParam("content-type", "application/json")
		.body(UpdatePlacePayload.updatePlace())
		.when().put("/maps/api/place/update/json").then().log().all().assertThat().log().all().statusCode(200);

	}

}
