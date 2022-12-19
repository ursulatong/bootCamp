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
  public List<Books> findAllBooks() {
    return booksService.findAllBooks();
  }

  @Override
  public ResponseEntity<Books> findBookById(Long id) {
    // return bookService.findBookById(id).orElse(null);
    Optional<Books> oBook = booksService.findBookById(id);
    if (oBook.isPresent()) {
      return ResponseEntity.ok().body(oBook.get()); //
    }
    return ResponseEntity.noContent().build();
  }

  @Override
  public ResponseEntity<Books> createBook(Books book) {
    URI location = ServletUriComponentsBuilder
        .fromCurrentRequest()
        .buildAndExpand()
        .toUri();

    Books rtnBook = booksService.createBook(book);
    if (rtnBook != null) {
      return ResponseEntity.created(location).body(rtnBook); // 201
    }
    return ResponseEntity.noContent().build();
  }

  @Override
  public ResponseEntity<Books> deleteBookByid(Long id) {
    Books rtnBook = booksService.deleteBookById(id);
    if (rtnBook != null) {
      return ResponseEntity.ok().body(rtnBook); // 200
    }
    return ResponseEntity.noContent().build();
  }

  @Override
  public ResponseEntity<Books> updateBook(Books book, Long id) {
    Books updatedBook = booksService.updateBookById(book, id);
    return ResponseEntity.ok().body(updatedBook);
  }

  @Override
  public ResponseEntity<Books> updateBookName(Long id, String bookName) {
    Books updatedBook = booksService.updateBookName(id, bookName);
    if (updatedBook == null) {
      return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok().body(updatedBook);
  }

  @Override
  public ResponseEntity<Boolean> deleteBookByAuthorId(Long id) {
    return ResponseEntity.ok().body(booksService.deleteBooksByAuthorId(id));
  }
}
