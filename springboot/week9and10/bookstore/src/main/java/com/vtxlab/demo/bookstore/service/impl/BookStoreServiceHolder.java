package com.vtxlab.demo.bookstore.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vtxlab.demo.bookstore.entity.Books;
import com.vtxlab.demo.bookstore.repository.BooksRepository;
import com.vtxlab.demo.bookstore.service.BooksService;

@Service
public class BookStoreServiceHolder implements BooksService {

  @Autowired
  BooksRepository booksRepository;

  @Override
  public List<Books> findAll() {
    return booksRepository.findAll();
  }

  @Override
  public Optional<Books> findById(Long id) {
    return booksRepository.findById(id);

  }

  // @Override
  // public void createBooks(Books book) {
  // booksRepository.createBooks(book.getAuthorName(), book.getBookName(),
  // book.getPublicationDate());
  // }

  @Override
  public Books createBooks(Books book) {
    if (!booksRepository.existsById(book.getId())) {
      return booksRepository.save(book);
    }
    return null;
  }

//  @Override
 // public Books deleteBooksById(Long id) {
   // Books book = booksRepository.findById(id).get();
    //if (book != null) {
      //booksRepository.deleteById(id);
      //return booksRepository.save(book);
    //}
    //return null;
  //}

  @Override
  public Books updateBookById(Books book, Long id) {
    book.setId(id);
    return booksRepository.save(book);
  }

  @Override
  public Books updateBookNameById(Long id, String bookName) {
    Books book = booksRepository.findById(id).orElse(null); // orElse handle optional, avoid to get NPE
    if (book != null) {
      book.setBookName(bookName);
      return booksRepository.save(book);
    }
    return null;
  }
}
