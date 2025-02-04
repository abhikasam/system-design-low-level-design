package models;

public class Bill {
    int id;
    Vehicle vehicle;
    long duration;
    ParkingSpot parkingSpot;
    long price;

    public Bill(int id, Vehicle vehicle, long duration, ParkingSpot parkingSpot) {
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

    public long getDuration() {
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

    public long getPrice() {
        return this.duration*this.parkingSpot.getPrice();
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }
}
