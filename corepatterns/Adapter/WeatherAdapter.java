package com.mySpringboot.corepatterns.Adapter;

public class WeatherAdapter {

    public int findTemperature(int zipcode ) {
        String city = null;
        if(zipcode==116) {
            city = "NewFoundLand";
        }
        WeatherFinder finder = new WeatherFinderImpl();
        int temperature = finder.find(city);
        return temperature;
    }
}
