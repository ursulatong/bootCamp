package com.vtxlab.openweather.service.impl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.vtxlab.openweather.model.WeatherHolder;
import com.vtxlab.openweather.service.WeatherService;


@Service
public class SelfWeatherService implements WeatherService {

  @Value("${rest.weather.baseUrl}")
  String baseUrl;

  @Value("${rest.weather.serviceVers}")
  String serviceVers;

  @Value("${rest.weather.serviceUrl}")
  String serviceUrl;

  @Value("${rest.weather.apikey}")
  String apikey;

  @Override
  public WeatherHolder getWeatherMessage(BigDecimal lat, BigDecimal lon) {
  
  String url = UriComponentsBuilder.fromUriString(baseUrl)
      .pathSegment(serviceVers)
      .path(serviceUrl)
      .queryParam("lat", lat)
      .queryParam("lon", lon)
      .queryParam("apikey", apikey)
      .build()
      .toString();

      RestTemplate restTemplate = new RestTemplate();
  return restTemplate.getForObject(url, WeatherHolder.class);
}
}
