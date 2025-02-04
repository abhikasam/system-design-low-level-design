package models;

import java.util.List;
import java.util.Optional;

public interface ParkingStrategy {
    Optional<ParkingSpot> findParkingSpot(List<ParkingSpot> parkingSpots, VehicleType vehicleType);
}
