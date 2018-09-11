package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EntityWithCreatedByRepository
    extends JpaRepository<EntityWithCreatedBy, Integer> {
}
