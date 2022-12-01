package com.vtxlab.demo.bookstore;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.vtxlab.demo.bookstore.entity.Authors;
import com.vtxlab.demo.bookstore.entity.Books;
import com.vtxlab.demo.bookstore.repository.BooksRepository;

@DataJpaTest // only create those beans related to JPA
public class BookStoreJpaTest { 
  
@Autowired
BooksRepository booksRepository;

@BeforeEach
void setup() {
//  Books book1 = new Books(1l, "Vincent Book", LocalDate.of(2022, 1, 1), new Authors());
 // Books book2 = new Books(2l, "Tommy Book", LocalDate.of(2022, 1, 1), new Authors());

//  booksRepository.save(book1);
 // booksRepository.save(book2);

}

//@Test
void testFindAll() {
  
  // when
  List<Books> books = booksRepository.findAll();
  // then
  assertThat(books).hasSize(2);
}

}
