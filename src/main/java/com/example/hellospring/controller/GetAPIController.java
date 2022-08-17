package com.example.hellospring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/get")
public class GetAPIController {

    @GetMapping(path="/hello")
    public String getHello(){
        return "Hello Spring boot!";
    }

    @RequestMapping(path="hi", method = RequestMethod.GET)
    public String hi(){
        return "Hi Spring boot!";
    }

//    @GetMapping("/pathVariable") // don't use capital letter on URL
    @GetMapping("/path-variable/{name}")
//    public String pathVariable(@PathVariable String name){
    public String pathVariable(@PathVariable(name="name") String pathName, String name){ // to avoid duplication of parameter
//        System.out.println("Path Variable: " + name);
        System.out.println("Path Variable: " + pathName);

//        return name;
        return pathName;
    }

    // query parameter


}
