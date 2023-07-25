package com.jnm.cardealersms.services;

import com.jnm.cardealersms.model.EmployeeType;
import com.jnm.cardealersms.model.VehicleStatus;
import com.jnm.cardealersms.repository.EmployeeTypeRepository;
import com.jnm.cardealersms.repository.VehicleStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleStatusService {

    @Autowired
    VehicleStatusRepository vehicleStatusRepository;

    // return a list of employee types
    public List<VehicleStatus> getVehicleStatus() {
        return vehicleStatusRepository.findAll();
    }

    // save a new employee type
    public void save(VehicleStatus vehicleStatus) {
        vehicleStatusRepository.save(vehicleStatus);
    }

    // find employee type by id

    public Optional<VehicleStatus> findById(Integer id) {
        return vehicleStatusRepository.findById(id);
    }

    public void delete(int id) {
        vehicleStatusRepository.deleteById(id);
    }
}
