package com.denk.service;

import com.denk.model.City;
import com.denk.repository.CityReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lvdengke1 on 2017/7/26.
 */
@Service
public class CityService {
    @Autowired
    private CityReposity cityReposity;

    public List<City> listCitys() {

//        List<City> cities = cityReposity.findAll();
//        cities.sort((new Comparator<City>() {
//            @Override
//            public int compare(City o1, City o2) {
//                return o1.cityName.compareTo(o2.cityName);
//            }
//        }));

        return cityReposity.findAll(new Sort("cityName"));
    }

    public void saveCity(City city) {
        cityReposity.save(city);
    }

    public void dropAll() {
        cityReposity.deleteAll();
    }
}
