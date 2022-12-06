package com.vtxlab.openweather.service;

import java.math.BigDecimal;

import com.vtxlab.openweather.exceptions.ApiException;
import com.vtxlab.openweather.model.currentweather.CurrentWeatherResponse;



public interface OpenWeatherService {
  
  CurrentWeatherResponse getCurrentWeather(BigDecimal latitude,
      BigDecimal longitude) throws ApiException;
}
