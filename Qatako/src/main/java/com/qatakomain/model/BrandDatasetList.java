package com.qatakomain.model;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BrandDatasetList {

    @JsonProperty("BrandDatasets")
    private List<Branddatasets> branddatasets;
    @JsonProperty("Success")
    private boolean success;
    @JsonProperty("Message")
    private String message;
    public void setBranddatasets(List<Branddatasets> branddatasets) {
         this.branddatasets = branddatasets;
     }
     public List<Branddatasets> getBranddatasets() {
         return branddatasets;
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