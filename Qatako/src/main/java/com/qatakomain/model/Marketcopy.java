
package com.qatakomain.model;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Marketcopy {

    @JsonProperty("MarketCopyContent")
    private Marketcopycontent marketcopycontent;
    public void setMarketcopycontent(Marketcopycontent marketcopycontent) {
         this.marketcopycontent = marketcopycontent;
     }
     public Marketcopycontent getMarketcopycontent() {
         return marketcopycontent;
     }

}