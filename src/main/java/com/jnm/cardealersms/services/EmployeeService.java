package com.jnm.cardealersms.services;

import com.jnm.cardealersms.model.Employee;
import com.jnm.cardealersms.model.User;
import com.jnm.cardealersms.repository.EmployeeRepository;
import com.jnm.cardealersms.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private UserRepository userRepository;


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
        return employeeRepository.findByKeyword(keyword);
    }

    public Employee findByUsername(String un) {
        return employeeRepository.findByUsername(un);
    }

    //Set the Username of the employee where firstname and lastname match
    public void assignUsername(int id){
        Employee employee = employeeRepository.findById(id).orElse(null);
        User user = userRepository.findByFirstnameAndLastname(
                employee.getFirstname(),
                employee.getLastname());
        employee.setUsername(user.getUsername());
        employeeRepository.save(employee);
    }
}
