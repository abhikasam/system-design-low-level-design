package com.systemdesign.parkinglot.models;

public class HourBasedParkingCharge implements ParkingCharge{
    @Override
    public Bill calcuateBill(Ticket ticket) {
        //hour based result.
        return new Bill();
    }
}
