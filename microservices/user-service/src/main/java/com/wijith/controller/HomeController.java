package com.wijith.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping
    public  String HomeControllerHandler(){
        return "user microservice for salon booking system";
    }
}
