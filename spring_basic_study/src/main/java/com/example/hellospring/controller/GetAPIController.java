package com.example.hellospring.controller;

import com.example.hellospring.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

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
    @GetMapping(path="query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam){
        StringBuilder sb = new StringBuilder();

        queryParam.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");
            sb.append(entry.getKey() + " = " + entry.getValue() + "\n");
        });
        return sb.toString();
    }

    // (knowing) explicit key
    @GetMapping(path="query-param2")
    public String queryParam2(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam int age
    ) {

        System.out.println(name);
        System.out.println(email);
        System.out.println(age);

        return name + " " + email + " " + age;
    }

    @GetMapping(path="query-param3")
    public String queryParam3(UserRequest userRequest){
        System.out.println(userRequest.getName());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getAge());

        return userRequest.toString();
    }
}
