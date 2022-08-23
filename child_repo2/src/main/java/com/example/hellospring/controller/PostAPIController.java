package com.example.hellospring.controller;

import com.example.hellospring.dto.PostRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")

public class PostAPIController {

    @PostMapping("/post")
//    public void post(@RequestBody Map<String, Object> requestData){
    public void post(@RequestBody PostRequestDto requestData){
        System.out.println(requestData);


//        requestData.entrySet().forEach(stringObjectEntry -> {
//            System.out.println("key: " + stringObjectEntry.getKey());
//            System.out.println("value: " + stringObjectEntry.getValue());
//        });
    }


}
