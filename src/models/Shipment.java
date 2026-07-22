package models;

public class Shipment {
  private String trackingCode;
   private String recipient;
   private PackageDimensions dimensions;
   private int priority;
   public Shipment(String trackingCode, String recipient, PackageDimensions dimensions, int priority) {
    this.trackingCode = trackingCode;
    this.recipient = recipient;
    this.dimensions = dimensions;
    this.priority = priority;
   }
   public String getTrackingCode() {
     return trackingCode;
   }
   public void setTrackingCode(String trackingCode) {
     this.trackingCode = trackingCode;
   }
   public String getRecipient() {
     return recipient;
   }
   public void setRecipient(String recipient) {
     this.recipient = recipient;
   }
   public PackageDimensions getDimensions() {
     return dimensions;
   }
   public void setDimensions(PackageDimensions dimensions) {
     this.dimensions = dimensions;
   }
   public int getPriority() {
     return priority;
   }
   public void setPriority(int priority) {
     this.priority = priority;
   }
   @Override
   public String toString() {
    return "Shipment [trackingCode=" + trackingCode + ", recipient=" + recipient + ", dimensions=" + dimensions
        + ", priority=" + priority + "]";
   }
   
   
}
