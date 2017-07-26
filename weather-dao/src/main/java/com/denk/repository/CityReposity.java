package com.denk.repository;

import com.denk.model.City;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by lvdengke1 on 2017/7/26.
 */
public interface CityReposity extends MongoRepository<City, String> {
}
