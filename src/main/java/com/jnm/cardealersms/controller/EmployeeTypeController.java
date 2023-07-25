package com.jnm.cardealersms.controller;

import com.jnm.cardealersms.model.EmployeeType;
import com.jnm.cardealersms.services.EmployeeTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class EmployeeTypeController {

    @Autowired
    EmployeeTypeService employeeTypeService;

    @GetMapping("/employeeTypes")
    public String getEmployeeType(Model model){

        List<EmployeeType> employeeTypeList = employeeTypeService.getEmployeeType();
        model.addAttribute("employeeTypes", employeeTypeList);

        return "employeeTypes";
    }

    @PostMapping("/employeeTypes/addNew")

    public String addNew(EmployeeType employeeType){

        employeeTypeService.save(employeeType);

        return "redirect:/employeeTypes";

    }

    @RequestMapping("employeeTypes/findById")
    @ResponseBody

    public Optional<EmployeeType> findById(int id){
        return employeeTypeService.findById(id);
    }

    @RequestMapping( value = "employeeTypes/update", method = {RequestMethod.GET, RequestMethod.PUT})

    public String update(EmployeeType employeeType){
        employeeTypeService.save(employeeType);
        return "redirect:/employeeTypes";
    }


    @RequestMapping(value = "/employeeTypes/delete", method = {RequestMethod.DELETE, RequestMethod.GET})

    public String delete(Integer id){
        employeeTypeService.delete(id);
        return "redirect:/employeeTypes";
    }

}
