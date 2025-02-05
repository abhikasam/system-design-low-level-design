package com.systemdesign.parkinglot.models;

public class DefaultParkingCharge implements ParkingCharge{
    @Override
    public Bill calcuateBill(Ticket ticket) {
        //default
        return new Bill();
    }
}
