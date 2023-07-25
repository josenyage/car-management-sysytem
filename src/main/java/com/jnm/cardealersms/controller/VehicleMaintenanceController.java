package com.jnm.cardealersms.controller;

import com.jnm.cardealersms.model.VehicleMaintenance;
import com.jnm.cardealersms.services.SupplierService;
import com.jnm.cardealersms.services.VehicleMaintenanceService;
import com.jnm.cardealersms.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.PublicKey;
import java.util.Optional;

@Controller
public class VehicleMaintenanceController {

    @Autowired
    VehicleMaintenanceService vehicleMaintenanceService;

    @Autowired
    VehicleService vehicleService;

    @Autowired
    SupplierService supplierService;

    @GetMapping("/VehicleMaintenance")
    public String getVehicleMaintenance(Model model){
        model.addAttribute("VehicleMaintenance", vehicleMaintenanceService.getVehicleMaintenance());
        model.addAttribute("Vehicle", vehicleService.getVehicle());
        model.addAttribute("suppliers", supplierService.getSupplier());
        return "VehicleMaintenance";
    }

    @RequestMapping("/VehicleMaintenance/addNew")
    public String addNew(VehicleMaintenance vehicleMaintenance){
        vehicleMaintenanceService.save(vehicleMaintenance);
        return "redirect:/VehicleMaintenance";
    }

    @RequestMapping("/VehicleMaintenance/findById")
    @ResponseBody
    public Optional<VehicleMaintenance> findById(int id){
        return vehicleMaintenanceService.findById(id);
    }

    @RequestMapping( value = "/VehicleMaintenance/update", method = {RequestMethod.GET, RequestMethod.PUT})
    public String update(VehicleMaintenance vehicleMaintenance){
        vehicleMaintenanceService.save(vehicleMaintenance);
        return "redirect:/VehicleMaintenance";
    }

    @RequestMapping(value = "/VehicleMaintenance/delete", method = {RequestMethod.GET, RequestMethod.DELETE})
    public String delete(int id){
        vehicleMaintenanceService.findById(id);
        return "redirect:/VehicleMaintenance";
    }

}
