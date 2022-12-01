package com.vtxlab.demo.bookstore.service;

import java.util.List;

import com.vtxlab.demo.bookstore.entity.Authors;

public interface AuthorsService {

  List<Authors> findAll();

  void deleteAuthor(Long id);

  Authors addAuthors(Authors author);

}
