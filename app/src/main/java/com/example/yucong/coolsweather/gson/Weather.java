package com.example.yucong.coolsweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 为Gson准备的实体封装类
 */
public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}
