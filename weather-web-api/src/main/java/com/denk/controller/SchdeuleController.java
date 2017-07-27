package com.denk.controller;

import com.denk.service.WeatherAndCityService;
import com.denk.webmagic.pipeline.MongodbPipeline;
import com.denk.webmagic.processor.WeatherPageProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RestController;
import us.codecraft.webmagic.Spider;

/**
 * Created by lvdengke1 on 2017/7/27.
 */
@RestController
public class SchdeuleController {

    private static final String WEATHER_FETCH_URL = "http://www.weather.com.cn/weather/101011000.shtml";
    private static final int WEATHER_FETCH_THREAD_COUNT = 5;

    @Autowired
    private MongodbPipeline mongodbPipeline;
    @Autowired
    private WeatherAndCityService weatherAndCityService;

    @Scheduled(initialDelay = 1000, fixedDelay = 60000 * 3)
    public void fetchAndUpdateWeatherTask() {
        weatherAndCityService.dropAllWeatherAndCities();
        Spider.create(new WeatherPageProcessor())
                .addUrl(WEATHER_FETCH_URL)
                .addPipeline(mongodbPipeline)
                .thread(WEATHER_FETCH_THREAD_COUNT)
                .run();
    }
}
