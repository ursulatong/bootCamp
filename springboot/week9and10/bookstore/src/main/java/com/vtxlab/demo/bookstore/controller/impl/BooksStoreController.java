package com.vtxlab.demo.bookstore.controller.impl;

import java.net.URI;
import java.util.List;
import java.util.Optional;

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

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = "/api/v1")
@Slf4j
@AllArgsConstructor
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
  public ResponseEntity<Books> findById(Long id) {

    Books book = booksService.findById(id).orElse(null);
    if (book != null) {
      booksService.findById(id);
      return ResponseEntity.ok().body(book); // 200 https status if book(s) is found, 204 https status if not found
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
      return ResponseEntity.created(location).body(myBook);  //201
    }
    return ResponseEntity.noContent().build();

  }

  //@Override
  //public ResponseEntity<Books> deleteBooksById(Long id) {

    //Optional<Books> resultBook = booksService.findById(id);
    //Books book = (resultBook==null) ? null : booksService.findById(id).orElse(null);
    //if (book != null) {
     // booksService.deleteBooksById(id);
      //return ResponseEntity.ok().body(book);
    //}
    //return ResponseEntity.noContent().build();
  //}


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
