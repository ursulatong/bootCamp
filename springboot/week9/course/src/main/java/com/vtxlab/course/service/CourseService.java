package com.vtxlab.course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vtxlab.course.entity.Courses;
import com.vtxlab.course.repository.CoursesRepository;

@Service
public class CourseService {

  @Autowired
  CoursesRepository coursesRepository;

  public List<Courses> findAll() {
    return coursesRepository.findAll();
  }

  public Optional<Courses> findById(long id) {
    return coursesRepository.findById(id);
  }

  public Courses save(Courses course) {
    return coursesRepository.save(course);
  }

  public List<Courses> saveAll (List<Courses> course){
    return coursesRepository.saveAll(course);
  }
}
