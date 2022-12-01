package com.vtxlab.course.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vtxlab.course.entity.Courses;
import com.vtxlab.course.repository.CoursesRepository;
import com.vtxlab.course.service.CourseService;


@Service
public class CourseServiceHolder implements CourseService {

  @Autowired
  CoursesRepository coursesRepository;

  @Override
 public List<Courses> findAllCourse () {
    return coursesRepository.findAll();
  }
}
