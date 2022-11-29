package com.vtxlab.demo.greeting.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "BOOKS") // table "Books" in database
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) // create AUTO_INCREMENT
  @Column(name = "ID")
  private Long id; // primary key

  @Column(name = "BOOK_NAME") // map database
  private String bookName; // map user

  @Column(name = "PUBLIC_DATE")
  private LocalDate publicationDate;

}
