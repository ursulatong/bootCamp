package com.vtxlab.crypto.polygon.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.vtxlab.crypto.polygon.exception.ApiException;
import com.vtxlab.crypto.polygon.model.CoinExchange;
import com.vtxlab.crypto.polygon.model.dto.ChannelDto;
import com.vtxlab.crypto.polygon.model.dto.ChannelDto.ExchangeRate;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class CoinsApi {

  @Autowired
  RestTemplate restTemplate;

  public static List<ChannelDto.ExchangeRate> map(
      List<CoinExchange> coinsExchange) {

  List<ChannelDto.ExchangeRate> exchangeRates = new ArrayList<>();

  for(CoinExchange coinExchange : coinExchanges)  {
    // Set Crypto to USD
    ExchangeRate exchangeRate = new ChannelDto().new ExchangeRate();
    exchangeRate.setFromCurr(coinExchange.getTickerCryptoString()); //BTC
    exchangeRate.setToCurr(coinExchange.getTickerCryptoString()); // USD
    exchangeRate.setRate(entry.getValue().getUsd());  
    exchangeRates.add(exchangeRate);

    // Set the rate for "Currency to Crypto"
    exchangeRate = new ChannelDto().new ExchangeRate();
    exchangeRate.setFromCurr("USD");
    exchangeRate.setToCurr(entry.getKey());
    exchangeRate.setRate(BigDecimal.ONE.divide(entry.getValue().getUsd(),
        new MathContext(6, RoundingMode.HALF_UP)));
    exchangeRates.add(exchangeRate);
    // Set HKD to Crypto
    exchangeRate = new ChannelDto().new ExchangeRate();
    exchangeRate.setFromCurr("HKD");
    exchangeRate.setToCurr(entry.getKey());
    exchangeRate.setRate(BigDecimal.ONE.divide(entry.getValue().getHkd(),
        new MathContext(6, RoundingMode.HALF_UP)));
    exchangeRates.add(exchangeRate);
  }return exchangeRates;
  }

  public <T> T invoke(String baseUrl,
      String serviceVers,
      String serviceUrl, HashMap<String, String> queryParms,
      Class<T> returnType) throws ApiException {
    try {
      UriComponentsBuilder url = UriComponentsBuilder.fromUriString(baseUrl)
          .pathSegment(serviceVers) // v2/aggs
          .path(serviceUrl); // ticker

      for (Map.Entry<String, String> entry : queryParms.entrySet()) {
        url = url.queryParam(entry.getKey(), entry.getValue());
      }

      // build the whole url
      String urlString = url.build().toString();

      log.info("url={}", urlString);

      // urlString is the parameter, returntype is sth that returned
      return restTemplate.getForObject(urlString, returnType);
    } catch (Exception e) {
      e.printStackTrace();
      throw new ApiException(80001, "Call coinGecko service fail.");
    }
  }
  
}
