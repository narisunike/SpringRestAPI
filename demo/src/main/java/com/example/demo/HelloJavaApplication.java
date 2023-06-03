package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloJavaApplication {

    @GetMapping(value = "hello")
    public String  getHelloWorld()
    {
     return "Hello SpringRestAPI";
 
    }
}
