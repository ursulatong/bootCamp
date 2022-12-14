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

public class Coordinate implements Serializable{
 
  /**
   * City geo location, longitude
   */
  @JsonProperty("lat")
  private BigDecimal latitude;
  
  /**
   * City geo location, latitude
   */
  @JsonProperty("lon")
  private BigDecimal longitude;

}
