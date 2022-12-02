package com.vtxlab.openweather.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Sys {

  private BigDecimal type;

  private BigDecimal id;

  private String country;

  private BigDecimal sunrise;

  private BigDecimal sunset;
  
}
