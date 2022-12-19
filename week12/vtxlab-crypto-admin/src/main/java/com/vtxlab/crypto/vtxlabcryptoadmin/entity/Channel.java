package com.vtxlab.crypto.vtxlabcryptoadmin.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.annotation.Nonnull;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "CHANNELS") // table name in database
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Channel implements Serializable{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increment
  @Column (name = "id")
  private long id; // primary key

  @Nonnull
  @Column (name = "channel_code")
  private String channelCode;

  @Nonnull
  @Column (name = "channel_url")
  private String channelUrl;

  @Nonnull
  @Column (name = "last_upd_date")
  private LocalDateTime lastUpDate;

  @OneToMany(mappedBy = "channel", cascade = CascadeType.ALL)
  @JsonIgnoreProperties({ "channel" })
  private List<ChannelCoinMapping> coinMap = new ArrayList<>();

  @OneToMany(mappedBy = "channel", cascade = CascadeType.ALL)
  @JsonIgnoreProperties({ "channel" })
  private List<ChannelTransaction> coinTran = new ArrayList<>();

  }


