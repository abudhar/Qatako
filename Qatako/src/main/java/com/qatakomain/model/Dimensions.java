
package com.qatakomain.model;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Dimensions {

    @JsonProperty("UOM")
    private String uom;
    @JsonProperty("Length")
    private int length;
    @JsonProperty("Height")
    private int height;
    @JsonProperty("Width")
    private int width;
    public void setUom(String uom) {
         this.uom = uom;
     }
     public String getUom() {
         return uom;
     }

    public void setLength(int length) {
         this.length = length;
     }
     public int getLength() {
         return length;
     }

    public void setHeight(int height) {
         this.height = height;
     }
     public int getHeight() {
         return height;
     }

    public void setWidth(int width) {
         this.width = width;
     }
     public int getWidth() {
         return width;
     }

}