package com.vtxlab.openweather.model;

import java.math.BigDecimal;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class WeatherHolder {

  private Coord coord;

  private List<Weather> weather;

  private String base;

  private Main main;

  private BigDecimal visibility;

  private Wind wind;

  private Rain rain;

  private Sys sys;

  private Clouds cloud;

  private BigDecimal dt;

  private BigDecimal timezone;

  private BigDecimal id;

  private String name;

  private BigDecimal cod;

  
}
