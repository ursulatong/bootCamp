package com.vtxlab.openweather.model.currentweather;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CloudIndex implements Serializable{ // need to implement serializable to cope with redis

  /**
   * Cloudiness %
   */


  @JsonProperty("all")
  private BigDecimal cloudinessPercent;
  
}
