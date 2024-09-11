package com.leihaomin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){

        System.out.println("Hello Springboot");
        return "hello";
    }

}
