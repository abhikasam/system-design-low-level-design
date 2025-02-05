package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

///
/// in the parking lot, we have to check if any available spot for any vehicle type.
/// ticket will be given on allotting the spot.
/// add or remove parking spots.
///

public class ParkingLot {
    private final List<ParkingSpot> area;
    private final ParkingStrategy parkingStrategy;

    public ParkingLot(ParkingStrategy parkingStrategy) {
        this.area=new ArrayList<>();
        this.parkingStrategy = parkingStrategy;
    }

    void addParkingSpot(ParkingSpot parkingSpot){
        area.add(parkingSpot);
    }

    void removeParkingSpot(ParkingSpot parkingSpot){
        area.remove(parkingSpot);
    }

     Optional<ParkingSpot> findParkingSpace(VehicleType vehicleType){
        return parkingStrategy.findParkingSpace(area,vehicleType);
    }

    Ticket allotSpot(Vehicle vehicle){
        return new Ticket();
    }

    public void releaseVehicle(Vehicle vehicle) {}
}
