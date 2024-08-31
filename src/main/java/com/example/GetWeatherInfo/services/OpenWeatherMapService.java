package com.example.GetWeatherInfo.services;

import com.example.GetWeatherInfo.dtos.OpenWeatherDto;
import com.example.GetWeatherInfo.models.Temprature;
import com.example.GetWeatherInfo.models.Weather;
import com.example.GetWeatherInfo.models.WeatherData;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class OpenWeatherMapService implements WeatherService{
    @Override
    public Weather getWeatherByLatLon(double lat, double lon) {

        String url="https://api.openweathermap.org/data/2.5/weather?lat="+lat+"&lon="+lon+"&appid="+"c70e01f23b4a845c0901338a669288ce";
    //https://api.openweathermap.org/data/2.5/weather?lat=17.89&lon=83.18&appid=c70e01f23b4a845c0901338a669288ce
        RestTemplate restTemplate=new RestTemplate();
        OpenWeatherDto openWeatherDto= restTemplate.getForObject(url, OpenWeatherDto.class);
        return convertOpenweathertoWeather(openWeatherDto);
    }
    private Weather convertOpenweathertoWeather(OpenWeatherDto dto){
        Weather weather=new Weather();
        Temprature t= new Temprature();
       // WeatherData wd=new WeatherData();
        //wd.setId(dt.);
        weather.setId(dto.getId());
        weather.setCurrentWeatherSummary(dto.getBase());
        weather.setName(dto.getName());
        weather.setCod(dto.getCod());
        weather.setTimezone(dto.getTimezone());
        weather.setWeatherdata(dto.getWeather());
       // ObjectMapper objectMapper;
       weather.setMain(dto.getMain());
       //t.setTemp(t.getTemp()-273.15);
        return weather;
    }
}
