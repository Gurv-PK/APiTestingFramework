package com.api.test;


import static io.restassured.RestAssured.*;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginAPITest {
    @Test(description="verify if login api is working")
    public void loginTest(){
        /*RestAssured.baseURI="http://64.227.160.186:8080";
        RequestSpecification requestSpecification = RestAssured.given();
        RequestSpecification header = requestSpecification.header("Content-Type","application/json");
        RequestSpecification body = header.body("{\"username\": \"uday1234\",\"password\": \"uday1234\"}");
        Response res = body.post("/api/auth/login");*/

        //System.out.println(res.asPrettyString());

        Response response = given()
                .baseUri("http://64.227.160.186:8080")
                .header("Content-Type","application/json")
                .body("{\"username\": \"uday1234\",\"password\": \"uday1234\"}")
                .post("/api/auth/login");

        System.out.println(response.asPrettyString());
        Assert.assertEquals(response.getStatusCode(),200);

    }
}
