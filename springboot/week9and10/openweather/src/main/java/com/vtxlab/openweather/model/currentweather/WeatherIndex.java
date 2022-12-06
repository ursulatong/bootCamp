package com.vtxlab.openweather.model.currentweather;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WeatherIndex implements Serializable{
  
  // Weather condition
  @JsonProperty("id")
  private Long conditionId;

  // Group of weather parameters (Rain, Snow, Extreme etc.)
  private String main;

  // Weather condition within the group. You can get the output in your language.
  private String description;

  // Weather icon id
  private String icon;
}
