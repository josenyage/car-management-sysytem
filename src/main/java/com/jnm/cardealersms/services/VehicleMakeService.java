package com.jnm.cardealersms.services;

import com.jnm.cardealersms.model.EmployeeType;
import com.jnm.cardealersms.model.VehicleMake;
import com.jnm.cardealersms.repository.EmployeeTypeRepository;
import com.jnm.cardealersms.repository.VehicleMakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleMakeService {

    @Autowired
    VehicleMakeRepository vehicleMakeRepository;

    // return a list of employee types
    public List<VehicleMake> getVehicleMake() {
        return vehicleMakeRepository.findAll();
    }

    // save a new employee type
    public void save(VehicleMake vehicleMake) {
        vehicleMakeRepository.save(vehicleMake);
    }

    // find employee type by id

    public Optional<VehicleMake> findById(Integer id) {
        return vehicleMakeRepository.findById(id);
    }

    public void delete(int id) {
        vehicleMakeRepository.deleteById(id);
    }
}
