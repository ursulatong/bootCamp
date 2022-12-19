package com.vtxlab.demo.bookstore.controller.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vtxlab.demo.bookstore.controller.AuthorsOperation;
import com.vtxlab.demo.bookstore.entity.Authors;
import com.vtxlab.demo.bookstore.model.AuthorDto;
import com.vtxlab.demo.bookstore.model.BookDto;
import com.vtxlab.demo.bookstore.service.AuthorsService;

@RestController
@RequestMapping(value = "/api/v1")

public class AuthorsController implements AuthorsOperation {

  @Autowired // (one to one , required = true)
  AuthorsService authorsService;

  @Autowired
  ModelMapper modelmapper;
  // 在Controller控制器中，通过@Autowired注解得到ModelMapper实例，
  // 然后直接通过modelMapper.map(b, BookDto.class)转换得到VO层的BookDto对象，
  // 然后直接传给前端接口。

  @Override
  public ResponseEntity<List<AuthorDto>> findAllAuthorss() {
    List<AuthorDto> authorDtos = authorsService.findAllAuthors()
        .stream() //
        .map(e -> {
          List<BookDto> books = e.getBooks().stream() //
              .map(b -> modelmapper.map(b, BookDto.class)) //
              .collect(Collectors.toList());

          return new AuthorDto(e.getId(), e.getAuthorName(),
              e.getNationality(), books);
        }).collect(Collectors.toList());

    return ResponseEntity.ok().body(authorDtos);
  }

  @Override
  public ResponseEntity<List<Authors>> findAllAuthors() {
    List<Authors> authors = authorsService.findAllAuthors();
    return ResponseEntity.ok().body(authors);
  }

  @Override
  public ResponseEntity<Void> deleteById(Long id) {
    authorsService.deleteAuthor(id);
    return ResponseEntity.ok().build();
  }

}
