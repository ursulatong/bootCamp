DELETE FROM
  AUTHORS
WHERE
  ID IN (1, 2,3,4,5);

INSERT INTO
  AUTHORS (ID, AUTHOR_NAME, AUTHOR_NAT)
VALUES
  (1, "OWIE", "HK");

INSERT INTO
  AUTHORS (ID, AUTHOR_NAME, AUTHOR_NAT)
VALUES
  (2, "TOMMY", "US");

COMMIT;