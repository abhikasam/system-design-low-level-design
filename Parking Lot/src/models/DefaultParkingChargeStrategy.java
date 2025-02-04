package models;

public class DefaultParkingChargeStrategy implements ParkingChargeStrategy{
    @Override
    public long generateBill(Ticket ticket) {
        return 20;
    }
}
