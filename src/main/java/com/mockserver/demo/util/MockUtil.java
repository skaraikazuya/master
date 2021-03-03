package com.mockserver.demo.util;

import org.mockserver.integration.ClientAndServer;
import org.mockserver.model.HttpRequest;
import org.mockserver.model.HttpResponse;

import static org.mockserver.model.HttpRequest.request;
import static org.mockserver.model.HttpResponse.response;


public class MockUtil {

    /**
     * 创建期望
     * @param server---mockServer
     * @param request---请求
     * @param response---期望的响应
     */
    public static void createExpectation(ClientAndServer server,HttpRequest request, HttpResponse response){
        server.when(request()
                .withPath(request.getPath())
                .withQueryStringParameters(request.getPathParameters())

        )
                .respond(
                        response()
                                .withBody(response.getBody())
                );


    }
}
