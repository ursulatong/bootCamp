create table Students (
  ID INTEGER auto_increment,
  NAME VARCHAR (20) NOT NULL,
  HEIGHT NUMERIC(5, 2) NOT NULL,
  CONSTRAINT PK_STUDENTS PRIMARY KEY(ID)
);