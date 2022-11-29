package com.vtxlab.demo.post2.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vtxlab.demo.post2.controller.Post2Operation;
import com.vtxlab.demo.post2.entity.Post2;
import com.vtxlab.demo.post2.model.PostDto;
import com.vtxlab.demo.post2.model.UserDto;
import com.vtxlab.demo.post2.response.ApiResponse;
import com.vtxlab.demo.post2.service.Post2Service;

@RestController
@RequestMapping(value = "/lihkg/api/v2") // get database data
public class LihkgPostController implements Post2Operation {

  @Autowired // = new LihkgPostService();
  Post2Service postService;

  public String checking() {
    return "connected";
  }

  @Override
  public List<Post2> findAllPost() {
    return postService.findAllPost();
  }

  @Override
  public ResponseEntity<ApiResponse<Post2>> findPostById(Long id) {

    ApiResponse<Post2> response = ApiResponse.<Post2>builder()
        .code(HttpStatus.OK.value()) // 200
        .message("OK")
        .data(postService.findPostById(id))
        .build();
    return ResponseEntity.ok().body(response);
  }

  @Override
  public List<Post2> saveAllPost(List<Post2> posts) {
    return postService.saveAllPost(posts);
  }

  @Override
  public ResponseEntity<ApiResponse<Post2>> savePost(Post2 post)
      throws Exception {
    ApiResponse<Post2> response = ApiResponse.<Post2>builder()
        .code(HttpStatus.OK.value()) // 200
        .message("OK")
        .data(postService.savePost(post))
        .build();
    return ResponseEntity.ok().body(response);
  }

  @Override
  public ResponseEntity<ApiResponse<Post2>> deletePostById(Long id) {
    ApiResponse<Post2> response = ApiResponse.<Post2>builder() //
        .code(HttpStatus.OK.value()) // 200
        .message("OK")
        .data(postService.deletePostById(id))
        .build();
    return ResponseEntity.ok().body(response);
  }

  /**
   * This is selecting the Posts Table where title = something
   * 
   * @param title is a title input
   * @return List of Post
   */

  @Override
  public ResponseEntity<ApiResponse<List<Post2>>> findPostByTitle(String title) {
    ApiResponse<List<Post2>> response = ApiResponse.<List<Post2>>builder() //
        .code(HttpStatus.OK.value())
        .message("OK")
        .data(postService.findPostByTitle(title))
        .build();
    return ResponseEntity.ok().body(response);
  }

  // @Override
  // public ResponseEntity<ApiResponse<UserDto>> findPostByUserID(String userId) {
  //   List<PostDto> postDtos = postService.findPostsByUserId(userId);
  //   UserDto userDto = UserDto.builder()
  //       .userId(userId)
  //       .posts(postDtos)
  //       .build();

  // ApiResponse<UserDto> response = ApiResponse.<UserDto>builder()
  //       .code(HttpStatus.OK.value())
  //       .message("OK")
  //       .data(userDto)
  //       .build();
  //       return ResponseEntity.ok().body(response);
  // }

  @Override // insert post into database??
  public ResponseEntity<ApiResponse<List<Post2>>> addNewPost(String title, String content) {
    ApiResponse<List<Post2>> response = ApiResponse.<List<Post2>>builder()
        .code(HttpStatus.OK.value())
        .message("OK")
        .data(postService.addNewPost(title, content))
        .build();
    return ResponseEntity.ok().body(response);
  }
}


