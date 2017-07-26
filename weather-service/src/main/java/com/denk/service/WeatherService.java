package com.denk.service;


import com.denk.model.City;
import com.denk.model.Weather;
import com.denk.repository.CityReposity;
import com.denk.repository.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lvdengke1 on 2017/7/25.
 */
@Service
public class WeatherService {
    @Autowired
    public WeatherRepository weatherRepository;
    @Autowired
    public CityReposity cityReposity;

    public Weather getWeatherByCityId(String cityId) {
        return weatherRepository.findByCityId(cityId);
    }

    public void saveWeather(String cityId, String cityName, String minTemperature, String maxTemperature) {
        City city = new City(cityId, cityName);
        cityReposity.save(city);
        Weather weather = new Weather(cityId, cityName, minTemperature, maxTemperature);
        weatherRepository.save(weather);
    }

    public void saveWeather(Weather weather) {
        City city = new City(weather.getCityId(), weather.getCityName());
        cityReposity.save(city);
        weatherRepository.save(weather);
    }
}
