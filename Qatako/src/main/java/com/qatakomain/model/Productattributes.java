
package com.qatakomain.model;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Productattributes {

    @JsonProperty("ProductAttribute")
    private List<Productattribute> productattribute;
    public void setProductattribute(List<Productattribute> productattribute) {
         this.productattribute = productattribute;
     }
     public List<Productattribute> getProductattribute() {
         return productattribute;
     }

}