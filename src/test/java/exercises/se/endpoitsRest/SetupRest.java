package exercises.se.endpoitsRest;

import exercises.se.data.RestData;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class SetupRest {
    public static void main(String[] args) {

        //getWeatherDetails();
        getUserData();

    }

    public static void getResponseBody() {
        given().when().get("http://demo.guru99.com/V4/sinkministatement.php?" +
                "CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1").then().log()
                .all();
    }

    public static void getResponseStatus() {
        String url = "http://demo.guru99.com/V4/sinkministatement.php";
        int statusCode = given().queryParam("CUSTOMER_ID", "68195")
                .queryParam("PASSWORD", "1234!")
                .queryParam("Account_No", "1").when().get(url).getStatusCode();
        System.out.println("The response status is " + statusCode);
        when().get(url).then().assertThat().statusCode(200);
        Assert.assertEquals("Expected status code", 200, statusCode);
    }

    public static void getResponseBody2() {
        given().queryParam("CUSTOMER_ID", "68195")
                .queryParam("PASSWORD", "1234!")
                .queryParam("Account_No", "1")
                .when().get("http://demo.guru99.com/V4/sinkministatement.php").then()
                .log().body();
    }
    public static void getResponseHeaders() {
        String url = "https://reqres.in/api/users";
        System.out.println("The headers in the response " +
                when()
                        .get(url)
                        .then()
                        .extract()
                        .headers());
    }
    public static void getResponseTime() {
        System.out.println("The time taken to fetch the response " +
                when()
                        .get("https://reqres.in/api/users")
                        .timeIn(TimeUnit.MILLISECONDS) + " milliseconds");
    }
    public static void getResponseContentType() {
        System.out.println("The content type of response " +
                when()
                        .get("https://reqres.in/api/users")
                        .then()
                        .extract()
                        .contentType());
    }
    public static void getDetails() {
        RestAssured.baseURI = "http://demo.guru99.com/V4/sinkministatement.php";
        RequestSpecification httprequest = RestAssured.given().queryParam("CUSTOMER_ID", "68195")
                .queryParam("PASSWORD", "1234!")
                .queryParam("Account_No", "1");
        Response response = httprequest.request(Method.GET);
        String responseBody = response.getBody().asString();
        System.out.println(response.getBody().prettyPrint());
    }
    public static void intoObject() {
        RestData[] posts = given().when().get("https://jsonplaceholder.typicode.com/posts").as(RestData[].class);
        for (RestData p : posts) {
            System.out.println("\n" + p + "\n");
        }
    }
    public static void reqresObj(){
//        Reqres[] reqres = given().when().get("https://reqres.in/api/users").jsonPath().get("data");
        RestAssured.baseURI = "https://reqres.in/api/users";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get("");
        JsonPath jsonPathEvaluator = response.jsonPath().prettyPeek();
        List<Map<String,String>> usersData = response.jsonPath().getList("data");
        for (Map<String,String> r : usersData){
            System.out.println(r);
        }
    }
    public static void postElement() {
        Response response = given()
                .log()
                .all()
                .body("{\n"
                        + "\"userId\": 10,"
                        + "\"id\": 101,"
                        + "\"title\":\"my new title\","
                        + "\"body\":\"my new Body\""
                        + "}")
                .get("https://jsonplaceholder.typicode.com/posts");
        System.out.println(response.getStatusCode());
        System.out.println(response.jsonPath().get("title").toString());

    }
    public static void getWeatherDetails(){
        RestAssured.baseURI = "https://demoqa.com/utilities/weather/city";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(Method.GET , "/Hyderabad");
        System.out.format("City: %s, \nTemperature: %s, \nHumidity: %s,"+
                "Weather Description: %s, \nWind speed: %s, \nWind Direction degree: %s ",
                response.getBody().as(HashMap.class).get("City"),
                response.getBody().as(HashMap.class).get("Temperature"),
                response.getBody().as(HashMap.class).get("Humidity").toString(),
                response.getBody().as(HashMap.class).get("Weather Description").toString(),
                response.getBody().as(HashMap.class).get("Wind Speed").toString(),
                response.getBody().as(HashMap.class).get("Wind Direction degree").toString());
    }
    public static void getUserData(){
        RestAssured.baseURI = "https://reqres.in/api/users";
//        RequestSpecification httpRequest = RestAssured.given();
        Response response = RestAssured.given().get(" ");
        List<Map<String, String>> userData = response.jsonPath().getList("data");
        for(Map<String, String> r: userData){
            System.out.println(r);
        }
        given()
                .log()
                .all()
                .body("\n"
                        +"\"name\":\"aliona\","
                + "\"job\":\"Software Tester\""
                +"}").post();
        System.out.println(response.getStatusCode());
        System.out.println(response.getHeader("Content-Type"));
        System.out.println(response.getHeader("Server"));
        System.out.println(response.getHeader("Age"));



    }

}
