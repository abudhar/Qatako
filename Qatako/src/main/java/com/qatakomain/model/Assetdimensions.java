
package com.qatakomain.model;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Assetdimensions {

    @JsonProperty("UOM")
    private String uom;
    public void setUom(String uom) {
         this.uom = uom;
     }
     public String getUom() {
         return uom;
     }

}