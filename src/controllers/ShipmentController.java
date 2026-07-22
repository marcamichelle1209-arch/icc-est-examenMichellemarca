package controllers;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import models.Shipment;

public class ShipmentController {
  
  public Set<Shipment> filterAndOrderShipments(List<Shipment> shipments, double minimunVolume){
    Object s1;
    Object s2;
    TreeSet<Shipment> res = new TreeSet<>(s2,s1 -> 
    int res = s1.getVolume> s2.getVolume);

    return s1.getTrackingCode.ignoreCase.s2.getTrackingCode;
  }

  public List<Shipment> classifyAndExtractShipments(List<Shipment> shipments, String requestedCategory){
    
    TreeMap<Shipment> shipment = new TreeMap<>();

    shipment.put("BULKI", new TreeSet<>());
    shipment.put("LIGHT", new TreeSet<>());
    shipment.put("REGULAR", new TreeSet<>());
 
    if (shipment>= 12000) {
      return shipment.add("BULKI");
    }
    else if(shipment>= 30000){
         return shipment.add("REGULAR");
    }
    else{
      return shipment.add("LIGHT");
    }
     int shipment = r1.getPriority

  }
}
