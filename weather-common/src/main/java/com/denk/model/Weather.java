package com.denk.model;

import org.springframework.data.annotation.Id;

/**
 * Created by lvdengke1 on 2017/7/25.
 */
public class Weather {
    @Id
    public String id;
    public int cityId;
    public String cityName;
    public int minTemperature;
    public int maxTemperature;

    public Weather(int cityId, String cityName, int minTemperature, int maxTemperature) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }


    public String toString() {
        return String.format("cityId:%d, cityName:%s, 温度：%d ~ %d",
                cityId, cityName, minTemperature, maxTemperature);
    }
}
