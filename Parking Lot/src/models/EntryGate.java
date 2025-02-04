package models;

import java.util.Optional;

///
/// responsibilities : vehicle enters, and look for parking spot.
/// if any parking spot available, then the vehicle will be allotted and ticket will be given.
///
public class EntryGate {
    private final ParkingLot parkingLot;

    public EntryGate(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    Optional<ParkingSpot> findParkingSpot(Vehicle vehicle){
        return parkingLot.findParkingSpot(vehicle.getVehicleType());
    }


    Ticket parkVehicle(Vehicle vehicle){
        return parkingLot.allotSpot(vehicle);
    }
}
