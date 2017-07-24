package com.denk.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    @RequestMapping("/")
    String weather() {
        return "hello weather***";
    }

}