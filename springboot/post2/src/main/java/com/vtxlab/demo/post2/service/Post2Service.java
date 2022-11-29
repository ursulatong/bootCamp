package com.vtxlab.demo.post2.service;

import java.util.List;

import com.vtxlab.demo.post2.entity.Post2;
import com.vtxlab.demo.post2.exception.KeyExistException;
import com.vtxlab.demo.post2.model.PostDto;

public interface Post2Service {
  List<Post2> findAllPost();

  Post2 findPostById(Long id);

  List<Post2> saveAllPost(List<Post2> posts);

  Post2 savePost(Post2 post) throws KeyExistException;

  Post2 deletePostById(Long id);

  List<Post2> findPostByTitle(String title);

  // List<PostDto> findPostsByUserId(String userId);

  List<Post2> addNewPost(String title, String content);

}
