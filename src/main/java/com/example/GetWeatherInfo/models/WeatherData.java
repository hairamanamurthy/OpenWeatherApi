package com.example.GetWeatherInfo.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class WeatherData {
    private int id;
    private String main;
    private String description;
    private String icon;

}
