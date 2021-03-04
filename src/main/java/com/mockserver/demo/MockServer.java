package com.mockserver.demo;


import com.mockserver.demo.util.MockUtil;
import org.mockserver.integration.ClientAndServer;
import org.mockserver.model.HttpRequest;
import org.mockserver.model.HttpResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.mockserver.model.Parameter.param;
@SpringBootApplication
public class MockServer {
    public static void main(String[] args) {

        SpringApplication.run(MockServer.class, args);

        //ClientAndServer server = new ClientAndServer(1080);
        //HttpRequest request = new HttpRequest();
        //request.withPath("/test");
        //request.withPathParameter(param("p","2"));
        //
        //
        //HttpResponse response = new HttpResponse();
        //response.withBody("2021");
        //
        //MockUtil.createExpectation(server,request,response);

    }
}
