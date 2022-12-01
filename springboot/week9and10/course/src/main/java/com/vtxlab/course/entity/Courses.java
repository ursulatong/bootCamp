package com.vtxlab.course.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "COURSES")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Courses {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID")
  private Long id;

  @Column(name = "COURSE_NAME")
  private String courseName;

  @Column(name = "COURSE_FEE")
  private Double courseFee;

  @Column(name = "START_DATE")
  private LocalDate startDate;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "TUTORS_ID")
  @JsonIgnoreProperties("tutor")
  private Tutors tutor;

}
