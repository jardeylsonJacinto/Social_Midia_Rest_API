package com.JJC.Social_midia.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.JJC.Social_midia.model.User;
import com.JJC.Social_midia.model.dao.UserDaoService;

@RestController
public class UserController {
  private UserDaoService service;

  public UserController(UserDaoService service) {
    this.service = service;
  }

  // GET /users
  @GetMapping("/users")
  public List<User> retrieveAllUsers() {
    return service.findAll();
  }

  // GET /users
  @GetMapping("/users/{id}")
  public User retrieveUser(@PathVariable int id) {
    return service.findOne(id);
  }
}
