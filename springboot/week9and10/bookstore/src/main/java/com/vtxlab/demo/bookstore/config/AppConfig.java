package com.vtxlab.demo.bookstore.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig { //

  // new modelapper
  // 将ModelMapper配置好后注册为JavaBean交给Spring来管理

  @Bean
  public ModelMapper modelMapper() {
    return new ModelMapper();
  }

  // 可以引入好多liberies再放入config進行配置...
}
