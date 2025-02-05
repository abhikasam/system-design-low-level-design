package com.systemdesign.parkinglot.models;

import com.systemdesign.parkinglot.enums.VehicleType;

public class EntranceGate {
    ParkingLot parkingLot;

    void findParkingSpace(VehicleType vehicleType){
        parkingLot.findParkingSpace(vehicleType);
    }

    void allotParkingSpace(Vehicle vehicle){
        ParkingSpot parkingSpot=parkingLot.findParkingSpace(vehicle.getVehicleType());
        parkingLot.addParkingSpot(parkingSpot);
    }
}
