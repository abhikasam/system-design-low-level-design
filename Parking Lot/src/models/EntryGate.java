package models;

///
/// responsibilities : vehicle enters, and look for parking spot.
/// if any parking spot available, then the vehicle will be allotted and ticket will be given.
///
public class EntryGate {
    ParkingLot parkingLot;

    boolean findSpot(Vehicle vehicle){
        return parkingLot.findSpot(vehicle.vehicleType);
    }

    Ticket parkVehicle(Vehicle vehicle){
        return parkingLot.allotSpot(vehicle);
    }
}
