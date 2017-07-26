package com.denk.repository;

import com.denk.model.Weather;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by lvdengke1 on 2017/7/25.
 */
public interface WeatherRepository extends MongoRepository<Weather, String> {
    Weather findByCityId(String cityId);
}
