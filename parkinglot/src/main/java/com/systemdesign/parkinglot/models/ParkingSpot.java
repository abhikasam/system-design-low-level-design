package com.systemdesign.parkinglot.models;

import lombok.Data;

@Data
public class ParkingSpot {
    private int id;
    private Vehicle vehicle;
    private boolean isAvailable;
    private int price;
}
