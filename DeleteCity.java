package com.example.lab8;

import java.util.ArrayList;

public class DeleteCity {

    public static void deleteCity(String cityName, ArrayList<City> cities) {
        for (City city : cities) {
            if (city.getCityName().equals(cityName)) {
                cities.remove(city);
                return; // exit loop once the city is found and removed
            }
        }
    }
}