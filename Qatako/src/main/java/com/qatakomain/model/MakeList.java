package com.qatakomain.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MakeList {

	private boolean success;
	private String message;
	@JsonProperty("Makes")
	private List<Make> makes;

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public boolean getSuccess() {
		return success;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMakes(List<Make> makes) {
		this.makes = makes;
	}

	public List<Make> getMakes() {
		return makes;
	}

}