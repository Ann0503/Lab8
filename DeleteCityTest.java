package com.example.lab8;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class DeleteCityTest {

    @Test
    public void testDeleteCity() {
        ArrayList<City> cities = new ArrayList<>();
        cities.add(new City("New York", "NY"));
        cities.add(new City("Los Angeles", "CA"));

        DeleteCity.deleteCity("New York", cities);
        assertEquals(1, cities.size());
        assertFalse(HasCity.hasCity("New York", cities));
    }
}