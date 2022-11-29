package com.vtxlab.posts.posts.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vtxlab.posts.posts.controller.PostOperation;
import com.vtxlab.posts.posts.entity.Post;
import com.vtxlab.posts.posts.service.PostService;

@RestController
@RequestMapping(value = { "/api/v1" })
public class PostController implements PostOperation {

  @Autowired
  @Qualifier(value = "postServiceImplB")
  PostService postService; // new PostServiceImplB();

  @Override
  public ResponseEntity<List<Post>> getAllPost() {
    return ResponseEntity.ok().body(postService.getAllPost());
  }

}
