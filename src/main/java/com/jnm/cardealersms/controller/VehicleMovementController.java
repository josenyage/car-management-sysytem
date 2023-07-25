package com.jnm.cardealersms.controller;

import com.jnm.cardealersms.model.State;
import com.jnm.cardealersms.model.VehicleMovement;
import com.jnm.cardealersms.services.LocationService;
import com.jnm.cardealersms.services.VehicleMovementService;
import com.jnm.cardealersms.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class VehicleMovementController {

    @Autowired VehicleMovementService vehicleMovementService;
    @Autowired VehicleService vehicleService;
    @Autowired LocationService locationService;
    @GetMapping("/VehicleMovement")
    public String getVehicleMovement(Model model){
        model.addAttribute("VehicleMovement", vehicleMovementService.getVehicleMovement());
        model.addAttribute("Vehicle", vehicleService.getVehicle());
        model.addAttribute("locations", locationService.getLocation());
        return "VehicleMovement";
    }

    @RequestMapping("/VehicleMovement/addNew")
    public String addNew(VehicleMovement vehicleMovement){
         vehicleMovementService.save(vehicleMovement);
        return "redirect:/VehicleMovement";
    }

    @RequestMapping("/VehicleMovement/findById")
    @ResponseBody
    public Optional<VehicleMovement> findById(int id){
        return vehicleMovementService.findById(id);
    }

    @RequestMapping(value = "/VehicleMovement/update", method = {RequestMethod.GET, RequestMethod.PUT})
    public String update(VehicleMovement vehicleMovement){
        vehicleMovementService.save(vehicleMovement);
        return "redirect:/VehicleMovement";
    }

    @RequestMapping(value = "/VehicleMovement/update", method = {RequestMethod.GET, RequestMethod.DELETE})
    public String delete(int id){
        vehicleMovementService.delete(id);
        return "redirect:/VehicleMovement";
    }
}
