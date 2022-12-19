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

  private Boolean existById(Long id) {
    return authorsRepository.existsById(id);
  }

  @Override
  public void deleteAuthor(Long id) {
    if (existById(id)) {
      authorsRepository.deleteById(id);
    }
    return;
  }

  @Override
  public List<Authors> findAllAuthors() {
    return authorsRepository.findAll();
  }

}
