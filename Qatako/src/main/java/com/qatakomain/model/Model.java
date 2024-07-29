package com.qatakomain.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Model {
	@JsonProperty("BaseVehicleID")
	private int baseVehicleID;
	
	@JsonProperty("ModelID")
	private int modelID;
	
	@JsonProperty("ModelName")
	private String modelName;

	public int getBaseVehicleID() {
		return baseVehicleID;
	}

	public void setBaseVehicleID(int baseVehicleID) {
		this.baseVehicleID = baseVehicleID;
	}

	public int getModelID() {
		return modelID;
	}

	public void setModelID(int modelID) {
		this.modelID = modelID;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

}