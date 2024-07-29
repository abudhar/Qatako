package com.qatakomain.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SubModelList {

	private boolean success;
	private String message;
	@JsonProperty("Submodels")
	private List<Submodel> submodels;

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

	public void setSubmodels(List<Submodel> submodels) {
		this.submodels = submodels;
	}

	public List<Submodel> getSubmodels() {
		return submodels;
	}

}