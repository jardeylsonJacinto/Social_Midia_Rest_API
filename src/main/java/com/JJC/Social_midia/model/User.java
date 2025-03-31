package com.JJC.Social_midia.model;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "user_details")
public class User {
  @Id
  @GeneratedValue
  private Integer id;

  @Size(min = 2, message = "Name should have atleast 2 characters")
  private String name;

  @Past(message = "Birth Date should be in the past")
  private LocalDate birthDate;

  @OneToMany(mappedBy = "user")
  @JsonIgnore
  private List<Post> posts;

  public User(Integer id, String name, LocalDate birthDate) {
    super();
    this.id = id;
    this.name = name;
    this.birthDate = birthDate;
  }

  @Override
  public String toString() {
    return "User [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
  }
}
