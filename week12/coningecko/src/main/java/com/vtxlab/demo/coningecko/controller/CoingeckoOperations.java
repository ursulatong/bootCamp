package com.vtxlab.demo.coningecko.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vtxlab.demo.coningecko.exception.ApiException;
import com.vtxlab.demo.coningecko.model.CoinsCurrency;
import com.vtxlab.demo.coningecko.model.CoinsMarket;

@RequestMapping (value = "/default")
public interface CoingeckoOperations {

  @GetMapping (value = "/coins/market")
  List<CoinsMarket> getCoinsMarket() throws ApiException;

  @GetMapping (value = "/coins/price")
  HashMap<String, CoinsCurrency> getCoinsPrices
  (@RequestParam List<String> ids, @RequestParam List<String> currencies) // @RequestParam input ? in Url
      throws ApiException;
  

      
  
}
