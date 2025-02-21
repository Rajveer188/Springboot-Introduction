package com.capgemini_training.springboot.uc1_helloword.controller;

import com.capgemini_training.springboot.uc1_helloword.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
    private HelloService helloService;

    @Autowired
    public HelloController(HelloService helloService){
        this.helloService = helloService;
    }
    //method to call service
    @GetMapping("/hello")
    public String hello(){
        return helloService.service();
    }
}
