package com.jnm.cardealersms.controller;

import com.jnm.cardealersms.model.VehicleModel;
import com.jnm.cardealersms.services.VehicleModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class VehicleModelController {

    @Autowired
    VehicleModelService vehicleModelService;

    @GetMapping("/VehicleModel")
    public String getVehicleModel(Model model) {
        List<VehicleModel> vehicleModelList = vehicleModelService.getVehicleModel();
        model.addAttribute("VehicleModel",vehicleModelList);
        return "VehicleModel";
    }

    @PostMapping("/VehicleModel/addNew")

    public String addNew(VehicleModel vehicleModel){
        vehicleModelService.save(vehicleModel);
        return "redirect:/VehicleModel";
    }

    @RequestMapping(value = "/VehicleModel/findById")
    @ResponseBody

    public Optional<VehicleModel> findById(int id){
       return vehicleModelService.findById(id);
    }

    @RequestMapping(value = "/VehicleModel/update", method = {RequestMethod.GET, RequestMethod.PUT})
    public String update(VehicleModel vehicleModel){
        vehicleModelService.save(vehicleModel);
        return "redirect:/VehicleModel";
    }

    @RequestMapping(value = "/VehicleModel/delete", method = {RequestMethod.GET, RequestMethod.DELETE})
    public String delete(int id){
        vehicleModelService.delete(id);
        return "redirect:/VehicleModel";
    }

}
