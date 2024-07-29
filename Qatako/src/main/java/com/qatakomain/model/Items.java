
package com.qatakomain.model;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Items {

    @JsonProperty("Item")
    private List<Item> item;
    public void setItem(List<Item> item) {
         this.item = item;
     }
     public List<Item> getItem() {
         return item;
     }

}