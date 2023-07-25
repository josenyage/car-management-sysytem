package com.jnm.cardealersms.controller;

import com.jnm.cardealersms.model.EmployeeType;
import com.jnm.cardealersms.model.JobTitle;
import com.jnm.cardealersms.model.VehicleMake;
import com.jnm.cardealersms.services.EmployeeTypeService;
import com.jnm.cardealersms.services.VehicleMakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class VehicleMakeController {

    @Autowired
    VehicleMakeService vehicleMakeService;

    @GetMapping("/VehicleMake")
    public String getVehicleMake(Model model){

        List<VehicleMake> vehicleMakeList = vehicleMakeService.getVehicleMake();
        model.addAttribute("VehicleMake", vehicleMakeList);

        return "VehicleMake";
    }

    @PostMapping("/VehicleMake/addNew")

    public String addNew(VehicleMake vehicleMake){

        vehicleMakeService.save(vehicleMake);

        return "redirect:/VehicleMake";

    }

    @RequestMapping("VehicleMake/findById")
    @ResponseBody

    public Optional<VehicleMake> findById(int id){
        return vehicleMakeService.findById(id);
    }


    @RequestMapping( value = "VehicleMake/update", method = {RequestMethod.GET, RequestMethod.PUT})

    public String update(VehicleMake vehicleMake){
        vehicleMakeService.save(vehicleMake);
        return "redirect:/VehicleMake";
    }


    @RequestMapping(value = "/VehicleMake/delete", method = {RequestMethod.DELETE, RequestMethod.GET})

    public String delete(Integer id){
        vehicleMakeService.delete(id);
        return "redirect:/VehicleMake";
    }
}
