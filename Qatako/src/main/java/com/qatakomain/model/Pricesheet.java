
package com.qatakomain.model;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Pricesheet {

    @JsonProperty("PriceSheetName")
    private String pricesheetname;
    @JsonProperty("PriceSheetNumber")
    private String pricesheetnumber;
    @JsonProperty("MaintenanceType")
    private String maintenancetype;
    @JsonProperty("EffectiveDate")
    private Date effectivedate;
    public void setPricesheetname(String pricesheetname) {
         this.pricesheetname = pricesheetname;
     }
     public String getPricesheetname() {
         return pricesheetname;
     }

    public void setPricesheetnumber(String pricesheetnumber) {
         this.pricesheetnumber = pricesheetnumber;
     }
     public String getPricesheetnumber() {
         return pricesheetnumber;
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