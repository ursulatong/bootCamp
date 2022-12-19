package com.vtxlab.crypto.polygon.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vtxlab.crypto.polygon.controller.PolygonOperation;
import com.vtxlab.crypto.polygon.exception.ApiException;
import com.vtxlab.crypto.polygon.model.CoinExchange;
import com.vtxlab.crypto.polygon.model.dto.ChannelDto;
import com.vtxlab.crypto.polygon.service.PolygonService;
import com.vtxlab.crypto.polygon.util.CoinsApi;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = "/crypto/polygon/api/v1")
@Slf4j

public class PolygonController implements PolygonOperation {

  @Autowired
  PolygonService polygonService;

  public ChannelDto getExchangeRate(List<String> cryptos, List<String> currencies) throws ApiException {
    log.info("start Controller");

    return ChannelDto.builder().exchangeRates (
    CoinsApi.map(polygonService.getCoinExchangeList(cryptos, currencies)))
        .build();
  }

  }

  