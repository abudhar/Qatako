
package com.qatakomain.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Productattribute {
	@JsonProperty("LanguageCode")
	private String languagecode;
	@JsonProperty("MultiValueSequence")
	private int multivaluesequence;
	@JsonProperty("AttributeID")
	private String attributeid;
	@JsonProperty("PADBAttribute")
	private String padbattribute;
	@JsonProperty("RecordNumber")
	private int recordnumber;
	@JsonProperty("MaintenanceType")
	private String maintenancetype;
	private String content;

	public void setLanguagecode(String languagecode) {
		this.languagecode = languagecode;
	}

	public String getLanguagecode() {
		return languagecode;
	}

	public void setMultivaluesequence(int multivaluesequence) {
		this.multivaluesequence = multivaluesequence;
	}

	public int getMultivaluesequence() {
		return multivaluesequence;
	}

	public void setAttributeid(String attributeid) {
		this.attributeid = attributeid;
	}

	public String getAttributeid() {
		return attributeid;
	}

	public void setPadbattribute(String padbattribute) {
		this.padbattribute = padbattribute;
	}

	public String getPadbattribute() {
		return padbattribute;
	}

	public void setRecordnumber(int recordnumber) {
		this.recordnumber = recordnumber;
	}

	public int getRecordnumber() {
		return recordnumber;
	}

	public void setMaintenancetype(String maintenancetype) {
		this.maintenancetype = maintenancetype;
	}

	public String getMaintenancetype() {
		return maintenancetype;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}
}