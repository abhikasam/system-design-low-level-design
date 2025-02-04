package models;

///
/// On exit vehicle will pay the bill.
///

public class ExitGate {

    private final ParkingLot parkingLot;
    private final ParkingChargeStrategy parkingChargeStrategy;

    public ExitGate(ParkingLot parkingLot, ParkingChargeStrategy parkingChargeStrategy) {
        this.parkingLot = parkingLot;
        this.parkingChargeStrategy = parkingChargeStrategy;
    }

    double generateBill(Ticket ticket){
        return parkingChargeStrategy.generateBill(ticket);
    }
    void releaseVehicle(Vehicle vehicle){
        parkingLot.releaseVehicle(vehicle);
    }
}
