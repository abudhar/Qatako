
package com.qatakomain.model;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Extendedproductinformation {

    @JsonProperty("LanguageCode")
    private String languagecode;
    @JsonProperty("EXPICode")
    private String expicode;
    @JsonProperty("MaintenanceType")
    private String maintenancetype;
    private String content;
    public void setLanguagecode(String languagecode) {
         this.languagecode = languagecode;
     }
     public String getLanguagecode() {
         return languagecode;
     }

    public void setExpicode(String expicode) {
         this.expicode = expicode;
     }
     public String getExpicode() {
         return expicode;
     }

    public void setMaintenancetype(String maintenancetype) {
         this.maintenancetype = maintenancetype;
     }
     public String getMaintenancetype() {
         return maintenancetype;
     }

    public void setContent(String content) {
         this.content = content;
     }
     public String getContent() {
         return content;
     }

}