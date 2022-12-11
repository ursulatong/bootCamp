package com.vtxlab.demo.async.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vtxlab.demo.async.service.AsyncService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = "/api/v1")
@Slf4j

public class AsyncController {

  @Autowired
  AsyncService asyncService;

  @GetMapping (value = "/async")
  public String async() throws InterruptedException{
    log.info("asyncController start .... {}", LocalDateTime.now().toString());
    asyncService.asyncService2();
    asyncService.asyncService1();
    log.info("asyncController start .... {}", LocalDateTime.now().toString());
    return "completed";

  }

  
  
}
