package com.jnm.cardealersms.controller;

import com.jnm.cardealersms.model.Employee;
import com.jnm.cardealersms.model.EmployeeType;
import com.jnm.cardealersms.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@Controller
public class EmployeeController {

    @Autowired private EmployeeService employeeService;
    @Autowired private EmployeeTypeService employeeTypeService;
    @Autowired private JobTitleService jobTitleService;
    @Autowired private CountryService countryService;
    @Autowired private StateService stateService;

    @GetMapping("/employees")
    public String getEmployee(Model model){

        model.addAttribute("employees", employeeService.getEmployee());
        model.addAttribute("employeeTypes", employeeTypeService.getEmployeeType());
        model.addAttribute("jobTitles", jobTitleService.getJobTitle());
        model.addAttribute("countries", countryService.getCountry());
        model.addAttribute("states", stateService.getStates());

        return "employees";
    }

    @PostMapping("/employees/addNew")

    public String addNew(Employee employee){

        employeeService.save(employee);

        return "redirect:/employees";

    }

    @RequestMapping("employees/findById")
    @ResponseBody

    public Optional<Employee> findById(int id){
        return employeeService.findById(id);
    }

    @RequestMapping( value = "employees/update", method = {RequestMethod.GET, RequestMethod.PUT})

    public String update(Employee employee){
        employeeService.save(employee);
        return "redirect:/employees";
    }


    @RequestMapping(value = "/employees/delete", method = {RequestMethod.DELETE, RequestMethod.GET})

    public String delete(Integer id){
        employeeService.delete(id);
        return "redirect:/employees";
    }
}
