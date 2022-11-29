package com.vtxlab.student.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vtxlab.student.entity.Student;

@Configuration // 自己製造一個bean and states itself
public class StudentConfiguration {

  @Bean(name = "BeanForAlan") // create student bean into container -> @autoweird in service to use
  public Student getAlan() {
    return new Student(2l, 155.0d, "alan");
  }

}
