package com.jnm.cardealersms.controller;

import com.jnm.cardealersms.model.Vehicle;
import com.jnm.cardealersms.model.VehicleHire;
import com.jnm.cardealersms.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;
    @Autowired private VehicleTypeService vehicleTypeService;
    @Autowired private VehicleMakeService vehicleMakeService;
    @Autowired private VehicleModelService vehicleModelService;
    @Autowired private LocationService locationService;
    @Autowired private EmployeeService employeeService ;
    @Autowired private VehicleStatusService vehicleStatusService;

    @GetMapping("/Vehicle")
    public String getVehicle(Model model){

        model.addAttribute("Vehicle", vehicleService.getVehicle());
        model.addAttribute("VehicleType", vehicleTypeService.getVehicleType());
        model.addAttribute("VehicleModel", vehicleModelService.getVehicleModel());
        model.addAttribute("VehicleMake", vehicleMakeService.getVehicleMake());
        model.addAttribute("locations", locationService.getLocation());
        model.addAttribute("employees", employeeService.getEmployee());
        model.addAttribute("VehicleStatus", vehicleStatusService.getVehicleStatus());

        return "Vehicle";
    }

    @PostMapping("/Vehicle/addNew")
    public String addNew(Vehicle vehicle){
        vehicleService.save(vehicle);
        return "redirect:/Vehicle";
    }

    @RequestMapping("/Vehicle/findById")
    @ResponseBody
    public Optional<Vehicle> findById(int id){
        return vehicleService.findById(id);
    }

    @RequestMapping(value = "/Vehicle/update", method = {RequestMethod.GET, RequestMethod.PUT})

    public String update(Vehicle vehicle){
        vehicleService.save(vehicle);
        return "redirect:/Vehicle";
    }

    @RequestMapping(value = "/Vehicle/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete (int id){
        vehicleService.delete(id);
        return "redirect:/Vehicle";
    }
}
