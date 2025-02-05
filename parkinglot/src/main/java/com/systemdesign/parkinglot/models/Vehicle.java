package com.systemdesign.parkinglot.models;

import com.systemdesign.parkinglot.enums.VehicleType;
import lombok.Data;

@Data
public class Vehicle {
    private String number;
    private VehicleType vehicleType;
}
