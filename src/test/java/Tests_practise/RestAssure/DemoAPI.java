package Tests_practise.RestAssure;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class DemoAPI {

    public static void main(String[] args){
        Response response = RestAssured.get("https://katalon.com/resources-center/blog/api-examples");
        int status =  response.getStatusCode();
        System.out.println("status code : "+ status);
        given().when().get("https://katalon.com/resources-center/blog/api-examples")
                .then().assertThat()
                .statusCode(404);
    }

@Test
    public static void logAll(){

        Response response =RestAssured.get("https://reqres.in/api/users");
        System.out.println("content" + response.getBody());
                    given().
                        log().all().
                    when().get("https://reqres.in/api/users").
                      then().
                          log().all();
    }

@Test
    public static void cType(){
        given().
                when().get("https://reqres.in/api/users")
                .then().assertThat().
                contentType("application/json");
    }

@Test
    public static void validate(){
        given().
                when().get("https://reqres.in/api/users?page=2")
                .then().body("data.find {it.id == 9}.id",equalTo(9))
                .body("data.find {it.email == 'lindsay.ferguson@reqres.in' }.email", equalTo("lindsay.ferguson@reqres.in")).statusCode(200); // Validate the email

}
}
