package Tests_practise.RestAssure;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.given;

public class ReqSpec {


    public static void main(String[] args){

        RequestSpecification requestSpec = new RequestSpecBuilder().
                setBaseUri("Https://reqres.in").addHeader("Authorization", "Bearer sample-token")
                .setContentType("application/json").build();

        given()
                .spec(requestSpec).
                    when().get("/api/users").then()
                .statusCode(200) // Validate response status code
                .log().all(); // Log the response;

//        ResponseSpecification response = (ResponseSpecification) new ResponseSpecBuilder();
        ResponseSpecBuilder response = new ResponseSpecBuilder().expectStatusCode(200).
                expectContentType("application/json").expectHeader("authentication","bearer");

        given().when().get("Https://reqres.in/api/users").then();



    }
}
