package com.mockserver.demo.controller;

import com.mockserver.demo.service.MockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MockController {

    @Autowired
    private MockService mockService;





}
