package com.capitalone.repos;

import com.capitalone.enums.VehicleType;
import com.capitalone.model.Spot;
import com.capitalone.model.Vehicle;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpotRepo extends JpaRepository<Spot, String> {
    Spot findByLevelAndPos(int level, int pos);
    Spot findByVehicle(Vehicle vehicle);
    Spot findByVehicleRegNo(String regNo);
    Page<Spot> findByVehicleColor(String color, Pageable pageable);
    Page<Spot> findByVehicleType(VehicleType type, Pageable pageable);
}
