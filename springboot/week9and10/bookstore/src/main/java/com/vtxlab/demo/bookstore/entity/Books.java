package com.vtxlab.demo.bookstore.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/*Sample: List of Book 
[
   {
  	"id": 1,
  	"bookName":"Book A",
    "bookAuthor":"Christy",
    "publicDate":"2022-11-23"
   },
   {
  	"id": 2,
  	"bookName": "Book B",
    "bookAuthor":"Amy",
    "publicDate": "2019-07-30"
   }
]
*/

@Entity
@Table(name = "BOOKS") // table "Books" in database
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) // create AUTO_INCREMENT
  @Column(name = "ID")
  private Long id; // primary key

  @Column(name = "BOOK_NAME") // map database
  private String bookName; // map user

  @Column(name = "PUBLIC_DATE")
  private LocalDate publicationDate;

 // @ToString.Exclude
  @ManyToOne // associated with the author class variable
  @JoinColumn(name = "AUTHOR_ID") // references the mapped column
  @JsonIgnoreProperties("books")
  private Authors author;

  public Books(Long id, String bookName, LocalDate publicationDate) {
    this.id = id;
    this.bookName = bookName;
    this.publicationDate = publicationDate;
  }

  
}
