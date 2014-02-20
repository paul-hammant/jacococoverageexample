package com.mycompany.teste2etest;

import com.jayway.restassured.RestAssured;
import org.junit.Test;

public class ITTestIT {

    @Test
    public void testGet() {
        RestAssured.given().
                get("http://localhost:8080/TestWeb/rest/payment").
                then().
                statusCode(200).log().all();

    }
}
