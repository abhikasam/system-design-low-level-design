package com.systemdesign.parkinglot.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ParkingLot {
    private final List<ParkingSpot> parkingSpots;

    public ParkingLot(List<ParkingSpot> parkingSpots) {
        this.parkingSpots=parkingSpots;
    }

    void addParkingSpot(ParkingSpot parkingSpot){
        this.parkingSpots.add(parkingSpot);
    }

    void removeParkingSpot(ParkingSpot parkingSpot){
        this.parkingSpots.remove(parkingSpot);
    }

    ParkingSpot findParkingSpace(){
        return parkingSpots.get(0);
    }

    void parkVehicle(Vehicle vehicle){}

    void releaseVehicle(Vehicle vehicle){}
}
