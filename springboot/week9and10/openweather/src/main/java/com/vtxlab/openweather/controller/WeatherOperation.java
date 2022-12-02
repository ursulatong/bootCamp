package com.vtxlab.openweather.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vtxlab.openweather.dto.WeatherSysDto;
import com.vtxlab.openweather.model.WeatherHolder;

@RequestMapping(value = "/default")
public interface WeatherOperation {

  @GetMapping(value = "/weather")
  WeatherHolder getWeatherService(@RequestParam BigDecimal lat, @RequestParam BigDecimal lon);

  @GetMapping (value = "/weather/sys")
  WeatherSysDto getWeatherSysDto(@RequestParam BigDecimal lat, @RequestParam BigDecimal lon);

}
