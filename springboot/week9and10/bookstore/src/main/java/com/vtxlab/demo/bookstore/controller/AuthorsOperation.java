package com.vtxlab.demo.bookstore.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vtxlab.demo.bookstore.entity.Authors;

@RequestMapping(value = "/default")
public interface AuthorsOperation {


  @GetMapping(value = "/authorss")
  ResponseEntity<List<Authors>> findAllAuthorss();

  @DeleteMapping(value = "/authors/id/{id}")
  ResponseEntity<Void> deleteById(@PathVariable Long id);

  @PostMapping (value = "/authors")
  ResponseEntity<Authors> addAuthors(@RequestBody Authors author);

}
