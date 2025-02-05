package models;

public abstract class ParkingSpot {
    private int id;
    private Vehicle vehicle;
    private Ticket ticket;
    private boolean isEmpty;

    private ParkingSpotType parkingSpotType;
    protected int price;

    public ParkingSpot(ParkingSpotType parkingSpotType, int price) {
        this.parkingSpotType = parkingSpotType;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public int getPrice(){
        return this.price;
    }
    protected abstract void setPrice();

    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }

    public void setParkingSpotType(ParkingSpotType parkingSpotType) {
        this.parkingSpotType = parkingSpotType;
    }
}
