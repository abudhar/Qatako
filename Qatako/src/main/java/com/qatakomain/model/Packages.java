
package com.qatakomain.model;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Packages {

    @JsonProperty("Package")
    private Package packages;

	public Package getPackages() {
		return packages;
	}

	public void setPackages(Package packages) {
		this.packages = packages;
	}
    

}