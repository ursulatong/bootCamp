package com.vtxlab.demo.greeting.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "BOOKS") // table "Books" in database
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Book implements Serializable{

 @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) // create AUTO_INCREMENT
  @Column(name = "ID")
  private long id; // primary key

  @Column(name = "BOOK_NAME") // map database
  private String bookName; // map user

  @Column(name = "PUBLIC_DATE")
  @JsonSerialize(using = LocalDateSerializer.class)
  @JsonFormat(pattern = "yyyy-MM-dd")
  private LocalDate publicationDate;

}
