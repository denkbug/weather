package com.denk.service;

import com.denk.model.City;
import com.denk.repository.CityReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lvdengke1 on 2017/7/26.
 */
@Service
public class CityService {
    @Autowired
    public CityReposity cityReposity;

    public List<City> listCitys(){
        return cityReposity.findAll();
    }
}
