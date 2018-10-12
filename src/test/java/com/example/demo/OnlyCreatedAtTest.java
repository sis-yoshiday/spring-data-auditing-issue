package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OnlyCreatedAtTest {

  @Autowired
  EntityWithOnlyCreatedAtRepository target;

  @SpyBean
  AuditorAware auditorAware;

  @Test
  public void getCurrentAuditor_DoNotWantToBeCalled__ForMe__ButInvoked() {

    target.save(new EntityWithOnlyCreatedAt());

    Mockito.verify(auditorAware, Mockito.times(0)).getCurrentAuditor();
  }

  @Test
  public void getCurrentAuditor_CalledOnce() {

    target.save(new EntityWithOnlyCreatedAt());

    Mockito.verify(auditorAware, Mockito.times(1)).getCurrentAuditor();
  }
}
