package com.vtxlab.demo.greeting;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.ContentResultMatchers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.result.StatusResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vtxlab.demo.greeting.entity.Book;
import com.vtxlab.demo.greeting.repository.GreetingRepository;
import com.vtxlab.demo.greeting.service.GreetingService;

import lombok.extern.slf4j.Slf4j;

// 模仿postman(web application)接API
@Slf4j
@WebMvcTest // find where have add @controller and @configaration then put the object to the
            // spring context
// start spring context, but with Controller related bean only
// have bean environment
// no service layer and repository, 所以自己要mockbean放去IOC 做test case, as the bean
// now is empty

public class GreetingControllerIntegationTest {

  // 鎖定return value, test service layer
  @MockBean // Create a new bean to spring context 將BEAN放入CONTEXT but still no real class
  GreetingService greetingService;

  @MockBean
  GreetingRepository greetingRepository;

  @Autowired // Due to @WebMvcTest, the mockMvc Bean has been loaded to context
  MockMvc mockMvc; // represent postman

  @Autowired
  ObjectMapper objectMapper;

  @Test
  void testWebMvc() throws Exception {
    // Given
    Mockito.when(greetingService.greeting()).thenReturn("hello world"); // no implemenation in greeting, when touch
                                                                        // greetig, return hello world, no need to go
                                                                        // through the implemenation (if, then esle...)
                                                                        // inside
    // When
    MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/api/v1/greeting"); // create get method related
                                                                                            // to this API

    ResultActions response = mockMvc.perform(builder);

    StatusResultMatchers status = MockMvcResultMatchers.status();
    ResultMatcher statusOK = status.isOk(); // 200
    response.andExpect(statusOK);

    ContentResultMatchers content = MockMvcResultMatchers.content();
    ResultMatcher contentHelloWorld = content.string("hello worldd");
    response.andExpect(contentHelloWorld);

  }

  @Test   
    void testWebMvc2() throws Exception {
      when(greetingService.greeting()).thenReturn("hello world"); 
    mockMvc.perform(get("/api/v1/greeting"))      // test API
    .andExpect(status().isOk())
    .andExpect(content().string("hello worldd"));


    

  }

  @Test // proof to mcok service
  void testFindAllBooks() throws Exception {
    Book book = new Book(1l, "Tommy's Book", LocalDate.of(2022, Month.JUNE, 22));

    List<Book> books = new ArrayList<>();
    books.add(book);

    when(greetingRepository.findAll()).thenReturn(new ArrayList<>(List.of(book)));

    MvcResult result = mockMvc.perform(get("/api/v1/books"))
        .andExpect(status().isOk()).andReturn();

    String string = result.getResponse().getContentAsString();
    log.info(string);

    // ObjectMapper objectMapper = new ObjectMapper(); // 可以不用new, 因為mockMVC
    // Test帶埋config裡面既BEAN黎webMCV 呢個BEAN
    // Deserialization
    List<Book> bookList = objectMapper.readValue(string, List.class);
    assertThat(bookList.size()).isNotEqualTo(1);

  }

}
