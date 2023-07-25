package com.jnm.cardealersms.controller;

import com.jnm.cardealersms.model.Client;
import com.jnm.cardealersms.model.Supplier;
import com.jnm.cardealersms.services.CountryService;
import com.jnm.cardealersms.services.StateService;
import com.jnm.cardealersms.services.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class SupplierController {

    @Autowired
    StateService stateService;
    @Autowired
    CountryService countryService;
    @Autowired
    SupplierService supplierService;
    @GetMapping("/suppliers")
    public String getClient(Model model){
        model.addAttribute("suppliers", supplierService.getSupplier());
        model.addAttribute("countries", countryService.getCountry());
        model.addAttribute("states", stateService.getStates());
        return "suppliers";
    }

    @PostMapping("/suppliers/addNew")
    public String addNew(Supplier supplier){
        supplierService.save(supplier);
        return "redirect:/suppliers";
    }

    @RequestMapping("/suppliers/findById")
    @ResponseBody
    public Optional<Supplier> findById(int id){
        return supplierService.findById(id);
    }

    @RequestMapping(value = "/suppliers/update", method = {RequestMethod.GET, RequestMethod.PUT})

    public String update(Supplier supplier){
        supplierService.save(supplier);
        return "redirect:/suppliers";
    }

    @RequestMapping(value = "/suppliers/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete (int id){
        supplierService.delete(id);
        return "redirect:/suppliers";
    }
}
