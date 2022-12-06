package com.vtxlab.openweather.controller.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vtxlab.openweather.controller.WeatherOperation;
import com.vtxlab.openweather.model.currentweather.CurrentWeatherResponse;
import com.vtxlab.openweather.model.dto.WeatherDto;
import com.vtxlab.openweather.response.Alert;
import com.vtxlab.openweather.response.ApiResponse;
import com.vtxlab.openweather.response.enums.ResponseStatus;
import com.vtxlab.openweather.service.OpenWeatherService;
import com.vtxlab.openweather.utils.WeatherModelMapper;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = "/api/v1")
@Slf4j

public class WeatherController implements WeatherOperation {


  @Autowired
  OpenWeatherService openWeatherService;

  public static List<Alert> errAlerts = new ArrayList<>();

  @Override
  public ResponseEntity<ApiResponse<WeatherDto>> getWeatherData(
      BigDecimal lantitude,
      BigDecimal longitude) throws Exception {
    CurrentWeatherResponse currentWeatherResponse = openWeatherService
        .getCurrentWeather(lantitude, longitude);

    if (currentWeatherResponse == null) {
      log.info("it is null");
    }

    Integer responseCode = currentWeatherResponse.getCode() == 200 ? //
        ResponseStatus.OK.getCode()
        : ResponseStatus.THIRD_PARTY_API_FAIL.getCode();

    String responseMsg = currentWeatherResponse.getCode() == 200 ? //
        ResponseStatus.OK.getMessage()
        : ResponseStatus.THIRD_PARTY_API_FAIL
            .getMessage();

    WeatherDto weatherDto = WeatherModelMapper
        .convert(currentWeatherResponse);

    ApiResponse<WeatherDto> apiResponse = ApiResponse
        .<WeatherDto>builder()
        .code(responseCode)
        .message(responseMsg)
        .data(weatherDto)
        .alerts(errAlerts)
        .build();

    return ResponseEntity.ok().body(apiResponse);
  }
}
