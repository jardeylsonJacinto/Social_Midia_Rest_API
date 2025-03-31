package com.JJC.Social_midia.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {

  private Integer id;

  @Size(min = 10)
  private String description;

  @JsonIgnore
  private User user;

  @Override
  public String toString() {
    return "Post [id=" + id + ", description=" + description + "]";
  }

}