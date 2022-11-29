package com.vtxlab.demo.post2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vtxlab.demo.post2.entity.Post2;

@Repository // create bean, manage database query
// as an agent to communicate with database

// means Post2Repository only extend Post2
public interface Post2Repository extends JpaRepository<Post2, Long> { // Post2 is result set, Type is long

  /**
   * This is selecting the Posts Table where title = something
   * 
   * @param title
   *              Title is a user input
   * @return List of Post
   */

  List<Post2> findPostByTitle(String title); // ORM // can find the entity

  List<Post2> findByTitleIgnoreCase(String title);

  // %something%
  // i.e. postRepository.findByTitleContaining("something")
  List<Post2> findByTitleContaining(String title);

  List<Post2> findByContentIsContaining(String content);

  List<Post2> findByContentContains(String content);

  List<Post2> findByTitleNotLike(String title);

  List<Post2> findByTitleAndId(String title, Long id);

  List<Post2> findByTitleOrId(String title, Long id);

  // Native SQL - Spwcific DBMS
  // MySQL
  @Query(nativeQuery = true, value = "select p.id as id ,p.title as title, p.content as content from users u, post2 p where u.user_id=p.user_id and u.user_id = :userId")
  List<Post2> findPostsByUserId(@Param("userId") String userId);

  @Query(nativeQuery = true, value = "insert into post2 (title, content) values (:title, :content)")  // for database
  List<Post2> addNewPost (@Param ("title") String title, @Param ("content") String content); 
  

}
