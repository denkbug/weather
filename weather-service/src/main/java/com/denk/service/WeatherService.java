package com.denk.service;


import com.denk.model.Weather;
import com.denk.repository.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lvdengke1 on 2017/7/25.
 */
@Service
public class WeatherService {
    @Autowired
    private WeatherRepository weatherRepository;

    public Weather getWeatherByCityId(String cityId) {
        return weatherRepository.findByCityId(cityId);
    }

    public void saveWeather(Weather weather) {
        weatherRepository.save(weather);
    }

    public void dropAll() {
        weatherRepository.deleteAll();
    }
}
