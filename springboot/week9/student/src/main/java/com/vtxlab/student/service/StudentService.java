package com.vtxlab.student.service;

import java.util.List;

import com.vtxlab.student.entity.Student;

public interface StudentService {

  List<Student> findStudents();

  Void createStudent(String name, Double height);

}
