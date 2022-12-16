package com.vtxlab.crypto.polygon.model;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CoinExchange {

  private String ticker;
  private BigDecimal queryCount;
  private BigDecimal resultsCount;
  private Boolean adjusted;
  private List<Results> results;
  private String status;
  @JsonProperty (value = "request_id")
  private String requestid;
  private BigDecimal count;


  public String getTickerCryptoString() {
    return this.ticker.substring(2, 5); // X:BTCUSD -> BTC
  }

  public String getTickerCurrencyString() {
    return this.ticker.substring(5, 8); // X:BTCUSD -> USD
  }


  @Data
  @AllArgsConstructor
  @NoArgsConstructor
  public static class Results {

    @JsonProperty (value = "T")
    private String ticker;
    @JsonProperty (value = "v")
    private BigDecimal tradingVolume;
    @JsonProperty (value = "vw")
    private BigDecimal volumeWeightedAveragePrice;
    @JsonProperty (value = "o")
    private BigDecimal openPrice;
    @JsonProperty (value = "c")
    private BigDecimal closePrice;
    @JsonProperty (value = "h")
    private BigDecimal highestPrice;
    @JsonProperty (value = "l")
    private BigDecimal lowestPrice;
    @JsonProperty (value = "t")
    private BigDecimal timeStamp;
    @JsonProperty (value = "n")
    private BigDecimal transactions;

  }

}
