package com.vtxlab.openweather.utils;

import com.vtxlab.openweather.model.currentweather.CurrentWeatherResponse;
import com.vtxlab.openweather.model.dto.CurrentWeatherDto;
import com.vtxlab.openweather.model.dto.WeatherDto;

public class WeatherModelMapper {

  public static WeatherDto convert(CurrentWeatherResponse cwr) {
    if (cwr == null) {
      return null;
    }
    CurrentWeatherDto currentWeatherDto = //
        CurrentWeatherDto.builder()
            .latitude(cwr.getCoordinate().getLatitude())
            .longitude(cwr.getCoordinate().getLongitude())
            .datatime(cwr.getDatatime())
            .timezone(cwr.getTimezone())
            .cityId(cwr.getCityId())
            .cityName(cwr.getCityName())
            .temperature(cwr.getMainIndex().getTempperature())
            .minTemperature(cwr.getMainIndex().getMaxTemperature())
            .maxTemperature(cwr.getMainIndex().getMinTemperature())
            .pressure(cwr.getMainIndex().getPressure())
            .humidity(cwr.getMainIndex().getHumidity())
            .windSpeed(cwr.getWindIndex().getWindSpeed())
            .windDegree(cwr.getWindIndex().getWindDegree())
            .cloudinessPercent(cwr.getCloudIndex().getCloudinessPercent())
            .build();

    return WeatherDto.builder().currentWeatherDto(currentWeatherDto).build();
  }
  
}
