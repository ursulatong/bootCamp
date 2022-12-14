package com.vtxlab.openweather.service.impl;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.vtxlab.openweather.exceptions.ApiException;
import com.vtxlab.openweather.model.currentweather.CurrentWeatherResponse;
import com.vtxlab.openweather.service.OpenWeatherService;
import com.vtxlab.openweather.utils.RedisKey;
import com.vtxlab.openweather.utils.WeatherApi;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Service
public class OpenWeatherServiceHolder implements OpenWeatherService {

  @Value("${service.currentweather.baseUrl}")
  String baseUrl;

  @Value("${service.currentweather.serviceVers}")
  String serviceVers;

  @Value("${service.currentweather.serviceUrl}")
  String serviceUrl;

  @Value("${service.appId}")
  String appId;

  @Autowired
  WeatherApi weatherApi;

  @Override
  public CurrentWeatherResponse getCurrentWeather(BigDecimal latitude,
      BigDecimal longitude) throws ApiException {
        
    // invoke weather API
    HashMap<String, String> hMap = new HashMap<>();
    hMap.put("lat", latitude.toString());
    hMap.put("lon", longitude.toString());
    hMap.put("appId", appId);

    String redisKey = RedisKey.API_OPENWEATHER_1 + ":"
    + latitude.toString() + ":"
        + longitude.toString();

        CurrentWeatherResponse currentWeatherResponse = 
            weatherApi.invoke(baseUrl,
                serviceVers, serviceUrl,
        hMap, CurrentWeatherResponse.class,
                redisKey, Duration.ofSeconds(60));

        return currentWeatherResponse;
  }
}
