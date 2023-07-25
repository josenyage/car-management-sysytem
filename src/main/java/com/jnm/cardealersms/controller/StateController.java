package com.jnm.cardealersms.controller;

import com.jnm.cardealersms.model.Country;
import com.jnm.cardealersms.model.State;
import com.jnm.cardealersms.services.CountryService;
import com.jnm.cardealersms.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class StateController {
    @Autowired private StateService stateService;
    @Autowired private CountryService countryService;


    // display list of States
    @GetMapping("/states")
    public String getStates(Model model){

        List<State> stateList = stateService.getStates();

        model.addAttribute("states", stateList);

        List<Country> countryList = countryService.getCountry();

        model.addAttribute("countries", countryList);

        return "states";
    }

    @PostMapping("/states/addNew")
    public String addNew(State state){
        stateService.save(state);
        return "redirect:/states";
    }

    // find state by id
    @RequestMapping("/states/findById")
    @ResponseBody

    public Optional<State> findById(int id){

        return stateService.findById(id);
    }

    //Update the country Record
    @RequestMapping(value = "/states/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(State state){
        stateService.save(state);
        return "redirect:/states";
    }

    @RequestMapping(value = "/states/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id){
        stateService.delete(id);
        return "redirect:/states";
    }
}
