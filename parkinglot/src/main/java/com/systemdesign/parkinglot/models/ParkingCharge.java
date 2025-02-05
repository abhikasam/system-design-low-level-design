package com.systemdesign.parkinglot.models;

public interface ParkingCharge {
    Bill calcuateBill(Ticket ticket);
}
