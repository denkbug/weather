package com.denk.controller;

import com.denk.model.City;
import com.denk.model.Weather;
import com.denk.service.CityService;
import com.denk.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @Autowired
    private CityService cityService;

    @RequestMapping("/weather/{cityId}")
    public String weather(Model model, @PathVariable String cityId) {
        Weather weather = weatherService.getWeatherByCityId(cityId);
        if(weather == null) {
            //error page
            weather = new Weather();
        }
        model.addAttribute("weather", weather);
        return "weather";
    }

    @RequestMapping("/city/list")
    public String listCitys(Model model) {
        List<City> citys = cityService.listCitys();
        model.addAttribute("citys", citys);
        return "citys";
    }

}