package com.jnm.cardealersms.services;

import com.jnm.cardealersms.model.Vehicle;
import com.jnm.cardealersms.model.VehicleMovement;
import com.jnm.cardealersms.repository.VehicleMaintenanceRepository;
import com.jnm.cardealersms.repository.VehicleMovementRepository;
import com.jnm.cardealersms.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleService {

    @Autowired
    VehicleRepository vehicleRepository;

    public List<Vehicle> getVehicle() { return vehicleRepository.findAll(); }

    public Optional<Vehicle> findById(int id) {
        return vehicleRepository.findById(id);
    }

    public void save(Vehicle vehicle) {
        vehicleRepository.save(vehicle);
    }

    public void delete(int id) {
        vehicleRepository.deleteById(id);
    }
}
