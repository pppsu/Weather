package com.example.aloha.myapplication.data;

import org.json.JSONObject;

/**
 * Created by Aloha on 1/3/2016.
 */
public class Atmosphere implements JSONPopulator {
    private int humid;

    public int getHumid() {
        return humid;
    }

    @Override
    public void populate(JSONObject data) {
        humid = data.optInt("humidity");
    }
}
