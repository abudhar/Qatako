
package com.qatakomain.model;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Price {

    @JsonProperty("UOM")
    private String uom;
    private double content;
    public void setUom(String uom) {
         this.uom = uom;
     }
     public String getUom() {
         return uom;
     }

    public void setContent(double content) {
         this.content = content;
     }
     public double getContent() {
         return content;
     }

}