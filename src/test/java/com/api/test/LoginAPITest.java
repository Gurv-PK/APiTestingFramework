package com.api.test;

import com.api.base.AuthService;
import com.api.models.Request.LoginRequest;
import com.api.models.Response.LoginResponse;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class LoginAPITest {
    @Test(description="verify if login api is working")
    public void loginTest(){
        LoginRequest loginRequest = new LoginRequest("eve.holt@reqres.in","cityslicka");
        AuthService authService = new AuthService();
        Response response = authService.login(loginRequest);
        LoginResponse loginResponse = response.as(LoginResponse.class);
        System.out.println(loginResponse.getToken());

    }
}
