package com.vtxlab.crypto.vtxlabcryptoadmin.contoller.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vtxlab.crypto.vtxlabcryptoadmin.contoller.CoinMappingOperations;
import com.vtxlab.crypto.vtxlabcryptoadmin.entity.ChannelCoinMapping;



@RestController
@RequestMapping (value = "crypto/admin/api/v1")
public class CoinMappingController implements CoinMappingOperations  {

@Override
public ChannelCoinMapping saveCoinMapping( ChannelCoinMapping channelCoinMapping){


}

  
  
}
