package com.vtxlab.crypto.vtxlabcryptoadmin.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vtxlab.crypto.vtxlabcryptoadmin.entity.Channel;

@RequestMapping (value = "/default")
public interface ChannelsOperation {


  @PostMapping (value = "/channel")
  Channel saveChannel(@RequestBody Channel channel);

  @PutMapping(value = "/channel/{id}")
  Channel updateChannel(@RequestBody Channel channel, @RequestParam("id") Long id);

  @PostMapping (value = "/channel-submit")
  Channel submitChannel(@RequestBody Channel channel);

  @GetMapping (value = "/channel")
  Channel getChannels( @RequestParam String sourceApp, @RequestParam String tranType);

  
}
