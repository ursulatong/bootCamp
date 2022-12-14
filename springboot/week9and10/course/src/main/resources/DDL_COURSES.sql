use sys;

CREATE TABLE COURSES (
  ID INTEGER NOT NULL AUTO_INCREMENT,
  COURSE_NAME VARCHAR (20) NOT NULL,
  COURSE_FEE DECIMAL (7, 2) NOT NULL,
  START_DATE DATE NOT NULL,
  TUTORS_ID INTEGER NOT NULL,
  CONSTRAINT PK_COURSES PRIMARY KEY (ID),
  CONSTRAINT FK_COURSES FOREIGN KEY(TUTORS_ID) REFERENCES TUTORS(ID)
);