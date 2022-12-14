package com.vtxlab.demo.coningecko.service.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.vtxlab.demo.coningecko.exception.ApiException;
import com.vtxlab.demo.coningecko.model.CoinsMarket;
import com.vtxlab.demo.coningecko.model.ExchangeRate;
import com.vtxlab.demo.coningecko.service.ConingeckoService;
import com.vtxlab.demo.coningecko.utils.CoinsApi;

@Service
public class CoingeckoServiceHolder implements ConingeckoService {

  @Autowired
  CoinsApi coinsApi;

  @Value ("${coingecko.baseUrl}")
  String baseUrl;

  @Value("${coingecko.serviceVers}")
  String serviceVers;

  @Value("${coingecko.service.coins-markets.serviceUrl}")
  String serviceUrl;

  @Value ("${coingecko.service.coins-markets.currency}")
  String vsCurrency;

  @Value ("${coingecko.service.coins-markets.order}")
  String order;

  @Value ("${coingecko.service.coins-markets.perPage}")
  String perPage;

  @Value ("${coingecko.service.coins-markets.page}")
  String page;

  @Value ("${coingecko.service.coins-markets.sparkline}")
  String sparkline;

  @Value("${coingecko.service.exchange-rates.serviceUrl}")
  String serviceUrl2;
  

  @Override
  public List<CoinsMarket> getAllCoinsMarket() throws ApiException {

    HashMap<String, String> hMap = new HashMap<>();
    hMap.put("vs_currency", vsCurrency);
    hMap.put("order", order);
    hMap.put("per_page", perPage);
    hMap.put("page", page);
    hMap.put("sparkline", sparkline);

    return Arrays.asList(coinsApi.invoke(baseUrl,
        serviceVers, serviceUrl,
        hMap, CoinsMarket[].class));

  }
  
  @Override
  public List<ExchangeRate> getExchangeRates() throws ApiException {
   
    return coinsApi.invoke(baseUrl,
        serviceVers, serviceUrl2,
       List<ExchangeRate>.class);

  }
    
  }
  

