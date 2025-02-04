package models;

public interface ParkingChargeStrategy {
    Bill generateBill(Ticket ticket);
}
