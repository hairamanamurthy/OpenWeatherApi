package com.example.GetWeatherInfo.controller;

import com.example.GetWeatherInfo.models.Weather;
import com.example.GetWeatherInfo.services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Weathercontroller {

     @Autowired
     private WeatherService  weatherService;
     @GetMapping("/weather/{lat}/{lon}")
     public ResponseEntity<Weather> getLangAndLatDetials(@PathVariable("lat") double lat, @PathVariable("lon")  double lon){
          if(lat<0 || lon<0) {
           return    new ResponseEntity<>(HttpStatusCode.valueOf(400));
          }
          Weather weather= weatherService.getWeatherByLatLon(lat,lon);
          return new ResponseEntity<>(weather,HttpStatusCode.valueOf(200));
     }
}
