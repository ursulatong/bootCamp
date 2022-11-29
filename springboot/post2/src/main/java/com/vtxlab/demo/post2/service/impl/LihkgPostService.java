package com.vtxlab.demo.post2.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vtxlab.demo.post2.entity.Post2;
import com.vtxlab.demo.post2.exception.KeyExistException;
import com.vtxlab.demo.post2.exception.KeyNotFoundException;
import com.vtxlab.demo.post2.model.PostDto;
import com.vtxlab.demo.post2.repository.Post2Repository;
import com.vtxlab.demo.post2.service.Post2Service;

@Service
public class LihkgPostService implements Post2Service {

  @Autowired // = new PostRepository();
  Post2Repository postRepository;

  @Override
  public List<Post2> findAllPost() {
    return postRepository.findAll();
  }

  @Override
  public Post2 findPostById(Long id) {
    return postRepository.findById(id).orElse(null);
  }

  @Override
  public List<Post2> saveAllPost(List<Post2> posts) {
    return postRepository.saveAll(posts);
  }

  @Override
  public Post2 savePost(Post2 post) throws KeyExistException {
    if (findPostById(post.getId()) == null) {
      return postRepository.save(post);
    }
    throw new KeyExistException();
  }

  @Override
  public Post2 deletePostById(Long id)
      throws IllegalArgumentException {
    Post2 post = postRepository.findById(id).orElse(null);
    if (post != null) {
      postRepository.deleteById(id);
      return post;
    }
    throw new KeyNotFoundException();
  }

  @Override
  public List<Post2> findPostByTitle(String title) {
    return postRepository.findPostByTitle(title);

  }

  @Override
  public List<Post2> addNewPost(String title, String content) {
    return postRepository.addNewPost(title, content);
  }
}