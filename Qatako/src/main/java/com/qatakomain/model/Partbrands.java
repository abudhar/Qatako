package com.qatakomain.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Partbrands {

	@JsonProperty("BrandAAIAID")
	private String brandaaiaid;
	@JsonProperty("PartNumber")
	private String partnumber;
	private ProductBean piesDetails;

	public void setBrandaaiaid(String brandaaiaid) {
		this.brandaaiaid = brandaaiaid;
	}

	public String getBrandaaiaid() {
		return brandaaiaid;
	}

	public void setPartnumber(String partnumber) {
		this.partnumber = partnumber;
	}

	public String getPartnumber() {
		return partnumber;
	}

	public ProductBean getPiesDetails() {
		return piesDetails;
	}

	public void setPiesDetails(ProductBean piesDetails) {
		this.piesDetails = piesDetails;
	}

}