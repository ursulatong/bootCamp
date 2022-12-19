package com.vtxlab.crypto.vtxlabcryptoadmin.service;

import com.vtxlab.crypto.vtxlabcryptoadmin.entity.Channel;

public interface AdminService {

  Boolean isChannelCodeExist(String channelCode); // check channel code

  Channel saveChannel(Channel channel); //save channel

  Channel updateChannel(Channel channel, Long id); // put method

  Channel submitChannel(Channel channel);
  
  Channel getChannels(String sourceApp, String tranType);

 

}
