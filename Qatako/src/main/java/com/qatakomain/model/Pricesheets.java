
package com.qatakomain.model;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Pricesheets {

    @JsonProperty("PriceSheet")
    private Pricesheet pricesheet;
    public void setPricesheet(Pricesheet pricesheet) {
         this.pricesheet = pricesheet;
     }
     public Pricesheet getPricesheet() {
         return pricesheet;
     }

}