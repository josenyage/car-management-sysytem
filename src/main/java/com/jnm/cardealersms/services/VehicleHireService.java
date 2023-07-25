package com.jnm.cardealersms.services;

import com.jnm.cardealersms.model.Supplier;
import com.jnm.cardealersms.model.VehicleHire;
import com.jnm.cardealersms.repository.SupplierRepository;
import com.jnm.cardealersms.repository.VehicleHireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleHireService {

    @Autowired
    VehicleHireRepository vehicleHireRepository;

    public List<VehicleHire> getVehicleHire(){
        return vehicleHireRepository.findAll();
    }

    public void save(VehicleHire vehicleHire){
        vehicleHireRepository.save(vehicleHire);
    }

    public Optional<VehicleHire> findById(int id){
        return vehicleHireRepository.findById(id);
    }

    public void delete(int id){
        vehicleHireRepository.deleteById(id);
    }
}
