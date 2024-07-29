
package com.qatakomain.model;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Minimumorderquantity {

    @JsonProperty("UOM")
    private String uom;
    private int content;
    public void setUom(String uom) {
         this.uom = uom;
     }
     public String getUom() {
         return uom;
     }

    public void setContent(int content) {
         this.content = content;
     }
     public int getContent() {
         return content;
     }

}