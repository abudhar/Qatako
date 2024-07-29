
package com.qatakomain.model;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Prices {

    @JsonProperty("Pricing")
    private List<Pricing> pricing;
    public void setPricing(List<Pricing> pricing) {
         this.pricing = pricing;
     }
     public List<Pricing> getPricing() {
         return pricing;
     }

}