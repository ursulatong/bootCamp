package com.vtxlab.openweather.service;

import java.math.BigDecimal;

import com.vtxlab.openweather.model.WeatherHolder;

public interface WeatherService {
  
  WeatherHolder getWeatherMessage(BigDecimal lat, BigDecimal lon);
}
