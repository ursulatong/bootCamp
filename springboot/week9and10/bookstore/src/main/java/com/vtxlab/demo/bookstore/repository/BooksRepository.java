package com.vtxlab.demo.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vtxlab.demo.bookstore.entity.Books;

@Repository
public interface BooksRepository extends JpaRepository<Books, Long> {

  // @Query(nativeQuery = true, value = "insert into Books (book_author,
  // book_name, public_date) values (:bookAuthor, :bookName, :publicDate)")
  // // @Transactional for DML
  // // @Modifying for DML
  // void createBooks(@Param("bookAuthor") String bookAuthor, @Param("bookName")
  // String name,
  // @Param("publicDate") LocalDate date);

}
