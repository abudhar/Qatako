
package com.qatakomain.model;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Description {

    @JsonProperty("LanguageCode")
    private String languagecode;
    @JsonProperty("DescriptionCode")
    private String descriptioncode;
    @JsonProperty("Sequence")
    private int sequence;
    @JsonProperty("MaintenanceType")
    private String maintenancetype;
    private String content;
    public void setLanguagecode(String languagecode) {
         this.languagecode = languagecode;
     }
     public String getLanguagecode() {
         return languagecode;
     }

    public void setDescriptioncode(String descriptioncode) {
         this.descriptioncode = descriptioncode;
     }
     public String getDescriptioncode() {
         return descriptioncode;
     }

    public void setSequence(int sequence) {
         this.sequence = sequence;
     }
     public int getSequence() {
         return sequence;
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