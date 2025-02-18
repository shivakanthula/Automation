package Tests_practise.RestAssure;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostData {

    public static void main(String[] args){

        String payload = "{\n" +
                "  \"id\": 13,\n" +
                "  \"email\": \"shivaknthula@outlook.com\",\n" +
                "  \"firstname\": \"shiva\",\n" +
                "  \"lastname\": \"kanthula\",\n" +
                "  \"avatar\": \"https://example.com/avatar.jpg\"\n" +
                "}";

//                "{\n"+ "
//                \"id\" : 20,\n" +
//                " \"email\": \"shivaknthula@outlook\",\n" +
//                " \"firstname\": \"shiva\",\n" +
//                " \"lastname\":\"kanthula\" ,\n" +
//                " \"avatar\": \"https://example.com/avatar.jpg\"\n" +"}";

        Response response = given().header("Content-Type","application/json").
                      body(payload).
                when().
                        post("https://reqres.in/api/users").
                then().
                    statusCode(201).
                    body("id",equalTo(13)).
                    extract().response();

        System.out.println("Response Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());
    }
    }

