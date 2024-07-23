package com.qatakomain.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Years {
	
	@JsonProperty("Years") 
    private ArrayList<Integer> years;
	
    @JsonProperty("Success") 
    private boolean success;
    
    @JsonProperty("Message") 
    private String message;

	public ArrayList<Integer> getYears() {
		return years;
	}

	public void setYears(ArrayList<Integer> years) {
		this.years = years;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}