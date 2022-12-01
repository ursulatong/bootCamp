package com.vtxlab.course.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vtxlab.course.entity.Courses;

@RequestMapping(value = "default")
public interface CourseOperation {

  @GetMapping(value = "/courses")
  List<Courses> findAllCourse();

  //@GetMapping(value = "/courses/id/{id}")
  //Optional<Courses> findCourseById(@PathVariable long id);
  
  //@PostMapping(value = "/courses")
  //Courses createCourse(@RequestBody Courses course);

 // @PostMapping(value = "/courses/list")
  //List<Courses> saveAll(@RequestBody List<Courses> course);

}
