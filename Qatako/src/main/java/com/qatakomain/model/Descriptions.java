
package com.qatakomain.model;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Descriptions {

    @JsonProperty("Description")
    private List<Description> description;
    public void setDescription(List<Description> description) {
         this.description = description;
     }
     public List<Description> getDescription() {
         return description;
     }

}