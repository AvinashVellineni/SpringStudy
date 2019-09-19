package com.learning.StartUp.controller;

import com.learning.StartUp.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    private HelloWorldService helloWorldService;

    public HelloWorldController(@Autowired HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @RequestMapping(value = "/helloWorld",method= RequestMethod.GET)
    public String getHelloWorld() {
        return this.helloWorldService.getHelloWorldServiceImpl();
    }
}
