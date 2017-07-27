package com.denk.webmagic.pipeline;

import com.denk.model.Weather;
import com.denk.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

import java.util.Map;

/**
 * Created by lvdengke1 on 2017/7/27.
 */
@Component
public class MongodbPipeline implements Pipeline {

    @Autowired
    private WeatherService weatherService;

    @Override
    public void process(ResultItems resultItems, Task task) {
        for (Map.Entry entry : resultItems.getAll().entrySet()) {
            Weather weather = (Weather)entry.getValue();
            weatherService.saveWeather(weather);
        }
    }
}
