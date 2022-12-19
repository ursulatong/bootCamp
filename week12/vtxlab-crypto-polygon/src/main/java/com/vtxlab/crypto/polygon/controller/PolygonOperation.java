package com.vtxlab.crypto.polygon.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vtxlab.crypto.polygon.exception.ApiException;
import com.vtxlab.crypto.polygon.model.CoinExchange;
import com.vtxlab.crypto.polygon.model.dto.ChannelDto;

import jakarta.websocket.server.PathParam;

@RequestMapping(value = "/default")
public interface PolygonOperation {

  @GetMapping(value = "/price")
   ChannelDto getExchangeRate(
       @RequestParam (value = "coins")  List<String> cryptos, 
   @RequestParam List<String> currencies) throws ApiException;

  
}

