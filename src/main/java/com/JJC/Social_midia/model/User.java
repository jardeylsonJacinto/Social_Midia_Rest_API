package com.JJC.Social_midia.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
  private Integer id;

  @Size(min = 2, message = "Name should have atleast 2 characters")
  @JsonProperty("user_name")
  private String name;

  @Past(message = "Birth Date should be in the past")
  @JsonProperty("birth_date")
  private LocalDate birthDate;

  @Override
  public String toString() {
    return "User [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
  }
}
