package models;

public class TwoWheelerParkingSpot extends ParkingSpot{
    public TwoWheelerParkingSpot(ParkingSpotType parkingSpotType, int price) {
        super(ParkingSpotType.TWO_WHEELER,20);
    }

    @Override
    protected void setPrice() {
        this.price=20;
    }
}
