package com.vtxlab.demo.greeting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vtxlab.demo.greeting.entity.Book;

public interface GreetingRepository extends JpaRepository <Book, Long>{
  
}
