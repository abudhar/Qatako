
package com.qatakomain.model;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Quantityperapplication {

    @JsonProperty("UOM")
    private String uom;
    @JsonProperty("Qualifier")
    private String qualifier;
    private int content;
    public void setUom(String uom) {
         this.uom = uom;
     }
     public String getUom() {
         return uom;
     }

    public void setQualifier(String qualifier) {
         this.qualifier = qualifier;
     }
     public String getQualifier() {
         return qualifier;
     }

    public void setContent(int content) {
         this.content = content;
     }
     public int getContent() {
         return content;
     }

}