package models;

public class FourWheelerParkingSpot extends ParkingSpot{
    public FourWheelerParkingSpot(ParkingSpotType parkingSpotType, int price) {
        super(ParkingSpotType.FOUR_WHEELER, 40);
    }

    @Override
    protected void setPrice() {
        this.price=40;
    }
}
