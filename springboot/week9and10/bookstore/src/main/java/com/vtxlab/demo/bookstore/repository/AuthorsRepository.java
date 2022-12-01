package com.vtxlab.demo.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vtxlab.demo.bookstore.entity.Authors;

@Repository
public interface AuthorsRepository extends JpaRepository<Authors, Long> {

}
