package com.vtxlab.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vtxlab.course.entity.Courses;

@Repository
public interface CoursesRepository extends JpaRepository<Courses, Long> {

}
