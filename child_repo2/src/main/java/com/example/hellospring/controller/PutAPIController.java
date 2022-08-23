package com.example.hellospring.controller;

import com.example.hellospring.dto.PutRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PutAPIController {

    @PutMapping("/put")
//    @PutMapping("/put/{userId}")
    public PutRequestDto put(@RequestBody PutRequestDto requestDto){
//    public PutRequestDto put(@RequestBody PutRequestDto requestDto, @PathVariable String userId){
        System.out.println(requestDto);
//        System.out.println(userId);
        return requestDto;
    }
}
