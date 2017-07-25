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
    public WeatherRepository weatherRepository;

    public Weather getWeatherByCityId(int cityId) {
        System.out.println("get:service");
        return weatherRepository.findByCityId(cityId);
    }

    public void saveWeather(int cityId,String cityName,int minTemperature,int maxTemperature){
        System.out.println("save:service");
        Weather weather = new Weather(cityId,cityName,minTemperature,maxTemperature);
        weatherRepository.save(weather);
    }
}
