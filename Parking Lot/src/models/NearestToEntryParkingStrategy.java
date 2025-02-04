package models;

import java.util.List;
import java.util.Optional;

public class NearestToEntryParkingStrategy implements ParkingStrategy{
    @Override
    public Optional<ParkingSpot> findParkingSpot(List<ParkingSpot> parkingSpots, VehicleType vehicleType) {
        return parkingSpots.stream().findFirst();
    }
}
