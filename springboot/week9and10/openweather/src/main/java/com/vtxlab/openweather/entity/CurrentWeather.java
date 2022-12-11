package com.vtxlab.openweather.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import com.vtxlab.openweather.model.currentweather.CurrentWeatherResponse;
import com.vtxlab.openweather.model.dto.CurrentWeatherDto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "CurrentWeather")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class CurrentWeather {

  @Id
  @GeneratedValue (strategy = GenerationType.IDENTITY)
  private Long id;

  private LocalDate date;

  private BigDecimal latitute;
  
  
}
