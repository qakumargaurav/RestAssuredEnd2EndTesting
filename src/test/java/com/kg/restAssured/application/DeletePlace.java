package com.kg.restAssured.application;

import static io.restassured.RestAssured.given;

import com.kg.restAssured.application.payload.DeletePlacePayload;

import io.restassured.RestAssured;

public class DeletePlace {

	public static void main(String[] args) {
		RestAssured.baseURI="https://rahulshettyacademy.com";
		given().queryParam("key", "qaclick123")
		.queryParam("content-type", "application/json")
		.body(DeletePlacePayload.placeDeletePayload())
		.when().delete("/maps/api/place/delete/json").then().log().all().assertThat().statusCode(200);
	}

}
