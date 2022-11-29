package com.vtxlab.posts.posts.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vtxlab.posts.posts.entity.Post;

@RequestMapping(value = "/default")
public interface PostOperation {

  @GetMapping(value = "/posts")
  public ResponseEntity<List<Post>> getAllPost();

}
