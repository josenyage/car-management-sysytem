package com.jnm.cardealersms.controller;

import com.jnm.cardealersms.model.Client;
import com.jnm.cardealersms.model.State;
import com.jnm.cardealersms.services.ClientService;
import com.jnm.cardealersms.services.CountryService;
import com.jnm.cardealersms.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class ClientController{


    @Autowired ClientService clientService;

    @Autowired CountryService countryService;

    @Autowired StateService stateService;


    @GetMapping("/clients")
    public String getClient(Model model){
        model.addAttribute("clients", clientService.getClient());
        model.addAttribute("countries", countryService.getCountry());
        model.addAttribute("states", stateService.getStates());
        return "clients";
    }

    @PostMapping("/clients/addNew")
    public String addNew(Client client){
        clientService.save(client);
        return "redirect:/clients";
    }

    @RequestMapping("/clients/findById")
    @ResponseBody
    public Optional<Client> findById(int id){
        return clientService.findById(id);
    }

    @RequestMapping(value = "/clients/update", method = {RequestMethod.GET, RequestMethod.PUT})

    public String update(Client client){
        clientService.save(client);
        return "redirect:/clients";
    }

    @RequestMapping(value = "/clients/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete (int id){
        clientService.delete(id);
        return "redirect:/clients";
    }

}
