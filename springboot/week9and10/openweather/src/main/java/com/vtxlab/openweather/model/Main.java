package com.vtxlab.openweather.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Main {

  private BigDecimal temp;

  private BigDecimal feels_like;

  private BigDecimal temp_min;

  private BigDecimal temp_max;

  private BigDecimal pressure;

  private BigDecimal humidity;

  private BigDecimal sea_Level;

  private BigDecimal grnd_level;
  
}
