package com.denk.controller;

import com.denk.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherAPIController {

    @Autowired
    private CityService cityService;

    @RequestMapping("/city/list.xhr")
    public String listCitys() {
        return cityService.listCitys().toString();
    }
}