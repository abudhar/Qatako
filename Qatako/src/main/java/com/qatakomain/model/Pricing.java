
package com.qatakomain.model;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Pricing {

    @JsonProperty("CurrencyCode")
    private String currencycode;
    @JsonProperty("Price")
    private Price price;
    @JsonProperty("PriceSheetNumber")
    private String pricesheetnumber;
    @JsonProperty("PriceType")
    private String pricetype;
    @JsonProperty("MaintenanceType")
    private String maintenancetype;
    @JsonProperty("EffectiveDate")
    private Date effectivedate;
    public void setCurrencycode(String currencycode) {
         this.currencycode = currencycode;
     }
     public String getCurrencycode() {
         return currencycode;
     }

    public void setPrice(Price price) {
         this.price = price;
     }
     public Price getPrice() {
         return price;
     }

    public void setPricesheetnumber(String pricesheetnumber) {
         this.pricesheetnumber = pricesheetnumber;
     }
     public String getPricesheetnumber() {
         return pricesheetnumber;
     }

    public void setPricetype(String pricetype) {
         this.pricetype = pricetype;
     }
     public String getPricetype() {
         return pricetype;
     }

    public void setMaintenancetype(String maintenancetype) {
         this.maintenancetype = maintenancetype;
     }
     public String getMaintenancetype() {
         return maintenancetype;
     }

    public void setEffectivedate(Date effectivedate) {
         this.effectivedate = effectivedate;
     }
     public Date getEffectivedate() {
         return effectivedate;
     }

}