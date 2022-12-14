package com.vtxlab.demo.coningecko.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming (value = PropertyNamingStrategies.SnakeCaseStrategy.class)

public class CoinsMarket {

  private String id;

  private String symbol;

  private String name;

  private String image;

  private BigDecimal currentPrice;

  private BigDecimal marketCap;

  private BigDecimal marketCapRank;

  private BigDecimal fullyDilutedValuation;

  private BigDecimal totalVolume;

  @JsonProperty (value = "high_24h")
  private BigDecimal high24h;

  @JsonProperty (value = "low_24h")
  private BigDecimal low24h;

  @JsonProperty (value = "price_change_24h")
  private BigDecimal priceChange24h;

  @JsonProperty (value = "price_change_percentage_24h")
  private BigDecimal priceChangePercentage24h;

  @JsonProperty (value = "market_cap_change_24h")
  private BigDecimal marketCapChange24h;

  @JsonProperty (value = "market_cap_change_percentage_24h")
  private BigDecimal marketCapChangePercentage24h;

  @JsonProperty (value = "circulating_supply")
  private BigDecimal circulatingSupply;

  @JsonProperty (value = "total_supply")
  private BigDecimal totalSupply;

  @JsonProperty (value = "max_supply")
  private BigDecimal maxSupply;

  private BigDecimal ath;

  @JsonProperty (value = "ath_change_percentage")
  private BigDecimal athChangePercentage;

  @JsonProperty (value = "ath_date")
  private String athDate;

  private BigDecimal atl;

  @JsonProperty (value = "atl_change_percentage")
  private BigDecimal atlChangePercentage;

  @JsonProperty (value = "atl_date")
  private String atlDate;

  private Roi roi;

  @JsonProperty (value = "last_updated")
  private String lastUpdated;



  @Data
  @AllArgsConstructor
  @NoArgsConstructor
  public class Roi {

    private BigDecimal times;

    private String currency;

    private BigDecimal percentage;
  }


}
