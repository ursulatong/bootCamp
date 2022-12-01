package com.vtxlab.student.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vtxlab.student.entity.Student;

//@Repository is a kind of @Component (can @Component to replace @Repository)
@Repository // -> bean = studetnRepository
// this repository is to linking the database by the method generated in this
// interface
public interface StudentRepository extends JpaRepository<Student, Long> { // studend = entity, long = primary key

  List<Student> findByNameAndHeight(String name, Double height);

  @Transactional
  @Modifying
  @Query(nativeQuery = true, value = "insert into students(name, height) values (?1, ?2)")
  Void createStudent(@Param("name") String name, @Param("height") Double height);

}
