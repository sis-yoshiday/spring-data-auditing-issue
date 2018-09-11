package com.example.demo;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class EntityWithOnlyCreatedAt {

  @Id
  @GeneratedValue
  private Integer id;

  @CreatedDate
  private LocalDateTime createdDate;
}
