package com.vtxlab.demo.bookstore.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vtxlab.demo.bookstore.entity.Books;
import com.vtxlab.demo.bookstore.repository.BooksRepository;
import com.vtxlab.demo.bookstore.service.BooksService;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BookStoreServiceHolder implements BooksService {

  @Autowired
  BooksRepository bookRepository;

  @Override
  public List<Books> findAllBooks() {
    return bookRepository.findAll();
  }

  @Override
  public Optional<Books> findBookById(Long id) {
    return bookRepository.findById(id);
  }

  @Override
  public Books createBook(Books book) {
    if (!bookRepository.existsById(book.getId())) {
      return bookRepository.save(book);
    }
    return null;
  }

  @Override
  public Books deleteBookById(Long id) {
    if (bookRepository.existsById(id)) {
      Books book = findBookById(id).orElse(null);
      bookRepository.deleteById(id);
      return book;
    }
    return null;
  }

  @Override
  public Books updateBookById(Books book, Long id) {
    book.setId(id);
    return bookRepository.save(book);
  }

  @Override
  public Books updateBookName(Long id, String bookName) {
    if (bookRepository.existsById(id)) {
      Books book = bookRepository.findById(id).orElse(null);
      book.setBookName(bookName);
      return bookRepository.save(book);
    }
    return null;
  }

  @Override
  public Boolean deleteBooksByAuthorId(Long authorId) {
    Integer bookCount = bookRepository.findBooksByAuthorId(authorId);
    log.info("bookCount={} ", bookCount);

    if (bookCount > 0) {
      bookRepository.deleteBooksByAuthorId(authorId);
      return true;
    }
    return false;
  }
}