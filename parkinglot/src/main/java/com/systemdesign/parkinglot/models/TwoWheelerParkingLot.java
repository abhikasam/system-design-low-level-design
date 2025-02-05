package com.systemdesign.parkinglot.models;

import com.systemdesign.parkinglot.enums.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class TwoWheelerParkingLot extends ParkingLot {
    public TwoWheelerParkingLot(ParkingStrategy parkingStrategy) {
        super(new ArrayList<>(),parkingStrategy);
    }
}
