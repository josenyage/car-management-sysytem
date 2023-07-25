package com.jnm.cardealersms.services;

import com.jnm.cardealersms.model.EmployeeType;
import com.jnm.cardealersms.model.VehicleModel;
import com.jnm.cardealersms.repository.EmployeeTypeRepository;
import com.jnm.cardealersms.repository.VehicleModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleModelService {
    @Autowired
    VehicleModelRepository vehicleModelRepository;

    // return a list of employee types
    public List<VehicleModel> getVehicleModel() {

        return vehicleModelRepository.findAll();
    }

    // save a new employee type
    public void save(VehicleModel vehicleModel) {
        vehicleModelRepository.save(vehicleModel);
    }

    // find employee type by id

    public Optional<VehicleModel> findById(Integer id) {
        return vehicleModelRepository.findById(id);
    }

    public void delete(int id) {
        vehicleModelRepository.deleteById(id);
    }


}
