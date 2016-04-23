package com.athletigen.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.athletigen.demo.domain.CheckPointStatus;
import com.athletigen.demo.domain.CheckPointStatusRepository;
import com.athletigen.demo.vo.CheckedResponse;

@RestController

public class CheckPointController {

	@Autowired
	CheckPointStatusRepository checkPointStatusRepository;

	protected @RequestMapping("/services/heartbeat/isAlive") CheckedResponse checkIsAlive() {
		String state = "";
		String message_alive="life is good!";
		String message_not_alive="Something is wrong, check the system logs";
		CheckedResponse checkedResponse = new CheckedResponse();
		CheckPointStatus checkPointStatus = checkPointStatusRepository.findByName("isAlive");
		try {
			state = checkPointStatus.getState();
			if (state.equals("200")) {
				checkedResponse.setCode(200);
				checkedResponse.setDeveloperMessage(message_alive);
			} else {
				checkedResponse.setCode(500);
				checkedResponse.setDeveloperMessage(message_not_alive);
			}
		} catch (Exception e) {
			checkedResponse.setCode(500);
			checkedResponse.setDeveloperMessage(message_not_alive);
		}
		return checkedResponse;
	}

}
