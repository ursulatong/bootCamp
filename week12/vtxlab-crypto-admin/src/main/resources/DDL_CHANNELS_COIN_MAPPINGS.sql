DROP TABLE IF EXISTS CHANNELS_COIN_MAPPINGS;

use sys;

CREATE TABLE CHANNELS_COIN_MAPPINGS (
  id INTEGER auto_increment PRIMARY KEY,
  channel_id INTEGER NOT NULL, -- coingecko
  coin_code VARCHAR (5) NOT NULL,  -- BTC
  coin_id VARCHAR (20) NOT NULL, -- bitcoin
  last_upd_date DATETIME NOT NULL DEFAULT current_timestamp,
  CONSTRAINT UC_MAPPING UNIQUE (channel_id, coin_code)
);