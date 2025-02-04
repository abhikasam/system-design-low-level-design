package models;

public class Bill {
    int id;
    Vehicle vehicle;
    int duration;
    ParkingSpot parkingSpot;

    public Bill(int id, Vehicle vehicle, int duration, ParkingSpot parkingSpot) {
        this.id = id;
        this.vehicle = vehicle;
        this.duration = duration;
        this.parkingSpot = parkingSpot;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }
}
