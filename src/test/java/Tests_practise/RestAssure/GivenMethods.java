package Tests_practise.RestAssure;
import static io.restassured.RestAssured.given;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

public class GivenMethods {


public static void main(String[] args){

    String payload = "{\n" + "\"name\": \"shivakumar\" + \"JOb\": \"Senior SoftWare Engineer" +"\"n" +  "}";

    Map<String, Object> payloads = new HashMap<>();
    payloads.put("name", "Shiva");
    payloads.put("job", "QA Engineer");

    given()
            .cookie("session_id", "kanthu_123")                // Set session cookie
//   Ex:- logging into a user account, making payments), cookies are usually mandatory.
            .header("Content-Type", "application/json")        // Set content type header
            .queryParam("id", "123")                     // Add query parameter
            .pathParam("name", "shivakumar")                     // Add path parameter
//            .multiPart("document", "Id proof")                // Add multipart form-data
            .body(payloads)                                          // Add JSON payload in the body
            .log().all()                                             // Log all request details
    .when()
            .post("https://reqres.in/api/users")                  // HTTP POST request
    .then()
            .statusCode(201);                                      // Validate response

}

}
