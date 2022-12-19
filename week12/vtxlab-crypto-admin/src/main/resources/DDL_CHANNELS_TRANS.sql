DROP TABLE IF EXISTS CHANNELS_TRANS;

USE SYS;

CREATE TABLE CHANNELS_TRANS (
  id INTEGER auto_increment primary key,
  channel_id INTEGER NOT NULL,
  -- 1
  domain_version VARCHAR (100) NOT NULL,
  --  crypto/coingecko/api/v1
  domain_url VARCHAR (100) NOT NULL,
  -- price 
  source_app VARCHAR (20) NOT NULL,
  -- crypto-web
  tran_type VARCHAR (20) NOT NULL,
  -- ex-rate
  last_upd_date DATETIME NOT NULL DEFAULT current_timestamp,
  CONSTRAINT UC_TRAN UNIQUE (source_app, tran_type)
);