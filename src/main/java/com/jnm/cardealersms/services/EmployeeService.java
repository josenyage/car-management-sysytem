package com.jnm.cardealersms.services;

import com.jnm.cardealersms.model.Employee;
import com.jnm.cardealersms.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;


    public List<Employee> getEmployee() {
        return employeeRepository.findAll();
    }

    public void save(Employee employee){
        employeeRepository.save(employee);
    }

    public Optional<Employee> findById(int id){
        return employeeRepository.findById(id);
    }

    public void delete(int id){
        employeeRepository.deleteById(id);
    }
    public List<Employee> findByKeyword(String keyword) {
        return employeeRepository.findByKeyword();
    }

    public EmployeeRepository findByUsername(String un) {
        return employeeRepository;
    }
}
