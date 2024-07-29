package com.qatakomain.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Product {

	@JsonProperty("IsValid")
	private boolean isvalid;
	@JsonProperty("ValidationWarnings")
	private List<String> validationwarnings;
	@JsonProperty("ValidationErrors")
	private List<String> validationerrors;
	@JsonProperty("PiesExport")
	private String piesexport;
	@JsonProperty("Success")
	private boolean success;
	@JsonProperty("Message")
	private String message;

	public void setIsvalid(boolean isvalid) {
		this.isvalid = isvalid;
	}

	public boolean getIsvalid() {
		return isvalid;
	}

	public void setValidationwarnings(List<String> validationwarnings) {
		this.validationwarnings = validationwarnings;
	}

	public List<String> getValidationwarnings() {
		return validationwarnings;
	}

	public void setValidationerrors(List<String> validationerrors) {
		this.validationerrors = validationerrors;
	}

	public List<String> getValidationerrors() {
		return validationerrors;
	}

	public void setPiesexport(String piesexport) {
		this.piesexport = piesexport;
	}

	public String getPiesexport() {
		return piesexport;
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
