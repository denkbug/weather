package com.denk.controller;

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

    @Autowired
    private MongodbPipeline mongodbPipeline;

    @Scheduled(initialDelay = 1000, fixedDelay = 60000*60)
    public void fetchAndUpdateWeatherTask() {
        Spider.create(new WeatherPageProcessor())
                .addUrl("http://www.weather.com.cn/weather/101011000.shtml")
                .addPipeline(mongodbPipeline)
                .thread(5).run();
    }
}
