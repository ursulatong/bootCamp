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
            .temperature(cwr.getMainIndex().getTempperature())
            .minTemperature(cwr.getMainIndex().getMinTemperature())
            .maxTemperature(cwr.getMainIndex().getMaxTemperature())
            .cityId(cwr.getCityId())
            .cityName(cwr.getCityName())
            .humidity(cwr.getMainIndex().getHumidity())
            .pressure(cwr.getMainIndex().getPressure())
            .windDegree(cwr.getWindIndex().getWindDegree())
            .windSpeed(cwr.getWindIndex().getWindSpeed())
            .cloudinessPercent(cwr.getCloudIndex().getCloudinessPercent())
            .build();

    return WeatherDto.builder().currentWeatherDto(currentWeatherDto).build();
  }
  
}
