package com.vtxlab.course.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TUTORS")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Tutors {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID")
  private Long id;

  @Column(name = "TUTOR_NAME")
  private String tutorName;

  @Column(name = "TUTOR_NAT")
  private String nationality;

  @OneToMany(mappedBy = "tutor", // default LAZY
      cascade = CascadeType.PERSIST, //
      orphanRemoval = true)
  @JsonIgnoreProperties({ "tutor" })
  private List<Tutors> tutor;

}
