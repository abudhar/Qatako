
package com.qatakomain.model;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Package {

    @JsonProperty("PackageLevelGTIN")
    private String packagelevelgtin;
    @JsonProperty("QuantityofEaches")
    private int quantityofeaches;
    @JsonProperty("Weights")
    private Weights weights;
    @JsonProperty("Dimensions")
    private Dimensions dimensions;
    @JsonProperty("PackageUOM")
    private String packageuom;
    @JsonProperty("PackageBarCodeCharacters")
    private int packagebarcodecharacters;
    @JsonProperty("MaintenanceType")
    private String maintenancetype;
    public void setPackagelevelgtin(String packagelevelgtin) {
         this.packagelevelgtin = packagelevelgtin;
     }
     public String getPackagelevelgtin() {
         return packagelevelgtin;
     }

    public void setQuantityofeaches(int quantityofeaches) {
         this.quantityofeaches = quantityofeaches;
     }
     public int getQuantityofeaches() {
         return quantityofeaches;
     }

    public void setWeights(Weights weights) {
         this.weights = weights;
     }
     public Weights getWeights() {
         return weights;
     }

    public void setDimensions(Dimensions dimensions) {
         this.dimensions = dimensions;
     }
     public Dimensions getDimensions() {
         return dimensions;
     }

    public void setPackageuom(String packageuom) {
         this.packageuom = packageuom;
     }
     public String getPackageuom() {
         return packageuom;
     }

    public void setPackagebarcodecharacters(int packagebarcodecharacters) {
         this.packagebarcodecharacters = packagebarcodecharacters;
     }
     public int getPackagebarcodecharacters() {
         return packagebarcodecharacters;
     }

    public void setMaintenancetype(String maintenancetype) {
         this.maintenancetype = maintenancetype;
     }
     public String getMaintenancetype() {
         return maintenancetype;
     }

}