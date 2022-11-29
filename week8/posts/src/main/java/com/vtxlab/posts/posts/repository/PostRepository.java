package com.vtxlab.posts.posts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vtxlab.posts.posts.entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
