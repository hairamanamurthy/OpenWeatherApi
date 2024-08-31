package com.example.GetWeatherInfo.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Temprature {
    double temp;
    double feels_like;
    double temp_min;
    double temp_max;
    long pressure;
    int humidity;
    int sea_level;
    int grnd_level;
    /*
        "temp": 298.48,
                "feels_like": 298.74,
                "temp_min": 297.56,
                "temp_max": 300.05,
                "pressure": 1015,
                "humidity": 64,
                "sea_level": 1015,
                "grnd_level": 933
    },*/

}
