package com.qatakomain.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BranddatasetsList {

	@JsonProperty("BrandDatasets")
	private List<Branddatasets> branddatasets;

	public void setBranddatasets(List<Branddatasets> branddatasets) {
		this.branddatasets = branddatasets;
	}

	public List<Branddatasets> getBranddatasets() {
		return branddatasets;
	}

}