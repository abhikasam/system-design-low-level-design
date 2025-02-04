package models;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class HourlyParkingChargeStrategy implements ParkingChargeStrategy{
    @Override
    public long generateBill(Ticket ticket) {
        long duration=(ticket.getEntryTime().until(LocalDateTime.now(),ChronoUnit.MINUTES)/60);
        return ticket.getParkingSpot().getPrice()*duration;
    }
}
