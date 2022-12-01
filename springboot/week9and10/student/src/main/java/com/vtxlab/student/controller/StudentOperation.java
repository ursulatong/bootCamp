package com.vtxlab.student.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vtxlab.student.entity.Student;

@RequestMapping(value = "/default")
public interface StudentOperation {

  @GetMapping(value = "/students")
  ResponseEntity<List<Student>> findStudents();

  @PostMapping(value = "/student")
  ResponseEntity<Void> createStudent(@PathVariable String name, @PathVariable Double height);

}
