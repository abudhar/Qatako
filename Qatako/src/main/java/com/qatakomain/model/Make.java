package com.qatakomain.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Make {
	
	@JsonProperty("MakeID")
	private int makeID;
	
	@JsonProperty("MakeName")
	private String makeName;

	public int getMakeID() {
		return makeID;
	}

	public void setMakeID(int makeID) {
		this.makeID = makeID;
	}

	public String getMakeName() {
		return makeName;
	}

	public void setMakeName(String makeName) {
		this.makeName = makeName;
	}

}