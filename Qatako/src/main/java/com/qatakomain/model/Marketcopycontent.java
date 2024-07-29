
package com.qatakomain.model;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Marketcopycontent {

    @JsonProperty("MarketCopyType")
    private String marketcopytype;
    @JsonProperty("RecordSequence")
    private int recordsequence;
    @JsonProperty("LanguageCode")
    private String languagecode;
    @JsonProperty("MarketCopyReference")
    private String marketcopyreference;
    @JsonProperty("MarketCopyCode")
    private String marketcopycode;
    @JsonProperty("MaintenanceType")
    private String maintenancetype;
    private String content;
    public void setMarketcopytype(String marketcopytype) {
         this.marketcopytype = marketcopytype;
     }
     public String getMarketcopytype() {
         return marketcopytype;
     }

    public void setRecordsequence(int recordsequence) {
         this.recordsequence = recordsequence;
     }
     public int getRecordsequence() {
         return recordsequence;
     }

    public void setLanguagecode(String languagecode) {
         this.languagecode = languagecode;
     }
     public String getLanguagecode() {
         return languagecode;
     }

    public void setMarketcopyreference(String marketcopyreference) {
         this.marketcopyreference = marketcopyreference;
     }
     public String getMarketcopyreference() {
         return marketcopyreference;
     }

    public void setMarketcopycode(String marketcopycode) {
         this.marketcopycode = marketcopycode;
     }
     public String getMarketcopycode() {
         return marketcopycode;
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