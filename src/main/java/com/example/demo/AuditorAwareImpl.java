package com.example.demo;

import java.util.Optional;
import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

@Component
public class AuditorAwareImpl implements AuditorAware<User> {

  @Override
  public Optional<User> getCurrentAuditor() {
    return Optional.empty();
  }
}
