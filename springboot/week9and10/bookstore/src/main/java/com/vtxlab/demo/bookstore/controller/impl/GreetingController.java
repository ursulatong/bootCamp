package com.vtxlab.demo.bookstore.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vtxlab.demo.bookstore.controller.GreetingOperation;
import com.vtxlab.demo.bookstore.service.GreetingService;


@RequestMapping("api/v1")
@RestController
public class GreetingController implements GreetingOperation {
  
  @Autowired
  GreetingService greetingService;

  @Override
  public String getGreetingService() {
    return greetingService.getGreetingMessage() + " Vincent";

  }
  

  


}
