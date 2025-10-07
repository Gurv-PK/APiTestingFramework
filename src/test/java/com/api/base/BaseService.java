package com.api.base;

import com.api.models.Request.LoginRequest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {
    private final static String BASE_URL = "https://reqres.in/";
    private RequestSpecification requestSpecification;

    public BaseService(){
        this.requestSpecification = RestAssured.given().baseUri(BASE_URL);
    }

    protected Response postRequest(Object payload, String endpoint){
        //System.out.println(requestSpecification.contentType(ContentType.JSON).header("x-api-key","reqres-free-v1").body(payload).post(endpoint).asPrettyString());
        return requestSpecification.contentType(ContentType.JSON).header("x-api-key","reqres-free-v1").body(payload).post(endpoint);
    }
}
