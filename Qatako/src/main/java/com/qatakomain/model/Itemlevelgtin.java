
package com.qatakomain.model;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Itemlevelgtin {

    @JsonProperty("GTINQualifier")
    private String gtinqualifier;
    private String content;
    public void setGtinqualifier(String gtinqualifier) {
         this.gtinqualifier = gtinqualifier;
     }
     public String getGtinqualifier() {
         return gtinqualifier;
     }

    public void setContent(String content) {
         this.content = content;
     }
     public String getContent() {
         return content;
     }

}