package com.systemdesign.parkinglot.models;

import com.systemdesign.parkinglot.enums.VehicleType;

public class NearToEntranceParkingStrategy implements ParkingStrategy {
    @Override
    public ParkingSpot findParkingSpace(VehicleType vehicleType) {
        if(vehicleType==VehicleType.TWO_WHEELER)
            return new TwoWheelerSpot();
        return new FourWheelerSpot();
    }
}
