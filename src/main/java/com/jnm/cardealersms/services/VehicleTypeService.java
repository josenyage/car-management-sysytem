package com.jnm.cardealersms.services;

import com.jnm.cardealersms.model.Country;
import com.jnm.cardealersms.model.EmployeeType;
import com.jnm.cardealersms.model.VehicleType;
import com.jnm.cardealersms.repository.CountryRepository;
import com.jnm.cardealersms.repository.EmployeeTypeRepository;
import com.jnm.cardealersms.repository.VehicleTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleTypeService {

    @Autowired
    private VehicleTypeRepository vehicleTypeRepository;

    //Displays list of all countries
    public List<VehicleType> getVehicleType(){
        return vehicleTypeRepository.findAll();
    }

    public void save(VehicleType vehicleType){
        vehicleTypeRepository.save(vehicleType);
    }

    public Optional<VehicleType> findById(int id){
        return vehicleTypeRepository.findById(id);
    }

    public void delete(Integer id) { vehicleTypeRepository.deleteById(id);
    }
}
