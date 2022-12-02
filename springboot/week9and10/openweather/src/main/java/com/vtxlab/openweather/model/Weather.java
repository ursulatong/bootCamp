package com.vtxlab.openweather.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Weather {

  private BigDecimal id;

  private String main;

  private String description;

  private String icon;
  
}
