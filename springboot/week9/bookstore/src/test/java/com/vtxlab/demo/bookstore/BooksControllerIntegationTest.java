package com.vtxlab.demo.bookstore;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.fasterxml.jackson.annotation.JacksonInject.Value;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vtxlab.demo.bookstore.controller.impl.AuthorsController;
import com.vtxlab.demo.bookstore.entity.Authors;
import com.vtxlab.demo.bookstore.entity.Books;
import com.vtxlab.demo.bookstore.repository.BooksRepository;
import com.vtxlab.demo.bookstore.response.ApiResponse;
import com.vtxlab.demo.bookstore.service.BooksService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@WebMvcTest
public class BooksControllerIntegationTest {

  @MockBean
  BooksService booksService;

  @MockBean
  BooksRepository booksRepository;

  @MockBean
  AuthorsController authorsController;

  @Autowired
  MockMvc mockMvc;

  @Autowired
  ObjectMapper objectMapper;

  @Test
  void testBookService() throws Exception {
    //Given
    Books book1 = new Books(11l, "Tommy book", LocalDate.of(2022, 1, 22), new Authors());
    Books book2 = new Books(12l, "Steve book", LocalDate.of(2022, 1, 22), new Authors());

    when(booksService.findAll()).thenReturn(List.of(book1, book2));
    //When
    MvcResult result = mockMvc.perform(get("/api/v1/bookstore/books"))
        .andDo(print())
        .andExpect(status().isOk())
        //.andExpect(jsonPath("$.length()").value(2))
        //.andExpect(jsonPath("$[0].bookName").value("Tommy book"))
        .andReturn();

    String str = result.getResponse().getContentAsString();
    ApiResponse response = objectMapper.readValue(str, ApiResponse.class);
    List<Books> books = (List<Books>) response.getData();
    assertThat(books).hasSize(2);

    //ObjectMapper objectMapper = new ObjectMapper();

   // List<Books> books = objectMapper.readValue(content, List.class);
   //  assertThat(books).hasSize(2);

  

    mockMvc.perform(post("/api/v1/bookstore/books")) 
        .andDo(print())
        .andExpect(status().isMethodNotAllowed());  //405
  }
}
