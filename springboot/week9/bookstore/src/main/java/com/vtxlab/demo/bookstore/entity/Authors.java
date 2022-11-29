package com.vtxlab.demo.bookstore.entity;

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
@Data
@Table(name = "AUTHORS")
@AllArgsConstructor
@NoArgsConstructor

public class Authors {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) // create AUTO_INCREMENT
  @Column(name = "ID")
  private Long id;

  @Column(name = "AUTHOR_NAME")
  private String authorName;

  @Column(name = "AUTHOR_NAT")
  private String nationality;

  // define the property in Books class that will be used to map the mappedBy
  // variable
  @OneToMany(mappedBy = "author", //
      // fetch = FetchType.LAZY, // default LAZY
      cascade = CascadeType.PERSIST, //
      orphanRemoval = true)
  @JsonIgnoreProperties({ "author" })
  private List<Books> books;

}
