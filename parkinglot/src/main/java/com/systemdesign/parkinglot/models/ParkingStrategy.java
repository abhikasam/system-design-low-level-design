package com.systemdesign.parkinglot.models;

import com.systemdesign.parkinglot.enums.VehicleType;

public interface ParkingStrategy {
    ParkingSpot findParkingSpace(VehicleType vehicleType);
}
