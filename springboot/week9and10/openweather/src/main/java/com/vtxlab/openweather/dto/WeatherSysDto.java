package com.vtxlab.openweather.dto;

import com.vtxlab.openweather.model.Coord;
import com.vtxlab.openweather.model.Sys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class WeatherSysDto {

  private Coord coord;

  private Sys sys;
  
}
