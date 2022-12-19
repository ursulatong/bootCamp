package com.vtxlab.demo.bookstore.service;

import java.util.List;
import java.util.Optional;

import com.vtxlab.demo.bookstore.entity.Books;

public interface BooksService {

  List<Books> findAllBooks();

  Optional<Books> findBookById(Long id);

  Books createBook(Books book);

  Books deleteBookById(Long id);

  Books updateBookById(Books book, Long id);

  Books updateBookName(Long id, String bookName);

  Boolean deleteBooksByAuthorId(Long authorId);
}


