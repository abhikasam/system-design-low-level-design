package models;

public interface ParkingChargeStrategy {
    long generateBill(Ticket ticket);
}
