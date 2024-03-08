package com.example.lab8;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class HasCityTest {

    @Test
    public void testHasCity() {
        ArrayList<City> cities = new ArrayList<>();
        cities.add(new City("New York", "NY"));
        cities.add(new City("Los Angeles", "CA"));

        assertTrue(HasCity.hasCity("New York", cities));
        assertFalse(HasCity.hasCity("Chicago", cities));
    }
}