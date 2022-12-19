DROP TABLE IF EXISTS CHANNELS;

USE SYS;

CREATE TABLE CHANNELS (
  id INTEGER auto_increment PRIMARY KEY,
  channel_code VARCHAR (10) NOT NULL,
  channel_url VARCHAR (100) NOT NULL,
  last_upd_date DATETIME NOT NULL DEFAULT current_timestamp
);