package com.vtxlab.crypto.vtxlabcryptoadmin.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.annotation.Nonnull;
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
@Table(name = "CHANNELS_COIN_MAPPINGS")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ChannelCoinMapping implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increment
  @Column(name = "id")
  private Long id; // primary key

  @Nonnull
  @Column(name = "coin_code")
  private String coinCode;

  @Nonnull
  @Column (name = "last_upd_date")
  private LocalDateTime lastUpDate;

  
  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "channel_id", referencedColumnName = "ID")
 @JsonIgnoreProperties("coinMap")
  private Channel channel;

  
}
