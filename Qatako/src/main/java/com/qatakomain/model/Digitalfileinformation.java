
package com.qatakomain.model;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Digitalfileinformation {

    @JsonProperty("AssetType")
    private String assettype;
    @JsonProperty("AssetDimensions")
    private Assetdimensions assetdimensions;
    @JsonProperty("FileType")
    private String filetype;
    @JsonProperty("FileName")
    private String filename;
    @JsonProperty("ColorMode")
    private String colormode;
    @JsonProperty("Representation")
    private String representation;
    @JsonProperty("URI")
    private String uri;
    @JsonProperty("MaintenanceType")
    private String maintenancetype;
    @JsonProperty("Resolution")
    private int resolution;
    public void setAssettype(String assettype) {
         this.assettype = assettype;
     }
     public String getAssettype() {
         return assettype;
     }

    public void setAssetdimensions(Assetdimensions assetdimensions) {
         this.assetdimensions = assetdimensions;
     }
     public Assetdimensions getAssetdimensions() {
         return assetdimensions;
     }

    public void setFiletype(String filetype) {
         this.filetype = filetype;
     }
     public String getFiletype() {
         return filetype;
     }

    public void setFilename(String filename) {
         this.filename = filename;
     }
     public String getFilename() {
         return filename;
     }

    public void setColormode(String colormode) {
         this.colormode = colormode;
     }
     public String getColormode() {
         return colormode;
     }

    public void setRepresentation(String representation) {
         this.representation = representation;
     }
     public String getRepresentation() {
         return representation;
     }

    public void setUri(String uri) {
         this.uri = uri;
     }
     public String getUri() {
         return uri;
     }

    public void setMaintenancetype(String maintenancetype) {
         this.maintenancetype = maintenancetype;
     }
     public String getMaintenancetype() {
         return maintenancetype;
     }

    public void setResolution(int resolution) {
         this.resolution = resolution;
     }
     public int getResolution() {
         return resolution;
     }

}