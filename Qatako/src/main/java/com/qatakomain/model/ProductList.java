package com.qatakomain.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductList {

	@JsonProperty("PartBrands")
	private List<Partbrands> partbrands;
	@JsonProperty("Success")
	private boolean success;
	@JsonProperty("Message")
	private String message;

	public void setPartbrands(List<Partbrands> partbrands) {
		this.partbrands = partbrands;
	}

	public List<Partbrands> getPartbrands() {
		return partbrands;
	}

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

}