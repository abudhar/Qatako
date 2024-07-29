
package com.qatakomain.model;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Marketingcopy {

    @JsonProperty("MarketCopy")
    private Marketcopy marketcopy;
    public void setMarketcopy(Marketcopy marketcopy) {
         this.marketcopy = marketcopy;
     }
     public Marketcopy getMarketcopy() {
         return marketcopy;
     }

}