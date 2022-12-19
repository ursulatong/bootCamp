package com.vtxlab.demo.bookstore;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vtxlab.demo.bookstore.controller.impl.AuthorsController;
import com.vtxlab.demo.bookstore.entity.Authors;
import com.vtxlab.demo.bookstore.entity.Books;
import com.vtxlab.demo.bookstore.repository.BooksRepository;
import com.vtxlab.demo.bookstore.response.ApiResponse;
import com.vtxlab.demo.bookstore.service.BooksService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
//@WebMvcTest
public class BooksControllerIntegationTest {

  @Autowired
  MockMvc mockMvc;

  @MockBean
  BooksService bookService;

  // Springboot bug?
  @MockBean
  AuthorsController authorController;

  //@Test
  void testBookService() throws Exception {
    // Given
    Books book = new Books(11l, "Tommy Book", LocalDate.of(2022, 1, 21),
        new Authors());
    Books book2 = new Books(12l, "Steve Book", LocalDate.of(2021, 10, 21),
        new Authors());
    when(bookService.findAllBooks()).thenReturn(List.of(book, book2));
    // When
    mockMvc.perform(get("/api/v1/books"))
        .andDo(print()) // print the whole response detail
        .andExpect(status().isOk()) // Check if status = 200
        .andExpect(jsonPath("$.length()").value(2))
        .andExpect(jsonPath("$[0].bookName").value("Tommy Book"))
        .andReturn();

    // String str = result.getResponse().getContentAsString();
    // ApiResponse response = objectMapper.readValue(str, ApiResponse.class);
    // List<Book> books = (List<Book>) response.getData();
    // assertThat(books).hasSize(2);
    mockMvc.perform(get("/api/v1/book1"))
        .andDo(print())
        .andExpect(status().isNotFound()); // 404

    mockMvc.perform(get("/api/v1/book")) // POST METHOD URI
        .andDo(print())
        .andExpect(status().isMethodNotAllowed()); // Should use POST
  }

  
}
