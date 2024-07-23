package com.qatakomain.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SemaToken {

	@JsonProperty("Token")
	private String token;
	
	@JsonProperty("Success")
	private boolean status;
	
	@JsonProperty("Message")
	private String message;
	
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
