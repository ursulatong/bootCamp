package com.vtxlab.demo.coningecko.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ExchangeRate {

  private String name;

  private String unit;

  private String value;

  private String type;
  
}
