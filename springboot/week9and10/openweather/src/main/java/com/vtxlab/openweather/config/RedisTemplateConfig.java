package com.vtxlab.openweather.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import com.vtxlab.openweather.model.currentweather.CurrentWeatherResponse;
import com.vtxlab.openweather.model.interfaces.WeatherResponseinterface;

@Configuration
public class RedisTemplateConfig {

  @Bean(name = "redisTemplate")
  public RedisTemplate<String, WeatherResponseinterface> redisTemplate(
      RedisConnectionFactory connectionFactory) {
    RedisTemplate<String, WeatherResponseinterface> redisTemplate = new RedisTemplate<>();
    redisTemplate.setConnectionFactory(connectionFactory);
    StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
    redisTemplate.setKeySerializer(stringRedisSerializer);
    // Add some specific configuration here. Key serializers, etc.
    return redisTemplate;
  }
  
}
