package com.vtxlab.demo.bookstore.controller.impl;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.vtxlab.demo.bookstore.controller.BooksOperation;
import com.vtxlab.demo.bookstore.entity.Books;
import com.vtxlab.demo.bookstore.response.ApiResponse;
import com.vtxlab.demo.bookstore.service.BooksService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = "/api/v1")
@Slf4j
public class BooksStoreController implements BooksOperation {

  @Autowired
  BooksService booksService;

  @Override
  public ResponseEntity<ApiResponse<List<Books>>> findAll() {
    ApiResponse<List<Books>> response = ApiResponse.<List<Books>>builder()
        .code(HttpStatus.OK.value())// 200
        .message("OK")
        .data(booksService.findAll())
        .build();
    return ResponseEntity.ok().body(response); // 200 https status if book(s) is found
  }

  @Override
  public ResponseEntity<ApiResponse<Books>> findById(Long id)
      throws Exception {

    if (booksService.findById(id).isPresent()) {
      ApiResponse<Books> response = ApiResponse.<Books>builder()
          .code(HttpStatus.OK.value())
          .message("All Lists") // in corporate, the message should not be hardcode, but input with an enum
          .data(booksService.findById(id).get())
          .build();
      return ResponseEntity.ok().body(response); // 200 https status if book(s) is found, 204 https status if not found
    } else {
      // log.info("find by id return false");

    }
    return ResponseEntity.noContent().build();
  }

  @Override
  public ResponseEntity<Books> createBooks(Books book) {
    URI location = ServletUriComponentsBuilder
        .fromCurrentRequest()
        .buildAndExpand()
        .toUri();

    Books myBook = booksService.createBooks(book);
    if (myBook != null) {
      return ResponseEntity.created(location).body(myBook);
    }

    return ResponseEntity.created(location).build();

  }

  @Override
  public ResponseEntity<Boolean> deleteBooksById(Long id) {

    // Books book = booksService.findById(id).get(); // error 500 "Internal Server
    // Error", java.util.NoSuchElementException:

    Books book = booksService.findById(id).orElse(null);
    if (book != null) {
      booksService.deleteBooksById(id);
      return ResponseEntity.created(null).build();
    }
    return ResponseEntity.noContent().build();
  }

  @Override
  public ResponseEntity<Books> updateBook(Books book, Long id) {

    Books myBook = booksService.updateBookById(book, id);
    return ResponseEntity.ok().body(myBook);
  }

  @Override
  public ResponseEntity<Books> updateBookNameById(Long id, String bookName) {

    Books book = booksService.findById(id).orElse(null);
    // if (booksService.findById(id).isPresent()) {
    if (book != null) {
      booksService.updateBookNameById(id, bookName);
      return ResponseEntity.ok().body(book);
    }
    return ResponseEntity.noContent().build();
  }
}
