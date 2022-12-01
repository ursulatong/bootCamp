package com.vtxlab.demo.greeting;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import com.vtxlab.demo.greeting.controller.GreetingOperation;
import com.vtxlab.demo.greeting.repository.GreetingRepository;
import com.vtxlab.demo.greeting.service.GreetingService;

// TDD, test driven design
@SpringBootTest // have all beans  
// 一個TEST FILE一個environment, pretend the exact SpringBoot Application startup
// situation
// e.g controller + service will be created in spring context

@AutoConfigureMockMvc  // MockBean for MockMvc
class GreetingApplicationTests {

	@Autowired
	GreetingOperation greetingOperation; // 測試 greeting operation 實體whether exist (有無add restcontroller)

	@Autowired // have springboot test 之後autowird 入黎自帶implementation
	GreetingService greetingService;

	@Autowired
	GreetingRepository greetingRepository;

	@Autowired  
	MockMvc mockmvc;

	@Test // represent this method will be run automatically for this test case
	void contextLoads() {

		// Mockito, Junit 5
		assertThat(greetingOperation).isNotNull(); // asserThat (overloading)
		assertThat(greetingService).isNotNull();
		assertThat(greetingRepository).isNotNull();
	
	}

	@Test
	void testIntegrationForGreeting() throws Exception {
		mockmvc.perform(get("/api/v1/greeting"))
				.andExpect(status().isOk())
				.andExpect(content().string("abcd"));
	}


	}


