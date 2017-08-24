package com.denk.test;

import com.denk.controller.WeatherAPIController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * Created by lvdengke1 on 2017/8/23.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleTest {

    @Autowired
    private WeatherAPIController weatherApiController;

    @Test
    public void testAPI(){
        System.out.println(weatherApiController.listCitys());
    }
}