package com.systemdesign.parkinglot.models;

import java.util.ArrayList;
import java.util.List;

public class FourWheelerParkingLot extends ParkingLot{
    public FourWheelerParkingLot(ParkingStrategy parkingStrategy) {
        super(new ArrayList<>(),parkingStrategy);
    }
}
