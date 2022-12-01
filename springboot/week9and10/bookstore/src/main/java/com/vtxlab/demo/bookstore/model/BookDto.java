package com.vtxlab.demo.bookstore.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class BookDto {

  private Long id;

  private String bookName;

  private LocalDate publicDate;

  // refer to authorsController
  // 經過 modelmapper.map的對象轉換後, 新bookDTO (id, bookname, publicdate, author(author's
  // field) )

}
