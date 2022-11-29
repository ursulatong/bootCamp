package com.vtxlab.demo.post2.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

// client request to change the DATABASE STRUCTURE (add column, delete column)

public class PostDto {

  @JsonProperty(value = "postTitle")
  private String title;

  @JsonProperty(value = "postContent")
  private String content;
}
