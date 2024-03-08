package com.example.lab8;

import java.util.ArrayList;

public class HasCity {

    public static boolean hasCity(String cityName, ArrayList<City> cities) {
        for (City city : cities) {
            if (city.getCityName().equals(cityName)) {
                return true;
            }
        }
        return false;
    }
}