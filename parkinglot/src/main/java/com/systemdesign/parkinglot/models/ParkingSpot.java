package com.systemdesign.parkinglot.models;

import lombok.Data;

@Data
public abstract class ParkingSpot {
    private int id;
    private boolean isAvailable;
    private int price;

    void parkVehicle(Vehicle vehicle){}
    void releaseVehicle(){}

    public abstract int getPrice();
}
