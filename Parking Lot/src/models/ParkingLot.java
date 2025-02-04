package models;

import java.util.List;
import java.util.Map;

///
/// in the parking lot, we have to check if any available spot for any vehicle type.
/// ticket will be given on allotting the spot.
/// add or remove parking spots.
///

public class ParkingLot {
    List<ParkingSpot> area;

    void addParkingSpot(ParkingSpot parkingSpot){
        area.add(parkingSpot);
    }

    void removeParkingSpot(ParkingSpot parkingSpot){
        area.remove(parkingSpot);
    }

    boolean findSpot(VehicleType vehicleType){
        return true;
    }

    Ticket allotSpot(Vehicle vehicle){
        return new Ticket();
    }
}
