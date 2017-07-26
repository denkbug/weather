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
    public WeatherService weatherService;

    @Autowired
    public CityService cityService;

    @RequestMapping("/{cityId}")
    public String weather(@PathVariable String cityId) {
        Weather weather = weatherService.getWeatherByCityId(cityId);
        return weather == null ? "no such city" : weather.toString();
    }

    @RequestMapping("/list")
    public String listCitys() {
        return cityService.listCitys().toString();
    }

    @RequestMapping("/save")
    public void saveWeather(String cityId, String cityName, String minTemperature, String maxTemperature) {
        weatherService.saveWeather(cityId, cityName, minTemperature, maxTemperature);
    }
}