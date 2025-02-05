package com.systemdesign.parkinglot.models;

import com.systemdesign.parkinglot.enums.VehicleType;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ParkingLot {
    private final List<ParkingSpot> parkingSpots;
    private final ParkingStrategy parkingStrategy;

    public ParkingLot(List<ParkingSpot> parkingSpots,ParkingStrategy parkingStrategy) {
        this.parkingSpots=parkingSpots;
        this.parkingStrategy=parkingStrategy;
    }

    void addParkingSpot(ParkingSpot parkingSpot){
        this.parkingSpots.add(parkingSpot);
    }

    void removeParkingSpot(ParkingSpot parkingSpot){
        this.parkingSpots.remove(parkingSpot);
    }

    ParkingSpot findParkingSpace(VehicleType vehicleType){
        return parkingStrategy.findParkingSpace(vehicleType);
    }

    void parkVehicle(Vehicle vehicle){}

    void releaseVehicle(Vehicle vehicle){}
}
