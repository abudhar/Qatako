
package com.qatakomain.model;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Item {

    @JsonProperty("QuantityPerApplication")
    private Quantityperapplication quantityperapplication;
    @JsonProperty("ItemQuantitySize")
    private Itemquantitysize itemquantitysize;
    @JsonProperty("ProductAttributes")
    private Productattributes productattributes;
    @JsonProperty("DigitalAssets")
    private Digitalassets digitalassets;
    @JsonProperty("PartNumber")
    private String partnumber;
    @JsonProperty("BrandLabel")
    private String brandlabel;
    @JsonProperty("PartTerminologyID")
    private int partterminologyid;
    @JsonProperty("ContainerType")
    private String containertype;
    @JsonProperty("ExtendedInformation")
    private Extendedinformation extendedinformation;
    @JsonProperty("AvailableDate")
    private Date availabledate;
    @JsonProperty("ItemLevelGTIN")
    private Itemlevelgtin itemlevelgtin;
    @JsonProperty("MaintenanceType")
    private String maintenancetype;
    @JsonProperty("BrandAAIAID")
    private String brandaaiaid;
    @JsonProperty("ItemEffectiveDate")
    private Date itemeffectivedate;
    @JsonProperty("Descriptions")
    private Descriptions descriptions;
    @JsonProperty("Prices")
    private Prices prices;
    @JsonProperty("ACESApplications")
    private String acesapplications;
    @JsonProperty("Packages")
    private Packages packages;
    @JsonProperty("HazardousMaterialCode")
    private String hazardousmaterialcode;
    @JsonProperty("MinimumOrderQuantity")
    private Minimumorderquantity minimumorderquantity;
    public void setQuantityperapplication(Quantityperapplication quantityperapplication) {
         this.quantityperapplication = quantityperapplication;
     }
     public Quantityperapplication getQuantityperapplication() {
         return quantityperapplication;
     }

    public void setItemquantitysize(Itemquantitysize itemquantitysize) {
         this.itemquantitysize = itemquantitysize;
     }
     public Itemquantitysize getItemquantitysize() {
         return itemquantitysize;
     }

    public void setProductattributes(Productattributes productattributes) {
         this.productattributes = productattributes;
     }
     public Productattributes getProductattributes() {
         return productattributes;
     }

    public void setDigitalassets(Digitalassets digitalassets) {
         this.digitalassets = digitalassets;
     }
     public Digitalassets getDigitalassets() {
         return digitalassets;
     }

    public void setPartnumber(String partnumber) {
         this.partnumber = partnumber;
     }
     public String getPartnumber() {
         return partnumber;
     }

    public void setBrandlabel(String brandlabel) {
         this.brandlabel = brandlabel;
     }
     public String getBrandlabel() {
         return brandlabel;
     }

    public void setPartterminologyid(int partterminologyid) {
         this.partterminologyid = partterminologyid;
     }
     public int getPartterminologyid() {
         return partterminologyid;
     }

    public void setContainertype(String containertype) {
         this.containertype = containertype;
     }
     public String getContainertype() {
         return containertype;
     }

    public void setExtendedinformation(Extendedinformation extendedinformation) {
         this.extendedinformation = extendedinformation;
     }
     public Extendedinformation getExtendedinformation() {
         return extendedinformation;
     }

    public void setAvailabledate(Date availabledate) {
         this.availabledate = availabledate;
     }
     public Date getAvailabledate() {
         return availabledate;
     }

    public void setItemlevelgtin(Itemlevelgtin itemlevelgtin) {
         this.itemlevelgtin = itemlevelgtin;
     }
     public Itemlevelgtin getItemlevelgtin() {
         return itemlevelgtin;
     }

    public void setMaintenancetype(String maintenancetype) {
         this.maintenancetype = maintenancetype;
     }
     public String getMaintenancetype() {
         return maintenancetype;
     }

    public void setBrandaaiaid(String brandaaiaid) {
         this.brandaaiaid = brandaaiaid;
     }
     public String getBrandaaiaid() {
         return brandaaiaid;
     }

    public void setItemeffectivedate(Date itemeffectivedate) {
         this.itemeffectivedate = itemeffectivedate;
     }
     public Date getItemeffectivedate() {
         return itemeffectivedate;
     }

    public void setDescriptions(Descriptions descriptions) {
         this.descriptions = descriptions;
     }
     public Descriptions getDescriptions() {
         return descriptions;
     }

    public void setPrices(Prices prices) {
         this.prices = prices;
     }
     public Prices getPrices() {
         return prices;
     }

    public void setAcesapplications(String acesapplications) {
         this.acesapplications = acesapplications;
     }
     public String getAcesapplications() {
         return acesapplications;
     }

    public void setPackages(Packages packages) {
         this.packages = packages;
     }
     public Packages getPackages() {
         return packages;
     }

    public void setHazardousmaterialcode(String hazardousmaterialcode) {
         this.hazardousmaterialcode = hazardousmaterialcode;
     }
     public String getHazardousmaterialcode() {
         return hazardousmaterialcode;
     }

    public void setMinimumorderquantity(Minimumorderquantity minimumorderquantity) {
         this.minimumorderquantity = minimumorderquantity;
     }
     public Minimumorderquantity getMinimumorderquantity() {
         return minimumorderquantity;
     }

}