package com.mockserver.demo.controller;

import com.mockserver.demo.entity.Mock;
import com.mockserver.demo.service.MockService;
import com.mockserver.demo.util.MockUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

import org.mockserver.integration.ClientAndServer;
import org.mockserver.model.HttpRequest;
import org.mockserver.model.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Random;

import static org.mockserver.model.Parameter.param;

@Api(tags = "mock挡板服务")
@RestController
@RequestMapping("/hello")
public class MockController {

    @Autowired
    private MockService mockService;

    @ApiOperation("创建mock")
    @PostMapping
    public String createMock(@RequestBody Mock mock){



            ClientAndServer server = new ClientAndServer(1080);

            HttpRequest request = new HttpRequest();
            request.withMethod(mock.getMethod());
            request.withPath(mock.getPath());
            request.withPathParameter(param("p",mock.getParam()));


            HttpResponse response = new HttpResponse();
            int type = mock.getType();//0-固定返回，1-随机返回，2-传入返回
            if (type == 0) {
                mock.setResponseVal("234");
                response.withBody(mock.getResponseVal());
            }else if(type == 1){
                Random r = new Random();
                int random = r.nextInt(100);
                mock.setResponseVal(String.valueOf(random));
                response.withBody(mock.getResponseVal());
            }else{
                response.withBody(mock.getResponseVal());
            }

            MockUtil.createExpectation(server,request,response);

        return "success";
    }






}
