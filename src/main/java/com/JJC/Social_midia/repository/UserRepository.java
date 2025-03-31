package com.JJC.Social_midia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JJC.Social_midia.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}