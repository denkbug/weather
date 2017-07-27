package com.denk.service;

import com.denk.model.City;
import com.denk.model.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lvdengke1 on 2017/7/27.
 */
@Service
public class WeatherAndCityService {
    @Autowired
    private WeatherService weatherService;
    @Autowired
    private CityService cityService;

    public void saveWeatherAndCity(Weather weather){
        City city = new City(weather.getCityId(),weather.getCityName());
        cityService.saveCity(city);
        weatherService.saveWeather(weather);
    }

    public void dropAllWeatherAndCities(){
        cityService.dropAll();
        weatherService.dropAll();
    }
}
