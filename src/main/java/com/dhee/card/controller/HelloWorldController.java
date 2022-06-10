package com.dhee.card.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/test")
@Controller
public class HelloWorldController {

    @GetMapping("/helloWorld")
    @ResponseBody
    public String helloWorld(){
        return "Hello World";
    }
}
