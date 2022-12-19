package com.vtxlab.demo.bookstore;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.vtxlab.demo.bookstore.controller.impl.BooksStoreController;
import com.vtxlab.demo.bookstore.repository.BooksRepository;
import com.vtxlab.demo.bookstore.service.BooksService;

//@SpringBootTest
class BookStoreApplicationTest {

  @Autowired
  BooksStoreController bookStoreController;

  @Autowired
  BooksService booksService;

  @Autowired
  BooksRepository bookRepository;

 // @Test
  void contextLoads() {
    assertThat(bookStoreController).isNotNull();
    assertThat(booksService).isNotNull();
    assertThat(bookRepository).isNotNull();
  }
  
}
