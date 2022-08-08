package com.example.testlab;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(String name) {
        return String.format("Hello %s", name);
    }

    @GetMapping("/reverse")
    public String reverseString(String s){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

}