package Tests_practise.RestAssure;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class Patchdata {

    public static void main(String[] args){

        String payload = "{ \"job\": \"Tester\"}";
        String payloads = "{ \"first_name\": \"shiva\", \"job\": \"Automation Tester\" }";
       Response response = given()
       .header("Content-Type","application/json")
                .body(payload).
                when()
                .patch("https://reqres.in/api/users/2")
                .then().
                log().all()
                .statusCode(200)
                .extract()
                .response();

        given().get("https://reqres.in/api/users/2").then().log().all();



//         Send PATCH request
//        Response respons = given()
//                .header("Content-Type", "application/json") // Set Content-Type header
//                .body(payload) // Attach payload
//                .when()
//                .patch("https://reqres.in/api/users/2") // Target URL
//                .then()
//                .log().all() // Log request and response details
//                .statusCode(200) // Validate status code
//                .extract()
//                .response(); // Extract response

    }
}
