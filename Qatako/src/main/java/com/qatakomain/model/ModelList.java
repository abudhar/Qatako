package com.qatakomain.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ModelList {

	private boolean success;
	private String message;
	@JsonProperty("Models")
	private List<Model> models;

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

	public void setModels(List<Model> models) {
		this.models = models;
	}

	public List<Model> getModels() {
		return models;
	}

}