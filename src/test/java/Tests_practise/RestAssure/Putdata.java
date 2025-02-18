package Tests_practise.RestAssure;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Putdata {

    public static void main(String[] args){


       Response response = given().
                header("Content-Type","application/json").body("{\"first_name\": \"kanthula\" }").
                when().put("https://reqres.in/api/users/2").
                then().log().all().statusCode(200).extract().response();
//       System.out.println("response : " + response.getBody().asString());

    }
}
