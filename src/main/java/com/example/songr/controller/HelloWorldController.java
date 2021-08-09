package com.example.songr.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {
    @GetMapping("/HelloWorld")
    public String HelloWorld() {

        return "HelloWorld";
    }


}
