package exercises.se.endpoitsRest;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;


import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Jackson {
    public static Response doGetRequest(String endpoint) {
        RestAssured.defaultParser = Parser.JSON;
        return given().headers("Content-Type", ContentType.JSON, "Accept", ContentType.JSON)
                .when().get(endpoint)
                .then().contentType(ContentType.JSON).extract().response();
    }
    public static void main(String[] args) {
        Response response = doGetRequest("https://reqres.in/api/users?page=2");
        List<String> jsonResponse = response.jsonPath().getList("$");
        System.out.println(jsonResponse.size());

        List<String> jsonResponse1 = response.jsonPath().getList("data.first_name");
        for (String s : jsonResponse1) {
            System.out.println(s);
        }
        ObjectMapper mapper = new ObjectMapper();
        JsonNode parseJsonResponse = response.jsonPath().getObject("username",JsonNode.class);
        List<String> accountList = mapper.convertValue(
                parseJsonResponse, new TypeReference<List<String>>(){});
        for (String s : accountList) {
            System.out.println(s);
        }
//        Response response = doGetRequest("https://reqres.in/api/users?page=2");
//        List<String> jsonResponse = response.jsonPath().getList("$");
//        System.out.println(jsonResponse.size());
//        String usernames = response.jsonPath().getString("username");
//        System.out.println(usernames);
//        String usernames1 = response.jsonPath().getString("username[9]");
//        System.out.println(usernames1);
//        List<String> jsonResponse1 = response.jsonPath().getList("data.first_name");
//        for (String s : jsonResponse1) {
//            System.out.println(s);
//        }
//        List<Map<String, String>> companies = response.jsonPath().getList("company");
//        for (Map<String, String> c : companies) {
//            System.out.println("Company Name -- " + c.get("name") +
//                    "\nCatch phrase -- " + c.get("catchPhrase")+
//                    "\nBS -- " + c.get("bs") +"\n\n");
//        }
    }


}
