package com.jnm.cardealersms.controller;

import com.jnm.cardealersms.model.InvoiceStatus;
import com.jnm.cardealersms.model.VehicleType;
import com.jnm.cardealersms.services.VehicleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class VehicleTypeController {

    @Autowired
    VehicleTypeService vehicleTypeService;

    @GetMapping("/VehicleType")
    public String getVehicleMake(Model model){
        List<VehicleType> vehicleTypeList = vehicleTypeService.getVehicleType();
        model.addAttribute("VehicleType", vehicleTypeList);

        return "VehicleType";
    }

    @PostMapping("/VehicleType/addNew")

    public String addNew(VehicleType vehicleType){
        vehicleTypeService.save(vehicleType);
        return "redirect:/VehicleType";
    }

    @RequestMapping(value = "/VehicleType/findById")
    @ResponseBody

    public Optional<VehicleType> findById(int id){
        return vehicleTypeService.findById(id);
    }

    @RequestMapping(value = "/VehicleType/update", method = {RequestMethod.GET, RequestMethod.PUT})
    public String update(VehicleType vehicleType){
        vehicleTypeService.save(vehicleType);
        return "redirect:/VehicleType";
    }

    @RequestMapping(value = "/VehicleType/delete", method = {RequestMethod.GET, RequestMethod.DELETE})
    public String delete(int id){
        vehicleTypeService.delete(id);
        return "redirect:/VehicleType";
    }
}
