package com.vtxlab.demo.bookstore.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vtxlab.demo.bookstore.entity.Books;

@Repository
public interface BooksRepository extends JpaRepository<Books, Long> {

  @Query(nativeQuery = true, //
      value = "delete from books b where b.author_id = :author_id")
  @Transactional
  @Modifying
  void deleteBooksByAuthorId(@Param("author_id") Long authorId);

  @Query(nativeQuery = true, //
      value = "select count(*) from books b where b.author_id = :author_id")
  Integer findBooksByAuthorId(@Param("author_id") Long authorId);
}

