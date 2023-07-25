package com.jnm.cardealersms.controller;

import com.jnm.cardealersms.model.VehicleModel;
import com.jnm.cardealersms.model.VehicleStatus;
import com.jnm.cardealersms.services.VehicleStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class VehicleStatusController {

    @Autowired
    VehicleStatusService vehicleStatusService;

    @GetMapping("/VehicleStatus")
    public String getVehicleStatus(Model model) {
        List<VehicleStatus> vehicleStatusList = vehicleStatusService.getVehicleStatus();
        model.addAttribute("VehicleStatus",vehicleStatusList);
        return "VehicleStatus";
    }

    @PostMapping("/VehicleStatus/addNew")

    public String addNew(VehicleStatus vehicleStatus){
        vehicleStatusService.save(vehicleStatus);
        return "redirect:/VehicleStatus";
    }

    @RequestMapping(value = "/VehicleStatus/findById")
    @ResponseBody

    public Optional<VehicleStatus> findById(int id){
        return vehicleStatusService.findById(id);
    }

    @RequestMapping(value = "/VehicleStatus/update", method = {RequestMethod.GET, RequestMethod.PUT})
    public String update(VehicleStatus vehicleStatus){
        vehicleStatusService.save(vehicleStatus);
        return "redirect:/VehicleStatus";
    }

    @RequestMapping(value = "/VehicleStatus/delete", method = {RequestMethod.GET, RequestMethod.DELETE})
    public String delete(int id){
        vehicleStatusService.delete(id);
        return "redirect:/VehicleStatus";
    }
}
