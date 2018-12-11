package com.mk.helloworld.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public String getGreeting(@RequestParam(name = "name",required = false ,defaultValue = "World" )String name){
        return "Hello "+name+"!";
    }
}
