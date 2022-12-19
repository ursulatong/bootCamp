package com.vtxlab.demo.bookstore;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.vtxlab.demo.bookstore.entity.Authors;
import com.vtxlab.demo.bookstore.entity.Books;
import com.vtxlab.demo.bookstore.repository.AuthorsRepository;
import com.vtxlab.demo.bookstore.repository.BooksRepository;

@DataJpaTest // Only create those Beans related to JPA
@AutoConfigureTestDatabase(replace = Replace.NONE)
@ExtendWith(SpringExtension.class)
public class BookStoreJpaTest {

  @Autowired
  BooksRepository bookRepository;

  @Autowired
  AuthorsRepository authorRepository;

  @Autowired
  EntityManager entityManager;

  @BeforeEach
  void setup() {
    // bookRepository.save(book2);
  }

 // @Test
  void testFindAll() {

    Books book1 = new Books(1l, "Vincent Book", LocalDate.of(2022, 1, 1));
    // null);
    // Book book2 = new Book(7l, "Tommy Book", LocalDate.of(2022, 2, 1), null);
    Authors author = new Authors(1l, "Vincent", "HK");
    author.addBook(book1);
    // author = authorRepository.save(author);
    // book1.setAuthor(author);
    // book2.setAuthor(author);
    // entityManager.persist(book1);
    // entityManager.persist(book2);
    // bookRepository.saveAndFlush(book1);
    // when
    // List<Book> books = bookRepository.findAll();
    // then
    assertThat(author.getBooks()).hasSize(1);
  }
}
