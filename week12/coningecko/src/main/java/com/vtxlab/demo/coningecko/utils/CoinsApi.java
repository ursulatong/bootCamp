package com.vtxlab.demo.coningecko.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.vtxlab.demo.coningecko.exception.ApiException;
import com.vtxlab.demo.coningecko.model.CoinsMarket;
import com.vtxlab.demo.coningecko.model.ExchangeRate;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class CoinsApi {

  @Autowired
  RestTemplate restTemplate;

  public <T extends CoinsMarket> T[] invoke(String baseUrl,
      String serviceVers,
      String serviceUrl, HashMap<String, String> queryParms,
      Class<T[]> returnType) throws ApiException {
    try {
      UriComponentsBuilder url = UriComponentsBuilder.fromUriString(baseUrl)
          .pathSegment(serviceVers) // api/v3
          .path(serviceUrl); // coins/markets

      //loop the queryParms...currency, order, marrket, page...
      for (Map.Entry<String, String> entry : queryParms.entrySet()) {
        url = url.queryParam(entry.getKey(), entry.getValue());
      }

      // build the whole url
      String urlString = url.build().toString();

      log.info("url={}", urlString);

      //urlString is the parameter, returntype is sth that returned
      return restTemplate.getForObject(urlString, returnType);
    } catch (Exception e) {
      e.printStackTrace();
      throw new ApiException(80001, "Call coinGecko service fail.");
    }
  }

  public <T extends ExchangeRate> T invoke(String baseUrl,
      String serviceVers,
      String serviceUrl,
      Class<T> returnType) throws ApiException {
    try {
      UriComponentsBuilder url = UriComponentsBuilder.fromUriString(baseUrl)
          .pathSegment(serviceVers) // api/v3
          .path(serviceUrl); // exchange_rates

      String urlString = url.build().toString();

      log.info("url={}", urlString);

      //urlString is the parameter, returntype is sth that returned
      return restTemplate.getForObject(urlString, returnType);
    } catch (Exception e) {
      e.printStackTrace();
      throw new ApiException(80001, "Call coinGecko service fail.");
    }
  }
}
