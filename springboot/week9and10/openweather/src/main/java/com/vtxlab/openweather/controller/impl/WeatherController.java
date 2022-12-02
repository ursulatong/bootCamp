package com.vtxlab.openweather.controller.impl;

import java.math.BigDecimal;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vtxlab.openweather.controller.WeatherOperation;
import com.vtxlab.openweather.dto.WeatherSysDto;
import com.vtxlab.openweather.model.WeatherHolder;
import com.vtxlab.openweather.service.WeatherService;

@RestController
@RequestMapping("/api/v1")

public class WeatherController implements WeatherOperation {

  @Autowired
  WeatherService weatherService;

  @Autowired
  ModelMapper modelMapper;

  @Override
  public WeatherHolder getWeatherService(BigDecimal lat, BigDecimal lon) {
    return weatherService.getWeatherMessage(lat, lon);
  }

  @Override
  public WeatherSysDto getWeatherSysDto(BigDecimal lat, BigDecimal lon) {
    WeatherSysDto dto = modelMapper.map(weatherService.getWeatherMessage(lat, lon), WeatherSysDto.class);
    return dto;

  }

}
