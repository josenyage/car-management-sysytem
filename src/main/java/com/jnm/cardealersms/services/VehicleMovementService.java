package com.jnm.cardealersms.services;

import com.jnm.cardealersms.model.State;
import com.jnm.cardealersms.model.VehicleMovement;
import com.jnm.cardealersms.repository.VehicleMovementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleMovementService {

    @Autowired
    VehicleMovementRepository vehicleMovementRepository;
    public List<VehicleMovement> getVehicleMovement() {
        return vehicleMovementRepository.findAll();
    }

    public Optional<VehicleMovement> findById(int id) {
        return vehicleMovementRepository.findById(id);
    }

    public void save(VehicleMovement vehicleMovement) {
        vehicleMovementRepository.save(vehicleMovement);
    }

    public void delete(int id) {
        vehicleMovementRepository.deleteById(id);
    }
}
