package com.capitalone.services;

import com.capitalone.enums.VehicleType;
import com.capitalone.model.Spot;
import com.capitalone.model.Vehicle;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.Date;

public interface ParkingLotService {

    Spot park(Vehicle vehicle);

    Vehicle unPark(String regNo);

    Vehicle getVehicle(String regNo);

    Page<Vehicle> getVehiclesByColor(String color, PageRequest pr);

    Page<Vehicle> getVehiclesByType(VehicleType color, PageRequest pr);

    Page<Vehicle> getVehiclesByDuration(Date startTime, Date endTime, PageRequest pr);

}
