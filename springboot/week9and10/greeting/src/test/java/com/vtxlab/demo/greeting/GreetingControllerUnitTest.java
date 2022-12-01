package com.vtxlab.demo.greeting;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.xmlunit.builder.Input;

import com.vtxlab.demo.greeting.controller.GreetingOperation;
import com.vtxlab.demo.greeting.controller.impl.GreetingController;
import com.vtxlab.demo.greeting.service.GreetingService;


// no bean environment
// no spring context on this file so we cannot autoweird
// Junit 5
@ExtendWith(SpringExtension.class) // @ Mock, @InjectMocks
public class GreetingControllerUnitTest { // 做testing 應該分離所有layer, TEST CONTROLLER BUT CAN WITHOUR THE EXIST OF SERVICE
  // only test controller, greetingService.greeting not test

  @Mock // no implementation injected in this reference
  // mock the dependency of greetingOperation
  GreetingService greetingService;

  

  private GreetingOperation greetingOperation;

  @BeforeEach // before implement method in this file will implement this method first
  void setup() {
    greetingOperation = new GreetingController(greetingService);
  }

  private void testHelloWorld(String input, String output, String notEqualOutput) {
    // Mockito
    // 當有人call呢個method既時候截住佢, return hello world, 避免中NPE, 因為無實體CLASS
    Mockito.when(greetingService.greeting()).thenReturn(input);
    // When
    String string = greetingOperation.greeting();
    // Then
    if (output != null) {
      Assertions.assertThat(string).isEqualTo(output);
    }

    if (notEqualOutput != null) {
      Assertions.assertThat(string).isNotEqualTo(notEqualOutput);
    }

  }

  // Unit Test is for test business senerio

  @Test
  void testCases() {
    testHelloWorld("hello world", "hello worldd", "hello");
    testHelloWorld("", "d", "c");
    testHelloWorld("abc", "abcd", "bcda");
    // ...100 test cases

  }

}
