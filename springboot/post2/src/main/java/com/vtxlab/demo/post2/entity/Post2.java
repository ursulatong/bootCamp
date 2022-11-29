package com.vtxlab.demo.post2.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 用呢個CLASS 對應enity 個table

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Post2")

public class Post2 {

  @Id
  private Long id; // mean unique, the id coming in should not be duplicated

  // @Column(name = "title")

  // @Column(name = "content")

  private String title;

  private String content;

  // getter, setter, constructor...

}
