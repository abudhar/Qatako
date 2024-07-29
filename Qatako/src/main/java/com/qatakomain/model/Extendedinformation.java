
package com.qatakomain.model;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Extendedinformation {

    @JsonProperty("ExtendedProductInformation")
    private List<Extendedproductinformation> extendedproductinformation;
    public void setExtendedproductinformation(List<Extendedproductinformation> extendedproductinformation) {
         this.extendedproductinformation = extendedproductinformation;
     }
     public List<Extendedproductinformation> getExtendedproductinformation() {
         return extendedproductinformation;
     }

}