package com.foodsgroup.foodsapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {

    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }
}
