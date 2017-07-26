package com.denk.model;


/**
 * Created by lvdengke1 on 2017/7/25.
 */
public class Weather {

    public String id;
    public String cityId;
    public String cityName;
    public int minTemperature;
    public int maxTemperature;

    public Weather(String cityId, String cityName, int minTemperature, int maxTemperature) {
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
        return String.format("%s %d  ~ %d  ℃",
                cityName, minTemperature, maxTemperature);
    }
}
