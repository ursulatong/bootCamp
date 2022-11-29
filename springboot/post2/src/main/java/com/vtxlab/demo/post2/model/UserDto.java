package com.vtxlab.demo.post2.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

/*
 * select u.user_id, u.user_email, p.id as post_id
 * ,p.title as post_title
 * ,p.content as post_content
 * from users u, posts p
 * where u.user_id = p.user_id;
 * 
 * 
 */

public class UserDto { // 中轉站一個class

  private String userId;

  private List<PostDto> posts;

}
