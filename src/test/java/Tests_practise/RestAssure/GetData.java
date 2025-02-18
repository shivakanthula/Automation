package Tests_practise.RestAssure;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetData {

    public static void main(String[] args){

        Response response =   given()
                .when()
                 .get("https://reqres.in/api/users?page=2")
                .then()
                .statusCode(200).body("data.find{it.first_name == 'Michael'}.first_name",equalTo("Michael")).extract().response();
        System.out.println("Response :" + response.getBody().asString());


//        .body("data.find{it.first_name == 'Michael'}.first_name", equalTo("Michael")):
//        data: Refers to the array of user objects in the JSON response.
//                find{}: Iterates over the array to find the first object where first_name is Michael.
//.first_name: Extracts the first_name property of the matched object.
//        equalTo("Michael"): Validates that the extracted first_name is equal to "Michael".
        // Parse the response body

        JsonPath jsonPath = response.jsonPath();

        // Extract data for "Michael"
        Object michaelData = jsonPath.get("data.find{ it.first_name == 'Michael'}");

        // Print only Michael's data
        System.out.println("Michael's Data: " + michaelData);

    }
}
