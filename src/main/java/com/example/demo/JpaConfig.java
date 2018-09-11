package com.example.demo;

import java.util.Optional;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.stereotype.Component;

@Configuration
@EnableJpaAuditing
public class JpaConfig {

  @Component
  public static class AuditorAwareImpl implements AuditorAware<User> {

    private final UserRepository userRepository;

    public AuditorAwareImpl(UserRepository userRepository) {
      this.userRepository = userRepository;
    }

    @Override
    public Optional<User> getCurrentAuditor() {
      return userRepository.findById(1);
    }
  }
}
