package com.denk.controller;

import com.denk.model.Weather;
import com.denk.service.CityService;
import com.denk.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @Autowired
    private CityService cityService;

    @RequestMapping("/weather/{cityId}")
    public String weather(@PathVariable String cityId) {
        Weather weather = weatherService.getWeatherByCityId(cityId);
        return weather == null ? "no such city" : weather.toString();
    }

    @RequestMapping("/city/list")
    public String listCitys() {
        return cityService.listCitys().toString();
    }

}