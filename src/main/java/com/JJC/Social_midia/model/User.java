package com.JJC.Social_midia.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

  private Integer id;
  private String name;
  private LocalDate birthDate;

  @Override
  public String toString() {
    return "User [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
  }
}
