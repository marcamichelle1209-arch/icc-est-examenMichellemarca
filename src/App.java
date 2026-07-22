import java.util.List;

import controllers.ShipmentController;
import data.ShipmentData;
import models.Shipment;

public class App {
    public static void main(String[] args) throws Exception {
       List<Shipment> shipments = new ShipmentData.createShipments();

       ShipmentController controller = new ShipmentController();
        Set<Shipment> ordered = controller.filterAndOrderShipments(shipments, 50000);

        List<Shipment> bulki = controller.classifyAndExtractShipments(shipments, "BULKI");

        System.out.println("Metodo A:" + ordered.size());
        System.out.println("BULKI: " + bulki.size());
    }
}
