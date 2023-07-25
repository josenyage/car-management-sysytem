package com.jnm.cardealersms.services;

import com.jnm.cardealersms.controller.CountryController;
import com.jnm.cardealersms.model.Country;
import com.jnm.cardealersms.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    //Displays list of all countries
    public List<Country> getCountry(){
        return countryRepository.findAll();
    }

    public void save(Country country){
        countryRepository.save(country);
    }

    public Optional<Country> findById(int id){
        return countryRepository.findById(id);
    }

    public void delete(Integer id) { countryRepository.deleteById(id);
    }
}
