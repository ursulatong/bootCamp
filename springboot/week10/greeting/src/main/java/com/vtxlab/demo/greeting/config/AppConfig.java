package com.vtxlab.demo.greeting.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration  // belong to @Component , find by @SpringBootApplication
public class AppConfig {

  @Bean //2nd
  public ObjectMapper objectMapper() {  // call method
    return new ObjectMapper(); // return bean
  }

  
}
