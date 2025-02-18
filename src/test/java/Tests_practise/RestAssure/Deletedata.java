package Tests_practise.RestAssure;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Deletedata {

public static void main(String[] args){

//    given().when().delete("https://reqres.in/api/users/2").then().statusCode(204).log().all();

    given().when().options("https://reqres.in/api/users/2").then().log().all();

    Response response = given()
            .when()
            .head("https://reqres.in/api/users/2") // HEAD method
            .then()
//            .log().all()
            .statusCode(200) // Validate status code
            .extract()
            .response();

    // Print all response headers
    System.out.println("Headers: " + response.getHeaders());
    // Response body should be empty
//    System.out.println("Response Body: " + response.getBody().asString()); // Should print an empty string
}
}
