
package com.qatakomain.model;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Productattribute {

    @JsonProperty("LanguageCode")
    private String languagecode;
    @JsonProperty("AttributeID")
    private String attributeid;
    @JsonProperty("PADBAttribute")
    private String padbattribute;
    @JsonProperty("MaintenanceType")
    private String maintenancetype;
    private int content;
    public void setLanguagecode(String languagecode) {
         this.languagecode = languagecode;
     }
     public String getLanguagecode() {
         return languagecode;
     }

    public void setAttributeid(String attributeid) {
         this.attributeid = attributeid;
     }
     public String getAttributeid() {
         return attributeid;
     }

    public void setPadbattribute(String padbattribute) {
         this.padbattribute = padbattribute;
     }
     public String getPadbattribute() {
         return padbattribute;
     }

    public void setMaintenancetype(String maintenancetype) {
         this.maintenancetype = maintenancetype;
     }
     public String getMaintenancetype() {
         return maintenancetype;
     }

    public void setContent(int content) {
         this.content = content;
     }
     public int getContent() {
         return content;
     }

}