package com.vtxlab.demo.bookstore.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vtxlab.demo.bookstore.controller.AuthorsOperation;
import com.vtxlab.demo.bookstore.entity.Authors;
import com.vtxlab.demo.bookstore.service.AuthorsService;

@RestController
@RequestMapping(value = "/api/v1")

public class AuthorsController implements AuthorsOperation {

  @Autowired // (one to one , required = true)
  AuthorsService authorsService;

  // @Autowired
  // ModelMapper modelmapper;
  // 在Controller控制器中，通过@Autowired注解得到ModelMapper实例，
  // 然后直接通过modelMapper.map(b, BookDto.class)转换得到VO层的BookDto对象，
  // 然后直接传给前端接口。

  @Override
  public ResponseEntity<List<Authors>> findAllAuthorss() {
    List<Authors> allauthors = authorsService.findAll();
    return ResponseEntity.ok().body(allauthors);
  }

  @Override
  public ResponseEntity<Void> deleteById(Long id) {
    authorsService.deleteAuthor(id);
    return ResponseEntity.ok().build();

  }

  @Override
  public ResponseEntity<Authors> addAuthors(Authors author) {
    Authors newAuthor = authorsService.addAuthors(author);
    return ResponseEntity.ok().body(newAuthor);

  }

}
