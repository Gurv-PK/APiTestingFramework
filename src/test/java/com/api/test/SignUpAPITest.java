package com.api.test;

import com.api.base.AuthService;
import com.api.models.Request.SignUpRequest;
import com.api.models.Response.SignUpResponse;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class SignUpAPITest {

    @Test(description = "Veriy if Sign up API is working")
    public void testRegister(){
        SignUpRequest signUpRequest = new SignUpRequest("Gaurav","QA");
        AuthService authService = new AuthService();
        Response response = authService.signup(signUpRequest);
        System.out.println(response.asPrettyString());
        SignUpResponse signUpResponse = response.as(SignUpResponse.class);
        System.out.println(signUpResponse.getId()+" "+signUpResponse.getName()+" "+signUpResponse.getJob()+" "+signUpResponse.getCreatedAt());
    }
}
