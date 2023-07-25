package com.jnm.cardealersms.services;

import com.jnm.cardealersms.model.VehicleMaintenance;
import com.jnm.cardealersms.repository.VehicleMaintenanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleMaintenanceService {

    @Autowired
    VehicleMaintenanceRepository vehicleMaintenanceRepository;

    public void save(VehicleMaintenance vehicleMaintenance){
        vehicleMaintenanceRepository.save(vehicleMaintenance);
    }

    public List<VehicleMaintenance> getVehicleMaintenance(){
        return vehicleMaintenanceRepository.findAll();
    }

    public Optional<VehicleMaintenance> findById(int id){
        return vehicleMaintenanceRepository.findById(id);
    }

    public void delete(int id){
        vehicleMaintenanceRepository.deleteById(id);
    }
}
