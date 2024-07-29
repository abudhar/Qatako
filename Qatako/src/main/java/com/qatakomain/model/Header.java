
package com.qatakomain.model;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Header {

    @JsonProperty("TechnicalContact")
    private String technicalcontact;
    @JsonProperty("BlanketEffectiveDate")
    private Date blanketeffectivedate;
    @JsonProperty("SubmissionType")
    private String submissiontype;
    @JsonProperty("BrandOwnerAAIAID")
    private String brandowneraaiaid;
    @JsonProperty("ParentAAIAID")
    private String parentaaiaid;
    @JsonProperty("ContactEmail")
    private String contactemail;
    @JsonProperty("PIESVersion")
    private double piesversion;
    public void setTechnicalcontact(String technicalcontact) {
         this.technicalcontact = technicalcontact;
     }
     public String getTechnicalcontact() {
         return technicalcontact;
     }

    public void setBlanketeffectivedate(Date blanketeffectivedate) {
         this.blanketeffectivedate = blanketeffectivedate;
     }
     public Date getBlanketeffectivedate() {
         return blanketeffectivedate;
     }

    public void setSubmissiontype(String submissiontype) {
         this.submissiontype = submissiontype;
     }
     public String getSubmissiontype() {
         return submissiontype;
     }

    public void setBrandowneraaiaid(String brandowneraaiaid) {
         this.brandowneraaiaid = brandowneraaiaid;
     }
     public String getBrandowneraaiaid() {
         return brandowneraaiaid;
     }

    public void setParentaaiaid(String parentaaiaid) {
         this.parentaaiaid = parentaaiaid;
     }
     public String getParentaaiaid() {
         return parentaaiaid;
     }

    public void setContactemail(String contactemail) {
         this.contactemail = contactemail;
     }
     public String getContactemail() {
         return contactemail;
     }

    public void setPiesversion(double piesversion) {
         this.piesversion = piesversion;
     }
     public double getPiesversion() {
         return piesversion;
     }

}