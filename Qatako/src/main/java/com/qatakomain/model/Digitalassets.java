
package com.qatakomain.model;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Digitalassets {

    @JsonProperty("DigitalFileInformation")
    private List<Digitalfileinformation> digitalfileinformation;
    public void setDigitalfileinformation(List<Digitalfileinformation> digitalfileinformation) {
         this.digitalfileinformation = digitalfileinformation;
     }
     public List<Digitalfileinformation> getDigitalfileinformation() {
         return digitalfileinformation;
     }

}