package com.systemdesign.parkinglot.models;

public class ExitGate {
    ParkingCharge parkingCharge;
    ParkingLot parkingLot;

    public ExitGate(ParkingCharge parkingCharge) {
        this.parkingCharge = parkingCharge;
    }

    Bill CostComputation(Ticket ticket){
        return parkingCharge.calcuateBill(ticket);
    }
    void payBill(Ticket ticket){}
    void releaseVehicle(Vehicle vehicle){
        parkingLot.releaseVehicle(vehicle);
    }
}
