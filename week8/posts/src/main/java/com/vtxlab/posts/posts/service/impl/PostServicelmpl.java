package com.vtxlab.posts.posts.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.vtxlab.posts.posts.entity.Post;
import com.vtxlab.posts.posts.repository.PostRepository;
import com.vtxlab.posts.posts.service.PostService;


public class PostServicelmpl implements PostService {
  
  @Autowired
  PostRepository postRepository;

  @Override
  public List<Post> getAllPost() {
    return postRepository.findAll();
  }
  
}
