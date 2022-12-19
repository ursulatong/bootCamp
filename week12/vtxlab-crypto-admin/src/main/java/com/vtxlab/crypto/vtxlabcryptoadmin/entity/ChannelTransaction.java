package com.vtxlab.crypto.vtxlabcryptoadmin.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "CHANNELS_TRANS")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ChannelTransaction implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increment
  @Column(name = "id")
  private long id; // primary key

 @Column(name = "domain_version")
 private String domainVersion;

 @Column(name = "domain_url")
 private String domainUrl;
  
 @Column(name = "source_app")
 private String sourceApp;
  
 @Column(name = "tran_type")
 private String tranType;
 
 @Column(name = "last_upd_date")
 private LocalDateTime lastUpDate;

 @ManyToOne(cascade = CascadeType.ALL)
 @JoinColumn(name = "channel_id", referencedColumnName = "ID")
 @JsonIgnoreProperties("coinTran")
 private Channel channel;

  
}
