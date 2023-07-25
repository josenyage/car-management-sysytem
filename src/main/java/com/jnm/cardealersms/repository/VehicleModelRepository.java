package com.jnm.cardealersms.repository;

import com.jnm.cardealersms.model.Employee;
import com.jnm.cardealersms.model.VehicleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleModelRepository extends JpaRepository<VehicleModel, Integer> {
}
