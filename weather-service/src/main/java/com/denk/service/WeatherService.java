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

    public void saveWeather(String cityId, String cityName, int minTemperature, int maxTemperature) {
        City city = new City(cityId, cityName);
        cityReposity.save(city);
        Weather weather = new Weather(cityId, cityName, minTemperature, maxTemperature);
        weatherRepository.save(weather);
    }
}
