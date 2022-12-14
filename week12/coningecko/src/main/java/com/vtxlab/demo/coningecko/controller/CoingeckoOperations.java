package com.vtxlab.demo.coningecko.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vtxlab.demo.coningecko.exception.ApiException;
import com.vtxlab.demo.coningecko.model.CoinsMarket;

@RequestMapping (value = "/default")
public interface CoingeckoOperations {

  @GetMapping (value = "/coin/market")
  List<CoinsMarket> getCoinsMarket() throws ApiException;
  
}
