package models;

import java.util.List;
import java.util.Optional;

public interface ParkingStrategy {
    Optional<ParkingSpot> findParkingSpace(List<ParkingSpot> parkingSpots, VehicleType vehicleType);
}
