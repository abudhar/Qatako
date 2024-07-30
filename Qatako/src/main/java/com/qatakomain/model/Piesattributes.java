package com.qatakomain.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Piesattributes {

	@JsonProperty("PiesSegment")
	private String piessegment;
	@JsonProperty("Value")
	private String value;

	public void setPiessegment(String piessegment) {
		this.piessegment = piessegment;
	}

	public String getPiessegment() {
		return piessegment;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}