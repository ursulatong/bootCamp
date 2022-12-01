package com.vtxlab.demo.bookstore.service;

import java.util.List;
import java.util.Optional;

import com.vtxlab.demo.bookstore.entity.Books;

public interface BooksService {

  List<Books> findAll(); // find all books

  Optional<Books> findById(Long id); // find books details by book id

  Books createBooks(Books book); // create books

 // Books deleteBooksById(Long id);

  Books updateBookById(Books book, Long id);

  Books updateBookNameById(Long id, String bookName);

}
