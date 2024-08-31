package com.example.GetWeatherInfo.services;

import com.example.GetWeatherInfo.models.Weather;

public interface WeatherService {
    public Weather getWeatherByLatLon(double lat, double lon);
}
