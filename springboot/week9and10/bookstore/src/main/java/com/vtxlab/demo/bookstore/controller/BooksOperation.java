package com.vtxlab.demo.bookstore.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vtxlab.demo.bookstore.entity.Books;
import com.vtxlab.demo.bookstore.response.ApiResponse;

/* API's requirement 
  One API to return all books from database
  One API to return a book by book id (provided by frontend)
  Seems Book Id should be unquie to represent a book and store in the database table
  One API to create a book record (data provdied by frontend), such as Book Name, Author Name, Publication Date
  One API to delete a book record by Id

*/

@RequestMapping(value = "/default")
public interface BooksOperation {

  @GetMapping(value = "/bookstore/books")
  ResponseEntity<ApiResponse<List<Books>>> findAll();

  @GetMapping(value = "/bookstore/book/id/{id}")
  ResponseEntity<Books> findById(@PathVariable Long id);

  // @PostMapping(value = "/bookstore/book/id")
  // ResponseEntity<ApiResponse<Void>> createBooks(UriComponentsBuilder
  // uriComponentsBuilder, @RequestBody Books book);

  @PostMapping(value = "/bookstore/book/id")
  ResponseEntity<Books> createBooks(@RequestBody Books book);

 // @DeleteMapping(value = "/bookstore/book/id/{id}")
  //ResponseEntity<Books> deleteBooksById(@PathVariable Long id);

  @PutMapping(value = "/bookstore/book/id/{id}")
  ResponseEntity<Books> updateBook(@RequestBody Books book, @PathVariable Long id);

  @PatchMapping(value = "/bookstore/book/id/{id}/bookname/{bookName}")
  ResponseEntity<Books> updateBookNameById(@PathVariable Long id, @PathVariable String bookName);

}
