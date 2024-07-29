
package com.qatakomain.model;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Trailer {

    @JsonProperty("ItemCount")
    private int itemcount;
    @JsonProperty("TransactionDate")
    private Date transactiondate;
    public void setItemcount(int itemcount) {
         this.itemcount = itemcount;
     }
     public int getItemcount() {
         return itemcount;
     }

    public void setTransactiondate(Date transactiondate) {
         this.transactiondate = transactiondate;
     }
     public Date getTransactiondate() {
         return transactiondate;
     }

}