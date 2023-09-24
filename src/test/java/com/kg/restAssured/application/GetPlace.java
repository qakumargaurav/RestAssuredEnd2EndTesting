package com.kg.restAssured.application;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class GetPlace {

	public static void main(String[] args) {
		RestAssured.baseURI="https://rahulshettyacademy.com";
		given().queryParam("key", "qaclick123").queryParam("place_id", "460d466734efeef203f4cf9b5686ca3e")
		.queryParam("content-type", "application/json")
		.when().get("/maps/api/place/get/json").then().log().all().assertThat().statusCode(200);
	}
}