package models;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class HourlyParkingChargeStrategy implements ParkingChargeStrategy{
    @Override
    public Bill generateBill(Ticket ticket) {
        long duration=(ticket.getEntryTime().until(LocalDateTime.now(),ChronoUnit.MINUTES)/60);
        return new Bill(0,ticket.getVehicle(),duration,ticket.getParkingSpot());
    }
}
