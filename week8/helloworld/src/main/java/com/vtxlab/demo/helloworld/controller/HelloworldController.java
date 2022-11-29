package com.vtxlab.demo.helloworld.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vtxlab.demo.helloworld.service.HelloworldService;

//@Controller  // happy flow
// @Controller advice - handle error
// class level annotation, this class is used to recieve API's message request through URL
// (create many APIs)
//@ResponseBody // return all reponse status

@RestController // @Controller + @ResponseBody
@RequestMapping(value = "/api/v1")

public class HelloworldController {

  // IOC - invention of control
  // 自動裝配
  @Autowired // tell springboot to do sth at runtime, help us to create a new object
  // springboot is an application, it manages runtime
  public HelloworldService helloworldService; // object reference (無指住任何object, but Autowired help us)

  // @GetMapping (method = RequestMethod.GET)
  // RestFul API
  @GetMapping(value = { "/helloworld/{string}/age/{age}", "/helloworld/age",
      "helloworld/age/{age}", "helloworld/{string}/age" })
  // api/v1/helloworld

  public String helloworld(
      // default required = true
      @PathVariable(value = "string", required = false) String str, // default required : true
      @PathVariable(value = "age", required = false) Integer age)
      throws Exception {// behaviour

    if (str == null || age == null) {
      return "xyz";
    }

    if ("abc".equals(str) && age > 30) {
      return "hello world! Vincent!" + str;
    }
    return "123";
  }

  // early return if variable is null

  @GetMapping(value = "/greeting")
  public String greeting(@RequestParam String gender,
      @RequestParam String age) {
    if ("M".equals(gender) && "2".equals(age)) {
      return "Gender:" + gender;
    }
    return "default";
  }

  // Use Optional<> to receive a PathVariable
  @RequestMapping(value = { "/optional/string/{str}", "/optional/string" }, method = RequestMethod.GET)

  public String getAge(@PathVariable Optional<String> str) {
    // optional dont need to new object, before get, use ispresent

    String var = "123";
    str.ifPresent(e -> {
      e = e + var;
    });
    // return (String) str.get();

    if (str.isPresent()) {
      return str.get();
    }
    return "default";
  }

  // Use Map to receive more than one PathVariable
  @GetMapping(value = "/abc/{name}/cbd/{age}")
  public String getName(
      @PathVariable Map<String, String> map) {
    // 1st Entry name, John
    // 2nd Entry age, 30
    return map.get("name") + map.get("age");
  }

  //
  @GetMapping(value = "/helloworld/{name}")
  public String getHelloworld(@PathVariable String name) {
    // HelloworldService helloworldService = new HelloworldService(); (complie time
    // new object)
    // springboot provide a method to replace the new object (@Autowired
    // 提供指針指住OBJECT)
    return helloworldService.sayHelloworldService(name);
  }

  @GetMapping(value = { "/helloworld/list/{name}/{name2}", "/helloworld/list/{name}" })

  public List<String> getHelloWorldbyList(@PathVariable Map<String, String> map) {

    List<String> strings = new ArrayList<>();
    map.forEach((a, b) -> {
      strings.add(helloworldService.sayHelloworldService(b));
    });
    return strings;

  }

  @PostMapping(value = { "/giftlist/{name}" })
  public Boolean createString(@PathVariable String name) {
    return helloworldService.createString(name);
  }

  @GetMapping(value = { "/giftlist" })
  public ResponseEntity<List<String>> getAllString() {
    try {
      List<String> strings = helloworldService.getAllString();
      return ResponseEntity.ok().body(strings);
    } catch (Exception e) {
      return ResponseEntity.badRequest().body(new ArrayList<>());
    }
  }

  @DeleteMapping(value = { "/giftlist/deleteLast" })
  public String deleteLast() {
    return helloworldService.deleteLast();

  }

  @DeleteMapping(value = { "/giftlist" })
  public List<String> deleteAll() {
    if (helloworldService.deleteAll()) {
      return helloworldService.getAllString();
    }
    return new ArrayList<>();
  }

  // GetMapping
  // Stream(), filter
  // No change in service layer
  // return type List<String>
  // No input parameter
  // Requirement: get all string from strings starting from t or T

  @GetMapping(value = { "/giftlist/tstrings" })
  public List<String> getAllStringFromT() {

    Predicate<String> upperCaseAndStartWithT = e -> e.toUpperCase()
        .startsWith("T");
    // this. remind instance method
    return helloworldService.getAllString().stream().filter(e -> e.toUpperCase().startsWith("T"))
        .collect(Collectors.toList());
  }

  // update the whole list
  @PutMapping(value = { "/giftlist" })
  public List<String> updateStrings(@RequestBody List<String> strings) {
    return helloworldService.updateStrings(strings);
  }

  // update the first element of the strings list
  @PatchMapping(value = { "/giftlist/firstElement/{element}" })
  public String updateFirst(@PathVariable String element) {
    return helloworldService.updateFirst(element);
  }

}
