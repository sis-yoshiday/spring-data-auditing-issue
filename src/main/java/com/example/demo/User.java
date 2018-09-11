package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

  @Id
  private Integer id;

  protected User() {
  }

  public User(Integer id) {
    this.id = id;
  }
}
