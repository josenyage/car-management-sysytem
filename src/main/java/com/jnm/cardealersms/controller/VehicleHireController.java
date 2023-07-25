package com.jnm.cardealersms.controller;

import com.jnm.cardealersms.model.Supplier;
import com.jnm.cardealersms.model.VehicleHire;
import com.jnm.cardealersms.services.ClientService;
import com.jnm.cardealersms.services.LocationService;
import com.jnm.cardealersms.services.VehicleHireService;
import com.jnm.cardealersms.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class VehicleHireController {

    @Autowired
    VehicleHireService vehicleHireService;

    @Autowired
    VehicleService vehicleService;

    @Autowired
    ClientService clientService;

    @Autowired
    LocationService locationService;
    @GetMapping("/VehicleHire")
    public String getVehicleHire(Model model){
        model.addAttribute("VehicleHire", vehicleHireService.getVehicleHire());
        model.addAttribute("Vehicle", vehicleService.getVehicle());
        model.addAttribute("locations", locationService.getLocation());
        model.addAttribute("clients", clientService.getClient());

        return "VehicleHire";
    }

    @PostMapping("/VehicleHire/addNew")
    public String addNew(VehicleHire vehicleHire){
        vehicleHireService.save(vehicleHire);
        return "redirect:/VehicleHire";
    }

    @RequestMapping("/VehicleHire/findById")
    @ResponseBody
    public Optional<VehicleHire> findById(int id){
        return vehicleHireService.findById(id);
    }

    @RequestMapping(value = "/VehicleHire/update", method = {RequestMethod.GET, RequestMethod.PUT})

    public String update(VehicleHire vehicleHire){
        vehicleHireService.save(vehicleHire);
        return "redirect:/VehicleHire";
    }

    @RequestMapping(value = "/VehicleHire/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete (int id){
        vehicleHireService.delete(id);
        return "redirect:/VehicleHire";
    }

}
