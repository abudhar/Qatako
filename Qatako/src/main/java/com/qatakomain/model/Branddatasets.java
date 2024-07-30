package com.qatakomain.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Branddatasets {

	@JsonProperty("AAIABrandId")
	private String aaiabrandid;
	@JsonProperty("BrandName")
	private String brandname;
	@JsonProperty("DatasetId")
	private int datasetid;
	@JsonProperty("DatasetName")
	private String datasetname;
	@JsonProperty("BrandLogoURL")
	private String brandlogourl;
	@JsonProperty("LastUpdated")
	private String lastupdated;

	public void setAaiabrandid(String aaiabrandid) {
		this.aaiabrandid = aaiabrandid;
	}

	public String getAaiabrandid() {
		return aaiabrandid;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	public String getBrandname() {
		return brandname;
	}

	public void setDatasetid(int datasetid) {
		this.datasetid = datasetid;
	}

	public int getDatasetid() {
		return datasetid;
	}

	public void setDatasetname(String datasetname) {
		this.datasetname = datasetname;
	}

	public String getDatasetname() {
		return datasetname;
	}

	public void setBrandlogourl(String brandlogourl) {
		this.brandlogourl = brandlogourl;
	}

	public String getBrandlogourl() {
		return brandlogourl;
	}

	public void setLastupdated(String lastupdated) {
		this.lastupdated = lastupdated;
	}

	public String getLastupdated() {
		return lastupdated;
	}

}
