package com.example.yucong.coolsweather.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {

    /**
     *  SerializedName     cityName   json与java字段建立映射
     */
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;//天气更新中的时间

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }

}
