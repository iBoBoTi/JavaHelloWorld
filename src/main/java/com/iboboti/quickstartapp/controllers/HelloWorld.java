package com.iboboti.quickstartapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping(path = "/greetings")
    public String helloWorld(@RequestParam(
            value = "name", required = false, defaultValue = "World")  String name){
        return String.format("Hello %s!", name);
    }
}
