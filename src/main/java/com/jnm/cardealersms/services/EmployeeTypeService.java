package com.jnm.cardealersms.services;

import com.jnm.cardealersms.model.EmployeeType;
import com.jnm.cardealersms.model.InvoiceStatus;
import com.jnm.cardealersms.model.Location;
import com.jnm.cardealersms.repository.EmployeeRepository;
import com.jnm.cardealersms.repository.EmployeeTypeRepository;
import com.jnm.cardealersms.repository.InvoiceStatusRepository;
import com.jnm.cardealersms.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeTypeService {
    @Autowired
    EmployeeTypeRepository employeeTypeRepository;

    // return a list of employee types
    public List<EmployeeType> getEmployeeType() {
        return employeeTypeRepository.findAll();
    }

    // save a new employee type
    public void save(EmployeeType employeeType) {
        employeeTypeRepository.save(employeeType);
    }

    // find employee type by id

    public Optional<EmployeeType> findById(Integer id) {
        return employeeTypeRepository.findById(id);
    }

    public void delete(int id) {
        employeeTypeRepository.deleteById(id);
    }
}
