package models;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class NearestToExitParkingStrategy implements ParkingStrategy{
    @Override
    public Optional<ParkingSpot> findParkingSpace(List<ParkingSpot> parkingSpots, VehicleType vehicleType) {
        return parkingSpots.stream().sorted(Comparator.comparing(i-> true).reversed()).findFirst();
    }
}
