package com.systemdesign.parkinglot.models;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Ticket {
    private int id;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private LocalDateTime entryTime;
}
