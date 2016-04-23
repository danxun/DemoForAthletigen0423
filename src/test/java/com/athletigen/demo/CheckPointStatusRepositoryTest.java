package com.athletigen.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.athletigen.demo.domain.CheckPointStatus;
import com.athletigen.demo.domain.CheckPointStatusRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
@ContextConfiguration(classes = Application.class)
public class CheckPointStatusRepositoryTest {
	@Autowired
	private CheckPointStatusRepository repository;

	@Test
	public void testExample() throws Exception {

		CheckPointStatus checkPointStatus = this.repository.findByName("isAlive");
		assertThat(checkPointStatus.getState()).isEqualTo("200");
	}
}
