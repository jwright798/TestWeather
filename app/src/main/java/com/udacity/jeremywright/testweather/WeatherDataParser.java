package com.udacity.jeremywright.testweather;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by jeremywright on 10/4/15.
 */
public class WeatherDataParser {

    public static double getMaxTemperatureForDay(String weatherJsonStr, int dayIndex) throws JSONException{

        double maxTemp;
        JSONObject weatherObject = new JSONObject(weatherJsonStr);
        JSONArray listArray = weatherObject.getJSONArray("list");
        JSONObject day = listArray.getJSONObject(dayIndex);
        JSONObject temp = day.getJSONObject("temp");
        maxTemp = temp.getDouble("max");


        return maxTemp;
    }
}
