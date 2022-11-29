package com.vtxlab.posts.posts.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Posts")
@Entity

public class Post {

  @Id
  private Long id;

  private String title;

  private String content;
}
