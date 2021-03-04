package com.mockserver.demo.controller;

import com.mockserver.demo.entity.Mock;
import com.mockserver.demo.service.MockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class MockController {

    @Autowired
    private MockService mockService;

    @RequestMapping(path = "/create",method = RequestMethod.POST)
    public String register(Model model, Mock mock){

        Map<String,Object> map = mockService.createMock(mock);
        if(map != null ){
            model.addAttribute("usernameMsg",map.get("usernameMsg"));
            model.addAttribute("passwordMsg",map.get("passwordMsg"));
            model.addAttribute("emailMsg",map.get("emailMsg"));

        }
        return "/index";
    }






}
