package com.vtxlab.demo.post2.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vtxlab.demo.post2.entity.Post2;
import com.vtxlab.demo.post2.model.UserDto;
import com.vtxlab.demo.post2.response.ApiResponse;

@RequestMapping(value = "/default")

public interface Post2Operation {
        @GetMapping(value = "/check")
        String checking();

        @GetMapping(value = "/posts")
        List<Post2> findAllPost();

        @GetMapping(value = "/posts/id/{id}")
        ResponseEntity<ApiResponse<Post2>> findPostById(@PathVariable Long id)
                        throws Exception;

        @PostMapping(value = "/posts")
        List<Post2> saveAllPost(@RequestBody List<Post2> posts);

        @PostMapping(value = "/posts")
        ResponseEntity<ApiResponse<Post2>> savePost(@RequestBody Post2 post)
                        throws Exception;

        @DeleteMapping(value = "/posts/id/{id}")
        ResponseEntity<ApiResponse<Post2>> deletePostById(@PathVariable Long id)
                        throws Exception;

        @GetMapping(value = "/posts/title/{title}")
        ResponseEntity<ApiResponse<List<Post2>>> findPostByTitle(@PathVariable String title);

        @GetMapping(value = "/posts/userId/{userId}")
        ResponseEntity<ApiResponse<UserDto>> findPostByUserID(@PathVariable String userId);

        @PutMapping(value = "/posts/addnew/{title}/{content}")
        ResponseEntity<ApiResponse<List<Post2>>> addNewPost(@PathVariable String title, String content);

}
