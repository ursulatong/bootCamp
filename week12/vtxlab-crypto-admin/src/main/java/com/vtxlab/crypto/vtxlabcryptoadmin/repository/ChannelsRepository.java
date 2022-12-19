package com.vtxlab.crypto.vtxlabcryptoadmin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vtxlab.crypto.vtxlabcryptoadmin.entity.Channel;

@Repository
public interface ChannelsRepository extends JpaRepository<Channel, Long> {

Boolean findByChannelCode(String channelCode);

Channel findByCoinTranSourceAppAndCoinTranTranType(
    String sourceApp,
    String tranType);
}
