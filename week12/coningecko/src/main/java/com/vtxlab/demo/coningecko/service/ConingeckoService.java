package com.vtxlab.demo.coningecko.service;

import java.util.List;

import com.vtxlab.demo.coningecko.exception.ApiException;
import com.vtxlab.demo.coningecko.model.CoinsMarket;
import com.vtxlab.demo.coningecko.model.ExchangeRate;

public interface ConingeckoService {

  List<CoinsMarket> getAllCoinsMarket() throws ApiException;

  List<ExchangeRate> getExchangeRates() throws ApiException;


}
