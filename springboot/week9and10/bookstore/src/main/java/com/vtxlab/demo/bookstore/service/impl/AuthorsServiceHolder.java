package com.vtxlab.demo.bookstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vtxlab.demo.bookstore.entity.Authors;
import com.vtxlab.demo.bookstore.repository.AuthorsRepository;
import com.vtxlab.demo.bookstore.service.AuthorsService;

@Service // 將BEAN放入SERVICE
public class AuthorsServiceHolder implements AuthorsService {

  @Autowired // （one to one 自動裝配, default: required = true, if required = false mean
             // 自動裝配唔成功都complie到)
  AuthorsRepository authorsRepository;

  @Override
  public List<Authors> findAll() {
    return authorsRepository.findAll();
  }

  @Override
  public void deleteAuthor(Long id) {
    if (existById(id)) {
      authorsRepository.deleteById(id);
    }
    return;
  }

  private boolean existById(Long id) {
    return authorsRepository.existsById(id);
  }

  @Override
  public Authors addAuthors(Authors author) {
    return authorsRepository.save(author);
  }
}
