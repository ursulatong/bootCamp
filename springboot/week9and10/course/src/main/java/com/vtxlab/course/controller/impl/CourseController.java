package com.vtxlab.course.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vtxlab.course.controller.CourseOperation;
import com.vtxlab.course.entity.Courses;
import com.vtxlab.course.service.CourseService;
import com.vtxlab.course.service.impl.CourseServiceHolder;


@RequestMapping(value = "/api/v1")
@RestController

public class CourseController implements CourseOperation {

  @Autowired
  CourseServiceHolder courseServiceHolder;

  @Autowired
  CourseService courseService;

  @Override
  public List<Courses> findAllCourse() {
    return courseServiceHolder.findAllCourse();
  }
  // courseService.findAllCourse






  //@Override
  //public Optional<Courses> findCourseById(long id) {
    //return courseServiceHolder.findCourseById(id);
  //}

  //@Override
  //public Courses createCourse(Courses course) {
   // return courseServiceHolder.createCourse(course);
  //}
  
  //@Override
  //public List<Courses> saveAll(List<Courses> course) {
    //return courseService.saveAll(course);

  }


