package com.denk.controller;

import com.denk.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    @Autowired
    public WeatherService weatherService;

    @RequestMapping("/")
    public String weather() {
        //System.out.println("get:controller");
        return weatherService.getWeatherByCityId(1).toString();
    }

    @RequestMapping("/save")
    public void saveWeather() {
        //System.out.println("save:controller");
        weatherService.saveWeather(1, "北京", 0, 100);
    }
}