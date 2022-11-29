package com.vtxlab.course.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vtxlab.course.entity.Courses;
import com.vtxlab.course.service.CourseService;

@RequestMapping(value = "/api/v1")
@RestController

public class CourseOperation {

  @Autowired
  CourseService courseService;

  @GetMapping(value = "/courses")
  public List<Courses> findAll() {
    return courseService.findAll();
  }

  @GetMapping(value = "/courses/id/{id}")
  public Optional<Courses> findById(@PathVariable long id) {
    return courseService.findById(id);
  }

  @PostMapping(value = "/courses")
  public Courses save(@RequestBody Courses course) {
    return courseService.save(course);
  }

  @PostMapping(value = "/courses/list")
  public List<Courses> saveAll(@RequestBody List<Courses> course) {
    return courseService.saveAll(course);
  }

}
