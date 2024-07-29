
package com.qatakomain.model;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Pies {

    private String xmlns;
    @JsonProperty("MarketingCopy")
    private Marketingcopy marketingcopy;
    @JsonProperty("Header")
    private Header header;
    @JsonProperty("Items")
    private Items items;
    @JsonProperty("PriceSheets")
    private Pricesheets pricesheets;
    @JsonProperty("Trailer")
    private Trailer trailer;
    public void setXmlns(String xmlns) {
         this.xmlns = xmlns;
     }
     public String getXmlns() {
         return xmlns;
     }

    public void setMarketingcopy(Marketingcopy marketingcopy) {
         this.marketingcopy = marketingcopy;
     }
     public Marketingcopy getMarketingcopy() {
         return marketingcopy;
     }

    public void setHeader(Header header) {
         this.header = header;
     }
     public Header getHeader() {
         return header;
     }

    public void setItems(Items items) {
         this.items = items;
     }
     public Items getItems() {
         return items;
     }

    public void setPricesheets(Pricesheets pricesheets) {
         this.pricesheets = pricesheets;
     }
     public Pricesheets getPricesheets() {
         return pricesheets;
     }

    public void setTrailer(Trailer trailer) {
         this.trailer = trailer;
     }
     public Trailer getTrailer() {
         return trailer;
     }

}