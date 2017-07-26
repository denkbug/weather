package com.denk.model;


/**
 * Created by lvdengke1 on 2017/7/25.
 */
public class Weather {

    public String id;
    public String cityId;
    public String cityName;
    public String minTemperature;
    public String maxTemperature;

    public Weather(String cityId, String cityName, String minTemperature, String maxTemperature) {
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

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(String minTemperature) {
        this.minTemperature = minTemperature;
    }

    public String getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(String maxTemperature) {
        this.maxTemperature = maxTemperature;
    }


    public String toString() {
        return String.format("%s %s  ~ %s",
                cityName, minTemperature, maxTemperature);
    }
}
