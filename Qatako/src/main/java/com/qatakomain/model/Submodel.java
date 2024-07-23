package com.qatakomain.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Submodel{
    @JsonProperty("VehicleID") 
    private int vehicleID;
    
    @JsonProperty("SubmodelID") 
    private int submodelID;
    
    @JsonProperty("SubmodelName") 
    private String submodelName;

	public int getVehicleID() {
		return vehicleID;
	}

	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}

	public int getSubmodelID() {
		return submodelID;
	}

	public void setSubmodelID(int submodelID) {
		this.submodelID = submodelID;
	}

	public String getSubmodelName() {
		return submodelName;
	}

	public void setSubmodelName(String submodelName) {
		this.submodelName = submodelName;
	}
}
