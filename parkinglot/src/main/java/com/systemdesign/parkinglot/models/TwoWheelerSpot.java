package com.systemdesign.parkinglot.models;

import lombok.Data;

@Data
public class TwoWheelerSpot extends ParkingSpot {
    @Override
    public int getPrice(){
        return 20;
    }
}
