package com.vtxlab.crypto.polygon.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.vtxlab.crypto.polygon.exception.ApiException;
import com.vtxlab.crypto.polygon.model.CoinExchange;
import com.vtxlab.crypto.polygon.service.PolygonService;
import com.vtxlab.crypto.polygon.util.CoinsApi;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Service
public class PolygonServiceHolder implements PolygonService {

  @Autowired
  CoinsApi coinsApi;

  @Value("${polygon.baseUrl}")
  String baseUrl;

  @Value("${polygon.serviceVers}")
  String serviceVers;

  @Value("${polygon.service.previous.serviceUrl}")
  String serviceUrl;

  @Value("${polygon.apiKey}")
  String apiKey;

  @Value("${polygon.service.previous.adjusted}")
  String adjusted;

  @Override
  public List<CoinExchange> getCoinExchangeList(List<String> cryptos, List<String> currencies) throws ApiException {

    // loop cryptos to invoke Polygon API

    List<CoinExchange> coinExchanges = new ArrayList<>();
    for (String coin : cryptos) {
      for (String curr : currencies) {
        coinExchanges.add(getCoinExchange(coin, curr));
      }
    }
    return coinExchanges;

  }

  // private method does not need to put in interface
  private CoinExchange getCoinExchange(String cryptos, String currency) throws ApiException {

    String updatedServiceUrl = serviceUrl.replace("{ticker}", "X:" + cryptos + currency);

    HashMap<String, String> hMap = new HashMap<>();
    hMap.put("adjusted", adjusted);
    hMap.put("apiKey", apiKey);

    return coinsApi.invoke(baseUrl,
        serviceVers, serviceUrl,
        hMap, CoinExchange.class);

  }
}

