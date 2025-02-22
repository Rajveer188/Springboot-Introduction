package com.capgemini_training.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloBridgeLabController {
    @GetMapping("/helloBridgeLabz")
    @ResponseBody
    public String methodHello() {
        return "<html><body><h1>Hello from BridgeLabz</h1></body></html>";
    }
}
