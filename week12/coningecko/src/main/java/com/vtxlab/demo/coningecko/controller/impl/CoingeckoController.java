package com.vtxlab.demo.coningecko.controller.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vtxlab.demo.coningecko.controller.CoingeckoOperations;
import com.vtxlab.demo.coningecko.exception.ApiException;
import com.vtxlab.demo.coningecko.model.CoinsCurrency;
import com.vtxlab.demo.coningecko.model.CoinsMarket;
import com.vtxlab.demo.coningecko.service.ConingeckoService;

import lombok.extern.slf4j.Slf4j;

@RestController
@CrossOrigin // annotation that match the frondend page
@RequestMapping(value = "/crypto/api/v1")
@Slf4j
public class CoingeckoController implements CoingeckoOperations {

  @Autowired
  ConingeckoService coningeckoService;

  public List<CoinsMarket> getCoinsMarket() throws ApiException {

    log.info("start Controller");
    List<CoinsMarket> coinsMarkets = coningeckoService.getAllCoinsMarket();
    log.info("start Controller");
    return coinsMarkets;
  }

   public HashMap<String, CoinsCurrency> getCoinsPrices(List<String> ids, List<String> currencies) throws ApiException{

    log.info("start Controller");
    HashMap<String, CoinsCurrency> coinsPrice = coningeckoService.getCoinsPrices(ids, currencies);
    log.info("start Controller");
    return coinsPrice;

    
  }

}
