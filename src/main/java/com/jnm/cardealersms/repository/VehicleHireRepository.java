package com.jnm.cardealersms.repository;

import com.jnm.cardealersms.model.Employee;
import com.jnm.cardealersms.model.VehicleHire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleHireRepository extends JpaRepository<VehicleHire, Integer> {
}
