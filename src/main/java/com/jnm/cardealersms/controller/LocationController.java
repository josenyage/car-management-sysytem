package com.jnm.cardealersms.controller;

import com.jnm.cardealersms.model.Country;
import com.jnm.cardealersms.model.Location;
import com.jnm.cardealersms.model.State;
import com.jnm.cardealersms.services.CountryService;
import com.jnm.cardealersms.services.LocationService;
import com.jnm.cardealersms.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class LocationController {

    @Autowired
    LocationService locationService;
    @Autowired
    StateService stateService;
    @Autowired
    CountryService countryService;

    @GetMapping("/locations")
    public String getLocation(Model model){

        List<Location> locationList = locationService.getLocation();
        model.addAttribute("locations", locationList);
        List<State> stateList = stateService.getStates();

        model.addAttribute("states", stateList);

        List<Country> countryList = countryService.getCountry();

        model.addAttribute("countries", countryList);

        return "locations";
    }

    @PostMapping("/locations/addNew")
    public String addNew(Location location){
         locationService.save(location);
         return "redirect:/locations";
    }

    @RequestMapping("/locations/findById")
    @ResponseBody

    public Optional<Location> findById(Integer id){
        return locationService.findById(id);
    }

    @RequestMapping(value = "/locations/update", method = {RequestMethod.GET, RequestMethod.PUT})

    public String update(Location location){
       locationService.save(location);
       return "redirect:/locations";
    }

    @RequestMapping(value = "/locations/delete", method = {RequestMethod.DELETE, RequestMethod.GET})

    public String delete(int id){
        locationService.delete(id);

        return "redirect:/locations";
    }
}
