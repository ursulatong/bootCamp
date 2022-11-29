package com.vtxlab.demo.post2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "check")
public class checknetwork {

  @GetMapping
  public String checknet() {
    return "network";

  }

}
