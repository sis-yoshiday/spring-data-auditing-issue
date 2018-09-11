package com.example.demo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OnlyCreatedAtTest {

  @Autowired
  EntityWithOnlyCreatedAtRepository target;

  @Autowired
  UserRepository userRepository;

  @SpyBean
  AuditorAware auditorAware;

  @Before
  public void setUp() {
    userRepository.save(new User(1));
  }

  @Test
  public void getCurrentAuditorDoNotWantToBeCalled__ForMe__ButInvoked() {

    target.save(new EntityWithOnlyCreatedAt());

    Mockito.verify(auditorAware, Mockito.times(0)).getCurrentAuditor();
  }
}
