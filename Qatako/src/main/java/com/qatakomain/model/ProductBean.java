
package com.qatakomain.model;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ProductBean {

    @JsonProperty("PIES")
    private Pies pies;
    public void setPies(Pies pies) {
         this.pies = pies;
     }
     public Pies getPies() {
         return pies;
     }

}