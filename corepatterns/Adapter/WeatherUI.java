package com.mySpringboot.corepatterns.Adapter;

public class WeatherUI {

    public void showTemperature(int zipcode ) {

        WeatherAdapter adapter = new WeatherAdapter();
        System.out.println(adapter.findTemperature(zipcode));
    }
}
