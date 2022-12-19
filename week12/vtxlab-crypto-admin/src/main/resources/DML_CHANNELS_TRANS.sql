INSERT INTO
  CHANNELS_TRANS (
    ID,
    CHANNEL_ID,
    DOMAIN_VERSION,
    DOMAIN_URL,
    SOURCE_APP,
    TRAN_TYPE
  )
VALUES
  (
    1,
    '1',
    'crypto/coingecko/api/v1',
    'price',
    'crypto-web',
    'ex-rate'
  );

INSERT INTO
  CHANNELS_TRANS (
    ID,
    CHANNEL_ID,
    DOMAIN_VERSION,
    DOMAIN_URL,
    SOURCE_APP,
    TRAN_TYPE
  )
VALUES
  (
    2,
    '2',
    'crypto/polygon/api/v1',
    'price',
    'crypto-app',
    'ex-rate'
  );