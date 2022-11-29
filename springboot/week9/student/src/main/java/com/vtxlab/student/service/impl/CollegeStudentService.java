package com.vtxlab.student.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vtxlab.student.entity.Student;
import com.vtxlab.student.repository.StudentRepository;
import com.vtxlab.student.service.StudentService;

@Service // Bean collegeStudentService -> Spring Container
public class CollegeStudentService implements StudentService {

  @Autowired // get the bean from spring container
  StudentRepository studentRepository;

  // @Autowired // if there is qualifier, Qualifier Value = bean name
  // @Qualifier(value = "BeanForVincent")
  // Student studentVincent; // studentVincent is an object reference

  // @Autowired
  // @Qualifier(value = "BeanForAlan")
  // Student studentAlan;

  @Override
  public List<Student> findStudents() {
    return studentRepository.findAll();
  }

  @Override
  public Void createStudent(String name, Double height) {
    return studentRepository.createStudent(name, height);
  }

}
