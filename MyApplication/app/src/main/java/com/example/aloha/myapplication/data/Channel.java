package com.example.aloha.myapplication.data;

import org.json.JSONObject;

/**
 * Created by Aloha on 12/31/2015.
 */
public class Channel implements JSONPopulator {
    private Item item;
    private Units units;
    private Atmosphere atmosphere;
    private Wind wind;
    public Item getItem() {
        return item;
    }

    public Units getUnits() {
        return units;
    }

    public Atmosphere getAtmosphere() {
        return atmosphere;
    }

    public Wind getWind() {
        return wind;
    }

    @Override
    public void populate(JSONObject data) {
        units =new Units();
        units.populate(data.optJSONObject("units"));
        item =new Item();
        item.populate(data.optJSONObject("item"));
        atmosphere =new Atmosphere();
        atmosphere.populate(data.optJSONObject("atmosphere"));
        wind = new Wind();
        wind.populate(data.optJSONObject("wind"));
    }
}
