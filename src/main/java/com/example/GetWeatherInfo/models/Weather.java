package com.example.GetWeatherInfo.models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Setter
@Getter
public class Weather {
//    double lat;
//    double lon;
    int id;
    String currentWeatherSummary;
//    double temp;
    String timezone;
    String name;
    int cod;
    ArrayList<WeatherData> weatherdata=new ArrayList<>();
    Temprature main;

}
