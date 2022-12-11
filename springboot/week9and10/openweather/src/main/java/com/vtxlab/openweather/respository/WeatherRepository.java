package com.vtxlab.openweather.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vtxlab.openweather.entity.CurrentWeather;
import com.vtxlab.openweather.model.dto.CurrentWeatherDto;

@Repository
public interface WeatherRepository extends JpaRepository<CurrentWeather, Long> {
  
}
