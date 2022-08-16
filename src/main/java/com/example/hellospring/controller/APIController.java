package com.example.hellospring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // annotation which deals with REST API
@RequestMapping("/api")// annotation which maps URI
public class APIController {

    @GetMapping("/hello")// get mapping
    public String hello() {
        return "Hello Spring Boot!";
    }

}
