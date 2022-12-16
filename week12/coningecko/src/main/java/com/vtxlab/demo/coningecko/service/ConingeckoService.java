package com.vtxlab.demo.coningecko.service;

import java.util.HashMap;
import java.util.List;

import com.vtxlab.demo.coningecko.exception.ApiException;
import com.vtxlab.demo.coningecko.model.CoinsCurrency;
import com.vtxlab.demo.coningecko.model.CoinsMarket;

public interface ConingeckoService {

  List<CoinsMarket> getAllCoinsMarket() throws ApiException;

//  List<ExchangeRate> getExchangeRates() throws ApiException;

  HashMap<String, CoinsCurrency> getCoinsPrices(List<String> coins, List<String> CoinsCurrency) throws ApiException;

}
