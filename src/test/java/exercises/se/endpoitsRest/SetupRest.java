package exercises.se.endpoitsRest;

import org.junit.Assert;

import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class SetupRest {
    public static void main(String[] args) {
        //getResponseBody();
        //getResponseStatus();
        getResponseContentType();

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
                        .get("http://demo.guru99.com/V4/sinkministatement.php")
                        .timeIn(TimeUnit.MILLISECONDS) + " milliseconds");
    }
    public static void getResponseContentType() {
        System.out.println("The content type of response " +
                when()
                        .get("http://demo.guru99.com/V4/sinkministatement.php")
                        .then()
                        .extract()
                        .contentType());
    }
}
