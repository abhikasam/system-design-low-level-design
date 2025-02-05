package com.systemdesign.parkinglot.models;

public class ExitGate {
    ParkingCharge parkingCharge;

    public ExitGate(ParkingCharge parkingCharge) {
        this.parkingCharge = parkingCharge;
    }

    Bill CostComputation(Ticket ticket){
        return parkingCharge.calcuateBill(ticket);
    }
    void payBill(Ticket ticket){}
    void releaseVehicle(ParkingSpot parkingSpot){}
}
