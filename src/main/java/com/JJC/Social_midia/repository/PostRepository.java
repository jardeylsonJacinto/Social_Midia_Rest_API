package com.JJC.Social_midia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JJC.Social_midia.model.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}