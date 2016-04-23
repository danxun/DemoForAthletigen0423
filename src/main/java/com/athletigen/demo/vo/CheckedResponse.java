package com.athletigen.demo.vo;

import java.io.Serializable;

public class CheckedResponse implements Serializable {

	private int Code;
	private String developerMessage;

	public int getCode() {
		return Code;
	}

	public void setCode(int code) {
		Code = code;
	}

	public String getDeveloperMessage() {
		return developerMessage;
	}

	public void setDeveloperMessage(String developerMessage) {
		this.developerMessage = developerMessage;
	}

}
