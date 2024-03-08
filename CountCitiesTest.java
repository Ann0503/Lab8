package com.example.lab8;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class CountCitiesTest {

    @Test
    public void testCountCities() {
        ArrayList<City> cities = new ArrayList<>();
        cities.add(new City("New York", "NY"));
        cities.add(new City("Los Angeles", "CA"));

        assertEquals(2, CountCities.countCities(cities));
    }
}