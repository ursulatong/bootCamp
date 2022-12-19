package com.vtxlab.crypto.vtxlabcryptoadmin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vtxlab.crypto.vtxlabcryptoadmin.entity.Channel;
import com.vtxlab.crypto.vtxlabcryptoadmin.repository.ChannelsRepository;
import com.vtxlab.crypto.vtxlabcryptoadmin.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

  @Autowired
  ChannelsRepository channelsRepository;

  @Override
  public Boolean isChannelCodeExist(String channelCode) {
    return channelsRepository.findByChannelCode(channelCode);
      }

  @Override
  public Channel saveChannel(Channel channel) {
    return channelsRepository.save(channel);
  }

  @Override
  public Channel submitChannel(Channel channel) throws IllegalArgumentException {
    if (!isChannelCodeExist(channel.getChannelCode())) {
      saveChannel(channel);
    }
    throw new IllegalArgumentException();
  }
  
  @Override
  public Channel updateChannel(Channel channel, Long id) {
    if (channelsRepository.existsById(id)) {
      return channelsRepository.save(channel);
    }
    return null;
  }

  @Override
  public Channel getChannels(String sourceApp, String tranType) {
    return channelsRepository.findByCoinTranSourceAppAndCoinTranTranType(sourceApp, tranType);
  }
  

}
