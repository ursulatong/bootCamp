package com.vtxlab.crypto.vtxlabcryptoadmin.contoller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vtxlab.crypto.vtxlabcryptoadmin.entity.ChannelCoinMapping;

@RequestMapping (value = "default")
public interface CoinMappingOperations {

  @PostMapping (value = "/coinmap")
  ChannelCoinMapping saveCoinMapping(@RequestBody ChannelCoinMapping channelCoinMapping);

}
