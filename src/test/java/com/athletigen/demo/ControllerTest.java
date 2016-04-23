package com.athletigen.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.athletigen.demo.vo.CheckedResponse;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = Application.class)
public class ControllerTest {

	@Test
	public void testRestRequest() throws Exception {
		RestTemplate restTemplate= new RestTemplate();
		String url = "http://127.0.0.1:8080/services/heartbeat/isAlive";
		CheckedResponse checkedResponse = restTemplate.getForObject(url, CheckedResponse.class);
		assertThat(checkedResponse.getCode()).isEqualTo(200);
	}

}
