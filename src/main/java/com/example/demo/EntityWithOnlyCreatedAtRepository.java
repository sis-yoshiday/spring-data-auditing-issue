package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EntityWithOnlyCreatedAtRepository
    extends JpaRepository<EntityWithOnlyCreatedAt, Integer> {
}
