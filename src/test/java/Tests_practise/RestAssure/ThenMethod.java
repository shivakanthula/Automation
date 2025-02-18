package Tests_practise.RestAssure;

import org.hamcrest.Matchers;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ThenMethod {

    public static void main(String[] args){

        given().contentType("application/json").when().get("Https://reqres.in/api/users")
                .then().statusCode(200).log().all()
                .log().ifError()
                .body("name",equalTo("shivakumar")).contentType("application/json")
                .extract().response();
    }
}
