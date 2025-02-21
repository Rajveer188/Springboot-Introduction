package com.capgemini_training.springboot.uc1_helloword.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class HelloService {
    public String service() {
        return "Hello from BridgeLabz";
    }
}
