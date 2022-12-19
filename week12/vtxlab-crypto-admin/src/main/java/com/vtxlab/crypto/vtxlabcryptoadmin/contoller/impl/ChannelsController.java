package com.vtxlab.crypto.vtxlabcryptoadmin.contoller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vtxlab.crypto.vtxlabcryptoadmin.contoller.ChannelsOperation;
import com.vtxlab.crypto.vtxlabcryptoadmin.entity.Channel;
import com.vtxlab.crypto.vtxlabcryptoadmin.service.AdminService;

@RestController
@RequestMapping (value = "crypto/admin/api/v1")
public class ChannelsController implements ChannelsOperation {

@Autowired
AdminService adminService;

@Override
public Channel saveChannel(Channel channel) {
  return adminService.saveChannel(channel);
}

@Override
public Channel updateChannel(Channel channel, Long id) {
  return adminService.updateChannel(channel, id);
}

@Override
public Channel submitChannel(Channel channel)
throws IllegalArgumentException {
  return adminService.submitChannel(channel);
}

@Override
public Channel getChannels(String sourceApp, String tranType) {
  return adminService.getChannels(sourceApp, tranType);
}


}
