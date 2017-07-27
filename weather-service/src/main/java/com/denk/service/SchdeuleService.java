package com.denk.service;

import com.denk.webmagic.processor.WeatherPageProcessor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import us.codecraft.webmagic.Spider;

/**
 * Created by lvdengke1 on 2017/7/27.
 */
@Service
public class SchdeuleService {

    @Scheduled(initialDelay = 1000, fixedDelay = 60000*60)
    public void fetchAndUpdateWeatherTask() {
        Spider.create(new WeatherPageProcessor())
                .addUrl("http://www.weather.com.cn/weather/101011000.shtml").thread(5).run();
    }
}
