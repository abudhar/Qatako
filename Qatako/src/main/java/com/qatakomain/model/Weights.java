
package com.qatakomain.model;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Weights {

    @JsonProperty("UOM")
    private String uom;
    @JsonProperty("Weight")
    private double weight;
    public void setUom(String uom) {
         this.uom = uom;
     }
     public String getUom() {
         return uom;
     }

    public void setWeight(double weight) {
         this.weight = weight;
     }
     public double getWeight() {
         return weight;
     }

}